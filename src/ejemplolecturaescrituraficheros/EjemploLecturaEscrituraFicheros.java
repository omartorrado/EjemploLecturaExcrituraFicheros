/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolecturaescrituraficheros;

import ejemplolecturaescrituraficheros.escritura.*;

/**
 *
 * @author otorradomiguez
 */
public class EjemploLecturaEscrituraFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        try{
//            LeerLinea rl=new LeerLinea();
//            rl.leerIntConDelimitador("./src/ejemplofichero.omar");
//        }catch(Exception e){
//            System.out.println("Error");
//        }


//        LeerObjeto lo1 = new LeerObjeto();
//        lo1.leerObjetos("./src/ejemploficheroobjeto.omar");

        
        Escribir e1= new Escribir();
        e1.escribirTexto("./src/ejemploficheroescribir.omar");
        AñadirDatos ad1= new AñadirDatos();
        ad1.añadir("./src/ejemploficheroescribir.omar","En un lugar de la Mancha");
        ad1.añadir("./src/ejemploficheroescribir.omar","de cuyo nombre no quiero");
    }

}
