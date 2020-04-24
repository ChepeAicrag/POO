public class Persona
{    
 private String nombre;
 private String apellido,apellido2;    
 private int edad;
 private char sexo;
 public Persona(String nombre, String apellido, String apellido2,int edad,int sex){
   setNombre(nombre);
   setApellido(apellido);
   setApellido2(apellido2);
   setEdad(edad);  
   setSexo(sex);
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
 public void setApellido2(String apellido2){
    this.apellido2=apellido2;
    }   
 public String getApellido2(){
    return apellido2;
    }   
 public void setEdad(int edad){
    if(edad>0)
    this.edad=edad;
    }   
 public int getEdad(){
    return edad;
    }
 public void setSexo(int sex){
    if(sex==1){
     sexo='H';
    }else{
     sexo='M';
    }
    }   
 public char getSexo(){
    return sexo;
    }   
    }   
