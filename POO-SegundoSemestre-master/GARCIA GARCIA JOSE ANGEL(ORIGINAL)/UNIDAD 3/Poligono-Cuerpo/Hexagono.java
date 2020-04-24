public class Hexagono extends Poligono
{
    private double lado,apotema;
    public Hexagono(double lado,Punto p){
    super(p,"Hexagono");
    setlado(lado);
    setapotema();
    }
    public void setlado(double lado){
    if(lado>0)
    this.lado=lado;
    }
    public double getlado(){
    return lado;
    }
    public double calcAng(){
    return 360/6;
    }
    public void setapotema(){
    apotema=lado/(2*(Math.tan(Math.toRadians(calcAng()/2))));
    }
    public double getapotema(){
    return apotema;
    }
    public double calcPerimetro(){
    return lado*6;
    }
    public double calcArea(){
    return (calcPerimetro()*apotema)/2; 
    }
    public String toString(){
    return super.toString()+", sus lados miden: "+getlado()+", su apotema mide: "+getapotema();
    }
}
