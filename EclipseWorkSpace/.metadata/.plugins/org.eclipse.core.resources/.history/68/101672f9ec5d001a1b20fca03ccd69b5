import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodigoBarras {
    public static void ean8(char[] entry, int length, StringBuilder x){
        int counter = 0;
        boolean par = false;
        for(int i=length-2; i>=0;i--){
            if(par){
                counter += entry[i]-'0';
                par = false;
            }else {
                counter += (entry[i]-'0') * 3;
                par = true;
            }
        }
        if((counter + entry[length-1] -'0')%10 == 0)
            x.append("SI\n");
        else
            x.append("NO\n");
    }

    public static void ean13(char[] entry, int length, StringBuilder x){
        int counter = 0;
        boolean par = false;
        for(int i=length-2; i>=0;i--){
            if(par){
                counter += entry[i]-'0';
                par = false;
            }else {
                counter += (entry[i]-'0') * 3;
                par = true;
            }
        }
        if((counter + entry[length-1]-'0')%10 == 0){
            if (length < 13 || entry[0] == '0') x.append("SI EEUU\n");
            else if (entry[0] == '3' && entry[1] == '8' && entry[2] == '0') x.append("SI Bulgaria\n");
            else if (entry[0] == '5') {
                if (entry[1] == '0') x.append("SI Inglaterra\n");
                else if (entry[1] == '3' && entry[2] == '9') x.append("SI Irlanda\n");
                else if (entry[1] == '6' && entry[2] == '0') x.append("SI Portugal\n");
                else x.append("SI Desconocido\n");
            }
            else if (entry[0] == '7') {
                if (entry[1] == '0') x.append("SI Noruega\n");
                else if (entry[1] == '5' && entry[2] == '9') x.append("SI Venezuela\n");
                else x.append("SI Desconocido\n");
            }
            else if (entry[0] == '8') {
                if (entry[1] == '5' && entry[2] == '0') x.append("SI Cuba\n");
                else if (entry[1] == '9' && entry[2] == '0') x.append("SI India\n");
                else x.append("SI Desconocido\n");
            }
            else x.append("SI Desconocido\n");
        }
        else
            x.append("NO\n");
    }

    public static void main(String[] args) throws IOException {
        StringBuilder x = new StringBuilder(8000);
        char[] entry = new char[128];
        int lenght;
        while((lenght = readLine(entry)) != 1 || entry[0] != '0') {
            if (lenght <= 8) {
                ean8(entry, lenght, x);
            } else if (lenght <= 13) {
                ean13(entry, lenght, x);
            } else {
                x.append("NO\n");
            }
        }
        System.out.print(x.toString());
    }

    /**
     * Reads a line from stdin, stops when a non digit is found
     * @param chars Array to fill
     * @return Length of the string
     * @throws IOException
     */
    public static int readLine(char[] chars) throws IOException {
        int c = System.in.read();
        int currentIndex = 0;
        while(c >= '0' && c <= '9'){
            chars[currentIndex++] = (char) c;
            c = System.in.read();
        }
        return currentIndex;
    }
}

