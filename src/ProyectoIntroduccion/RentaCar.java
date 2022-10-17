package ProyectoIntroduccion;
import java.util.Scanner;
/**
 *
 * @author Diego Herrera López 
 * @author James Arias Avalos 
 */
public class RentaCar {
static String traduce (String pala, int idioma){
    //Variables
     
     int numerador=0;
     //fin variables
     //inicio de la libreria de lenguaje español
      String español [] = new String [49];
     //inicio de arreglos del menu 
     español [0]=("   Por favor seleccione una opción");
     español [1] = ("1. Mostar Vehiculos");
     español [2] = ("2. Mostrar los vehiculos disponibles");
     español [3] = ("3. Verificar el estado del vehiculos");
     español [4] = ("4. Retornar Vehiculos");
     español [5] = ("5. Alquilar Vehiculos");
     español [6] = ("6. Lista de vehiculos alquilados");
     español [7] = ("7. Cambio de idioma");
     español [8] = ("0. Salir");
     //fin de arreglos del menu
     //inciio del arreglo del caso 1 
     español [9] = ("Estos son todos los vehiculos:");
     español [10] = (": Disponible");
     español [11] = (": No esta Disponible");
     //fin del arreglo 1
     //inicio del caso 2
     español [12] = ("Todos estos son todos los vehiculos actualmente disponibles");
     //caso 3
     español [13] = ("Digite el vehiculo desea verificar su estado");
     español [14] = ("El auto seleccionado es ");
     español [15] = (" matricula ");
     español [16] = ("Se encuentra disponible para rentar");
     español [17] = ("El auto no esta disponible, ya que se encuentra alquilado ");//El auto esta alquilado por la persona
     español [18] = ("El auto esta alquilado por la persona ");
     español [19] = ("Su correo electronico es ");
     español [20] = ("Su telefono es ");
     español [21] = ("Su numero de cedula es ");
     //fin caso 3
     //inicio caso 4
     español [22] = ("Digite su cedula para conocer sus autos");
     español [23] = ("Actualmente no posee veiculos registrados");
     español [24] = ("Desea devolver el vehiculo ");
     español [25] = ("? Si/No");
     español[26] = ("El vehiculo ");
     español [27] = (", fue contratado por ");
     español [28] = ("Por un total de ");
     español [29] = (" días");
     español [30] = ("El total a pagar es de ,");
     español [31] = ("Cancelo la operaciÃ³n");
     español [32] = ("cedula no registrada");
     //fin del caso 4
     //inicio del caso 5
     español[33]=("Vehiculos disponibles para alquilar");
     español[34]=("Digite el auto que desea alquilar");
     español[35]=("Digite su numero de cedula");
     español[36]=("Hola bienvenido ");
     español[37]=(", por favor indique el monto a pagar por dia del auto");
     español[38]=("Indique la cantidad de dias que dispondra del vehiculo");
     español[39]=("->El auto ha sido alquilado con exito");
     //fin del caso 5
     //inicio del caso 6
     español[40]=("Cedula no encontrada");
     español[41]=("Hola que tal, digite su numero de cedula");
     español[42]=("Bienvenido ");
     español[43]=("Posee actualmente el auto ");
     español[44]=(" con matricula ");
     español[45]=("Actualmente no ha registrado vehiculos");
     español[46]=("Cedula mal digitada");
     //fin del caso 6
     //inicio del caso 7
     español[47]=("Digite el idioma a escoger");
     //fin del caso 7
     //inicio del final
     español[48]=("Gracias por usar nuestra plataforma");
     //fin del caso final
     //fin del la libreria de español
     
     //_
     
      //Inicio de la libreria de ingles
     String ingles [] = new String [49];
     ingles [0] = ("   Please select an option");
     ingles [1] = ("1. Show Vehicles");
     ingles [2] = ("2. Show available vehicles");
     ingles [3] = ("3. Check the status of the vehicle");
     ingles [4] = ("4. Return Vehicles");
     ingles [5] = ("5. Rent Vehicles");
     ingles [6] = ("6. List of rented vehicles");
     ingles [7] = ("7. Language change");
     ingles [8] = ("0. Exit");
     //fin de arreglos del menu
     //inciio del arreglo del caso 1
     ingles [9] = ("These are all vehicles:");
     ingles [10] = (": Available");
     ingles [11] = (": Not Available");
     //fin del arreglo 1
     //inicio del caso 2
     ingles [12] = ("All these are all vehicles currently available");
     //caso 
     ingles [13] = ("Type the vehicle you want to check its status");
     ingles [14] = ("The selected car is ");
     ingles [15] = (" Registration ");
     ingles [16] = ("It is available for rent");
     ingles [17] = ("The car is not available, as it is rented  ");
     ingles [18] = ("The car is rented by the person");
     ingles [19] = ("Your email is ");
     ingles [20] = ("Your phone is ");
     ingles [21] = ("Your card number is ");
     //fin caso 3
     //inicio caso 4
     ingles [22] = ("Enter your ID to know your cars");
     ingles [23] = ("It currently has no registered vehicles");
     ingles [24] = ("You want to return the vehicle " );
     ingles [25] = ("? Yes/Not");
     ingles [26] = ("The vehicle ");
     ingles [27] = (", was hired by "); 
     ingles [28] = ("For a total of ");
     ingles [29] = (" days");
     ingles [30] = ("The total to be paid is ");
     ingles [31] = ("I cancel the operation");
     ingles [32] = ("unregistered ID");
     ingles [33] = ("Vehicles available for rent");
     ingles [34] = ("Enter the car you want to rent");
     ingles [35] = ("Enter your id number");
     ingles [36] = ("Hello welcome ");
     ingles [37] = (", please indicate the amount to be paid per day of the car");
     ingles [38] = ("Indicate the number of days you will have the vehicle");
     ingles [39] = ("->The car has been successfully rented");
     //fin del caso 5
     //inicio del caso 6
     ingles [40] = ("ID not found");
     ingles [41] = ("Hello how about, type your id number");        
     ingles [42] = ("Welcome ");
     ingles [43] = ("He currently owns the car ");
     ingles [44] = (" with registration ");
     ingles [45] = ("Currently has not registered vehicles");
     ingles [46] = ("Mistyped ID");
      //fin del caso 6
     //inicio del caso 7
     ingles [47] = ("Enter the language to choose");
     //fin del caso 7
     //inicio del final
     ingles [48] = ("Thank you for using our platform");
     //fin del caso final
     //fin del la libreria de ingles
     
    //_ 
   boolean logrado=false;
        while (!logrado && numerador < 49)
        {      
            if (español[numerador].equals(pala)){
                logrado = true;
            }                     
            numerador = numerador + 1;
        }
        //si lo encontro       
        if (logrado == true)
        {
           numerador = numerador - 1;            
           if (idioma == 1) 
           {
               return español[numerador];
           }
           else if (idioma == 2) 
           {
               return  ingles[numerador];
           }
 
           else
               return "N/A";
        }
        else
        {
            return "N/E";
        }
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Algunos scanners  
   Scanner lector= new Scanner(System.in);
   Scanner ced = new Scanner(System.in);
   Scanner Letra = new Scanner(System.in);
   Scanner teclado=new Scanner(System.in);
   //int
   //Las variables que aparecen en amarillo es porque se igualan a 0 para despues usarlas
   int Konta=0;
   int Coun=0;
   int cedul;
   int Kon=0;         
   int contador=0; 
   int counter=0;  
   int Contadors=0;
   int auto;   
   int cedula;
   int Alqui;
   int precio;
   int salir=0;
   int respuesta;
   int y=0;
   int conta=0;
   int iden=0;
   int dias;
   int presivacio=0;//FUNCION ARREGLOS
   int DIAS;
   int DIAVACIO=0;//FUNCION ARREGLOS
   int pago=0;
   int idioma=1;
   //boleanas
   boolean identificacion;
   identificacion =false;
   boolean encontro;
   encontro = false;
   boolean carro;
   carro=true;
   String R;        
   String palabras ="salir";
     //libreria de los vehiculos       
    carro=true;
    String [] vehiculos= new String[12];
    vehiculos [0] = ("Nissan Frontier 2003");
    vehiculos [1] = ("Hyundai tucson 2010");
    vehiculos [2] = ("toyota hilux 2022");
    vehiculos [3] = ("Hyundai SANTA fe 2013");
    vehiculos [4] = ("Dodge/RAM RAM 2020");
    vehiculos [5] = ("ford ranger 2022");
    vehiculos [6] = ("Mitsubishi l200 2017");
    vehiculos [7] = ("Mitsubishi Montero SPORT 2003");
    vehiculos [8] = ("Toyota Fortuner 2016");
    vehiculos [9] = ("Toyota RAV4 2018");
    vehiculos [10] = ("Honda civic 2015");
    vehiculos [11] = ("nisan versa 2001");
    //Fin de libreria de vehiculos
    //inicio de la libreria de las matricula
    String [] matricula= new String[12];
    matricula [0] = ("5212");
    matricula [1] = ("7213");
    matricula [2] = ("1914");
    matricula [3] = ("1615");
    matricula [4] = ("1416");
    matricula [5] = ("1817");
    matricula [6] = ("1356");
    matricula [7] = ("1245");
    matricula [8] = ("2595");
    matricula [9] = ("3569");
    matricula [10] = ("4646");
    matricula [11] = ("1564");
//Fin de la matricula
//inicio de los precios 
    int [] presi= new int[12];
    presi [0] = (presivacio);
    presi [1] = (presivacio);
    presi [2] = (presivacio);
    presi [3] = (presivacio);
    presi [4] = (presivacio);
    presi [5] = (presivacio);
    presi [6] = (presivacio);
    presi [10] = (presivacio);
    presi [11] = (presivacio);
    //Fin de libreria de precios
    //Incio de libreria de Dias
    int []dia = new int[12];
    dia [0] = (DIAVACIO);
    dia [1] = (DIAVACIO);
    dia [2] = (DIAVACIO);
    dia [3] = (DIAVACIO);
    dia [4] = (DIAVACIO);
    dia [5] = (DIAVACIO);
    dia [6] = (DIAVACIO);
    dia [7] = (DIAVACIO);
    dia [8] = (DIAVACIO);
    dia [9] = (DIAVACIO);
    dia [10] = (DIAVACIO);
    dia [11] = (DIAVACIO);
    //Fin de libreria donde se almacena los pagos de cada persona
   // inicio de los nombres
        String [] nombres= new String[12];
    nombres [0] = ("James Kalith Arias Avalos");
    nombres [1] = ("Juan Carlos Santaolalla");
    nombres [2] = ("Diego Herrera Lopez ");
    nombres [3] = ("Dilan Chavrria Trinidad");
    nombres [4] = ("Kevin Sibaja Granados");
    nombres [5] = ("luis Pedro Perez Fonceca");
    nombres [6] = ("Vicente Fernandez Alameda");
    nombres [7] = ("Manuel Antonio Grutierrez Garro");
    nombres [8] = ("Scarlett Ingrid Johansson ");
    nombres [9] = ("Chistopher Alfaro Lopez");
    nombres [10] = ("Jose Pablo Garcia Laguna");
    nombres [11] = ("William perez Corella ");
    //fin de los nombres
  //Inicio libreria de las cedulas
    int [] cedulas= new int[12];
    cedulas [0] = (604800142);
    cedulas [1] = (604800143);
    cedulas [2] = (107800432);
    cedulas [3] = (204800142);
    cedulas [4] = (604780085);
    cedulas [5] = (604800132);   
    cedulas [6] = (201200123);
    cedulas [7] = (601111005);
    cedulas [8] = (603260125);
    cedulas [9]=  (202222022);
    cedulas [10] =(964800236);
    cedulas [11] =(601120111);
    //fin cedulas
     //Inicio libreria de correros
  String [] correos= new String[12];
  correos [0] = ("jamesarias23@gmail.com");
  correos [1] = ("juancarlos10@gmail.com");
  correos [2] = ("diegoherrera47@gmail.com");
  correos [3] = ("dilanchavarria@gmail.com");
  correos [4] = ("kevinsibaja14@gmail.com");
  correos [5] = ("luispedro145@gmail.com");
  correos [6] = ("vicentefernandez147@gmail.com");
  correos [7] = ("menuelantonio78@gmail.com");
  correos [8] = ("scarlettjohanson8@gmail.com");
  correos [9] = ("christopheralfaro710@gmail.com");
  correos [10] = ("josegarcia25@gmail.com");
  correos [11] = ("williamperez51@gmail.com");
  //Fin libreria de correos
   //Inicio libreria de telefonos
  int [] telefono = new int[12];
  telefono[0]=(81506639);
  telefono[1]=(84235681);
  telefono[2]=(86436053);
  telefono[3]=(89454316);
  telefono[4]=(89461313);
  telefono[5]=(86453970);
  telefono[6]=(87818283);
  telefono[7]=(81627898);
  telefono[8]=(84257895);
  telefono[9]=(76459564);
  telefono[10]=(81246891);
  telefono[11]=(85956584);
  //Fin libreria de telefonos
    //Inicio boleanas
         boolean [] alquila= new boolean[12];
    alquila [0] =(true);//Nissan Frontier 2003
    alquila [1] =(true);//Hyundai tucson 2010
    alquila [2] =(true);//toyota hilux 2022
    alquila [3] =(true);//Hyundai SANTA fe 2013
    alquila [4] =(true);//Dodge/RAM RAM 2020
    alquila [5] =(true);//ford ranger 2022
    alquila [6] =(true);//Mitsubishi l200 2017
    alquila [7] =(true);//Mitsubishi Montero SPORT 2003
    alquila [8] =(true);//"Toyota Fortuner 2016
    alquila [9] =(true);//Toyota RAV4 2018
    alquila [10] =(true);//Honda civic 2015
    alquila [11]=(true);//nisan versa 2001
    //Fin Boleanas 
       
    //Inicio de librerias improvisadas  
    int ident;
    int [] arreglo= new int [12];
    arreglo [0] = (iden);// 1) System.out.print.ln("la cedula persona que le presto el vehiculo es"+arreglo [1])
    arreglo [1] = (iden);
    arreglo [2] = (iden);  
    arreglo [3] = (iden);        
    arreglo [4] = (iden);
    arreglo [5] = (iden);
    arreglo [6] = (iden);
    arreglo [7] = (iden);
    arreglo [8] = (iden);
    arreglo [9] = (iden);
    arreglo [10] = (iden);
    arreglo [11] = (iden);
   //Fin de libreria improvisada 
   
    //inicio de menu
    System.out.println("Bienvenidos al Rent Car carritos Sibaja");
    System.out.println("Digite el idioma a escoger");
            System.out.println("1)español");
            System.out.println("2)ingles");
            System.out.print("-->");
            idioma = ced.nextInt();
   while (idioma>2){
    System.out.println("Digite el idioma a escoger");
            System.out.println("1)español");
            System.out.println("2)ingles");
            System.out.print("-->");
            idioma = ced.nextInt();       
   }
            
    do {
    System.out.println("______________________________________________");
    System.out.println(traduce("   Por favor seleccione una opción",idioma));
    System.out.println("");
    System.out.println(traduce("1. Mostar Vehiculos",idioma));
    System.out.println(traduce("2. Mostrar los vehiculos disponibles",idioma));
    System.out.println(traduce("3. Verificar el estado del vehiculos",idioma));
    System.out.println(traduce("4. Retornar Vehiculos",idioma));
    System.out.println(traduce("5. Alquilar Vehiculos",idioma));
    System.out.println(traduce("6. Lista de vehiculos alquilados",idioma));
    System.out.println(traduce("7. Cambio de idioma",idioma));
    System.out.println(traduce("0. Salir",idioma));
    System.out.println("______________________________________________");
    respuesta=lector.nextInt();
 
    //Fin del menu
    
    //Inicio de los casos
    switch (respuesta){  
        case 1:
            conta=0;
            contador=0;
         
            System.out.println(traduce("Estos son todos los vehiculos:",idioma));
             while(contador<12){  
                  
                   if ((alquila [contador])) {
                        System.out.print("-" + vehiculos [contador]);              
                        System.out.println(traduce(": Disponible",idioma));
           }//fin del if 
                   else {
                        System.out.print("-" + vehiculos [contador]);         
                        System.out.println(traduce(": No esta Disponible",idioma));
           }//fin else  
             contador=contador+1;
             }//fin while
             
             break;
         
        case 2:
                System.out.println(traduce("Todos estos son todos los vehiculos actualmente disponibles",idioma)); 
                conta=0;
                while(conta<12){    
                   if (!alquila [conta]) {
           } else {  System.out.println(conta+1 +". "+ vehiculos [conta]);
           } //fin if
           //fin if
                conta++;
             }//fin while
              System.out.println("");
            break;
            
        case 3:
             System.out.println(traduce("Digite el vehiculo desea verificar su estado",idioma));
             int indice=0;
             for (indice=0 ;indice<12;indice++){
              System.out.println((indice + 1) +") " + vehiculos [indice]);}//fin del for 
 
             auto=teclado.nextInt();
                 
                     System.out.println((traduce("El auto seleccionado es ",idioma) + vehiculos [auto-1]) + traduce(" matricula ",idioma) + matricula[auto-1]);
                     if (alquila [auto-1])
                         System.out.println(traduce("Se encuentra disponible para rentar",idioma));
                     
                     else {
                         System.out.println(traduce("El auto no esta disponible, ya que se encuentra alquilado ",idioma));
                                Coun=0;
                                while (counter<12){
                                 if (cedulas [Coun]==arreglo[auto-1]){
                                  System.out.println(traduce("El auto esta alquilado por la persona ",idioma) + nombres [Coun]);
                                  System.out.println(traduce("Su correo electronico es ",idioma) + correos [Coun]);
                                  System.out.println(traduce("Su telefono es ",idioma) + telefono[Coun]);
                                  System.out.println(traduce("Su numero de cedula es ",idioma) + cedulas [Coun]);
                                 }else{  
                                }//fin del else  
                                 Coun++;
                                 counter++;
                                }//fin del while  
                                }//fin del else principal
                     counter=0;
                     Coun=0;
        break;
        
        case 4:
            contador=0;
            counter=0;
           
            Konta=0;
            Coun=0;
            System.out.println(traduce("Digite su cedula para conocer sus autos",idioma));
            cedul = ced.nextInt();
            while (Coun<12){
                
                if ((cedulas [Coun])==cedul){
                  while(Konta<12){
                      if (arreglo[Konta]==0){
                        contador++;}
                        if (contador==12){
                         System.out.println(traduce("Actualmente no posee veiculos registrados",idioma));} 
                if((arreglo [Konta])==cedul){
                    System.out.println(traduce("Desea devolver el vehiculo ",idioma) + vehiculos[Konta] + traduce("? Si/No",idioma));
                    R=Letra.nextLine();
                    
                    if (R.equals("Si")||(R.equals("Yes"))){
                         System.out.println(traduce("El vehiculo ",idioma) + vehiculos[Konta] + traduce(", fue contratado por ",idioma) + presi[Konta]);
                    System.out.println(traduce("Por un total de ",idioma) + dia[Konta] + traduce(" días",idioma));
                    pago = dia[Konta]*presi[Konta];
                    System.out.println(traduce("El total a pagar es de ,",idioma) + pago);
                    presi[Konta]=0;
                    dia[Konta]=0;
                    alquila[Konta]=true;
                    arreglo [Konta]=0;
                    }else{
                        System.out.println(traduce("Cancelo la operación",idioma));
                        counter=0;
                    }
                    
                }else{Coun++;}//fin del else
                Konta++;
                
            }//fin while    
            }else{Coun++;
            counter++;
             if (counter==12){
                  System.out.println(traduce("cedula no registrada",idioma));
             }   
                }//fin del else
            }//fin while
            Coun=0;
            Konta=0;
            contador=0;
            counter=0;
            break;
        case 5:
            y=0;
     contador=0;
                System.out.println(traduce("Vehiculos disponibles para alquilar",idioma));
             while(contador<12){  
                   if ((alquila [contador])) {
                        System.out.println(contador+1 +". "+ vehiculos [contador]);    
           }//fin if
                contador=contador+1;
             }//fin while
         
                System.out.println(traduce("Digite el auto que desea alquilar",idioma));
                Scanner gatito = new Scanner(System.in);
                Alqui = gatito.nextInt();
                
            System.out.println(traduce("Digite su numero de cedula",idioma));
            Scanner cedu = new Scanner(System.in);
            cedula = cedu.nextInt();  
            
            while(!identificacion && y < 12){ 
                if ((cedulas [y]) == cedula){ 
                    System.out.println(traduce("Hola bienvenido ",idioma) + nombres [y] + traduce(", por favor indique el monto a pagar por dia del auto",idioma));
                    precio =lector.nextInt();
                    presi [Alqui-1] = (precio);
                    System.out.println(traduce( "Indique la cantidad de dias que dispondra del vehiculo",idioma));
                    DIAS =lector.nextInt();
                    dia [Alqui-1] = (DIAS);
                    arreglo [Alqui-1] = arreglo [Alqui-1]+cedula;        
                    alquila [Alqui-1] =false;//esto aqui declara que el carro se alquilo
                     System.out.println(traduce("->El auto ha sido alquilado con exito",idioma));
                        identificacion=true;
                }else{y=y+1;}//fin del else y el if        
           if (y==12)
                  System.out.println(traduce("Cedula no encontrada",idioma));
                }
              identificacion=false;//es importante ya que sin esto no declara las cedulas no encontadas
            
    System.out.println("");
            break;
            
        case 6:
            System.out.println(traduce("Hola que tal, digite su numero de cedula",idioma));
            cedul = ced.nextInt();
            while(Coun < 12){
                if ((cedulas [Coun]) == cedul){//
                    System.out.println(traduce("Bienvenido ",idioma) + nombres[Coun]);
                    while (!encontro && Konta < 12){//inicio del while
                    if ((arreglo [Konta]) == cedul){
                        System.out.println(traduce("Posee actualmente el auto ",idioma) + vehiculos[Konta] + traduce(" con matricula ",idioma) + matricula[Konta]);
                        encontro=false; 
                    }else{ Kon++;}//fin del else
                      Konta=Konta+1;
                    }//fin while
                }
           Coun=Coun+1;
       if (Kon==12)
            System.out.println(traduce("Actualmente no ha registrado vehiculos",idioma));
       Kon=0;
            }//fin While principal
            if (Konta<=0 )
            System.out.println(traduce("Cedula mal digitada",idioma));
             Konta=0;
            Coun=0;
            break;
            
        case 7:
            System.out.println(traduce("Digite el idioma a escoger",idioma));
            System.out.println("1)español");
            System.out.println("2)ingles");
            System.out.print("-->");
            idioma = ced.nextInt();
            while (idioma>2){
            System.out.println(traduce("Digite el idioma a escoger",idioma));
            System.out.println("1)español");
            System.out.println("2)ingles");
            System.out.print("-->");
            idioma = ced.nextInt();       
   }
            
            break;
            
        case 0:
            System.out.println(traduce("Gracias por usar nuestra plataforma",idioma));
            salir=1;
            break;      
    }
    
    }while (salir==0);
    
} 
    }