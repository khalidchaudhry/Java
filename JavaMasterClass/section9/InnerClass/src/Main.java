import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static Button printButton = new Button("Print");
    public static void main(String[] args) {

        //System.out.println("Hello world!");
//        class ClickListener implements Button.OnClickListener{
//            public ClickListener() {
//                System.out.println("I have been attached");
//            }
//            @Override
//            public void onClick(String title) {
//                System.out.println(title+" was clicked");
//            }
//        }
//        printButton.setOnClickListener(new ClickListener());
        printButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title+" was clicked");
            }
        });
        listen();
    }
    private static void listen(){
        boolean quit=false;
        while (!quit){
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                     printButton.onClick();
                     break;
            }
        }
    }
}