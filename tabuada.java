package welsson;

public class tabuada {
    public static void main(String[] args) {
        for (int x = 1; x <10; x++){
            for (int j = 1; j<10;j++){
                if (j == 1)
                    System.out.println("Tabuada do : " + x);
                System.out.println(j +" x "+x+" = "+ (j * x));
            }
        }
    }


}
