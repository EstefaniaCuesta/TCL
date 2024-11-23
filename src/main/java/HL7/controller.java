package HL7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/pacientes")  // La ruta base para las operaciones con pacientes
public class controller {

    @Autowired
    private Repository repository;

    // Endpoint para subir y procesar el archivo HL7
    @PostMapping("/upload")
    public String uploadHL7(@RequestParam("file") MultipartFile hl7File) {
        try {
            // Procesamos el archivo HL7 y lo convertimos en un objeto Paciente
            Paciente paciente = Hl7Lector.parseHL7File(hl7File);

            // Verificamos si el paciente fue procesado correctamente
            if (paciente != null) {
                repository.save(paciente);  // Guardamos el paciente en MongoDB
                return "Paciente guardado correctamente";
            } else {
                return "Error al procesar el archivo HL7";
            }
        } catch (IOException e) {
            return "Error al leer el archivo: " + e.getMessage();
        }
    }

    // Endpoint para obtener todos los pacientes almacenados
    @GetMapping("/")
    public List<Paciente> getPatients() {
        return repository.findAll();  // Devuelve la lista de todos los pacientes almacenados
    }
}
