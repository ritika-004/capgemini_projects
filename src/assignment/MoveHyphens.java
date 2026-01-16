package assignment;

public class MoveHyphens {
    public static void main(String[] args) {

        String str = "Move-Hyphens-to-Front";

        if (str == null) 
            System.out.println("null");
            


        String hyphens = "";
        String letters = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '-') {
                hyphens = hyphens + ch;
            } else {
                letters = letters + ch;
            }
        }

        System.out.println(hyphens + letters);
    }
}
