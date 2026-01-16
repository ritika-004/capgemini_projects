package assignment;

public class UniqueWords {
    public static void main(String[] args) {

        String str = "hello world hello java world";
        String[] words = str.split(" ");

        System.out.println("Unique words in the given string:");

        for (int i = 0; i < words.length; i++) {
            int count = 0;

            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(words[i]);
            }
        }
    }
}
