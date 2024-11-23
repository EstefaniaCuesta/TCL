package HL7;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pacientes")  // Anotación para indicar que esta clase se almacenará en MongoDB
public class Paciente {
    private String name;
    private String orderNumber;
    private String examCode;
    private String examResult;

    // Constructor
    public Paciente(String name, String orderNumber, String examCode, String examResult) {
        this.name = name;
        this.orderNumber = orderNumber;
        this.examCode = examCode;
        this.examResult = examResult;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    public String getExamResult() {
        return examResult;
    }

    public void setExamResult(String examResult) {
        this.examResult = examResult;
    }
}
