package Excepciones;
/*
 * # Try: ejecuta el codigo que se encuentre dentro de try{}, en caso de que salte alguna excepcion ahi dentro, no se guarda lo realizado en try, catch agarra la excepcion y la lanza por consola.
*/
public class main {
    public static void main(String[] args) {
        clase clase = new clase(15);

        try 
        {
            clase.agregar(16); //Solo se puede tener un maximo de 15, modificar este numero para superar el maximo y que salte la excepcion.
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
