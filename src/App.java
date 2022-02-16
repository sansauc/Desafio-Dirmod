import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int repetir = 1;
        
        while (repetir == 1){
        
            Scanner leer = new Scanner(System.in);

            System.out.println("Ingrese el mensaje a codificar ");
                    
            String mensaje = leer.nextLine();
    
            Codificador codificador = new Codificador();
            
            String codigo = codificador.transformar(mensaje);

            System.out.println("El mensaje ingresado es: "+mensaje+" y su codigo es: "+ codigo+"\n");      //imprime el mensaje codificado
        
            System.out.println("Ingrese 1 si desea seguir codificando mensajes ");

            repetir = leer.nextInt();
        
        }
    }
}
