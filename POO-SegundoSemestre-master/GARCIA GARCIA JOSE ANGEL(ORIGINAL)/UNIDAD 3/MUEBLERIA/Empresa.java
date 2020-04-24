import java.util.*;
public class Empresa
{
 private String nombre;
 private Vector <Empleado> emp;
 public Empresa(String nombre){
    setNombre(nombre);
    emp=new Vector <Empleado>();
    }
 public void setNombre(String nombre){
    this.nombre=nombre;
    }
 public String getNombre(){
    return nombre;
    } 
 public void contratar(Empleado e){
    emp.add(e);
    } 
 public void despedir(int e){
    emp.remove(e);
    }   
}
