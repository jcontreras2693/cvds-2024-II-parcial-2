package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "JUAN_CONTRERAS")
public class JuanContreras {
    @Id
    @Column(name = "#")
    private int numero;
    @Column(name = "LETRA")
    private String letra;
    @Column(name = "RAZON")
    private String razon;

    public JuanContreras() {
    }

    public JuanContreras(int numero, String letra, String razon) {
        this.numero =  numero;
        this.letra = letra;
        this.razon = razon;
    }

    public int getNumero() {
        return numero;
    }

    public String getLetra() {
        return letra;
    }

    public String getRazon() {
        return razon;
    }
}