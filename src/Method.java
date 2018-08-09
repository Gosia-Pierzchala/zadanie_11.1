import java.util.List;

public class Method {

    public static void reverseOrder(List<Integer> lista){
        for (int i = lista.size() - 1; i >= 0; i--) {
            int y = lista.get(i);
            System.out.print(y + " ");
        }
        System.out.println("\n");
    }

    public static void showSum(List<Integer> lista){
        int sum = 0;
        for (int i = 0; i < lista.size(); i++) {
            int y = lista.get(i);
            sum = sum + y;
        }
        for (int i = 0; i < lista.size() - 1; i++) {
            int y = lista.get(i);
            System.out.print(y + " + ");
        }
        System.out.println(lista.get(lista.size() - 1) + " = " + sum);
    }

    public static void showMaxAndMin(List<Integer> lista){
        int max = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) > max){
                max = lista.get(i);
            }
        }
        int min = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) < min){
                min = lista.get(i);
            }
        }
        System.out.println("Największa z wprowadzonych liczb to: " + max);
        System.out.println("Najmniejsza z wprowadzonych liczb to: " + min);
    }

}
