public  class Triangulo extends Poligono{
    private double base, lado1, lado2, altura;
    
    public Triangulo(double base, double lado1, double lado2,double altura,Punto p){
        super(p,"Triangulo");
        setBase(base);
        setLado1(lado1);
        setLado2(lado2);
        setAltura(altura); 
        
    }
    
    public void setBase(double base){
        if(base > 0)
            this.base = base;
    }
    
    public double getBase(){
        return base;
    }
    
    public void setLado1(double lado1){
        if(lado1 > 0)
            this.lado1 = lado1;
    }
    
    public double getLado1(){
        return lado1;
    }
    
    public void setLado2(double lado2){
        if(lado2 > 0)
            this.lado2 = lado2;
    }
    
    public double getLado2(){
        return lado2;
    }
    
   
    public   void setAltura(double altura){
        if(altura > 0)
            this.altura = altura;
    }
    
    public double getAltura(){
    return altura;
    }
    
    public double calcArea(){
        return (base * altura)/2;
    }
    
    public double calcPerimetro(){
        return (base + lado1 + lado2);
    }
    
    public String toString(){
    return super.toString()+" su base mide: "+getBase()+", su altura mide "+getAltura()+", sus lados miden: "+getLado1()+" y "+getLado2();
    }
}