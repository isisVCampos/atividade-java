import entidade.HomenDeFerro;

public class Aplicacao {
    public static void main(String[] args) {
        HomenDeFerro homenDeFerro =  new HomenDeFerro("tony stack", "rico", "mk1");
        homenDeFerro.SalvarOMundo();
        System.out.println(homenDeFerro.getIndentidadeSecreta());

    }


}
