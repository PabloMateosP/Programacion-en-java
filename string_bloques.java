public class string_bloques {
    public static void main(String[] args) {
        // Declaramos a y b 
        int a = 2;
        int b = 3;
        // Separar en bloques nos funcionar√° para optimizar, hacer bucles etc.
        {
            // Creamos un primer bloque donde se imprimir√° a
            System.out.println(a);
            // Declaramos una variable c nueva 
            int c = 4;
            {
                // E imprimimos nuestra nueva variable en otro bloque diferente 
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
        }
        {
            // Creamos un segundo bloque donde se imprimir√° b 
            System.out.println(b);
        }
    }
}