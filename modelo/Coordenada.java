package modelo;

public class Coordenada
{
    private double x;
    private double y;

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

    public double distancia(Coordenada c1, Coordenada c2)
    {
        double ct1 = c1.x-c2.x;
        double ct2 = c1.y-c2.y;
        double hip = Math.sqrt(ct1*ct1 + ct2*ct2);
        return hip;

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