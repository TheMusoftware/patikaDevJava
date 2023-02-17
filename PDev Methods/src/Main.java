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
    public static void main(String[] args) {
        System.out.println(Pow(2,5));
    }
}