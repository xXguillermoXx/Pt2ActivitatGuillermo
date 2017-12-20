import java.io.*; 
public class Exercici3GuillermoRuiz {
    public static void main(String[] args) throws IOException {
        int i;
        int y;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce un numero=");
        String numero1 = reader.readLine();
        int numero = Integer.parseInt(numero1);
        if (numero==1){
			System.out.println("+");
		}
		else{
			System.out.print("+");
			for(i=0;i<numero-2;i++){
				System.out.print("-");
			}
			System.out.println("+");
			for (y=0;y<numero-2;y++){
				System.out.print("|");
				for(i=0;i<numero-2;i++){
					System.out.print(" ");
				}
				System.out.println("|");
			}
			System.out.print("+");
			for(i=0;i<numero-2;i++){
				System.out.print("-");
			}
			System.out.println("+");
		
		}
		
			
				
				
			
    }
}

