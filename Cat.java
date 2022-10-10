public class Cat extends Animal{

    public Cat(String givenName) throws UserDefinedException {
        super(givenName);
    }

    @Override
    public void speak(){
        System.out.println("Meow! Meow!");
    }
    @Override
    public void move(){
        System.out.println(getName() + "is running");
    }

    public void fetch(){
        System.out.println("Cat ball! Cat ball!");
    }
}
