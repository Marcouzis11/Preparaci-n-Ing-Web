package ClasesAbstractas;

public class main {
    public static void main(String[] args) {
        //claseAbstracta claseAbstracta = new claseAbstracta(); //No puede instanciarse porque es abstracta.
        claseNoAbstracta claseNoAbstracta = new claseNoAbstracta(); //Esta si se puede porque no es abstracta.
        claseNoAbstracta.hacerAlgo();
        claseNoAbstracta.hacerAlgoAbstracto();
    }
}
