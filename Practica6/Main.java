class Main {
    public static void main(String [] args){
        int[] arr1= {1,2,3};
        int[] arr2= {5,6,7,8};
        int[] arr= fusionar(arr1,arr2);
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    } 

    public static int[] fusionar(int[] a, int[] b){
        int tam= a.length+b.length;
        int[] res= new int[tam];
        int pos=0;
        for(int i=0;i<a.length;i++){
            res[pos]= a[i];
            pos++;
        }
        for(int i=0;i<b.length;i++){
            res[pos]= b[i];
            pos++;
        }
        return res;
    }
}