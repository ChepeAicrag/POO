import javax.swing.JOptionPane;
public class Vista
{
    public static int  Opciones(String cad,int a){
    boolean op=false;
    int num=0;
    while(!op){
       num=LeerEntero(cad);
       if(num>0 && num<a){
        return num;
        }else{
        Imprimir("Seleeccione adecuadamente");
        }
    }
    return num;
    }
    public static void Imprimir(String cad){
    JOptionPane.showMessageDialog(null,cad);
    }
    public static String LeerString(String s){
     return JOptionPane.showInputDialog(null, s);
    }
    public static void MostrarAR(Object ar[]){
    for(int i=0;i<ar.length;i++){
        if( ar[i] instanceof Jugador){ 
        Imprimir(((Jugador)ar[i]).getNombre());}
     }
    }
    public static int LeerEntero(String Cad){
      int entero=0;
      boolean leidobien=false;
      String Cad2="";
        while(!leidobien){
          try{
            entero=Integer.parseInt(LeerString(Cad));
            leidobien=true; 
           }catch(NumberFormatException miExcepcion){
            JOptionPane.showMessageDialog(null,"Introduzca un número de tipo entero, por favor\n");
           }
       }
       return entero; 
    }
    public static int LeerPositivo(String cad){
    boolean op=false;
    int a=0;
    while(!op){
     a=LeerTeclado.LeerEntero(cad);
     if(a>0){
        return a;
        }
        else{
        Imprimir("Introduce un valor mayor a 0");
        }
      }
    return a;
    }
    public static boolean  mensajeOtro(String cad){
    boolean op=false;
    boolean ops=false;
    while(!ops){
       int sal=LeerEntero(cad);
       if(sal==1){
         op= false;
         ops=true;
        } 
       else if(sal==2){
          op= true;
          ops=true;
          }
          else{
            Imprimir("Seleccione adecuadamente");
           }
      }
     return op;
    }
    public static String LeerCadenaLetras(String Cad2){    
    String cad="";  
    boolean leidobien=false;
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
}
