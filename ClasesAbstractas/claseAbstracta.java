package ClasesAbstractas;

/* 
 * Qué quiere decir que sea abstracta la clase?
 * # No se puede hacer "new" de la clase abstracta.
 * # Se instancia a través de una subclase.
 * # No tiene constructor.
 * 
*/

abstract class claseAbstracta { //superclase
    public void hacerAlgo()
    {
        System.out.println("Hace algo.");
    }

    public abstract void hacerAlgoAbstracto();
}




