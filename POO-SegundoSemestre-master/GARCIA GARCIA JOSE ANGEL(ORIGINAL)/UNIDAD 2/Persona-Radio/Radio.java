public class Radio
{
 private boolean estado, estacion;
 private float amac, fmac,fmmax,ammax;
 private int vol,volmax;
 public Radio(boolean estacion,float esta){
    estado=false;volmax=100;fmmax=1000;ammax=600;
    setestacion(estacion,esta);
    }
 public void setestado(boolean estado){
    this.estado=estado;
    }
 public boolean getestado(){
    return estado;
    }
 public void setestacion(boolean estacion,float esta){ // El true indica am y el false fm
    this.estacion=estacion;
    if(estacion==true&&esta<ammax){
    setamac(esta);
    }
    else if(estacion==false&&esta<fmmax){
    setfmac(esta);
    }
    }
 public boolean getestacion(){
    return estacion;
    }   
 public void setamac(float amac){
    this.amac=amac;
    }   
 public float getamac(){
    return amac;
    }    
 public void setfmac(float fmac){
    this.fmac=fmac;
    }   
 public float getfmac(){
    return fmac;
    }    
 public void setfmmax(){
    this.fmmax=fmmax;
    }   
 public float getfmmax(){
    return fmmax;
    }   
 public void setammax(){
    this.ammax=ammax;
    }   
 public float getammax(){
    return ammax;
    }
 public void setvol(int vol){
    if(vol>0){
    this.vol=vol;
    }
    }
 public int getvol(){
    return vol;
    }   
 public void setvolmax(int volmax){
    this.volmax=volmax;
    }   
 public int getvolmax(){
    return volmax;
    }   
}

