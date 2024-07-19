package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        // i = 1, 2, 3, 4, 5
        while(i < 5){
            if (i == 3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
