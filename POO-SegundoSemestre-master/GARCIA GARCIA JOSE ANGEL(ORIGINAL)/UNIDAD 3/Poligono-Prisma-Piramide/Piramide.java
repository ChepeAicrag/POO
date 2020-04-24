public class Piramide
{
    private Poligono base;
    private double altura;
    public Piramide (Poligono base, double altura){
    setBase(base);
    setAltura(altura);
    }
    public void setBase(Poligono base){
    this.base=base;
    }
    public Poligono getbase(){
    return base;
    }
    public void setAltura(double altura){
    this.altura=altura;
    }
    public double getAltura(){
    return altura;
    }
    public double calcVolumen(){
    return (base.calcArea()*altura)/3;
    }
}
