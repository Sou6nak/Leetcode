import java.util.*;
public class Rough{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kp = sc.nextLine();
        String [] arr = kp.split(" ");
        int [] array = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            array[i] = arr[i].length();
        }
        System.out.println(Arrays.toString(array));
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                
                if(array[i]>array[j]){
                    int take = array[i];
                    array[i] = array[j];
                    array[j] = take;
                    String hlpr = arr[i];
                    arr[i] = arr[j];
                    arr[j] = hlpr;
                }
            }
        } 
        System.out.println(Arrays.toString(array)+"\n"+Arrays.toString(arr));
        
    }
}
// class Helper implements Comparator<String>{
    
//     public int compare(String o1, String o2) {
//         // TODO Auto-generated method stub
//         return o1.length()-o2.length();
//     }
// }