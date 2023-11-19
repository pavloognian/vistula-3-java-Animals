public class Dog extends Mammal{
    public Dog(String name, int age, int weight, String breed){
        super(name, age, weight,breed);
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
    public void eat(String foodName) {
        System.out.printf("Dog: %s. Eats meat, sausage, bread, %s. Drinks water, juice\n",getName(),foodName);
    }
    @Override
    public void getVoice() {
        System.out.printf("Dog: %s. Gav Gav\n",getName());
    }
}
