public class Animal {
    private String name;
    static int numberOfAnimals = 0;
    public Animal(String givenName) throws UserDefinedException {
        if(givenName.equals("Ana"))
            throw new UserDefinedException("This is user-defined exception");
        this.name = givenName;
        numberOfAnimals++;
    }

    public void speak(){
        System.out.println("Hello!");
    }

    public void move(){
        System.out.println(this.name + " animal is moving!");
    }
    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}
