package CoreConcept;

public class JavaPassByValueOrReference {

    static int val = 11;

    public static void main(String[] args) {
        System.out.println(val);

        changeVal(val);

        System.out.println(val);
    }

    private static void changeVal(int val) {
        val = 12;
        System.out.println(val);
    }
}
