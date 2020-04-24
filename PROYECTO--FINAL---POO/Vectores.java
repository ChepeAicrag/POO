import java.util.*;
public class Vectores 
{   
    static Vector<Jugador> vecJugador;
    static Vector<Entrenador> vecEntrenador=new Vector();
    static Vector<Disciplina> vecDisciplina=new Vector();
    static Vector<Evento> vecEvento=new Vector();
    static Vector<Participacion> vecParticipacion=new Vector();
    public Vectores()throws Exception{   
     vecJugador=Archivo.llenarVectorDadoNombre("Jugador");
     vecEntrenador=Archivo.llenarVectorDadoNombre("Entrenador");
     vecDisciplina=Archivo.llenarVectorDadoNombre("Disciplina");
     vecEvento=Archivo.llenarVectorDadoNombre("Evento");
     vecParticipacion=Archivo.llenarVectorDadoNombre("Participacion");
   }
   
    public static void ReArchivo(Vector v,String c){
    try{ 
       Archivo.LlenarVector(v,c);
        }catch(Exception e){}
   } 
   
    public static Entrenador EntC(String c){
      for(int i=0; i<vecEntrenador.size(); i++){ 
          if (vecEntrenador.elementAt(i).getClaveEnt().equals(c)){
              return vecEntrenador.elementAt(i); }
        }
      return null;
   }
   
    public static Jugador JugC(String c){
      for(int i=0; i<vecJugador.size(); i++){
          if(vecJugador.elementAt(i)!=null){
          if (vecJugador.elementAt(i).getClaveJug().equals(c)){ 
              return vecJugador.elementAt(i);}}
        }return null;
   }
   
    public static Disciplina DisC(String c){
      for(int i=0; i<vecDisciplina.size(); i++){
          if (vecDisciplina.elementAt(i).getClaveDis().equals(c)){ 
              return vecDisciplina.elementAt(i);}
        }return null;
   }
   
    public static Evento EvC(String c){
      for(int i=0; i<vecEvento.size(); i++){
          if (vecEvento.elementAt(i).getClaveEve().equals(c)){ 
              return vecEvento.elementAt(i); }
        }
      return null;
   }
   
    public static Vector<Participacion> ParCJ(String c){
       Vector<Participacion> pJug=new Vector();
      for(int i=0; i<vecParticipacion.size(); i++){
          if (c.equals(vecParticipacion.elementAt(i).getClaJugador())){
              pJug.add(vecParticipacion.elementAt(i)); 
            }
        }
      return pJug;
   }
   
    public static Vector<Participacion> ParCE(String c){
       Vector<Participacion> paEntrenador=new Vector();
      for(int i=0; i<vecParticipacion.size(); i++){
          if (c.equals(vecParticipacion.elementAt(i).getClaEntrenador())){ 
              paEntrenador.add(vecParticipacion.elementAt(i)); 
            }
        }
      return paEntrenador;
   }
    
   public static Vector<Participacion> ParCEntyCJ(Vector <Participacion> vec,String c){
       Vector<Participacion> pEn=new Vector();
      for(int i=0; i<vec.size(); i++){
          if (c.equals(vec.elementAt(i).getClaEntrenador())){ 
              pEn.add(vec.elementAt(i)); 
            }
        }
      return pEn;
   }
    
   public static Vector<Participacion> ParCEve(String c){
       Vector<Participacion> pEv=new Vector();
      for(int i=0; i<vecParticipacion.size(); i++){
          if (c.equals(vecParticipacion.elementAt(i).getClaEvento())){
              pEv.add(vecParticipacion.elementAt(i)); 
            }
        }
      return pEv;
   }
   
   public static Vector <Participacion> ParCEyCJ(Vector <Participacion> vec,String cj){
        Vector<Participacion> pJug=new Vector();
      for(int i=0; i<vec.size(); i++){
          if (cj.equals(vec.elementAt(i).getClaJugador())){
              pJug.add(vec.elementAt(i)); 
            }
        }
      return pJug;
    }
    
    public static Vector<Participacion> ParCD(String c){
       Vector<Participacion> pDis=new Vector();
      for(int i=0; i<vecParticipacion.size(); i++){
          if (c.equals(vecParticipacion.elementAt(i).getClaDisciplina())){
              pDis.add(vecParticipacion.elementAt(i)); 
            } 
        }
      return pDis;
   }
   
   
    public static Vector<Participacion> ParaLogro(String c,Vector<Participacion> vec){
       Vector<Participacion> pDis=new Vector();
      for(int i=0; i<vec.size(); i++){
          if (c.equals((vec.elementAt(i)).getClaDisciplina())){
              pDis.add(vecParticipacion.elementAt(i)); 
            } 
        }
      return pDis;
   }

    public static Vector<Participacion> ParticipacionConLogro(int c){
       Vector<Participacion>pDis=new Vector();
       String comp="";
       if(c==1){comp="Primer Lugar";}
       if(c==2){comp="Segundo Lugar";}
       if(c==3){comp="Tercer Lugar";}
       if(c==4){comp="Participante";}
      for(int i=0; i<vecParticipacion.size(); i++){
          if (comp.equals(vecParticipacion.elementAt(i).getLogro())){
              pDis.add(vecParticipacion.elementAt(i)); 
            } 
        }
      return pDis;
   }
   
   
    public static Vector<Participacion> ParticipacionConLogrodeEvento(int c,Vector <Participacion> vec){
       Vector<Participacion>pDis=new Vector();
       String comp="";
       if(c==1){comp="Primer Lugar";}
       if(c==2){comp="Segundo Lugar";}
       if(c==3){comp="Tercer Lugar";}
       if(c==4){comp="Participante";}
      for(int i=0; i<vec.size(); i++){
          if (comp.equals(vec.elementAt(i).getLogro())){
              pDis.add(vec.elementAt(i)); 
            } 
        }
      return pDis;
   }
   
   
    public static void eliminarEntC(String c){
       if(EntC(c)!=null){eliminarParCE(c);
       vecEntrenador.removeElement(EntC(c));
       Vista.Imprimir("Eliminado Correctamente");}
       else{
           Vista.Imprimir("No existe el entrenador");
    }
   }
   
    public static void eliminarJugC(String c){
       if(JugC(c)!=null){eliminarParCJu(c);
       vecJugador.remove(JugC(c));
       Vista.Imprimir("Eliminado el Jugador");}
       else{
           Vista.Imprimir("No existe el Jugador");
     }
   }
    
    public static void eliminarEvC(String c){
       if(EvC(c)!=null){eliminarParCEv(c);
       vecEvento.remove(EvC(c)); 
       Vista.Imprimir("Eliminado el Evento");}
       else{
           Vista.Imprimir("No existe el evento");
     }
   }
   
    public static void eliminarDisC(String c){
       if(DisC(c)!=null){eliminarParCDis(c);
       vecDisciplina.remove(DisC(c)); 
       Vista.Imprimir("Eliminada la Disciplina");}
       else{
           Vista.Imprimir("No existe la Disciplina");
     }
   }
   
    public static void eliminarParCE(String c){
       Vector<Participacion>v=ParCE(c);
       for(int i=0; i<v.size(); i++){
          vecParticipacion.remove(v.elementAt(i));
        } 
   }
   
    public static void eliminarParCEv(String c){
       Vector<Participacion>v=ParCEve(c);
       for(int i=0; i<v.size(); i++){
          vecParticipacion.remove(v.elementAt(i));
        } 
   }
   
    public static void eliminarParCJu(String c){
       Vector<Participacion>v=ParCJ(c);
       for(int i=0; i<v.size(); i++){
          vecParticipacion.remove(v.elementAt(i));
        } 
   }
   
    public static void eliminarParCDis(String c){
       Vector<Participacion>v=ParCD(c);
       for(int i=0; i<v.size(); i++){
          vecParticipacion.remove(v.elementAt(i));
        } 
   }
}
