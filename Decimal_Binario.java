/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal_binario;

/**
 *
 * @author AleX
 */
public class Decimal_Binario {

    private final int[] array = {0, 0, 0, 0, 0, 0, 0, 0};
    private final int[] array2 = {1, 2, 4, 8, 16, 32, 64, 128};
    private int contador = 0;
    private String res = "";

    /**
     *
     * @param n entero entre 0-255
     * @return Retorna una cadena con la representacion binaria de 8 bits con
     * los 8 caracteres
     */
    public String binario(int n) {
        /*
        Condicion que sirve para comparar el parametro n
        con la suma binaria obtenida con el metodo sumabin
         */
        if (sumabin(array) != n) {
            //Cambia el digito 0 por un 1 y reinicia el contador
            if (array[contador] == 0) {
                array[contador] = 1;
                contador = 0;
                //Cambia el digito 1 a 0 y suma uno al contador
            } else {
                array[contador] = 0;
                contador++;
            }
            binario(n);
        } else {
            //Ordena los 8 caracteres de manera invertida para el resultado final
            for (int i = 7; i >= 0; i--) {
                res += array[i];
            }
        }
        return res;
    }

    private int sumabin(int[] f) {
        int suma = 0;
        for (int i = 0; i < 8; i++) {
            if (f[i] == 1) {
                suma += array2[i];
            }
        }
        return suma;
    }
}
