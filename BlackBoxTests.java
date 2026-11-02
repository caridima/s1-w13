public class BlackBoxTests {
    public static void main(String[] args) {
        BlackBox b = new BlackBox();
    int result = b.findIndexOfLetter("witch", "t");
    int result1 = b.findIndexOfLetter("witch", "w");
    int result2 = b.findIndexOfLetter("witch", "h");
    int result3 = b.findIndexOfLetter("witch", "b");
    System.out.println(result);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    }
    
}
