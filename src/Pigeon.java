public class Pigeon extends Bird{
    private String species;
    public Pigeon(String name, int age, int weight, String color, String species){
        super(name, age, weight,color);
        this.species = species;
    }
    public Pigeon(){
        super();
    }
    public Pigeon(String name, String color){
        super(name,color);
    }
    public void howBeautifulVoice(){
        System.out.println("Pigeon is capable to sing good, but in his own way.");
    }

    public String getSpecies() {return species;}

    public void setSpecies(String species) {this.species = species;}

    @Override
    public void eat(String foodName) {
        System.out.printf("Pigeon: %s. Eats insects, bread, meat, chocolate, %s. Drinks water, milk, juice.\n",getName(),foodName);
    }

    @Override
    public void getVoice() {
        System.out.printf("Pigeon: %s. Kyrluk Kyrluk\n",getName());
    }
}
