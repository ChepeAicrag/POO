public class Puerta
{
   private boolean estado;
   private Cerrojo cerr;
   public Puerta(boolean estado, Cerrojo cerr){
    setestado(estado);
    setcerrojo(cerr);
    }
   public void setestado(boolean estado){
    this.estado=estado;
    } 
   public boolean getestado(){
    return estado;
    } 
   public void setcerrojo(Cerrojo cerr){
    this.cerr=cerr;
    } 
   public Cerrojo getcerrojo(){
    return cerr;
    } 
}
