import java.util.Scanner;
public class Main{
    static int readInt(Scanner sc) {
    while(!sc.hasNextInt()){
        System.out.print("Numbers only, try again: ");
        sc.next();   // throw away the bad input
    }
    return sc.nextInt();
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the current temprature int celcius: ");
        int n = readInt(sc);
        System.out.println("Thermometer: ");

            for(int i =1;i<=50;i++){
                if(i<=n){
                    if(i<=12){
                    System.out.print("🟨");
                    }
                    else if(i>12 && i<23){
                        System.out.print("🟧");
                    }
                    else{
                        System.out.print("🟥");
                    }
                }
                else{
                    System.out.print("⬜");
                }
            }
    
            if(n<5){
                System.out.print("❄️ Very cold");
            }
            else if(n<18){
                System.out.print("🥶 Cold");
            }
            else if(n< 30){
                System.out.print("😊 Comfortable");
            }
        else{
            System.out.print("🥵 Hot");
        }
        sc.close();
    }
}
