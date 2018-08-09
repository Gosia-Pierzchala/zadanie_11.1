import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int i = 0;
        while (i >= 0){
            System.out.println("Podaj liczbę");
            i = scan.nextInt();
            if(i < 0){
                break;
            }
            list.add(i);
        }

        String content = list.toString();
        System.out.println(content);

        Method.reverseOrder(list);
        Method.showSum(list);
        Method.showMaxAndMin(list);

    }
}
