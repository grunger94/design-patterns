package singleton.pedro;

class App {
    public static void main(String[] args) {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        if (firstInstance == secondInstance) {
            System.out.println("Son la misma instancia");
        } else {
            System.out.println("Son instancias diferentes");
        }
    }
}