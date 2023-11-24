package ClasesAbstractas;

/* 
 * Qué quiere decir que sea abstracta la clase?
 * # No se puede hacer "new" de la clase abstracta.
 * # Se instancia a través de una subclase.
 * # Pueden tener constructor, pero no se pueden instanciar, asi que no sirve tener el constructor.
 * 
*/

abstract class claseAbstracta { //superclase
    claseAbstracta()
    {

    }
    
    public void hacerAlgo()
    {
        System.out.println("Hace algo.");
    }

    public abstract void hacerAlgoAbstracto();
}




