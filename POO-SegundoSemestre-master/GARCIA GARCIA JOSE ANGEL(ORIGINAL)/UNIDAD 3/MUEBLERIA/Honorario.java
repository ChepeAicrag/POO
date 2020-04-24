public class Honorario extends Empleado
{
 private int nt;
 private double pxt;
 public Honorario(String nombre, String id, int nt,double pxt){
    super(nombre,id);
    setNT(nt);
    setPXT(pxt);
    }
 public void setNT(int nt){
    this.nt=nt;
    }   
 public int getNT(){
    return nt;
    }   
 public void setPXT(double pxt){
    this.pxt=pxt;
    }   
 public double getPXT(){
    return pxt;
    }   
 public double CalcSueldo(){
    return pxt*nt;
    }   
}
