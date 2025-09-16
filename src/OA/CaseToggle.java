package OA;

/*
Create a function that toggles the case of alphabetic characters in a string -
converting uppercase to lowercase and vice versa, while leaving non-alphabetic characters unchanged.
 */
public class CaseToggle {
    private static String toggle(String string) {
        StringBuilder result = new StringBuilder();

        for(char c : string.toCharArray()) {
            if(c>='A' && c<='Z') {
                result.append(Character.toLowerCase(c));
            } else if(c>='a' && c<='z') {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String string = "miXEDcASE";
        System.out.println(toggle(string));
    }
}