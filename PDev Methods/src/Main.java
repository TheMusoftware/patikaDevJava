public class Main {
    static boolean isPalindromeNumbers(int num){
        boolean res=false;
        String sNum= String.valueOf(num);
        for (int i = 0; i <sNum.length()/2; i++) {
            if(sNum.charAt(i)==sNum.charAt(sNum.length()-i-1)) res = true;
        }
        return res;
    }
    static int Pow(int x , int e){
        int result = 1;
        /*
        Pow(2,1)=2
        Pow(2,2)=4
        Pow(2,3=8
         */
        if(e==0) return 1;
        result*=Pow(x,--e)*x;
        return result;
    }
    static boolean isPrime(int num , int divider){
        /*
        23 29
        21 27 25
        -18 19 20 -21 22 23 -24 25 26 -27 28 29 -30
         */
        if(num<3) return num==2 ? true : false;
        if(num%2==0) return false;
        if(num%divider!= 0 && divider >= num-1 ) return true;
        else{
            if(num%divider==0)return false;
            else return isPrime(num,++divider);
        }
    }
    static void PrintPattern(int num){
        System.out.print(num+" ");
        if(num<0) num+=5;
        else num-=5;

        PrintPattern(num);
    //Update Required
    }

    static int Fib(int n ){
        if(n==1 || n==2) return 1;
        return Fib(n-2)+Fib(n-1);
    }
    public static void main(String[] args) {
        System.out.println(Pow(2,5));
        System.out.println(isPrime(21,2));
        System.out.println(Fib(6));
    }
}