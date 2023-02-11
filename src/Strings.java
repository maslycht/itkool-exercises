public class Strings {
    public static void main(String[] args) {
        // creating a string
        String name1 = "John";
        String name2 = new String("John");
        String name3 = "JOHN";
        String name4 = "John Doe";

        // comparing strings
        boolean name1EqualsName2 = name1 == name2;
        System.out.println(name1 + " == " + name2 + ": " + name1EqualsName2); // false

        name1EqualsName2 = name1.equals(name2);
        System.out.println(name1 + ".equals(" + name2 + "): " + name1EqualsName2); // true

        boolean name1EqualsJohn = name1.equals("John");
        System.out.println(name1 + ".equals(John): " + name1EqualsJohn); // true

        boolean name1EqualsName3 = name1.equals(name3);
        System.out.println(name1 + ".equals(" + name3 + "): " + name1EqualsName3); // false

        boolean name1EqualsName3IgnoreCase = name1.equalsIgnoreCase(name3);
        System.out.println(name1 + ".equalsIgnoreCase(" + name3 + "): " + name1EqualsName3IgnoreCase); // true

        // string methods
        // length of the string
        System.out.println("Length of name1: " + name1.length()); // 4

        // getting a character at a specific index
        System.out.println("Character at index 0 is: " + name1.charAt(0)); // J

        // getting the index of a character or a substring
        System.out.println("Index of 'o' is: " + name1.indexOf("o")); // 1
        System.out.println("Index of 'o' from index 2 is: " + name4.indexOf("o", 2)); // 6

        System.out.println("Index of 'hn' is: " + name1.indexOf("hn")); // 1

        // getting a substring
        System.out.println("Substring beginning at index 1 is: " + name1.substring(1)); // ohn
        System.out.println("Substring between indexes 1 and 3 is: " + name1.substring(1, 3)); // oh

        // upper/lower case conversion
        System.out.println("Uppercase " + name1 + " is: " + name1.toUpperCase()); // JOHN
        System.out.println("Lowercase " + name1 + " is: " + name1.toLowerCase()); // john

        // replacing a character or a substring
        System.out.println(name1 + " -> " + name1.replace("J", "K")); // Kohn
        System.out.println(name1 + " -> " + name1.replace("hn", "hnny")); // Johnny

        // checking if a string contains a character or a substring
        System.out.println(name1 + " contains 'hn': " + name1.contains("hn")); // true
        System.out.println(name1 + " contains 'nh': " + name1.contains("nh")); // false

        // checking if a string starts/ends with a character or a substring
        System.out.println(name1 + " starts with 'J': " + name1.startsWith("J")); // true
        System.out.println(name1 + " starts with 'j': " + name1.startsWith("j")); // false
        System.out.println(name1 + " starts with 'Jo': " + name1.startsWith("Jo")); // true

        System.out.println(name1 + " starts with 'hn': " + name1.startsWith("hn")); // false
        System.out.println(name1 + " starts with 'hn' from index 2: " + name1.startsWith("hn", 2)); // true

        System.out.println(name1 + " ends with 'n': " + name1.endsWith("n")); // true
        System.out.println(name1 + " ends with 'N': " + name1.endsWith("N")); // false

        // empty/blank string

        System.out.println(name1 + " is empty: " + name1.isEmpty()); // false
        System.out.println("'' is empty: " + "".isEmpty()); // true

        System.out.println("' ' is empty: " + " ".isEmpty()); // false
        System.out.println("' ' is blank: " + " ".isBlank()); // true

        // trimming a string
        System.out.println(name1 + " trimmed is: " + name1.trim()); // John
        System.out.println("' John ' trimmed is: " + " John ".trim()); // John

        // concatenating strings
        System.out.println(name1 + " + ' Doe' is: " + name1 + " Doe"); // John Doe
        System.out.println(name1 + " concatenated with ' Doe' is: " + name1.concat(" Doe")); // John Doe


    }
}