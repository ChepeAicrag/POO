import java.io.*;
public class Participacion implements Serializable
{
    private String ClaEvento,ClaJugador, ClaEntrenador,ClaDisciplina,logro;
    Participacion(String e, String j,String en,String d,String logro){
    setClaEvento(e);
    setClaJugador(j);
    setClaEntrenador(en);
    setClaDisciplina(d);
    setLogro(logro);
    }
    public void setClaEvento(String e){
    ClaEvento=e;
    }
    public String getClaEvento(){
    return ClaEvento;
    }
    public void setClaJugador(String j){
    ClaJugador=j;
    }
    public String getClaJugador(){
    return ClaJugador;
    }
    public void setClaEntrenador(String en){
    ClaEntrenador=en;
    }
    public String getClaEntrenador(){
    return ClaEntrenador;
    }
    public void setClaDisciplina(String d){
    ClaDisciplina=d;
    }
    public String getClaDisciplina(){
    return ClaDisciplina;
    }
    public void setLogro(String lo){
    logro=lo; 
    }
    public String getLogro(){
    return logro;
    }
    public String DatPar(){
    return "\nEl jugador clave: "+ClaJugador+"\nEntrenador: "+getClaEntrenador()+"\nDisciplina: "+getClaDisciplina()+"\nEvento: "+getClaEvento()+"\nLogro: "+getLogro();
    }
}
