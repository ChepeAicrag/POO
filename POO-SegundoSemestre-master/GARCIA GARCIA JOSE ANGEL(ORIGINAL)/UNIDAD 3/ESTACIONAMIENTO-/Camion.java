public class Camion extends Vehiculo
{
    private int nt;
    public Camion(String marca, String color, int nt){
    super(marca,color);
    setnt(nt);
    }
    public void setnt(int nt){
    this.nt=nt;
    }
    public int getnt(){
    return nt;
    }
    public int CalcCobro(int hr){
    return (20*hr)+(2*nt);
    }
}
