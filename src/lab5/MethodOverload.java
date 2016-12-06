package lab5;

/**
 * @author flo
 * @since 06/12/2016.
 */
public class MethodOverload {
    public static void main(String[] args) {
        MethodOverload mo = new MethodOverload();
        mo.disp(5);
        mo.disp("This is a text", 5);
        mo.disp(3.14f);
    }

    private void disp(float f) {
        System.out.println("Float " + f);
    }

    private void disp(String s, int m) {
        System.out.println("String" + s + m);
    }

    private void disp(int v) {
        System.out.println("Int" + v);
    }
}
