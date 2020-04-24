import java.io.*;
public abstract class Persona implements Serializable
{
    private String nombre,apellido;
    private int edad,sexo;
    public Persona(String nombre,String apellido,int edad,int sexo){
    setNombre(nombre);
    setApellido(apellido);
    setEdad(edad);
    setSexo(sexo);
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    public String getNombre(){
    return nombre;
    }
    public void setApellido(String apellido){
    this.apellido=apellido;
    }
    public String getApellido(){
    return apellido;
    }
    public void setEdad(int edad){
    this.edad=edad;
    }
    public int getEdad(){
    return edad;
    }
    public void setSexo(int sexo){
    this.sexo=sexo;
    }
    public int getSexo(){
    return sexo;
    }
    public abstract String Yosoy();
}
