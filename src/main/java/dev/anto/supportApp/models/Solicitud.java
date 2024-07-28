package dev.anto.supportApp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "solicitudes")
public class Solicitud {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_solicitud")
    private Long id;
    private String name; 
    private String date;
    private String solicitud;
    private String consulta;

    public Solicitud() {
    }

    public Solicitud(Long id, String name, String date, String solicitud, String consulta) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.solicitud = solicitud;
        this.consulta = consulta;

    }

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getSolicitud() {
        return solicitud;
    }
    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }
    public String getConsulta() {
        return consulta;
    }
    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
