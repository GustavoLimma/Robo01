import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Robot robot = new Robot();
        String opc;

        do{
            robot.ShowCurrentPosition();
            System.out.println("Select: W, A, S, D to move");
            opc = scanner.nextLine().toUpperCase(); //Showing the current map position with each interaction
            switch(opc){
                case "W": robot.WalkForward(); break;
                case "S": robot.WalkBackward(); break;
                case "A": robot.WalkLeft(); break;
                case "D": robot.WalkRight(); break;
                default: System.out.println("Exiting..."); opc="E";
            }
        }while(opc!="E");
        
        scanner.close();
    }
}
