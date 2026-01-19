public class RecursionQuestions {
    public static void main(String[] args) {


      //  int res=fibo(0);
        //System.out.println("5th term = "+res);

        int arr[]={10,20,30,4,50};
        boolean isSortedRes=isSorted(arr,0);
        System.out.println(isSortedRes);

        String s="abbaa";
        boolean isPalinRes=ispalin(s,0,s.length()-1);
        System.out.println(isPalinRes);
    }

    static int fibo(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int a = fibo(n-1);
        int b = fibo(n-2);
        return a+b;
    }

    static boolean isSorted(int[] arr,int i)
        {
            if(i==arr.length-1) return true;

            if(arr[i]>arr[i+1]) return false;
            //3-->4

            return isSorted(arr,i+1);
    }

    static boolean ispalin(String s,int l,int h)
    {
        if(l>=h) return true;
        if(s.charAt(l)!=s.charAt(h)) return false;

        return ispalin(s,l+1,h-1);
    }
}
