import java.math.BigDecimal;
import java.util.Objects;

public class Livro {
    private String codigo;
    private String autor;
    private double anoPublicacao;
    private String genero;
    private BigDecimal valorDeReserva;

    public Livro(String codigo, String autor, double anoPublicacao, String genero, BigDecimal valorDeReserva) {
        this.codigo = codigo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.valorDeReserva = valorDeReserva;
    }

    public Livro() {
    }


    @Override
    public String toString() {
        return "Livro{" +
                "codigo='" + codigo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", genero='" + genero + '\'' +
                ", valorDeReserva=" + valorDeReserva +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(codigo, livro.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public double getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public BigDecimal getValorDeReserva() {
        return valorDeReserva;
    }
}
