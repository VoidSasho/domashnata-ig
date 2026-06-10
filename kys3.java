import java.util.Scanner;

public class kys3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];

        int glSum = 0;
        int vtSum = 0;

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

       
        for (int i = 0; i < n; i++) {
            glSum += a[i][i];
            vtSum += a[i][n - 1 - i];
        }

        System.out.println("Главна сума: " + glSum);
        System.out.println("Второстепенна сума: " + vtSum);
    }
}

