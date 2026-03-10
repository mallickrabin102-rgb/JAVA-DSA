public class MaxElement {
    public static void main(String[] args){
        int[] arr = {5, 8, 7, 9, 10};
        int Max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
if (arr[i]>Max) {
    Max = arr[i];
}
        }
        System.out.println("The max element is "+Max);
    }
}
