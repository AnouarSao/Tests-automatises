import java.util.Arrays;

public class MathUtils {
    public static int additionner(int a, int b){
        return  a+b;
    }

    public static  int additionner(int[] tableau){
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        return somme;
    }

    public static int soustraire(int a, int b){
        return a-b;
    }

    public static  int multiplier(int a, int b){
        return  a*b;
    }


    /*
    public static int additionner2(int... nbrs){
        return Arrays.stream(nbrs).sum();
    }

    public static int additionner2(int[] nombres){
        return Arrays.stream(nombres).sum();
    }
    */
}
