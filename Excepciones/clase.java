package Excepciones;

public class clase {
    int cantidadMaxima;
    int cantidadActual;

    clase(int cantidadMaxima)
    {
        this.cantidadMaxima = cantidadMaxima;
    }

    clase()
    {
        
    }

    public void agregar(int cantAgregar) throws excepcionCreada
    {
        cantidadActual += cantAgregar;
        if(cantidadActual > cantidadMaxima )
        {
            throw new excepcionCreada(); //Tira esa excepcion si la cantidad supera la cantidad maxima
        }
    }
}
