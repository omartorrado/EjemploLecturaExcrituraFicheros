/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolecturaescrituraficheros.escritura;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author otorradomiguez
 */
public class Escribir {
    File fichero;
    PrintWriter p=null;
    
    public void escribirTexto(String nombreFichero){
        try{
            fichero=new File(nombreFichero);
            p=new PrintWriter(fichero);
            p.println("probando escribir nun fichero");
            p.println("con varias lineas");
            p.println("de texto");
        }
        catch (Exception e){
            System.out.println("Error");
        }
        finally{
            p.close();
        }
    }
}
