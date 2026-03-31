import java.util.ArrayList;

public class LoginFunction {

    private ArrayList<Login> users = new ArrayList<>();

    // Constructor → carga "base de datos"
    LoginFunction() {
        users.add(new Login("Axel", "12345"));
        users.add(new Login("admin", "admin123"));
    }

    // Método para validar login
    public boolean validateLogin(String name, String password) throws Exception {

        if (name.isEmpty() || password.isEmpty()) {
            throw new Exception("Campos vacíos no permitidos");
        }

        for (Login user : users) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                return true; 
            }
        }

        return false;
    }
}
