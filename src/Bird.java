public class Bird extends Animal{
    private String color;

    public Bird(String name, int age, int weight, String color){
        super(name, age, weight);
        this.color = color;
    }
    public Bird(){
        super();
        this.color = "unknown";
    }
    public Bird(String name, String color){
        super(name);
        this.color = color;
    }
    public void howBeautifulVoice(){
        System.out.println("Tells how beautiful a bird could sing.");
    }

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    @Override
    public void eat(String foodName) {
        System.out.printf("Eats insects, %s  or something like that. Drinks water or something like that.\n",foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Makes a sound");
    }
}
