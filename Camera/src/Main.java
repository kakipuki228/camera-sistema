import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Tell me what camera and accessories you want");

        System.out.println("what is camera price");
        int pr1= scan.nextInt();
        System.out.println("what is amateur camera price");
        int pr2= scan.nextInt();
        System.out.println("what is professional camera price");
        int pr3= scan.nextInt();
        System.out.println("what is professional camera max resolution in thousands");
        int max= scan.nextInt();




        ArrayList<Camera> cam =new ArrayList<>();
        Newbie noob1=new Newbie("Canon","compact", 2,pr1,"auto");
        Amateur ama1=new Amateur("Canon","Mirrorless",5, pr2,"canon f/1.8", 200);
        Pro pro1=new Pro("Sony","mirrorless",2, pr3, max);
        cam.add(noob1);
        cam.add(ama1);
        cam.add(pro1);
        System.out.println(noob1.print_Info());
        System.out.println(noob1.price());
        System.out.println();
        System.out.println(ama1.print_Info());
        System.out.println(ama1.price());
        System.out.println();
        System.out.println(pro1.print_Info());
        System.out.println(pro1.price());

        try {
            FileWriter writer=new FileWriter("camera.txt");

            for (Camera i: cam) {

                writer.write(i.print_Info()+"\n");
                writer.write(i.price()+"\n");
                writer.write("\n");

            }
            writer.close();
        }catch (Exception e){
            throw new RuntimeException(e);
        }



    }
}