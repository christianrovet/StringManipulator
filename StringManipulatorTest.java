public class StringManipulatorTest{
    public static void main(String[] args){
        // //Problem 1
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld 

        //Problem 2
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null

        //Problem 3
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulator.getIndexOrNull(word, subString);
        Integer e = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // null

        //Problem 4
        String word1 = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word1); // eworld
    }
}