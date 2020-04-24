public class Refresco
{
 private int nuvas;
 public Refresco(int nuvas){
    setnuvas(nuvas);
    }
 public void setnuvas(int nuvas){
    if(nuvas>0){
    this.nuvas=nuvas;
    }
    else{
    nuvas=0;
    }
    }
 public int getnuvas(){
    return nuvas;
    }   
}
