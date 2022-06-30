package ejecutable;

import modelo.Coordenada;

public class Test 
{
    public static void main(String[] args)
    {
        Coordenada c1 = new Coordenada(0, 0);
        Coordenada c2 = new Coordenada(1.3 , 5.3);

        c1.setX(2);
        c2.setY(3);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(("La distancia entre los puntos es: " + c1.distancia(c1, c2)));
    }
}
