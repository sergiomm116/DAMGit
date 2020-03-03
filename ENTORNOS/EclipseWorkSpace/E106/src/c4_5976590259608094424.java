package Codigo_de_barras;

import java.io.IOException;

class CodigoBarras {
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
        if((counter + entry[length-1]-'0')%10 == 0)
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
            else if (entry.substring(0,3).equals("380")) x.append("SI Bulgaria\n");
            else if (entry.substring(0,2).equals("50")) x.append("SI Inglaterra\n");
            else if (entry.substring(0,3).equals("539")) x.append("SI Irlanda\n");
            else if (entry.substring(0,3).equals("560")) x.append("SI Portugal\n");
            else if (entry.substring(0,2).equals("70")) x.append("SI Noruega\n");
            else if (entry.substring(0,3).equals("759")) x.append("SI Venezuela\n");
            else if (entry.substring(0,3).equals("850")) x.append("SI Cuba\n");
            else if (entry.substring(0,3).equals("890")) x.append("SI India\n");
            else x.append("SI Desconocido\n");
        } else
            x.append("NO\n");
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8000);
        StringBuilder x = new StringBuilder(8000);
        char[] chars = new char[128];
        int length = readLine(chars);
        while(length != 1 || chars[0] != '0') {
            if (length <= 8) {
                ean8(entry, x);
            } else if (length <= 13) {
                ean13(entry, x);
            } else {
                x.append("NO\n");
            }
        }
        System.out.append(x.toString());
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