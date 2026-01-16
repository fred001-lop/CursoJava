public class Strings {
    public static void main(String[] args) {
        //cadenas de textoo
        String name = "Fredy";
        var surname = new String("Guti");
        //concatenacion
        System.out.println(name + " " + surname);
        //length -- Longitud
        System.out.println(name.length());
        //Obtener caracter
        System.out.println(name.charAt(0));
        //Subbstring - Subcadena
        System.out.println(name.substring(2, 4));
        //touppercase o tolowercase
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //Comprobar si contiene
        System.out.println("Hola Java".contains("Fredy"));
        System.out.println("Hola Java".toUpperCase().contains("AVA"));
        //Comparacion - EQUAL
        System.out.println(name.equals("Fredy"));
        System.out.println(name.equalsIgnoreCase("fredy"));


        // == vs equals
        var a = "Fredy";
        var b = "Fredy";
        var c = new String("Fredy");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        //Trim
        System.out.println("Hola me llamo Fredy".trim());

        //Replace
        System.out.println("Me llamo fredy".replace(" ", ""));

        //Format
        var age = 26;
        System.out.println(String.format("Hola %s. Tengo %d.", name, age));

    }
}
