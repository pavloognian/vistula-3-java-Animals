public class Fish extends Animal{
    private String scaleColor;

    public Fish(String name, int age, int weight, String scaleColor){
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }
    public Fish(){
        super();
        this.scaleColor = "unknown";
    }
    public Fish(String name, String scaleColor){
        super(name);
        this.scaleColor = scaleColor;
    }
    public void howDangerous(){
        System.out.println("Tells how dangerous fish could be.");
    }

    public String getScaleColor() {return scaleColor;}
    public void setScaleColor(String scaleColor) {this.scaleColor = scaleColor;}

    @Override
    public void eat(String foodName) {
        System.out.printf("Eats corals,%s or something like that. Drinks water or something like that.\n",foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Makes a sound");
    }
}
