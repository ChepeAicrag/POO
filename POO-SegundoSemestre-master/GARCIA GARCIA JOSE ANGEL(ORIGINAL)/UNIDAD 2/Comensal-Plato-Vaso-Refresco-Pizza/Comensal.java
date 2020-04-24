public class Comensal
{
   private String nombre;
   private Plato pl;
   private Vaso va;
   public Comensal(String nombre, Plato pl, Vaso va){
    setnombre(nombre);
    setplato(pl);
    setvaso(va);
    }
  public void setnombre(String nombre){
    this.nombre=nombre;
    }   
  public String getnombre(){
    return nombre;
    }  
  public void setplato(Plato pl){
    this.pl=pl;
    }   
  public Plato getplato(){
    return pl;
    }
  public void setvaso(Vaso va){
    this.va=va;
    }  
  public Vaso getvaso(){
    return va;
    }  
  public void servirpizza(Pizza p){
    if(p.getnureb()>0 && pl.getestado()==false){
    p.setnureb(p.getnureb()-1);
    pl.setestado(true);
    }
   }
  public void servirrefresco(Refresco r){
    if(r.getnuvas()>0 && va.getestado()==false){
    r.setnuvas(r.getnuvas()-1);
    va.setestado(true);
    }
    } 
  public void comer(){
    pl.setestado(false);
    }  
  public void tomar(){
    va.setestado(false);
    }  
    }  
