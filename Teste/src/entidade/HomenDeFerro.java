package entidade;

public class HomenDeFerro extends SuperHeroi{
    private String armadura;

    public HomenDeFerro(String indentidadeSecreta, String superpoder, String armadura) {
        super(indentidadeSecreta, superpoder);
        this.armadura = armadura;
    }

    public HomenDeFerro(String indentidadeSecreta, String superpoder) {
        super(indentidadeSecreta, superpoder);
    }


}
