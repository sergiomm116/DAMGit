


public class Ejercicio1 {
	
	public static void main (String[] args) {
		int[][] arr = new int[3][3];
		int n = 1;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i][j] == 0){
					arr[i][j] = n;
					n++;
				}
			}
		}
		
		System.out.println("| "+arr[0][0]+" | "+arr[0][1]+" | "+arr[0][2]+" |\n| "+arr[1][0]+" | "+arr[1][1]+" | "+arr[1][2]+" |\n| "+arr[2][0]+" | "+arr[2][1]+" | "+arr[2][2]+" |");
	}
	
}

