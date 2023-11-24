package ClasesAbstractas;
/*
 * #Mediante "extends claseAbstracta", la claseNoAbstracta podrá reemplazar el método abstracto de la clase abstracta.
 * #De manera que cada clase que extienda a la claseAbstracta, podrá tener su propio método abstracto personal.
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
