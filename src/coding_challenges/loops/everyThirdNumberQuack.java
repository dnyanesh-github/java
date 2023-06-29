package coding_challenges.loops;

public class everyThirdNumberQuack {
    public static void main(String[] args) {
        for(int i=1; i<=40; i++) {
            System.out.println(i);
            if(i%3==0) {
                System.out.println("Quack");
            }
        }
    }
}
