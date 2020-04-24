public class Piramide extends Cuerpo
{
    public Piramide (Poligono base, double altura){
    super(base,altura);
    }
    public double calcVolumen(){
    return (base.calcArea()*altura)/3;
    }
}
