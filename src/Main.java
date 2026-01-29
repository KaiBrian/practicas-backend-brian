public class Main {
    public static void main(String[] args) {

        String nombre = "Brian";
        int edad = 31;
        boolean sabeGit = true;

        System.out.println("Hola, me llamo " + nombre + " tengo " +edad + " años.");

        if (sabeGit==true) {
            System.out.println("Sé usar Git.");
        } else {
            System.out.println("No sé usar Git.");
        }

        mostrarInformacion(nombre, edad); 


        boolean puedeEmpezar = puedeEmpezarPracticas(edad, sabeGit);

        if (puedeEmpezar) {
            System.out.println("Puede empezar las prácticas.");
        } else {
            System.out.println("No puede empezar las prácticas.");
        }

    }


        static void mostrarInformacion(String nombre, int edad)
        {
            System.out.println("Hola, me llamo " + nombre + " tengo " +edad + " años.");
        }

        static boolean puedeEmpezarPracticas(int edad, boolean sabeGit)
        {
        return edad >=18 && sabeGit ==true;
        }





    
}