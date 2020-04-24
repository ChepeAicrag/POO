public class Pentagono extends Poligono{
    private double lado,  apotema; 
    public Pentagono( double medidaLado,Punto p){
        super(p,"Pentagono");
        setLado(medidaLado); 
        setApotema();
    }
    
    /*
     * Se omitió el uso del <else> en el set de los lados, puesto que por 
     * defecto java cosidera una variable sin inicializar como 0. Y si no 
     * se cumple la condicion ladoX > 0, pasará a tener el valor por defecto 
     * de java, es decir 0, como se dijo anteriormente.
     */
    public void setLado(double lado){
        if(lado > 0){
            this.lado = lado;
        }
    }
    
    public double getLado(){
        return lado;
    }
    
   
    /* Para calcular el apotema del pentagono.           */
    private double calcAngulo(){
        //Angulo central = 360/N --> N = número de lados
        return 360/5; //Devuelve 72
    }
    
    /*
     * El apotema dependerá de la medida de los lados que tenga el pentagono, 
     * por lo que no tendría sentido que el usuario establezca el apotema. 
     * Usando la fórmula para un apotema de un polígono regular.
     */
    public void setApotema(){
        /*
         * Math.sqrt = Raíz cuadrada | Math.tan = tangente(número) 
         * Math.toRadians = Convierte Grados a Radianes.
         * Por lo que java maneja las funciones trigonométricas en radianes, es necesario 
         * poner en el argumento de la función trigonométrica de grados a radianes.
         */
        apotema = lado/(2 * (Math.tan(Math.toRadians(calcAngulo()/2))));
        /*
         * Si se manejará grados la formula se vería así: >> lado/2*[tan(36)] <<
         * Pero al manejarse radianes, y usando Math.toRadians para que
         * quede correctamente,la fórmula quedará así: >> lado/2*[tan(0.628319)] <<
         */
    }
    
    public double getApotema(){
        return apotema;
    }
    
    public double calcArea(){
        return (calcPerimetro() * apotema)/2;
    }
    
    public double calcPerimetro(){
        return lado *5;
    }
    
    public String toString(){
    return super.toString()+", sus lados miden: "+getLado()+", su apotema mide: "+getApotema();
    }
}