package lesson2;

public class MainClass {
    public static void main(String[] args) {
        String[][] goodMatrix = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] badMatrix = {
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] wrongChar = {
                {"1", "a", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            System.out.println(Conversation.converter(goodMatrix));
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println(Conversation.converter(badMatrix));
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println(Conversation.converter(wrongChar));
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }

    }
}
