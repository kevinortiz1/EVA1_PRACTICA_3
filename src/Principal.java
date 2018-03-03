/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Ortiz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iArreNum[][] = new int[5][5];
        for (int i = 0; i < iArreNum.length; i++) {
            for (int j = 0; j < iArreNum[i].length; j++) {
                iArreNum[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        //IMPRIMIR EL ARREGLO
        System.out.println("ARREGLO ORIGINAL");
        for (int i = 0; i < iArreNum.length; i++) {
            for (int j = 0; j < iArreNum[i].length; j++) {
                System.out.print("[" + iArreNum[i][j] + "]");
            }
            //SALTO DE LINEA 
            System.out.println("");
        }
        System.out.println("");
        //COPIA INVERSA DEL ARREGLO
        System.out.println("COPIA INVERSA DEL ARREGLO");
        int iArreCopia[][] = new int[5][5];
        for (int i = 0 , j = iArreNum.length-1; i < iArreNum.length; i++, j--) {
            for (int k = 0 , l= iArreNum[i].length-1; k < iArreNum[j].length; k++, l--) {
                iArreCopia[i][k] =  iArreNum[j][l];               
            }
            
        }
        //IMPRIMIR EL ARREGLO
        for (int i = 0; i < iArreCopia.length; i++) {
            for (int j = 0; j < iArreCopia[i].length; j++) {
                System.out.print("[" + iArreCopia[i][j] + "]");
            }
            //SALTO DE LINEA 
            System.out.println("");
        }
    }
}
