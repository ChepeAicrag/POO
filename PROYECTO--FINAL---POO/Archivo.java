import java.util.*;
import  java.io.*;
public class Archivo
 { 
     public static void LlenarVector(Vector vec,String nom) throws Exception{
   Object per=null; 
   try{
       File archivoSalida;
       FileOutputStream flujoArchivoSalida;
       ObjectOutputStream flujoObjetoSalida;    
           archivoSalida=new File(nom+".txt");
           flujoArchivoSalida=new FileOutputStream(archivoSalida);
           flujoObjetoSalida=new ObjectOutputStream(flujoArchivoSalida);
           for(int i=0;i<archivoSalida.length();i++){
             per=(Object)vec.elementAt(i);  
             flujoObjetoSalida.writeObject(per);
           }
       flujoObjetoSalida.close();
       flujoArchivoSalida.close();
      }catch(IOException error){ }  
  }
  
    public static Vector llenarVectorDadoNombre(String nom) throws Exception{
   Object per=null;
   Vector <Object>v=new Vector();
   try{
       File archivoSalida;
       archivoSalida=new File(nom+".txt");     
       FileInputStream flujoArchivoEntrada=new FileInputStream(archivoSalida);
       ObjectInputStream flujoObjetoEntrada=new ObjectInputStream(flujoArchivoEntrada);
       for(int i=0;i<archivoSalida.length();i++){
        per=flujoObjetoEntrada.readObject();
        v.add(per);
        if(v.get(i) instanceof Jugador){
        System.out.println(((Jugador)per).Yosoy());
        }if(v.get(i) instanceof Entrenador){
        System.out.println(((Entrenador)per).Yosoy());
        }if(v.get(i) instanceof Evento){
        System.out.println(((Evento)per).EsteSoy());
        }if(v.get(i) instanceof Participacion){
        System.out.println(((Participacion)per).DatPar());
        }if(v.get(i) instanceof Disciplina){
        System.out.println(((Disciplina)per).EstaSoy());
        }
    } 
       flujoArchivoEntrada.close();
       flujoObjetoEntrada.close();
      }catch(IOException error){}      
    return v;
  }
}
