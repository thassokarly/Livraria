
import java.util.ArrayList;
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
    public void exibirLivrosAutor( ){

    }
    public void exibirLivrosGenero(){

    }
    public void calcularValorTotalLivros(){

    }
    public void livroMaisCaro(){

    }
    public void livroMaisBarato(){

    }
}
