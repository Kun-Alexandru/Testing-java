public class Main {
    public static void main(String[] args) throws UserDefinedException {

        System.out.println("Hello world!");
        try {
            Animal a = new Animal("Tudor");
            a.speak();
            a.move();
            Cat c = new Cat("Pisica");
            c.speak();
            c.fetch();
        }
        catch (UserDefinedException ude){
            System.out.println(ude.getMessage());
        }
        try{
            Cat c = new Cat("Ana");
            c.speak();
            c.fetch();
        }
        catch (UserDefinedException ude){
            System.out.println(ude.getMessage());
        }
        System.out.println("There are " + Animal.numberOfAnimals + " animals.");
    }
}