package Interfaces;
/*
 * # Una interfaz es como una lista de métodos, de los cuales TODOS van a ser abstractos.
 * # No hace falta colocarles "abstract" a cada método, si esta dentro de una interfaz, todos son abstractos.
 * # Al ser abstractos, no pueden tener contenido los métodos, cada clase que la implemente deberá colocarles su contenido personal.
*/
public interface interfaz {

    /*interfaz()
    {

    }*/             //NO SE LE PUEDE HACER CONSTRUCTOR A UNA INTERFAZ.

    public void hacerAlgo();
    public void hacerAlgo2();
    public void hacerAlgo3();
}
