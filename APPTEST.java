public class AppTest {
    public static void main(String[] args) {
        assert App.add(2, 2) == 4 : "Addition failed";
        assert App.add(3, 5) == 8 : "Addition failed";

        System.out.println("All tests passed!");
    }
}
