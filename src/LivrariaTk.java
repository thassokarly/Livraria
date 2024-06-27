
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class LivrariaTk {

    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }
    public void removerLivro(Livro livro){
        this.livros.remove(livro);
    }
    public void quantidadeLivros(){
        this.livros.size();
    }
    public void exibirTodosLivros(){
        if (!livros.isEmpty()){
            for (Livro livro : livros){
                System.out.println(livro);
            }
        } else {
            System.out.println("Não possui nenhum livro!");
        }
    }
    public void exibirLivrosAutor(String nomeAutor){
        boolean encontrouLivros = false;
        System.out.println("Livros do autor " + nomeAutor + ":");
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(nomeAutor)) {
                System.out.println(livro);
                encontrouLivros = true;
            }
        }
        if (!encontrouLivros) {
            System.out.println("Não há livros do autor " + nomeAutor + " na livraria.");
        }
    }
    public void exibirLivrosGenero(String livroGenero){
        boolean encontrarGenero = false;
        for (Livro livro : livros){
            if (livro.getGenero().equalsIgnoreCase(livroGenero)){
                System.out.println(livro);
                encontrarGenero = true;
            }
        }
        if (!encontrarGenero){
            System.out.println("Não há livros do genero " + livroGenero + " na livraria.");
        }

    }
    public BigDecimal calcularValorTotalLivros(){
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (Livro livro : livros){
            valorTotal = valorTotal.add(livro.getValorDeReserva());
        }
        return valorTotal;
    }
    public Livro livroMaisCaro() {
        if (livros.isEmpty()) {
            return null;
        }
        return Collections.max(livros, Comparator.comparing(Livro::getValorDeReserva));
    }

    public Livro livroMaisBarato(){
        if (livros.isEmpty()){
            return null;
        }
        return Collections.min(livros, Comparator.comparing(Livro::getValorDeReserva));
    }
    public boolean reservarLivro(String codigo, BigDecimal valorPago) {
        for (Livro livro : livros) {
            if (livro.getCodigo().equals(codigo)) {
                if (livro.isDisponivel()) {
                    if (valorPago.compareTo(livro.getValorDeReserva()) >= 0) {
                        livro.setDisponivel(false);
                        livro.setDataReserva(LocalDate.now()); // Define a data de reserva
                        return true;
                    } else {
                        System.out.println("Valor pago é insuficiente para reservar o livro.");
                        return false;
                    }
                } else {
                    System.out.println("Livro já está reservado.");
                    return false;
                }
            }
        }
        System.out.println("Livro não encontrado.");
        return false;
    }
}
