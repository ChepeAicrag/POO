public class Cuadrado extends Poligono{
    private double lado; //Los 4 lados del cuadrado
    
    //Un solo párametro y método para establecer los 4 lados
    public Cuadrado(double medidaLados,Punto p){
        super(p,"Cuadrado");
        setLado(medidaLados);
        
    }
    
    /*
     * Se omitió el uso del <else> en el set de los lados, puesto que por 
     * defecto java cosidera una variable sin inicializar como 0. Y si no 
     * se cumple la condicion ladoX > 0, pasará a tener el valor por defecto 
     * de java, es decir 0, como se dijo anteriormente.
     */
    public void setLado(double lado){
        if(lado > 0){
            this.lado= lado;
        }
    }
    
    public double getLado1(){
        return lado;
    }
    
    public double calcArea(){
        return lado * lado;
    }
    
    public double calcPerimetro(){
        return lado*4;
    }
    
    public String toString(){
    return super.toString()+" sus lados miden: "+getLado1();
    }
}