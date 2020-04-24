public class Persona
{
 private String nombre;
 public Persona(String nombre){
    setnombre(nombre);
    }
 public void setnombre(String nombre){
    this.nombre=nombre;
    }   
 public String getnombre(){
    return nombre;
    }   
 public void abrirpuerta(Puerta p, Llave ll){
    if(p.getestado()==false && ll.getcodigo().equals(p.getcerrojo().getcodigo()))
    {p.setestado(true);}
    }   
}
