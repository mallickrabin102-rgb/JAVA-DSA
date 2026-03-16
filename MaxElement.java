public class MaxElement {
    public static void main(String[] args){
        int[] arr = {5, 8, 7, 9, 10};
        int Max = arr[0];
        for(int i=1;i<arr.length;i++){
if (arr[i]>Max) {
    Max = arr[i];
}
        }
        System.out.println("The max element is "+Max);
    }
}
