import java.util.*;
public class Entrenador extends Persona
{
    private String claveEnt;
    public Entrenador(String nombre,String apellido,int edad,int sexo, String claveEnt){
    super(nombre,apellido,edad,sexo);
    setClaveEnt(claveEnt);
    }
    public void setClaveEnt(String claveEnt){
    this.claveEnt=claveEnt;
    }
    public String getClaveEnt(){
    return claveEnt;
    }
    public String Yosoy(){
    return "\nNombre: "+super.getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad()+"\nClave: "+claveEnt;
    }
}
