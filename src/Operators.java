public class Operators {
    public static void main(String[] args) {
        //OPERADORES

        //Operadores aritmeticos
        double a = 5;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //OPERADORES DE ASIGNACION
        a = b;
        System.out.println(a);
        a = b * 2;
        System.out.println(a);
        a += 1; // a = a + 1
        System.out.println(a);

        //Operadores de comparacion (Relacionales)
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        //Operadores logicos
        //AND
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(3 > 2 && 5 == 2);

        // OR
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(3 > 2 || 5 == 2);

        //NOT
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(3 > 2) || 5 == 2);

        //Operadores unarios


    }
}
