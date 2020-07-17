/*
Crear un algoritmo que permita mostras una lista de datos para despues eliminar
algunos objetos de la lista.
 */
package colecciontarea1;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Enríquez Israel
 */
public class ColeccionTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("        UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-LATACUNGA");
        System.out.println("Nombre: Enríquez Israel");
        System.out.println("Curso: Programación ¨B¨");
        System.out.println("NRC: 7450");
        System.out.println("Tema: COLECCIÓN");
        //Hacemos la lista
        Collection listaArticulosPro = new ArrayList <String>(); //El tipo de lista de listaArticulosPro es collection
            listaArticulosPro.add("Resistencias");
            listaArticulosPro.add("Potenciometro 100k");
            listaArticulosPro.add("C.A.O 741");
            listaArticulosPro.add("Fuente de voltaje ");
            listaArticulosPro.add("Transistor 2n2222A");
            listaArticulosPro.add("Protoboard");
            listaArticulosPro.add("Voltímetro");
            listaArticulosPro.add("Led");
            listaArticulosPro.add("Pulsador");
                //creamos la lista de objetos
                String[]arr;
                //asignando memoria para los 12 meses del año
                arr= new String[9];
                //inicializa los elementos array
                arr[0]="Resistencias";
                arr[1]="Potenciometro 100k";
                arr[2]="C.A.O 741";
                arr[3]="Fuente de voltaje";
                arr[4]="Transistor 2n2222A";
                arr[5]="Protoboard";
                arr[6]="Voltímetro";
                arr[7]="Led";
                arr[8]="Pulsador";

             //accediendo a los elementos del array
            System.out.println("LISTA DE ELEMENTOS UTILIZADOS EN EL PROYECTO SON:");
                for(int i=0;i<arr.length; i++)
                System.out.println(+(i+1)+". "+arr[i]);
            System.out.println("NÚMERO TOTAL DE ELEMENTOS: "+listaArticulosPro.size());
            System.out.println("REMOVEMOS LOS ELEMENTOS QUE IMPIDAN LIBRE PASO"
                    + " DE CORRIENTE:");
            listaArticulosPro.remove("Resistencias");
            listaArticulosPro.remove("Potenciometro 100k");
            listaArticulosPro.remove("Pulsador");
            System.out.println("LOS ELEMENTOS ELIMINADOS SON TRES(Resistencias"
                    + ",Potenciometro 100k,Pulsador): ");
            System.out.println("LOS ELEMENTOS QUE QUEDAN SON: "+listaArticulosPro.size());
            System.out.println(listaArticulosPro.toString());
    }

}
