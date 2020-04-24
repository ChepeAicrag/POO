public class Vendedor extends Empleado
{
 private int at;
 private double vtstotales;
 public Vendedor(String nombre,String id,int at, double vtstotales){
    super(nombre,id);
    setas(at);
    setvtstotales(vtstotales);
    }
 public void setas(int at){
    if(at>0)
    this.at=at;
 }
 public int getas(){
    return at;
    }
 public void setvtstotales(double vtstotales){
    this.vtstotales=vtstotales;
    }   
 public double getvtstotales(){
    return vtstotales;
    }     
 public double CalcSueldo(){
    if(at<2)   
     return (vtstotales*0.05);
    else{
    return (vtstotales*0.07);
    }
 }   
}
