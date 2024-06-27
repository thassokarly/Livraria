import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Livro {
    private String codigo;
    private String autor;
    private double anoPublicacao;
    private String genero;
    private BigDecimal valorDeReserva;
    private boolean disponivel;
    private LocalDate dataReserva;

    public Livro(String codigo, String autor, double anoPublicacao, String genero, BigDecimal valorDeReserva, boolean disponivel, LocalDate dataReserva) {
        this.codigo = codigo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.valorDeReserva = valorDeReserva;
        this.disponivel = disponivel;
        this.dataReserva = dataReserva;
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
                ", disponivel=" + disponivel +
                ", dataReserva=" + dataReserva +
                '}';
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
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

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(double anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setValorDeReserva(BigDecimal valorDeReserva) {
        this.valorDeReserva = valorDeReserva;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public BigDecimal getValorDeReserva() {
        return valorDeReserva;
    }
}
