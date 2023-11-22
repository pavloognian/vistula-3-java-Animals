public class Dog extends Mammal{
    private String breed;
    public Dog(String name, int age, int weight, String order,String breed){
        super(name, age, weight,order);
        this.breed = breed;
    }
    public Dog(){
        super();
    }
    public Dog(String name, String breed){
        super(name,breed);
    }
    public void probabilityToSurvive(){
        System.out.println("Dog is likely to survive.");
    }

    @Override
    public String getBreed() {return breed;}

    @Override
    public void setBreed(String breed) {this.breed = breed;}

    @Override
    public void eat(String foodName) {
        System.out.printf("Dog: %s. Eats meat, sausage, bread, %s. Drinks water, juice\n",getName(),foodName);
    }
    @Override
    public void getVoice() {
        System.out.printf("Dog: %s. Gav Gav\n",getName());
    }
}
