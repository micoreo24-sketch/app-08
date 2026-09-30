//Crear un programa que determine el salario final de un trabajador
// SI EL PROGRAMA SE AGREGA UN 25% AL SALARIO TOTAL
// SI ES MEDICO SE AGREGA $100 AL SALARIO TOTAL
// SI ES ADMINISTRATIVO SE AGREGA 2% DEL SALARIO TOTAL
// SI TIENE MULTA SE DESCUENTA $15 AL SALARIO FINAL
// EL PROGRAMA DEBE RECIBIR EL NOMBRE Y EL SALARIO DEL TRABAJADOR

public class main {
    public static void main(String[] args) {

        String nombre;  
        double salario;  
        int opcion;   
        System.out.println("################");
        System.out.println("Es Programador");
        System.out.println("Es medico");
        System.out.println("Es administrativo");
        System.out.println("Ingrese una opcion");

        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                // Lógica si es Programador (+25%)
                break;

            case 2:
                // Lógica si es Médico (+$100)
                break;

            case 3:
                // Lógica si es Administrativo (+2%)
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }

    }
}
  
//Variable nombre is neither read or written to
//Variable salario;Variable salario is neither read or written to
//Variable opcion is neither read or written to