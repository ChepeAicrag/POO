public class Octagono extends Poligono
{
    private double lado, apotema;
    public Octagono(double lado,Punto p){
    super(p,"Octagono");
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
    public double  calcAng(){
    return 360/8;
    }
    public void setapotema(){
    apotema=lado/(2*(Math.tan(Math.toRadians(calcAng()/2))));
    }
    public double getapotema(){
    return apotema;
    }
    public double calcArea(){
    return (calcPerimetro()*apotema)/2;
    }
    public double calcPerimetro(){
    return lado*8;
    }
}
