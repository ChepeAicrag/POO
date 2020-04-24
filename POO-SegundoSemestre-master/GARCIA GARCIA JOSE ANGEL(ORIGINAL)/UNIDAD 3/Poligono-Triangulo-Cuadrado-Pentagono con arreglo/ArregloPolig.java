public class ArregloPolig{
    private int max;
    private Poligono[] a;
    private int hay;

    public ArregloPolig(int max){
        a=new Poligono[max];
        hay=-1;
    }

    public boolean lleno(){
        if(hay==a.length-1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean vacio(){
        if(hay==-1){
            return true;
        }
        else{
            return false;}
    }

    public boolean Agregar(Poligono I){
        if(lleno()!=true){
            hay+=1;
            a[hay]=I;
            return true;
        }
        else{
            return false;
        }
    }

    public int CuantosHay(){
        return hay+1;
    }

    public String Eliminar(int posicion){
         Poligono x;
        if(posicion<0 || posicion>hay){
            return "No está dentro del ancho del arreglo";
        }
        else{
            x=a[posicion];
            for(int i=posicion; i<hay;i++){
                a[i]=a[i+1];
                a[i+1]=null;
            }
            hay--;
            return "Se ha eliminado el Poligono en la pocisión: " + posicion;
        }
    }
   
    public Poligono RegresarPosicion(int pos){
        if(pos>=0 && pos<=hay){
            return a[pos];
        }
        else{
            return null;
        }
    }

    public int cuantosCuadrados(){
        int x=0;
        for(int i=0; i<=CuantosHay(); i++){
            if(RegresarPosicion(i) instanceof Cuadrado){
                x++;
            }
        }
        return x;
    }
    
    public int cuantostriangulos(){
        int y=0;
        for(int i=0; i<=CuantosHay(); i++){
            if(RegresarPosicion(i) instanceof Triangulo){
                y++;
            }
        }
        return y;
    }
    
    public int cuantosPentagonos(){
        int z=0;
        for(int i=0; i<=CuantosHay(); i++){
            if(RegresarPosicion(i) instanceof Pentagono){
                z++;
            }
        }
        return z;
    }
    public int cuantosOctagonos(){
        int o=0;
        for(int i=0; i<=CuantosHay(); i++){
            if(RegresarPosicion(i) instanceof Octagono){
                o++;
            }
        }
        return o;
    }
    public int cuantosHexagonos(){
        int h=0;
        for(int i=0; i<=CuantosHay(); i++){
            if(RegresarPosicion(i) instanceof Hexagono){
                h++;
            }
        }
        return h;
    }
}