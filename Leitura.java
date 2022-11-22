//ROdrigo Mero de Omena 2209152

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
    public static String entDados(String rotulo){
        System.out.println(rotulo);
        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(teclado);
        String s = "";
        try{
            s = buff.readLine();

        }catch (IOException err){
            System.out.println(err);
        }
        return s;
    }
}
