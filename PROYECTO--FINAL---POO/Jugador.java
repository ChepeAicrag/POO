import java.util.*;
public class Jugador extends Persona
{
    private String claveJug;
    private int TiemEntre;
    private Vector <Participacion> pa=new Vector();
    public Jugador(String nombre,String apellido,int edad,int sexo, int TiemEntre,String claveJug){
    super(nombre,apellido,edad,sexo);
    setClaveJug(claveJug);
    setTiemEntre(TiemEntre);
    }
    public void setClaveJug(String claveJug){
    this.claveJug=claveJug;
    }
    public String getClaveJug(){
    return claveJug;
    }
    public void setTiemEntre(int TiemEntre){
       this.TiemEntre=TiemEntre;
    }
    public int getTiempoEntrenamiento(){
       return TiemEntre;
    }
    public String Yosoy(){
    return "\nNombre: "+super.getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad()+"\nT.Entrenamiento: "+getTiempoEntrenamiento()+"\nClave: "+claveJug;
    }
    public Vector RegParti(){
    return pa;
    }
}
