public class Ejercicio2 {

    public static void main (String[] args) {
        int[] arr = new int[25];
        int n = (int)(Math.random()*9+1);
        for(int i = 0; i < n  ;i++){
            arr[(int)(Math.random()*24+1)] = (int)(Math.random()*9+1);
        }
		int[] arr2 = new int[n];
		int i = 0;
		for(int j = 0; j < arr.length; j++){
			if(arr[j] >= 1){
				arr2[i] = j;
				i++;
			}
		}
		System.out.print("Se cargan "+n+" numeros.");
		System.out.print("\n\n| "+arr[0]+" | "+arr[1]+" | "+arr[2]+" | "+arr[3]+" | "+arr[4]+" |");
		System.out.print("\n| "+arr[5]+" | "+arr[6]+" | "+arr[7]+" | "+arr[8]+" | "+arr[9]+" |");
		System.out.print("\n| "+arr[10]+" | "+arr[11]+" | "+arr[12]+" | "+arr[13]+" | "+arr[14]+" |");
		System.out.print("\n| "+arr[15]+" | "+arr[16]+" | "+arr[17]+" | "+arr[18]+" | "+arr[19]+" |");
		System.out.print("\n| "+arr[20]+" | "+arr[21]+" | "+arr[22]+" | "+arr[23]+" | "+arr[24]+" |");
		
		System.out.print("\n\n\n[");
		for(int k = 0; k < arr2.length; k++){
			System.out.print(arr2[k]+", ");
		}
		System.out.print("\b\b]");
		
    }
}
