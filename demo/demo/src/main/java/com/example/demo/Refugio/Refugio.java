package com.example.demo.Refugio;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Refugio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_refugio;

    private String nombreRefugio;
    private String direccion;
    private int poblacionMaxima;
    
    public Integer getId_refugio() {
        return id_refugio;
    }

    public void setId_refugio(Integer id_refugio) {
        this.id_refugio = id_refugio;
    }
    
    public String getNombreRefugio() {
        return nombreRefugio;
    }

    public void setNombreRefugio(String nombreRefugio) {
        this.nombreRefugio = nombreRefugio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getPoblacionMaxima() {
        return poblacionMaxima;
    }

    public void setPoblacionMaxima(int poblacionMaxima) {
        this.poblacionMaxima = poblacionMaxima;
    }
}

