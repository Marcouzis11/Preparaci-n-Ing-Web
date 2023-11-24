package HerenciaMultiple;

public class main {
    public static void main(String[] args) {
        //Creo los 3 tipos de perros.
        galgo galgo = new galgo();
        ovejeroAleman ovejeroAleman = new ovejeroAleman();
        salchichaGordoBachicha salchicha = new salchichaGordoBachicha();

        /*
         * # Cada uno de los 3 tipos de perros, pueden utilizar los métodos de la clase perros, ya que heredaron esos métodos
         * # Además pueden utilizar sus propios métodos.
         */

        galgo.ladrar();
        galgo.aullar();
        galgo.correr();

        ovejeroAleman.ladrar();
        ovejeroAleman.aullar();
        ovejeroAleman.olfatear();

        salchicha.ladrar();
        salchicha.aullar();
        salchicha.rodar();
    }
}
