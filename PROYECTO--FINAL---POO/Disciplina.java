import java.io.*;
public class Disciplina implements Serializable 
{
 private String claveDis,nombreDis,tipo;
 public Disciplina(String claveDis, String nombreDis,int tipo){
    setClaveDis(claveDis);
    setNombreDis(nombreDis);
    setTipo(tipo);
    }
 public void setClaveDis(String claveDis){
    this.claveDis=claveDis;
    }   
 public String getClaveDis(){
    return claveDis;
    }   
 public void setNombreDis(String nombreDis){
    this.nombreDis=nombreDis;
    }   
 public String getNombreDis(){
    return nombreDis;
    }   
 public void setTipo(int t){
    if(t==1){
    tipo="Individual";
    }else {
    tipo="Grupal";
    }
    }   
 public String getTipo(){
    return tipo;
    }   
 public String EstaSoy(){
    return "\nNombre: "+getNombreDis()+"\nClave: "+getClaveDis()+"\nTipo: "+getTipo();
    }
}
