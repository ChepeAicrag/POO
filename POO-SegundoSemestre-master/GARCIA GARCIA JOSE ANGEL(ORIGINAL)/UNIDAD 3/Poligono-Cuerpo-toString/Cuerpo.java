public abstract class Cuerpo
{
    protected Poligono base;
    protected double altura;
    public Cuerpo(Poligono base,double altura){
    setBase(base);
    setAltura(altura);
    }
    public void setBase(Poligono base){
    this.base=base;
    }
    public Poligono getBase(){
    return base;
    }
    public void setAltura(double altura){
    this.altura=altura;
    }
    public double getAltura(){
    return altura;
    }
    public abstract double calcVolumen();
}
