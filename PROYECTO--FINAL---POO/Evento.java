import java.io.*;
import java.util.*;
public class Evento implements Serializable
{
  private String claveEve,nombreEve;
  public Evento(String claveEve, String nombreEve){
    setClaveEve(claveEve);
    setNombreEve(nombreEve);
    }
  public void setClaveEve(String claveEve){
    this.claveEve=claveEve;
    }   
  public String getClaveEve(){
    return claveEve;
    }   
  public void setNombreEve(String nombreEve){
    this.nombreEve=nombreEve;
    }   
  public String getNombreEve(){
    return nombreEve;
    } 
  public String EsteSoy(){
    return "\nNombre: "+getNombreEve()+"\nClave: "+getClaveEve();
    }  
}
