import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class LeerTeclado
{
  public static String LeerString(String s){
    return JOptionPane.showInputDialog(s);
    }
  public static int LeerEntero(){
    int entero=0;
    boolean leidobien=false;
    String Cad="Introduzca un número tipo entero";
    while(!leidobien){
     try{
      entero=Integer.parseInt(LeerString(Cad));
      leidobien=true;
     }catch(NumberFormatException miExcepcion){
      Cad="Introduzca un número de tipo entero, por favor";
     }
    }
     return entero; 
  }
  public static float LeerFlotante(){
    float flotante=0.0F;
    boolean leidobien=false;
    String Cad="Introduzca un número tipo flotante";
    while(!leidobien){
     try{
      flotante=Float.parseFloat(LeerString(Cad));
      leidobien=true;
     }catch(NumberFormatException miExcepcion){
      Cad="Introduzca un número de tipo flotante, por favor";
     }
    }
     return flotante;
    }  
  public static double LeerDoble(){
    double doble=0;
    boolean leidobien=false;
    String Cad="Introduce un número tipo doble";
    while(!leidobien){
    try{
     doble=Double.parseDouble(LeerString(Cad));
     leidobien=true;
    }catch(NumberFormatException miExcepcion){
     Cad="Introduzca un número de tipo doble, por favor";
    }
   }
    return doble;
    }   
  public static short LeerCorto(){
    short corto=0;
    boolean leidobien=false;
    String Cad="Introduzca un número de tipo corto";
    while(!leidobien){
     try{
      corto=Short.parseShort(LeerString(Cad));
      leidobien=true;
     }catch(NumberFormatException miExcepcion){
      Cad="Introduzca un número de tipo corto, por favor";
     }
    }
     return corto;
    }
  public static long LeerLargo(){
    long largo=0;
    boolean leidobien=false;
    String Cad="Introduzca un número de tipo largo";
    while(!leidobien){
     try{
      largo=Long.parseLong(LeerString(Cad));
      leidobien=true;
     }catch(NumberFormatException miException){
     Cad="Introduzca un número de tipo largo, por favor";
     }
    } 
     return largo;
    }  
  public static byte LeerByte(){
    byte bait=0;
    boolean leidobien=false;
    String Cad="Introduzca un dato de tipo byte";
    while(!leidobien){
     try{
      bait=Byte.parseByte(LeerString(Cad));
      leidobien=true;
     }catch(NumberFormatException miExcepcion){
      Cad="Introduzca un dato de tipo byte, por favor";
     }
    }
     return bait;
    }
  public static char LeerCaracter(){
    char caracter='a';
    boolean leidobien=false;
    String Cad="Introduzca un dato de tipo char";
    while(!leidobien){
     try{   
      String p=LeerString(Cad);   
      if(p.length()==1){
      caracter=p.charAt(0);    
      leidobien=true;
      }
      else{
          throw new Exception();
       }
     }catch(Exception miExcepcion){
     Cad="Introduzca un dato de tipo char, por favor";
     
    }
    }
     return caracter;
    } 
  public static boolean LeerBooleano(){
    boolean boleano=false;
    boolean leidobien=false;
    String Cad="Introduzca un dato tipo booleano";
    while(!leidobien){
     try{    
    String p=LeerString(Cad);     
    if(p.equalsIgnoreCase("true")||p.equalsIgnoreCase("false")){
        boleano=Boolean.parseBoolean(p);
        leidobien=true;
    }else{
    throw new Exception();
    }
    }catch(Exception mixd){
     Cad="Introduzca un dato tipo booleano, por favor";
     }
    }
     return boleano;
    }
  public static String LeerCadenaLetras(){    
    String cad="";  
    boolean leidobien=false;
    String Cad2="Introduzca una cadena solo con letras";
    while(!leidobien){
     try{
      String p=LeerString(Cad2); 
      if(p.matches( "[a-zA-Z]+[^ 0-9]")){
        cad=p;
        leidobien=true;
         }else{
            throw new Exception(); }
     }catch(Exception ExeptionR){
            Cad2="Su cadena debe ser solo de letras";
      } 
    }
    return cad;
  }
    public static String LeerCadenaLetrasYnumeros(){    
    String cad="";  
    boolean leidobien=false;
    String Cad2="Introduza una cadena solo con letras y numeros";
    while(!leidobien){
     try{
      String p=LeerString(Cad2);
      if(p.matches(".*[a-zA-Z]+.*[0-9]")){
         cad=p;
         leidobien=true;
        }else{
            throw new Exception(); 
       }
      }catch(Exception ExeptionR){
            Cad2="Su cadena debe ser solo de letras y numeros";
        } 
    }
    return cad;
  }
  public static String LeerCadenaLetrasYSimbolos(){    
    String cad="";  
    boolean leidobien=false;
    String Cad2="Introduza una cadena solo de letras y simbolos";
    while(!leidobien){
      try{
       String p=LeerString(Cad2);
       if(p.matches(".*[a-zA-Z]+[\\x00-\\x7F]")){
          cad=p;
          leidobien=true;
          }else{
            throw new Exception(); }
      }catch(Exception ExeptionR){
            Cad2="Su cadena debe ser solo de letras y simbolos";
       } 
    }
    return cad;
  }
}
