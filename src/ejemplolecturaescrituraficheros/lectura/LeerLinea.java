/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolecturaescrituraficheros.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author otorradomiguez
 */
public class LeerLinea {
    Scanner sc1;
    File fichero;
    
    public void leerLinea(String nomeFichero){
        fichero=new File(nomeFichero);
        try{
        sc1=new Scanner(fichero);
        while(sc1.hasNextLine()){
            System.out.println(sc1.nextLine());
        }
        }catch(FileNotFoundException e){
            e.getMessage();
            System.out.println("Error");
        }
    }
    
    public void leerIntConDelimitador(String nomeFichero){
        fichero=new File(nomeFichero);
        try{
        sc1=new Scanner(fichero);
        sc1.useDelimiter(",\\s*");
        while(sc1.hasNext()){
            System.out.println(sc1.next());
        }
        }catch(FileNotFoundException e){
            e.getMessage();
            System.out.println("Error");
        }
    }  
}
