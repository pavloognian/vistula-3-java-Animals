public class Pigeon extends Bird{
    public Pigeon(String name, int age, int weight, String color){
        super(name, age, weight,color);
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
    @Override
    public void eat(String foodName) {
        System.out.printf("Pigeon: %s. Eats insects, bread, meat, chocolate, %s. Drinks water, milk, juice.\n",getName(),foodName);
    }

    @Override
    public void getVoice() {
        System.out.printf("Pigeon: %s. Kyrluk Kyrluk\n",getName());
    }
}
