public class Persona
{
    private String nombre;
    public Persona(String nombre){
    setnombre(nombre);
    }
    public void setnombre(String nombre){
    this.nombre=nombre;
    }
    public String getnombre(){
    return nombre;
    }
    public void apagarencender(Radio r){
    r.setestado(!r.getestado());
    }
    public String cambiarestacion(Radio r, float est){ 
    if(r.getestado()==true){    
    if(r.getestacion()==true){
    r.setestacion(false,est);
    r.setamac(0);
    return "FM al estacion "+est;
    }
    else{
    r.setestacion(true,est);
    r.setfmac(0);
    return "AM a estacion "+est;
    }}
    return "No está encendido el radio";
    }
    public void subirvol(Radio r){
    if(r.getestado()==true && r.getvol()<r.getvolmax()){
      r.setvol(r.getvol()+1);
    }
    }
    public void bajarvol(Radio r){
    if(r.getestado()==true && r.getvol()>0){
      r.setvol(r.getvol()-1);
    }
    }
    public void subirestam(Radio r){
    if(r.getestado()==true&&r.getestacion()==true){
       if(r.getamac()<r.getammax()){
          r.setamac(r.getamac()+ (float)0.10);
         }
         else if(r.getamac()==r.getammax()){
             r.setamac(r.getammax());
    }}}
    public void bajarestam(Radio r){
    if(r.getestado()==true&&r.getestacion()==true&&r.getamac()>0){
    r.setamac(r.getamac()- (float)0.10);
    }
    }
    public void subirestfm(Radio r){
    if(r.getestado()==true&&r.getestacion()==false){
       if(r.getfmac()<r.getfmmax()){
          r.setfmac(r.getfmac()+ (float)0.10);
         }
         else if(r.getfmac()==r.getfmmax()){
             r.setfmac(r.getfmmax());
    }}}
    public void bajarestfm(Radio r){
    if(r.getestado()==true&&r.getestacion()==false&&r.getfmac()>0){
    r.setfmac(r.getfmac()- (float)0.10);
    }
    }
}
