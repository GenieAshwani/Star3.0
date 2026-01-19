public class RecursionDemo {
    public static void main(String[] args) {

        print1(3);

    }

    //3 2 1
    static void print(int n)
    {
        if(n==0) return;
        System.out.println(n); //work
        print(n-1);
    }

    static void print1(int n)
    {
        if(n==0) return;
        print1(n-1); //stack build
        System.out.println(n); //work
    }
}
