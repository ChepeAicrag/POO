public class Moto extends Vehiculo
{
    private int nruedas;
    public Moto(String marca, String color, int nruedas){
    super(marca,color);
    setnruedas(nruedas);
    }
    public int CalcCobro(int hr){
       return hr*10; 
    }
    public void setnruedas(int nruedas){
    this.nruedas=nruedas;
    }
    public int getnruedas(){
    return nruedas;
    }
    
}
