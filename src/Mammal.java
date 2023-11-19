public class Mammal extends Animal{
    private String breed;

    public Mammal(String name, int age, int weight, String breed){
        super(name, age, weight);
        this.breed = breed;
    }
    public Mammal(){
        super();
        this.breed = "unknown";
    }
    public Mammal(String name, String breed){
        super(name);
        this.breed = breed;
    }
    public void probabilityToSurvive(){
        System.out.println("Tells how fast mammal to survive.");
    }
    public String getBreed() {return breed;}
    public void setBreed(String breed) {this.breed = breed;}

    @Override
    public void eat(String foodName) {
        System.out.printf("Eats meat,%s or something like that. Drinks milk or something like that.\n",foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Makes a sound");
    }
}
