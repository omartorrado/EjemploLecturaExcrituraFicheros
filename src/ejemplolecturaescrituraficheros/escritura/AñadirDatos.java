/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolecturaescrituraficheros.escritura;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author otorradomiguez
 */
public class AñadirDatos {
    PrintWriter añadir;
    FileWriter fichero;
    
    public void añadir(String nombreFichero,String dato){
        try{
            añadir=new PrintWriter(new FileWriter(nombreFichero,true));
            añadir.println(dato);
            System.out.println("listo");
        }
        catch(Exception e){
            System.out.println("Error");
        }
        finally{
            añadir.close();
        }
    }
}
