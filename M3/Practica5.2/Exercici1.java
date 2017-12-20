import java.io.*; 
public class Exercici1 {
    public static void main(String[] args) throws IOException {
        int i;
        int x;
        int matriz[][];
        matriz=new int[5][4];
        for(i=0;i<5;i++){
			System.out.println();
			for(x=0;x<4;x++){
				matriz[i][x] = 1;
				System.out.print(matriz[i][x]);
			}
		}
    }
}
