<<<<<<< HEAD
public class OOPSBanner {

    public static String[] getOPattern() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }

    }
}
=======
/**
 * UC5 – OOPS Banner using Inline Array Initialization
 */

public class OOPSBanner {

    public static void main(String[] args) {

        String[] lines = {

            String.join(" ", " *** ", " *** ", " ***** ", " ***** "),
            String.join(" ", "*   *", "*   *", "*     *", "*     "),
            String.join(" ", "*   *", "*   *", "*     *", "*     "),
            String.join(" ", "*   *", "*   *", "***** ", " ***** "),
            String.join(" ", "*   *", "*   *", "*      ", "     *"),
            String.join(" ", "*   *", "*   *", "*      ", "*    *"),
            String.join(" ", " *** ", " *** ", "*      ", " **** ")

        };

        for (String line : lines) {
            System.out.println(line);
        }

    }
}

>>>>>>> 5da266814b4849756344d799e653cdc1f2d50427
