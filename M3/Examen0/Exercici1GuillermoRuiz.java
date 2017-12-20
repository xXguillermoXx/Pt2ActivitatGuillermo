import java.io.*; 
public class Exercici1GuillermoRuiz {
    public static void main(String[] args) throws IOException {
        int i;
        int x;
        int z=0;
        int g=0;
        int suma;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el primer numero=");
        String numero11 = reader.readLine();
        int numero1 = Integer.parseInt(numero11);
        System.out.println("Introduce el segundo numero=");
        String numero22 = reader.readLine();
        int numero2 = Integer.parseInt(numero22);
        if(numero1==numero2){
			System.out.println("La suma del rango es="+numero1);
		}
        if(numero1>numero2){
			System.out.println("Error");
		}
        if(numero1>0){
			if(numero1<numero2){
				for(i=numero1+1;i<=numero2-1;i++){
					g=g+i;
				}
			suma=numero1+numero2+g;
			System.out.println("La suma del rango es="+suma);
			}
		
		
		}
		else if(numero1<0){
			if(numero1<numero2){
				for(x=numero2-1;x>numero1+1;x--){
					z=x+x;
				}
			suma=numero2+numero1+z;
			System.out.println("La suma del rango es="+suma);
			}
		}
		
    }
}
