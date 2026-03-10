class LinearSearch{
    static int linearsearch(int[] arr,int target ){
for (int i = 0; i < arr.length; i++) {
    if (arr[i]==target) {
        return i;
    }
    
}
return -1;
    }
    public static void main(String[] args){
int [] arr = {5,2,8,1,9};
int result = linearsearch(arr, 8);
if (result==-1) {
    System.out.println("Element is not present in the array");
}
else{
    System.out.println("Element is present in the array and index is "+result);
}
    }
}