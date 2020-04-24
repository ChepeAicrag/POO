public abstract class Poligono{
    private String tipo;
    private Punto p;
    public Poligono(Punto p, String tipo){
        this.tipo=tipo;
        setpunto(p);
    } 
    public String centro(){
        return "Su centro esta ubicado en " + "(" + p.getx() + ", " + p.gety() + ")";
    }
    public void  setnombre (String tipo){
     this.tipo=tipo ;
    }
    public void setpunto(Punto p){
    this.p=p;
    }
    public Punto getpunto(){
    return p;
    }
    public abstract double calcArea();
    public abstract double calcPerimetro();
}