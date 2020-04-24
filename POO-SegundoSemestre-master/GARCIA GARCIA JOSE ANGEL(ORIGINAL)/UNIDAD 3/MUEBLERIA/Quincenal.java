public class Quincenal extends Empleado
{
 private int df;
 private int sueldofijo=2200;
 private int dt;
 public Quincenal(String nombre, String id, int df,int dt){
    super(nombre,id);
    setDF(df);
    setDT(dt);
    }
 public void setDF(int df){
    this.df=df;
    }   
 public int getDF(){
    return df;
    }   
 public void setDT(int dt){
    this.dt=dt;
    }   
 public int getDT(){
    return dt;
    }   
 public double CalcSueldo(){
    return ((sueldofijo)/(dt+df))*dt;
    }   
}
