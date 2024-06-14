import java.time.LocalDate;
import java.util.Objects;

public class Evento {

    private String atracao;
    private String apresentador;
    private String codigo;

    public Evento(String atracao, String apresentador, String codigo) {
        this.atracao = atracao;
        this.apresentador = apresentador;
        this.codigo = codigo;
    }

    public Evento() {
    }

    @Override
    public String toString() {
        return "Evento{" +
                "atracao='" + atracao + '\'' +
                ", apresentador='" + apresentador + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return Objects.equals(codigo, evento.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    public String getAtracao() {
        return atracao;
    }

    public String getApresentador() {
        return apresentador;
    }
}
