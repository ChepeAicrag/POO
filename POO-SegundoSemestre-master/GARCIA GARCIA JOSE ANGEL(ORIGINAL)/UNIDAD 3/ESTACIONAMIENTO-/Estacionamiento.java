public  class Estacionamiento
{   
 private Vehiculo[] a;
 public Estacionamiento(int tam){
    a=new Vehiculo[tam];
    }
 public void agregar(int pos, Vehiculo v){
    if(a[pos]==null)
    a[pos]=v;
    }  
 public void elimar(int pos){
    a[pos]=null;
    }   
}
