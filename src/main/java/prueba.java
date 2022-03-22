
import java.io.*;

/**
 * Write a description of class array_u here.
 * @author (your name) @version (a version number or a date)
 */
public class prueba
{

    /* instance variables - replace the example below with your own*/

    /**
     *
     */
    static public void main()
    {
        int tamaño = 0;
        int x = 0;
        int y = 0;
        int calculo = 0;
        BufferedReader teclado =  new  BufferedReader( new  InputStreamReader(System.in));
        System.out.println("Tamaño: ");
        int[] array =  new  int[10];
        int[] arrays = {7, 7, 7, 7, 7, 7, 7, 7, 8, 7};
        x = 0;
        while (x < 10) {
            System.out.printf("\nValor %d: ", x + 1);
            array[x] = arrays[y];
            calculo = array[x] % 7;
            y = y + 1;
            x = x + 1;
        }
    }
}