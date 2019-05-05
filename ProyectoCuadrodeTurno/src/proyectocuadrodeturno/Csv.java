/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocuadrodeturno;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Csv {
    
    String linea = null; 
    String [] valores ;
     String [] separadas = null;
    String cadena;
    ArrayList csvlista =new ArrayList<>();
    ArrayList csv =new ArrayList<>();
    File archivo = new File ("prueba.csv");
   public void csvd(){
     try {
            Scanner entrada = new Scanner(archivo);
            while (entrada.hasNext()){
                linea=entrada.nextLine();
                valores=linea.split(",");
                csvlista.add(valores[0]);
                
              // System.out.println (valores[0]+"h");
                }
            
          for (int i =1;i<csvlista.size();i++){
               cadena =(String) csvlista.get(i);
       separadas=cadena.split(";");
        for (int j =0;j<separadas.length;j++){
           // System.out.println(separadas[j]);  
            csv.add(separadas[j]);
               //System.out.println(linea+" h");
         //System.out.println(csvlista.get(0));
          } } 
     }
 catch (FileNotFoundException ex) {
            Logger.getLogger(Csv.class.getName()).log(Level.SEVERE, null, ex);
        }
}}
 