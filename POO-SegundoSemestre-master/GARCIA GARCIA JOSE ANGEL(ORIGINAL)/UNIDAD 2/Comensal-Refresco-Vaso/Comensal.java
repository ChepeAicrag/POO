public class Comensal
{
 private String nombre;
 private Vaso va;
 private Plato pl;
 public Comensal(String nombre, Vaso va, Plato pl){
    setnombre(nombre);
    setvaso(va);
    setplato(pl);
    }
 public void setnombre(String nombre){
    this.nombre=nombre;
    }
 public String getnombre(){
    return nombre;
    }  
 public void setvaso(Vaso va){
    this.va=va;
    }   
 public Vaso getvaso(){
    return va;
    }   
 public void setplato(Plato pl){
    this.pl=pl;
    }   
 public Plato getplato(){
    return pl;
    }   
 public void servirpizza(Pizza p){
    if(pl.getestado()==false&& p.getnureb()>0){
      pl.setestado(true);
      p.setnureb(p.getnureb()-1);
      }
    } 
 public void servirresfreco(Refresco r){
    if(va.getestado()==false&& r.getnuvas()>0){
      va.setestado(true);
      r.setnuvas(r.getnuvas()-1);
      }
    }   
}
