package HL7;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Paciente, String> {
    // Puedes agregar consultas personalizadas si es necesario
}
