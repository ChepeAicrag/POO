public class Prisma extends Cuerpo
{
 public Prisma(Poligono base,double altura){
  super(base,altura);
 }
 public double calcVolumen(){
 return base.calcArea()*altura;   
 }
}
