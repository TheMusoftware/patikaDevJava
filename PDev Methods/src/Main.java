public class Main {
    static boolean isPalindromeNumbers(int num){
        boolean res=false;
        String sNum= String.valueOf(num);
        for (int i = 0; i <sNum.length()/2; i++) {
            if(sNum.charAt(i)==sNum.charAt(sNum.length()-i-1)) res = true;
        }
        return res;
    }
    public static void main(String[] args) {

    }
}