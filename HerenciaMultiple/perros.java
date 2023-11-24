package HerenciaMultiple;
/*
 * #Perros va a ser la clase que se va a heredar.
 * #Va a tener métodos normales, nada del otro mundo.
 * #Todas las clases que extiendan a perros van a poder ladrar y aullar, y además utilizar los métodos propios de cada raza de perro.
*/
public class perros {
    //Como no le pongo constructor, el compilador se lo crea solo.

    public void ladrar()
    {
        System.out.println("Buaf! (ladrido)");
    }

    public void aullar()
    {
        System.out.println("Auuuu! (aullido)");
    }
}
