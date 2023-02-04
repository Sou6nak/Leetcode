import java.util.*;
public class Cloud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int n = sc.nextInt(),m=sc.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        int total = n*m;
        int row = n,col = 0;
        while(total>0){
            for(int i=0;i<row;i++){
                System.out.print(arr[i][col]+" ");
                total-=1;
            }
            System.out.println();
            row-=1;
            col+=1;
            for(int i=col;i<m;i++){
                System.out.print(arr[row][i]+" ");
                total-=1;
            }    
            System.out.println();      
        }
    }
}
