import java.util.*;
public class ArregloPer
{      
 private Persona[] arregloper=new Persona[5000];    
 public ArregloPer(){
   String nombresM[]={"Maria","Elena","Ana","Laura","Monserrat","Diana","Lizeth","Marlen","Jennifer","Jessica","Rubi","Ivonne","Abril","Hannia","Carolina","Paola","Anahi","Joahana"}; 
   String nombresH[]={"Juan","Pedro","Kevin","David","Melvin","Sergio","Daniel","José","Ricardo","ELmer","Uriel","Aaron","Jesus","Ángel","Alejandro","Paul","Jairo","Mateo"};
   String apellidos[]={"Garcia","Perez","Sanchez","Gonzalez","Sierra","Pascual","Cortez","Vasquez","Chavez","Díaz",
                       "Delgado","Muñoz","Palma","Gutierrez","Martinez","Wariste","Cruz","Campos"}; 
   for(int i=0;i<5000;i++){                    
   int s=(int)(Math.random()*2);
   if(s==1){                   
    arregloper[i]=new Persona(nombresH[(int)(Math.random()*(nombresH.length))],apellidos[(int)(Math.random()*(apellidos.length))],apellidos[(int)(Math.random()*(apellidos.length))],
    (int)(Math.random()*100+1),s);
   }else{
   arregloper[i]=new Persona(nombresM[(int)(Math.random()*(nombresM.length))],apellidos[(int)(Math.random()*(apellidos.length))],apellidos[(int)(Math.random()*(apellidos.length))],
   (int)(Math.random()*100+1),s);
   }
   }
  }
  
 public Vector TodosLosHombres(){
  Vector <Persona> todos=new Vector <Persona>();
  for(int i=0;i<5000;i++){  
     if(arregloper[i].getSexo()=='H'){
      todos.add(arregloper[i]);
     }
  }
  return todos;
}

 public Vector TodasLasMujeres(){
  Vector <Persona> todos=new Vector <Persona>();
  for(int i=0;i<5000;i++){
     if(arregloper[i].getSexo()=='M'){
        todos.add(arregloper[i]);
     }
  }
  return todos;
}

 public Vector MujeresMayorDeEdad(){
  Vector <Persona> todos=new Vector <Persona>();
  for(int i=0;i<TodasLasMujeres().size();i++){
     if(((Persona)TodasLasMujeres().get(i)).getEdad()>=18){
       todos.add((Persona)TodasLasMujeres().get(i));
     }
  }
  return todos;
}

 public Vector HombresMayorDeEdad(){
  Vector <Persona> todos=new Vector <Persona>();
  for(int i=0;i<TodosLosHombres().size();i++){
     if((((Persona)TodosLosHombres().get(i)).getEdad())>=18){
       todos.add(((Persona)TodosLosHombres().get(i)));
     }
  }
  return todos;
}

 public Vector TodosMayorDeEdad(){
  Vector <Persona> todos=new Vector <Persona>();
  for(int i=0;i<5000;i++){
    if(arregloper[i].getEdad()>=18){
    todos.add(arregloper[i]);
    }
  }
  return todos;
}
 
 public Vector TodosMenorDeEdad(){ //cambiando solciona el error
  Vector <Persona> todos=new Vector <Persona>();
  for(int i=0;i<5000;i++){
      if(arregloper[i].getEdad()<18){//if(!(TodosMayorDeEdad().contains(arregloper[i]))){
         todos.add(arregloper[i]);
      }
  }
  return todos;
}

 public Vector HombresMenorDeEdad(){ 
  Vector <Persona> todos=new Vector <Persona>();
  Vector Tam=HombresMayorDeEdad();
  for(int i=0;i<Tam.capacity();i++){
      if(!(Tam.contains(arregloper[i]))){
         todos.add(arregloper[i]);
      }
  }
  return todos;
}

  public Vector MujeresMenorDeEdad(){ //Se pasa el array
  Vector <Persona> todos=new Vector <Persona>();
  for(int i=0;i<TodasLasMujeres().size();i++){
      if(!(MujeresMayorDeEdad().contains(arregloper[i]))){
         todos.add(arregloper[i]);
      }
  }
  return todos;
}

public Vector TodosMayorDeX(int x){
  Vector <Persona> todos=new Vector <Persona>();
  for(int i=0;i<5000;i++){
    if(arregloper[i].getEdad()>=x){
    todos.add(arregloper[i]);
    }
  }
  return todos;
}

public Vector HombresMayorDeX(int x){
  Vector <Persona> todos=new Vector <Persona>();
  for(int i=0;i<TodosMayorDeX(x).size();i++){
    if(((Persona)TodosMayorDeX(x).get(i)).getSexo()=='H'){
    todos.add(((Persona)TodosMayorDeX(x).get(i)));
    }
  }
  return todos;
}

public Vector MujeresMayorDeX(int x){
  Vector <Persona> todos=new Vector <Persona>();
  for(int i=0;i<TodosMayorDeX(x).size();i++){
    if(((Persona)TodosMayorDeX(x).get(i)).getSexo()=='M'){
    todos.add(((Persona)TodosMayorDeX(x).get(i)));
    }
  }
  return todos;
}

public Vector TodosMenorDeX(int x){ //soluciona el error de bsuqueda cambiando
  Vector <Persona> todos=new Vector <Persona>();
  for(int i=0;i<5000;i++){
    if(arregloper[i].getEdad()<x){  //if(!(TodosMayorDeX(x).contains(arregloper[i]))){
    todos.add(arregloper[i]);
    }
  }
  return todos;
}

 public Vector HombresMenorDeX(int x){ //error de array
  Vector <Persona> todos=new Vector <Persona>();
  for(int i=0;i<TodosMenorDeX(x).size();i++){
    if(((Persona)TodosMenorDeX(x).get(i)).getSexo()=='H'){
    todos.add(((Persona)TodosMenorDeX(x).get(i)));
    }
  }
  return todos;
}

 public Vector MujeresMenorDeX(int x){ //error de array
  Vector <Persona> todos=new Vector <Persona>();
  for(int i=0;i<TodosMenorDeX(x).size();i++){
    if(((Persona)TodosMenorDeX(x).get(i)).getSexo()=='M'){
    todos.add(((Persona)TodosMenorDeX(x).get(i)));
    }
  }
  return todos;
}

 public Vector TodasLasMujeresNombreConChar(char x){ 
  Vector <Persona> todos=new Vector <Persona>();
  for(int i=0;i<TodasLasMujeres().size();i++){
    if(((Persona)TodasLasMujeres().get(i)).getNombre().charAt(0)==x){
      todos.add(((Persona)TodasLasMujeres().get(i)));
   }
  }
  return todos;
}
  
 public Vector MujeresMenorDeXyNombreCharY(int x,char y){ 
  Vector <Persona> todos=new Vector <Persona>();
  Vector Tam=MujeresMenorDeX(x);
  for(int i=0;i<Tam.size();i++){
    if(((Persona)Tam.get(i)).getNombre().charAt(0)==y){
    todos.add(((Persona)Tam.get(i)));
    }
  }
  return todos;
}

 public Vector TodosLosHombresNombreConChar(char x){ 
  Vector <Persona> todos=new Vector <Persona>();
  for(int i=0;i<TodosLosHombres().size();i++){
    if(((Persona)TodosLosHombres().get(i)).getNombre().charAt(0)==x){
      todos.add(((Persona)TodosLosHombres().get(i)));
   }
  }
  return todos;
}

 public Vector HombresMenorDeXyNombreCharY(int x,char y){ 
  Vector <Persona> todos=new Vector <Persona>();
  Vector Tam=HombresMenorDeX(x);
  for(int i=0;i<Tam.size();i++){
    if(((Persona)Tam.get(i)).getNombre().charAt(0)==y){
    todos.add(((Persona)Tam.get(i)));
    }
  }
  return todos;
}

public Vector MujeresMayorDeEdadyNombreCharY(char y){ 
  Vector <Persona> todos=new Vector <Persona>();
  Vector Tam=MujeresMayorDeEdad();
  for(int i=0;i<Tam.size();i++){
    if(((Persona)Tam.get(i)).getNombre().charAt(0)==y){
    todos.add(((Persona)Tam.get(i)));
    }
  }
  return todos;
}

public Vector HombresMayorDeEdadyNombreCharY(char y){ 
  Vector <Persona> todos=new Vector <Persona>();
  Vector Tam=HombresMayorDeEdad();
  for(int i=0;i<Tam.size();i++){
    if(((Persona)Tam.get(i)).getNombre().charAt(0)==y){
    todos.add(((Persona)Tam.get(i)));
    }
  }
  return todos;
}
}
