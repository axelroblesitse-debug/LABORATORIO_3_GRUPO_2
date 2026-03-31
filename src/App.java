import java.util.Scanner;

public class App {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       LoginFunction loginFunction = new LoginFunction();

       int attempts = 3;

       while (attempts > 0) {
           try {
               System.out.print("Usuario: ");
               String name = sc.nextLine();

               System.out.print("Contraseña: ");
               String password = sc.nextLine();

               if (loginFunction.validateLogin(name, password)) {
                   System.out.println(" Bienvenido");
                   break;
               } else {
                   attempts--;
                   System.out.println(" Datos incorrectos");
               }

           } catch (Exception e) {
               attempts--;
               System.out.println("⚠️ " + e.getMessage());
           }

           System.out.println("Intentos restantes: " + attempts);
       }

       if (attempts == 0) {
           System.out.println(" Acceso bloqueado");
       }

       sc.close();
   }
}
