public class MaxMin {
    public static void main(String[] args){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int [] arr={5,2,8,1,9};
        for(int i = 0;i<arr.length;i++){
if (arr[i]>max) {
    max = arr[i];
}
 if (arr[i]<min) {
    min = arr[i];
}
        }
        System.out.println("The max element is "+max);
        System.out.println("The min element is "+min);

    }
}
