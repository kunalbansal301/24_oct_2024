 public class subarray {
    static boolean  maxLen(int arr[],int n){
        int maxi=0;
        boolean  isValid=false;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];

                if(sum==0){
                    maxi=Math.max(maxi,j-i+1);
                    isValid=true;
                }
            }

        }
        return isValid;
    }
    public static void main(String[] args) {
        
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int n= arr.length;
        System.out.println(maxLen(arr,n));


    }
    
}
