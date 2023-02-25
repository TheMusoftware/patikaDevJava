import java.util.Scanner;

public class Game {
    Scanner scan = new Scanner(System.in);
   private int upBound;
   private int downBound=0;
   private int correctPredict;
   private int predict;

  private  void GetUpBound(){

        System.out.print("Enter your up-boundary: ");
        String numTemp = scan.nextLine();
        try{
            this.upBound = Integer.parseInt(numTemp);

        }
        catch (Exception e){
            System.out.print("Your entry was wrong. It must be numeric.\n");
            GetUpBound();
        }

    }
    private void RandomNumber(){
        double num = Math.random()*upBound;
        this.correctPredict = (int) num;
    }
   private int GetPredict(){
        System.out.printf("Enter your predict(%d - %d): ",downBound,upBound);
        String numTemp = scan.nextLine();
        try{
            this.predict = Integer.parseInt(numTemp);

        }
        catch (Exception e){
            System.out.print("Your entry was wrong. It must be numeric and integer.\n");
            GetPredict();
        }
        return this.predict;

    }
   private boolean askPredict(int predict){
        boolean isPredict;
       if(predict == correctPredict){
           isPredict = true;
           System.out.println("Congratulations.... You win!!!");
       }
       else{
           isPredict = false;
           if(predict > correctPredict && this.upBound > predict) this.upBound = predict;
           else if (predict < correctPredict && this.downBound < predict) this.downBound = predict;
       }
       return  isPredict;
    }
    public void Start(){
        GetUpBound();
        RandomNumber();
        while (!askPredict(GetPredict()));

    }
}
