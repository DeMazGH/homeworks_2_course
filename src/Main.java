public class Main {
    public static void main(String[] args) {

        userVerification("java_skypro", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
    }



    public static boolean userVerification(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("^[a-zA-Z0-9_]+$")) {
                return false;
            } else if (login.length() > 20) {
                throw new WrongLoginException();
            } else if (!password.matches("^[a-zA-Z0-9_]+$")) {
                return false;
            } else if (password.length() > 20) {
                return false;
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
        } catch (WrongLoginException e) {
            System.out.println("Логин не может быть больше 20 символов");
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("Неверно введен пароль");
            return false;
        } finally {
            System.out.println("Проверка завершена");
        }
        return true;
    }
}