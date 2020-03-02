
public class Ejercicio3Angel{
	
	static int i=0;
	
	static int sumaArray(int[] arr){
		if(i==arr.length-1){
			return arr[i];
		}else{
			return arr[i++]+=sumaArray(arr);
		}
	}
}

