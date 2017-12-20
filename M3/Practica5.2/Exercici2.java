import java.io.*; 
public class Exercici2 {
    public static void main(String[] args) throws IOException {
        int i;
        int x;
        int z=0;
        int contador=1;
        int matriz[][];
        matriz=new int[5][4];
        for(i=0;i<5;i++){
			System.out.println();
			for(x=0;x<4;x++){
				matriz[i][x] = contador;
				contador = contador + 1;
				System.out.print(matriz[i][x]+"\t");
				
				
			}
		}
	}
}
