/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author ESFOT
 */
public class Principal {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiantes[] estudiantes = new Estudiantes[5]; // va a ser un arreglo de datos de tipo estudiante  
        System.out.println("#####INFORMACION ESTUDIANTES#####");
        System.out.println("##ESTUDIANTES ");

        //--->1ER ESTUDIANTE 
        estudiantes[0] = new Estudiantes("Juan", "Perez", "1234567890");
        String[] m = {"Calculo","Arquitectura"}; //forma corta
        estudiantes[0].setMaterias(m);
        
        
        //---->2DO ESTUDIANTE
        estudiantes[1] = new Estudiantes("Maria", "Castro", "1722864483");
        String[] m1 = {"Calculo", "Arquitectura", "Fisica"};
        estudiantes[1].setMaterias(m1);
        
        
        //---->3ER ESTUDIANTE 
        estudiantes[2] = new Estudiantes("Pedro", "Benitez", "1712568672");
        String[] m2 = {"Calculo", "Arquitectura", "Fisica", "Programacion"};
        estudiantes[2].setMaterias(m2);
        
        
        //---> 4TO ESTUDIANTE
        estudiantes[3] = new Estudiantes("Jose", "Salvador", "1722884493");
        String[] m3 = {"Fisica", "Programacion", "Calculo"};
        estudiantes[3].setMaterias(m3);

         
        //----> 5TO ESTUDIANTE
        estudiantes[4] = new Estudiantes("Ana", "Martinez", "1712846852");
        String[] m4 = {"Calculo", "Arquitecctura", "Sistemas"};
        estudiantes[4].setMaterias(m4);
        
       //auxiliares para el contador
       int aux1 = 0;
       int aux2 = 0;
       int aux3 = 0;
       int aux4 = 0;
       int aux5 = 0;
       
       
        //for e impresiones 
        for(int i=0; i < estudiantes.length; i++){
           
            System.out.println("Estudiante" + "[" + (i+1)+ "]" );
            System.out.println("Nombre completo: " + estudiantes[i].getNombre() + " "+ estudiantes[i].getApellido());
            System.out.println("Cedula: " + estudiantes[i].getCedula());
            System.out.println("Materias: ");
            
            String[] materiasEstudiantes = estudiantes[i].getMaterias();
             
            for(int j=0; j < materiasEstudiantes.length ; j++){
            
            System.out.println( j+1 + "._" + materiasEstudiantes[j]);
            
               if( materiasEstudiantes[j].equals("Calculo")){
                   aux1++;
               }else if( materiasEstudiantes[j].equals("Fisica")){
                   aux2++;
               }else if( materiasEstudiantes[j].equals("Arquitectura")){
                   aux3++;
               }else if( materiasEstudiantes[j].equals("Programacion")){
                   aux4++;
               }else if( materiasEstudiantes[j].equals("Sistemas")){
                   aux5++;
               }
            
            }
            
         System.out.println(" ");
        }
        
        //RESUMEN
        System.out.println("#####RESUMEN MATERIAS#####");
        System.out.println("Calculo: " + aux1 );
        System.out.println("Fisica: " + aux2);
        System.out.println("Arquitectura: " + aux3);
        System.out.println("Programacion: " + aux4);
        System.out.println("Sistemas: " + aux5);
        
     
        
      
        
        
    }
    
}
    
    
    

/*######INFORMACION ESTUDIANTES ##########

  ##Estudiante 1
  Nombre Completo: Juan Perez
  Cedula: 172284545
  Materias:
  1. M1   
  2. M2

  ##Estudiante2
  asi completar....


  ######RESUMEN MATERIAS#######
  M1: 1
  M2: 3
  M3: 2
  M4: 2
  M5: 1
*/

/*
calculo 
arquitectura
fisica 
programacion
*/