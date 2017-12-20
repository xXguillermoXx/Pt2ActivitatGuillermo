import java.io.*; 
public class Exercici12 {
    public static void main(String[] args) throws IOException {
        int i;
        int x;
        int z;
        int array_numero1[];
        int array_numero2[];
        int array_total[];
        array_numero1 = new int[10];
        array_numero2 = new int[10];
        array_total = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el numero del primer array=");
        String array = reader.readLine();
        array_numero1[0] = Integer.parseInt(array);
        System.out.println("Introduce el numero del segundo array=");
        String array2 = reader.readLine();
        array_numero2[0] = Integer.parseInt(array2);
        for (i=0;i<10;i++){
			if(i==0){
				System.out.print(array_numero1[0]+", ");
				continue;
			}
			array_numero1[i] = array_numero1[0];
			array_numero1[i] = array_numero1[i]+i;
			if(i==9){
				System.out.println(array_numero1[i]);
				break;
			}
			System.out.print(array_numero1[i]+", ");
			
		}
		for (x=0;x<10;x++){
			if(x==0){
				System.out.print(array_numero2[0]+", ");
				continue;
			}
			array_numero2[x] = array_numero2[0];
			array_numero2[x] = array_numero2[x]+x;
			if(x==9){
				System.out.println(array_numero2[x]);
				break;
			}
			System.out.print(array_numero2[x]+", ");
		}
		for (z=0;z<10;z++){
			array_total[z] = array_numero1[z]+array_numero2[z];
			if(z==9){
				System.out.println(array_total[z]);
				break;
			}
			System.out.print(array_total[z]+", ");
		}
    }
}
