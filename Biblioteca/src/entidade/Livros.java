package entidade;

public class Livros {
    private String titulo;
    private String autor;

    private int numeroPaginas;

    public Livros(java.lang.String titulo, java.lang.String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void InformarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }



}
