import java.util.*;
public class Controlador
{
    private static Vista v;
    static  Evento e; static Jugador j; static Entrenador en; static Disciplina d; static Participacion p;
    static Vectores VAr;
    private static Vector vec;
   
    public static void main(String[]args)throws Exception{
       VAr=new Vectores();
       Entrada();    
   }
    
    public static void Entrada()throws Exception{
     boolean op1=false;
       while(!op1){
        int p=v.Opciones("Seleccione lo que desee hacer\n1-Agregar\n2-Eliminar\n3-Estadistica\n4-Buscar\n5-Salir del Programa",6);
         switch (p){
          case 1:
            Agregar();
            break;
          case 2:
            Eliminar();
            break;
          case 3:
            Estadisticas();
            break;
          case 4:
            Buscar();
            break;
          case 5:
            Vectores.ReArchivo(Vectores.vecJugador,"Jugador");
            Vectores.ReArchivo(Vectores.vecEntrenador,"Entrenador");
            Vectores.ReArchivo(Vectores.vecDisciplina,"Disciplina");
            Vectores.ReArchivo(Vectores.vecEvento,"Evento");
            Vectores.ReArchivo(Vectores.vecParticipacion,"Participacion");
            op1=true;
            break;
        }
     }
   }
    
    public static void Estadisticas(){
     boolean op=false;
      while(!op){
        int p=v.Opciones("Seleccione la estadistica:\n1-Cuantos\n2-Con Jugador\n3-Con Evento\n4-Con Entrenador\n5-Con Disciplina\n6-Salir De Estadisticas",7);
         switch(p){
           case 1:
             Cuantos();
             break;
           case 2:
             if(Vectores.vecJugador.size()!=0){ 
                 DadoJugador();
             }else{
                   v.Imprimir("No hay jugadores, no puede ejecutar el método");
              }
             break;
           case 3:
             if(Vectores.vecEvento.size()!=0){
                 DadoEvento();
             }else{
                   v.Imprimir("No hay evento, no puede ejecutar el método");
              }
             break;
           case 4:
             if(Vectores.vecEntrenador.size()!=0){
                 DadoEntrenador();
             }else{
                  v.Imprimir("No hay entrenadores, no puede ejecutar el método");
              }
             break;
           case 5:
             if(Vectores.vecDisciplina.size()!=0){
                DadoDisc();
             }else{
                v.Imprimir("No hay disciplinas, no se puede ejecutar el metodo");
                }
           break;
           case 6:
             op=true;
             break;
        } 
     }
   } 
    
    public static void Buscar(){
     boolean op=false;
      while(!op){
       int p=v.Opciones("Seleccione lo que desee buscar\n1-Entrenador\n2-Jugador\n3-Disciplina\n4-Evento\n5-Salir De Buscar",6);
        switch(p){
         case 1:
           if(Vectores.vecEntrenador.size()!=0){
              en=Vectores.EntC(v.LeerString("Introduce la clave del Entrenador"));
              if(en!=null){
                 v.Imprimir(en.Yosoy());
                }else{
                      v.Imprimir("Entrenador no encontrado");}
           }else{
                 v.Imprimir("No hay entrenadores, no puede ejecutar el método");
            }
           break;
         case 2:
           if(Vectores.vecJugador.size()!=0){
              j=Vectores.JugC(v.LeerString("Introduce la clave del Jugador"));
              if(j!=null){
                   v.Imprimir(j.Yosoy());
                }else{
                    v.Imprimir("Jugador no encontrado");}
            }else{
                v.Imprimir("No hay jugadores, no puede ejecutar el método");
            }
           break;
         case 3:
           if(Vectores.vecDisciplina.size()!=0){
             d=Vectores.DisC(v.LeerString("Introduce la clave de la Disciplina"));
             if(d!=null){
                 v.Imprimir(d.EstaSoy());
              }else{
                  v.Imprimir("Disciplina no encontrada");}
            }else{
                v.Imprimir("No hay disciplinas, no puede ejecutar el método");
            }
           break;
         case 4: 
           if(Vectores.vecEvento.size()!=0){
             e=Vectores.EvC(v.LeerString("Introduce la clave del Evento"));
             if(e!=null){
                 v.Imprimir(e.EsteSoy());
              }else{
                  v.Imprimir("Evento no encontrado");}
                }else{
                    v.Imprimir("No hay participaciones, no puede ejecutar el método");
             } 
           break;
         case 5:
           op=true;
           break;
       }
     } 
   }
   
   public static void DadoDisc(){
    Disciplina d2=null;boolean op=false;
    while(!op){
      d2=Vectores.DisC(v.LeerString("Introduce la clave de la disciplina"));
      while(!op && d2!=null){
       int p=v.Opciones("Seleccione lo que pueda hacer\n1-Ver Jugadores\n2-Ver Entrenadores\n3-Salir",4);
       switch (p){
        case 1:
        if(Vectores.vecJugador.size()!=0){
         for(int i=0;i<Vectores.ParCD(d2.getClaveDis()).size();i++){
             v.Imprimir(Vectores.JugC(Vectores.ParCD(d2.getClaveDis()).elementAt(i).getClaJugador()).Yosoy()+"\nCon Entrenador: "+
             Vectores.EntC(Vectores.ParCD(d2.getClaveDis()).elementAt(i).getClaEntrenador()).getNombre());
            }       
        }else{v.Imprimir("No hay jugadores");}
        break;
        case 2:
        if(Vectores.vecEntrenador.size()!=0){
         for(int i=0;i<Vectores.ParCD(d2.getClaveDis()).size();i++){
             v.Imprimir(Vectores.EntC(Vectores.ParCD(d2.getClaveDis()).elementAt(i).getClaEntrenador()).Yosoy()+"\nCon Jugador: "+
             Vectores.JugC(Vectores.ParCD(d2.getClaveDis()).elementAt(i).getClaJugador()).getNombre());
            }       
        }else{v.Imprimir("No hay Entrenadores");}
        break;
        case 3:
        op=true;
        break;
        }
      }
      if(d2==null){v.Imprimir("No se encontro la discipliona");
        op=true;}
    }
    
    }
   
   
   
   public static void DadoEvento(){
     Evento e2=null;String par="";boolean op=false;  
     while(!op){
        e2=Vectores.EvC(v.LeerString("Introduce la clave del Evento"));
         while(e2!=null && !op){
            int p=v.Opciones("Seleccione lo que desee hace\n1-Lista de Participantes\n2-Primer Lugar\n3-Segundo Lugar\n4-Tercer Lugar\n5-Participantes\n6-Salir",7);
             switch(p){
              case 1:
                if(Vectores.ParCEve(e2.getClaveEve()).size()!=0){ 
                  for(int i=0;i<Vectores.ParCEve(e2.getClaveEve()).size();i++){   
                   Vector <Participacion>  vTem=Vectores.ParCEve(e2.getClaveEve());
                   v.Imprimir("Participante "+(i+1)+Vectores.JugC((vTem.elementAt(i)).getClaJugador()).Yosoy()+"\nEntrenador: "+    
                   Vectores.EntC((Vectores.ParCJ(vTem.elementAt(i).getClaJugador())).elementAt(0).getClaEntrenador()).getNombre()+"\nDisciplina: "+
                   Vectores.DisC((Vectores.ParCJ(vTem.elementAt(i).getClaJugador())).elementAt(0).getClaDisciplina()).getNombreDis());
                    }              
                 }else{
                    v.Imprimir("El evento no tiene participantes");
                    }
             break;
              case 2:
               if(Vectores.ParticipacionConLogro(1).size()!=0){ 
                  EvetoDat(e2,1); 
                 }else{
                    v.Imprimir("No hay primer Lugar");
                    }
             break;
             case 3:
              if(Vectores.ParticipacionConLogro(2).size()!=0){ 
                EvetoDat(e2,2);      
                 }else{
                    v.Imprimir("No hay segundo Lugar");
                    }
              break;
             case 4:
                if(Vectores.ParticipacionConLogro(3).size()!=0){
                  EvetoDat(e2,3);
                 }else{
                       v.Imprimir("No hay con Tercer Lugar");
                    }
              break;
             case 5:
               if(Vectores.ParticipacionConLogro(4).size()!=0){
                  EvetoDat(e2,4);
                }else{v.Imprimir("No hay participantes");}
              break;
             case 6:
               op=true;
               break;
            }
        }if(e2==null){v.Imprimir("No se encontro el Evento");
        op=true;}}
   }
    
   public static void EvetoDat(Evento e2,int p){
     for(int i=0;i<Vectores.ParticipacionConLogro(p).size();i++){   
                   if(Vectores.ParticipacionConLogro(p).elementAt(i).getClaEvento().equals(e2.getClaveEve())){
                   v.Imprimir(Vectores.JugC(Vectores.ParticipacionConLogro(p).elementAt(i).getClaJugador()).Yosoy()+"\nEntrenador: "+
                   Vectores.EntC(Vectores.ParticipacionConLogro(p).elementAt(i).getClaEntrenador()).getNombre()+"\nDisciplina: "+
                   Vectores.DisC(Vectores.ParticipacionConLogro(p).elementAt(i).getClaDisciplina()).getNombreDis());
                   }        
                  }
    }
   
   public static void DadoJugador(){
    boolean op=false;
      while(!op){
        j=Vectores.JugC(v.LeerString("Introduce la clave del Jugador"));
          while(j!=null && !op){
            String disc="";String disc2="";String disc3="";
            int p=v.Opciones("Seleccione lo que desee hace\n1-Evento donde Participa\n2-Entrenador que tiene\n3-Disciplina que practica\n4-Evento 1er Lugar\n5-Evento 2do Lugar\n6-Evento 3er Lugar\n7-Evento como Participante\n8-Salir",9);
             switch(p){
               case 1:
                 if(Vectores.ParCJ(j.getClaveJug()).size()!=0){
                   for(int i=0;i<Vectores.ParCJ(j.getClaveJug()).size();i++){
                       if(Vectores.ParCJ(j.getClaveJug()).elementAt(i).getClaEvento()!=null){
                           v.Imprimir("Evento "+(i+1)+Vectores.EvC(((Participacion)Vectores.ParCJ(j.getClaveJug()).elementAt(i)).getClaEvento()).EsteSoy()+"\nEntrenador: "+
                           Vectores.EntC(((Participacion)Vectores.ParCJ(j.getClaveJug()).elementAt(i)).getClaEntrenador()).getNombre());  
                           }
                   }
                 }else{
                     v.Imprimir("No tiene evento");
                 }   
                break;
               case 2:
                 if(Vectores.ParCJ(j.getClaveJug()).size()!=0){
                    for(int i=0;i<Vectores.ParCJ(j.getClaveJug()).size();i++){
                        if(Vectores.ParCJ(j.getClaveJug()).elementAt(i).getClaEntrenador()!=null){
                           v.Imprimir("Disciplina"+(i+1)+Vectores.EntC(((Participacion)Vectores.ParCJ(j.getClaveJug()).elementAt(i)).getClaEntrenador()).Yosoy());
                          }
                     }
                    }else{
                        v.Imprimir("No tiene entrenador");
                 }
                break;
               case 3:
                 if(Vectores.ParCJ(j.getClaveJug()).size()!=0){
                   for(int i=0;i<Vectores.ParCJ(j.getClaveJug()).size();i++){
                       if(Vectores.ParCJ(j.getClaveJug()).elementAt(i).getClaEntrenador()!=null){
                           v.Imprimir(Vectores.DisC(((Participacion)Vectores.ParCJ(j.getClaveJug()).elementAt(i)).getClaDisciplina()).EstaSoy());    
                        }
                    }
                 }else{
                     v.Imprimir("No tiene disciplina");
                 }
                break;
               case 4:
                 if(Vectores.ParCJ(j.getClaveJug()).size()!=0 && Vectores.ParticipacionConLogro(1).size()!=0){
                   Jugador(j,1);
                   }else{
                     v.Imprimir("No hay eventos registrado con 3er Lugar");
                 }
               break;
               case 5:
                 if(Vectores.ParCJ(j.getClaveJug()).size()!=0 && Vectores.ParticipacionConLogro(2).size()!=0){
                   Jugador(j,2);
                   }else{
                     v.Imprimir("No hay eventos registrado con 2do Lugar");
                 }
               break;
               case 6:
                 if(Vectores.ParCJ(j.getClaveJug()).size()!=0 && Vectores.ParticipacionConLogro(3).size()!=0){
                   Jugador(j,3);
                   }else{
                     v.Imprimir("No hay eventos registrado con 3er Lugar");
                 }
               break;
               case 7:
                 if(Vectores.ParCJ(j.getClaveJug()).size()!=0 && Vectores.ParticipacionConLogro(4).size()!=0){
                   Jugador(j,4);
                   }else{
                     v.Imprimir("No hay eventos registrado con Participante");
                 }
               break;
               case 8:
               op=true;
                break;
        }
      }if(j==null){v.Imprimir("No se encontro el jugador");
        op=true;}
    }
    
   } 
   public static void Jugador(Jugador j,int p){
    String msj3="";boolean entre3=false;             
    for(int i=0;i<Vectores.ParticipacionConLogro(p).size();i++){
                       if(Vectores.ParticipacionConLogro(p).elementAt(i).getClaJugador().equals(j.getClaveJug())){
                        v.Imprimir(Vectores.EvC(Vectores.ParCJ(j.getClaveJug()).elementAt(i).getClaEvento()).EsteSoy()+"\nCon Entrenador: "+
                        Vectores.EntC(((Participacion)Vectores.ParCJ(j.getClaveJug()).elementAt(i)).getClaEntrenador()).getNombre()+"\nCon Disciplina: "+
                        Vectores.DisC(((Participacion)Vectores.ParCJ(j.getClaveJug()).elementAt(i)).getClaDisciplina()).getNombreDis());    
                        entre3=true;
                           }else{
                            msj3="No ha ganado el "+p+" Lugar";
                            }
                   }if(msj3!=null && entre3==false){v.Imprimir(msj3);
                    }
                 
    }
  
    public static void DadoEntrenador(){
     boolean op=false;
       while(!op){   
         en=Vectores.EntC(v.LeerString("Introduce la clave del Entrenador"));   
           while(en!=null && !op){
            String disc="";String disc2="";String disc3="";   
             int p=v.Opciones("Seleccione lo que desee hacer\n1-Disciplina que tiene\n2-Evento que participa\n3-Jugadores que manda\n4-Evento 1er Lugar\n5-Evento 2do Lugar\n6--Evento 3er Lugar\n7-Evento Participante\n8-Salir",9);
             switch(p){
               case 1:
                 if(Vectores.ParCE(en.getClaveEnt()).size()!=0){
                    for(int i=0;i<Vectores.ParCE(en.getClaveEnt()).size();i++){
                       if(Vectores.ParCE(en.getClaveEnt()).elementAt(i).getClaDisciplina()!=null){
                           v.Imprimir("Disciplina "+(i+1)+Vectores.DisC(((Participacion)Vectores.ParCE(en.getClaveEnt()).elementAt(i)).getClaDisciplina()).EstaSoy());
                        }}
                   }else{
                    v.Imprimir("No tiene disciplina asignada");
                 }
                break;
              case 2:
                if(Vectores.ParCE(en.getClaveEnt()).size()!=0){
                   for(int i=0;i<Vectores.ParCE(en.getClaveEnt()).size();i++){
                       if(Vectores.ParCE(en.getClaveEnt()).elementAt(i).getClaEvento()!=null){
                         v.Imprimir("Evento "+(i+1)+Vectores.EvC(((Participacion)Vectores.ParCE(en.getClaveEnt()).elementAt(i)).getClaEvento()).EsteSoy());
                        }
                    }
                   }else{
                    v.Imprimir("No tiene evento");
                }
                break;
              case 3:
                if(Vectores.ParCE(en.getClaveEnt()).size()!=0){
                  for(int i=0;i<Vectores.ParCE(en.getClaveEnt()).size();i++){
                      if(Vectores.ParCE(en.getClaveEnt()).elementAt(i).getClaJugador()!=null){ 
                         v.Imprimir("Jugador "+(i+1)+Vectores.JugC(((Participacion)Vectores.ParCE(en.getClaveEnt()).elementAt(i)).getClaJugador()).Yosoy());
                        }
                    }
                  }else{
                    v.Imprimir("No tiene jugadores asignados");
                }
                break;
              case 4:
                 if(Vectores.ParticipacionConLogro(1).size()!=0){
                     EntrenadorDat(en,1);
                    }else{
                     v.Imprimir("No hay eventos registrado con 1er Lugar");
                 }
               break;
               case 5:
                 if(Vectores.ParticipacionConLogro(2).size()!=0){
                   EntrenadorDat(en,2);
                    }else{
                     v.Imprimir("No hay eventos registrado con 2do Lugar");
                 }
               break;
               case 6:
                 if(Vectores.ParticipacionConLogro(3).size()!=0){
                  EntrenadorDat(en,3);
                 }else{
                     v.Imprimir("No hay eventos registrado con 3er Lugar");
                 }
               break;
               case 7:
                 if(Vectores.ParticipacionConLogro(4).size()!=0){
                    EntrenadorDat(en,4);
                    }else{
                     v.Imprimir("No hay eventos registrado con Participante");
                 }
               break;
              case 8:
                op=true;
                break;
            }  
          }if(en==null){
              v.Imprimir("No se encontro el entrenador");
              op=true;
              break;
          }
      }
   }
   
    public static void EntrenadorDat(Entrenador en,int p){
       String msj0="";boolean entre0=false;                  
       for(int i=0;i<Vectores.ParticipacionConLogro(p).size();i++){
                       if(Vectores.ParticipacionConLogro(p).elementAt(i).getClaEntrenador().equals(en.getClaveEnt())){
                        v.Imprimir(Vectores.EvC((Vectores.ParCE(en.getClaveEnt()).elementAt(i)).getClaEvento()).EsteSoy()+"\nCon jugador: "+
                        Vectores.JugC(((Participacion)Vectores.ParCE(en.getClaveEnt()).elementAt(i)).getClaJugador()).getNombre()+"\nEn disciplina: "+
                        Vectores.DisC(((Participacion)Vectores.ParCE(en.getClaveEnt()).elementAt(i)).getClaDisciplina()).getNombreDis());
                        entre0=true;
                           }else{
                            msj0="No ha gando el "+p+" Lugar";
                        }}
                   if(msj0!=null && entre0==false){v.Imprimir(msj0);}
                 
    }
    
    public static void Eliminar ()throws Exception{
     boolean op=false;
      while(!op){
        int p=v.Opciones("Seleccione lo que desee eliminar\n1-Entrenador\n2-Jugador\n3-Disciplina\n4-Evento\n5-Participacion\n6-Salir",7);
        switch(p){
          case 1:
           if(Vectores.vecEntrenador.size()!=0){
              Vectores.eliminarEntC(v.LeerString("Introduce la clave del entrenador a eliminar")); 
            }else{
                v.Imprimir("No hay entrenadores, no puede ejecutar el método");
           }
           break;
          case 2:
           if(Vectores.vecJugador.size()!=0){
              Vectores.eliminarJugC(v.LeerString("Introduce la clave del jugador a eliminar"));
            }else{
                v.Imprimir("No hay jugadores, no puede ejecutar el método");
            }
           break;
          case 3:
           if(Vectores.vecDisciplina.size()!=0){
              Vectores.eliminarDisC(v.LeerString("Introduce la clave de la disciplina a eliminar"));
            }else{
                v.Imprimir("No hay disciplinas, no puede ejecutar el método");
            }
           break;
          case 4: 
           if(Vectores.vecEvento.size()!=0){
              Vectores.eliminarEvC(v.LeerString("Introduce la clave del evento a eliminar"));
            }else{
                v.Imprimir("No hay eventos, no puede ejecutar el método");
            }
           break;
          case 5:
           if(Vectores.vecParticipacion.size()!=0){
              String b=v.LeerString("Introduce la clave del jugador para eliminar su participacion");   
               if(Vectores.JugC(b)!=null){    
                   Vectores.eliminarParCJu(b); 
                   Vectores.JugC(b).RegParti().removeAllElements();
                   v.Imprimir("Participacion eliminada");
                }else{
                     v.Imprimir("No existe dicho jugador");
              }
           }else{v.Imprimir("No hay participaciones, no puede ejecutar el método");}
           break;
          case 6:
            op=true;
            break;
        }
      }
   } 
   
    public static void Agregar()throws Exception{
      boolean op=false;
        while(!op){
          int p=v.Opciones("Seleccione lo que desea agregar\n1-Entrenador\n2-Jugador\n3-Disciplina\n4-Evento\n5-Participacion\n6-Salir De Agregar",7);
          switch (p){
           case 1:
             Entrenador entrenador=CrearEntrenador();
             Vectores.vecEntrenador.add(entrenador);
             v.Imprimir("Se agrego el entrenador: "+entrenador.Yosoy());
             break;
           case 2:
             Jugador jugador=CrearJugador();
             Vectores.vecJugador.add(jugador);
             v.Imprimir("Se agrego al jugador "+jugador.Yosoy());
             break;
           case 3:
             Disciplina disciplina=CrearDisciplina();
             Vectores.vecDisciplina.add(disciplina);
             v.Imprimir("Se agrego la disciplina "+disciplina.EstaSoy());
             break;
           case 4:
             Evento evento=CrearEvento();
             Vectores.vecEvento.add(evento);
             v.Imprimir("Se agrego el evento "+evento.EsteSoy());
             break;
           case 5:        
             if(Vectores.vecEntrenador.size()!=0 && Vectores.vecJugador!=null && Vectores.vecEntrenador!=null && Vectores.vecEvento!=null){//size()==0
                Participacion participacion=CrearParticipacion();
                 if(participacion!=null){
                     Vectores.vecParticipacion.add(participacion); 
                     v.Imprimir("Se asigno la participacion correctamente "+participacion.DatPar());
                  }else{
                      v.Imprimir("Lo sentimos, no se pudo generar una participacion");
                }
              }else{
                       v.Imprimir("Lo sentimos, no hay datos suficientes para crear una participacion");
             }
             break;
           case 6:
             op=true;
             break;
        }
      }
    } 
    
    public static void Cuantos(){
     boolean op=false;Evento e2=null;
        while(!op){
          int p=v.Opciones("Seleccione la estadistica:\n1-Jugadores Con Participacion hay\n2-Jugadores hay\n3-Entrenadores hay\n4-Disciplinas hay\n5-Eventos hay\n6-1er Lugar\n7-2do Lugar\n8-3er Lugar\n9-Premio Participante\n10-Salir De Cuantos",11);
          switch(p){
            case 1:
               v.Imprimir("Hay en total "+String.valueOf(Vectores.vecParticipacion.size())+" participantes");
               break;
            case 2:
               v.Imprimir("Hay en total "+String.valueOf(Vectores.vecJugador.size())+" jugadores");
               break;
            case 3:
               v.Imprimir("Hay en total "+String.valueOf(Vectores.vecEntrenador.size())+" entrenadores");
               break;
            case 4:
               v.Imprimir("Hay en total "+String.valueOf(Vectores.vecDisciplina.size())+" disciplinas");
               break;
            case 5:
               v.Imprimir("Hay en total "+String.valueOf(Vectores.vecEvento.size())+" eventos");
               break;
            case 6:
               v.Imprimir("Hay en total "+String.valueOf(Vectores.ParticipacionConLogro(1).size())+" Primeros Lugares");
               if(Vectores.ParticipacionConLogro(1).size()!=0){
               for(int i=0;i<Vectores.ParticipacionConLogro(1).size();i++){
                    v.Imprimir(Vectores.JugC(Vectores.ParticipacionConLogro(1).elementAt(i).getClaJugador()).Yosoy()+"\nEvento: "+
                    Vectores.EvC(Vectores.ParticipacionConLogro(1).elementAt(i).getClaEvento()).getNombreEve()+"\nEntrenador: "+
                    Vectores.EntC(Vectores.ParticipacionConLogro(1).elementAt(i).getClaEntrenador()).getNombre()+"\nDisciplina: "+
                   Vectores.DisC(Vectores.ParticipacionConLogro(1).elementAt(i).getClaDisciplina()).getNombreDis());
                }}     
                  break;
            case 7:
               v.Imprimir("Hay en total "+String.valueOf(Vectores.ParticipacionConLogro(2).size())+" Segundos Lugares");
               if(Vectores.ParticipacionConLogro(2).size()!=0){
               for(int i=0;i<Vectores.ParticipacionConLogro(2).size();i++){
                  v.Imprimir(Vectores.JugC(Vectores.ParticipacionConLogro(2).elementAt(i).getClaJugador()).Yosoy()+"\nEvento: "+
                  Vectores.EvC(Vectores.ParticipacionConLogro(2).elementAt(i).getClaEvento()).getNombreEve()+"\nEntrenador: "+
                  Vectores.EntC(Vectores.ParticipacionConLogro(2).elementAt(i).getClaEntrenador()).getNombre()+"\nDisciplina: "+
                   Vectores.DisC(Vectores.ParticipacionConLogro(2).elementAt(i).getClaDisciplina()).getNombreDis());
                }}
               break;
            case 8:
               v.Imprimir("Hay en total "+String.valueOf(Vectores.ParticipacionConLogro(3).size())+" Terceros Lugares");
               if(Vectores.ParticipacionConLogro(3).size()!=0){
                 for(int i=0;i<Vectores.ParticipacionConLogro(3).size();i++){
                  v.Imprimir(Vectores.JugC(Vectores.ParticipacionConLogro(3).elementAt(i).getClaJugador()).Yosoy()+"\nEvento: "+
                  Vectores.EvC(Vectores.ParticipacionConLogro(3).elementAt(i).getClaEvento()).getNombreEve()+"\nEntrenador: "+
                  Vectores.EntC(Vectores.ParticipacionConLogro(3).elementAt(i).getClaEntrenador()).getNombre()+"\nDisciplina: "+
                   Vectores.DisC(Vectores.ParticipacionConLogro(3).elementAt(i).getClaDisciplina()).getNombreDis());
                }
                }
               break;
            case 9:
               v.Imprimir("Hay en total "+String.valueOf(Vectores.ParticipacionConLogro(4).size())+" Participantes");
               if(Vectores.ParticipacionConLogro(4).size()!=0){
                 for(int i=0;i<Vectores.ParticipacionConLogro(3).size();i++){
                  v.Imprimir(Vectores.JugC(Vectores.ParticipacionConLogro(3).elementAt(i).getClaJugador()).Yosoy()+"\nEvento: "+
                  Vectores.EvC(Vectores.ParticipacionConLogro(3).elementAt(i).getClaEvento()).getNombreEve()+"\nEntrenador: "+
                  Vectores.EntC(Vectores.ParticipacionConLogro(4).elementAt(i).getClaEntrenador()).getNombre()+"\nDisciplina: "+
                   Vectores.DisC(Vectores.ParticipacionConLogro(4).elementAt(i).getClaDisciplina()).getNombreDis());
                }
                }
               break;
            case 10:
               op=true;
               break;
         }
      }
    }
   public static int Clav(Vector vec){
    return (vec.size())+1;
    } 
   public static Jugador  CrearJugador(){
    return new Jugador(v.LeerCadenaLetras("Introduce el nombre"),v.LeerCadenaLetras("Introduce el apellido"),v.LeerPositivo("Introduce la edad"),
    v.Opciones("Introduce el sexo\n1-Hombre\n2-Mujer",3),v.LeerEntero("Introduce el tiempo de entrenaminedo"),"P"+(Clav(Vectores.vecJugador))+"J"+(int)(Math.random()*100)+"U");
    } 
   public static Entrenador CrearEntrenador(){
    return new Entrenador(v.LeerCadenaLetras("Introduce el nombre"),v.LeerCadenaLetras("Introduce el apellido"),v.LeerPositivo("Introduce la edad"),
    v.Opciones("Introduce el sexo\n1-Hombre\n2-Mujer",3),"E"+(Clav(Vectores.vecEntrenador))+"N"+(int)(Math.random()*100)+"T");
    }  
   public static Disciplina CrearDisciplina(){
    return new Disciplina("D"+(Clav(Vectores.vecDisciplina)+"S"+(int)(Math.random()*100)+"P"),v.LeerCadenaLetras("Introduce el nombre de la disciplina"),v.Opciones("Seleccione el tipo de disciplina\n1-Individual\n2-Grupal",3));
    }  
   public static Evento CrearEvento(){
    return new Evento("E"+(Clav(Vectores.vecEvento)+"V"+(int)(Math.random()*100)+"E"),v.LeerCadenaLetras("Introduce el nombre del evento"));
    }   
    
    
    public static String asigarLogro(String eve, String dis){
    String Lo=" ";boolean opv=false;boolean op=false;
    Vector <Participacion>  vec;
    while(!op){
    vec=Vectores.ParaLogro(dis,Vectores.ParCEve(eve));    
     int opl=v.Opciones("Introduce el logro\n1-Primer Lugar\n2-Segundo Lugar\n3-Tercer Lugar\n4-Participante",5);
     if(opl==1){
       Lo="Primer Lugar";
        if(vec.size()!=0){
         for(int i=0;i<vec.size();i++){
            if(vec.elementAt(i).getLogro().equalsIgnoreCase(Lo)){
               v.Imprimir("Logro ya existenteeeeeeeeeee");
               op=true;
               break;
           }else{
              return Lo;
             }
        }
       }else{
        return Lo;
        }
    }else if(opl==2){
     Lo="Segundo Lugar";
     if(vec.size()!=0){
         for(int i=0;i<vec.size();i++){
            if(vec.elementAt(i).getLogro().equalsIgnoreCase(Lo)){
               v.Imprimir("Logro ya existenteeeeeeeeeee");
               op=true;
               break;
           }else{
              return Lo;
             }
        }
       }else{
        return Lo;
        }}
     else if(opl==3){   
    Lo="Tercer Lugar";
     if(vec.size()!=0){
        for(int i=0;i<vec.size();i++){
           if(vec.elementAt(i).getLogro().equalsIgnoreCase(Lo)){
              v.Imprimir("Logro ya existenteeeeeeeeeee");
              op=true;
              break;
           }else{
              return Lo;
             }
        }
       }else{
        return Lo;
        }}
      else{return "Participante";}
     }
     return null;
   }
    
    
     public static Participacion CrearParticipacion(){
      String logro=""; Evento e2=null;Disciplina d2=null;
       boolean op=false,op1=false,op2=false,op3=false,op4=false,opv=false;boolean listo=false;
       while(!op){
       e2=Vectores.EvC(v.LeerString("Introduce la clave del evento"));
       if(e2!=null){ 
       v.Imprimir("Evento encontrado");
        op=true;
        break;
        }else{
        v.Imprimir("Ese evento no existe ");    
        op=true;op1=true;op2=true;op3=true;op4=true;
        break;
       }}
       while(!op1){
       j=Vectores.JugC(v.LeerString("Introduce la clave del Jugador"));
       if(j!=null){
        if(Vectores.ParCJ(j.getClaveJug()).size()!=0){   
        for(int i=0;i<Vectores.ParCJ(j.getClaveJug()).size();i++){
            Vector <Participacion> vec=(Vectores.ParCEyCJ(Vectores.ParCEve(e2.getClaveEve()),j.getClaveJug()));
                if(vec.size()!=0){
            v.Imprimir("Ya tiene participacion aquí");op1=true;op2=true;op3=true;op4=true;break;
        }else{
          v.Imprimir("Jugador encontrado");
          op1=true;break;}}}else{
          v.Imprimir("Jugador encontrado");
          op1=true;break;
            }
        }else{
        v.Imprimir("No existe el jugador");
        op1=true;op2=true;op3=true;op4=true;
        }    
       }
       while(!op2){
        en=Vectores.EntC(v.LeerString("Introduce la clave del entrenador"));
        if(en!=null){   
        v.Imprimir("Entrenador encontrado");
        op2=true;
        break;
        }else{
           v.Imprimir("Ese entrenador no existe");
           op2=true;op3=true;op4=true;
           break;
        }
       }
       while(!op3){
        d2=Vectores.DisC(v.LeerString("Introduce la clave de la disciplina"));
        if(d2!=null){
           v.Imprimir("Disciplina encontrada");
           op3=true;
           break;
        }else{
           v.Imprimir("No existe la disciplina");
           op3=true;op4=true;
        }}
        if(!op4){
        logro=asigarLogro(e2.getClaveEve(),d2.getClaveDis());
        if(logro!=null){
        op4=true;
        listo=true;}else{return null;}
        }
        if(listo==true){
        return new Participacion(e2.getClaveEve(),j.getClaveJug(),en.getClaveEnt(),d2.getClaveDis(), logro); 
        }
       return null;
   }
}