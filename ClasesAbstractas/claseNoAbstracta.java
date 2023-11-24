package ClasesAbstractas;
/*
 * # Cada clase que "extends claseAbstracta" va a poder usar los métodos abstractos y no abstractos de la claseAbstracta
 * # Métodos abstractos: la claseNoAbstracta podrá modificar el método abstracto a su gusto, haciendolo un método personal.
 * # Métodos no abstractos: la claseNoAbstracta no puede modifcar los métodos no abstractos, solo puede utilizarlos.
 * 
 */
public class claseNoAbstracta extends claseAbstracta {
    claseNoAbstracta()
    {

    }
    
    public void hacerAlgoAbstracto()
    {
        System.out.println("Se hizo algo abstracto");
    }
}
