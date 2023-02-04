import java.util.Arrays;

public class Merge_Sort{
    public static void main(String[] args) {
        int []arr = {5,54,84,6,2,99,16};
        new Merge_Sort().mergesort(arr,0,arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
    public void mergesort(int [] arr,int left,int right){
        if(left<right){
            mergesort(arr, left, (left+right)/2);
            mergesort(arr, (left+right)/2 + 1, right);
            merge(arr,left,(left+right)/2,right);
        }

    }
    public void merge(int [] arr,int left,int mid,int right){
        int []temp = new int[arr.length];
        int k=left,lf=left,rh=mid+1;
        while(lf<=mid && rh<=right){
            if(arr[lf]<arr[rh])
                temp[k++] = arr[lf++];
            else
                temp[k++] = arr[rh++];

        }
        if(lf>mid){
            while(rh<=right){
                temp[k++] = arr[rh++];
            }
        }
        else{
            if(rh>right){
                while(lf<=mid){
                    temp[k++] = arr[lf++];
                }
            }
        }
        for(int i=left;i<=right;i++){
            arr[i] = temp[i];
        }
        //

    }
}