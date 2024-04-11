package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="JOHAN_ESTRADA")
public class johanEstrada {
    @Id
    @Column(name = "PREGUNTA")
    private int pregunta;
    @Column(name = "LETRA")
    private String letra;

    @Column(name="ARGUMENTO")
    private String argumento;

    public johanEstrada() {
    }

    public johanEstrada(int pregunta, String letra, String argumento) {
        this.pregunta=pregunta;
        this.letra=letra;
        this.argumento=argumento;
    }
    public int getPregunta(){
        return this.pregunta;
    }
    public String getLetra(){
        return letra;
    }
    public String getArgumento(){
        return this.argumento;
    }
}