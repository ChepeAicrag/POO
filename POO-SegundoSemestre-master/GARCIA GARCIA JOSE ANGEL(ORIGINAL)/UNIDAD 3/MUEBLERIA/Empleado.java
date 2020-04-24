public abstract class  Empleado
{
 protected String nombre;
 protected String id;
 public Empleado(String nombre, String id){
    setNombre(nombre);
    setID(id);
    }
 public void setNombre(String nombre){
    this.nombre=nombre;
    }
 public String getNombre(){
    return nombre;
    }   
 public void setID(String id){
    this.id=id;
    }   
 public String getID(){
    return id;
    }
 public abstract double CalcSueldo();   
}
