package modelo;

public class Coordenada
{
    private double x;
    private double y;
    private double punto;

    public Coordenada (double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    //public double distancia(Punto a, Punto b)
    {
        double ct1 = a*x

    }

    public String toString()
    {
        return "( " + x + " , " + y + " )";
    }

    public boolean equals(Object o)
    {
        Coordenada otra = (Coordenada)o;
        return (this.x == otra.x) && (this.y==otra.y);
    }
}