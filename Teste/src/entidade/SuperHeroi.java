package entidade;

public class SuperHeroi {
    private String indentidadeSecreta;
    private String superpoder;

    public void SalvarOMundo(){
        System.out.println("Salve o mundo!!");
    }

    public SuperHeroi(String indentidadeSecreta, String superpoder) {
        this.indentidadeSecreta = indentidadeSecreta;
        this.superpoder = superpoder;
    }

    public String getIndentidadeSecreta() {
        return indentidadeSecreta;
    }

    public void setIndentidadeSecreta(String indentidadeSecreta) {
        this.indentidadeSecreta = indentidadeSecreta;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }
}
