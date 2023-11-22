public class Mammal extends Animal{
    private String order;

    public Mammal(String name, int age, int weight, String order){
        super(name, age, weight);
        this.order = order;
    }
    public Mammal(){
        super();
        this.order = "unknown";
    }
    public Mammal(String name, String order){
        super(name);
        this.order = order;
    }
    public void probabilityToSurvive(){
        System.out.println("Tells how fast mammal to survive.");
    }
    public String getBreed() {return order;}
    public void setBreed(String order) {this.order = order;}

    @Override
    public void eat(String foodName) {
        System.out.printf("Eats meat,%s or something like that. Drinks milk or something like that.\n",foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Makes a sound");
    }
}
