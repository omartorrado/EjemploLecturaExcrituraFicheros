/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolecturaescrituraficheros.lectura;

import ejemplolecturaescrituraficheros.Jugador;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author otorradomiguez
 */
public class LeerObjeto {

    Scanner sc1;
    ArrayList <Jugador> lista;

    public void leerObj(String nombreFichero) {
        try {
            sc1 = new Scanner(new File(nombreFichero));
            while(sc1.hasNextLine()){
                System.out.println(sc1.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error. No se encuentra el archivo");
        }
        finally{
            sc1.close();
        }
    }
    
    public void leerObjetos(String nombreFichero){
        lista=new ArrayList<>();
        try{
            sc1=new Scanner(new File(nombreFichero));
            while(sc1.hasNextLine()){
                String[] aux;
                aux=sc1.nextLine().split(",");
                Jugador j=new Jugador(aux[0],Integer.parseInt(aux[1]));
                lista.add(j);
            }
            leerLista();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public void leerLista(){
        for(int i=0;i<lista.size();i++){
        System.out.println(lista.get(i));
    }
    }

}
