public class Fish extends Animal{
    private int size;

    public Fish(String name, int age, int weight, int size){
        super(name, age, weight);
        this.size = size;
    }
    public Fish(){
        super();
        this.size = -1;
    }
    public Fish(String name, int size){
        super(name);
        this.size = size;
    }
    public void howDangerousFish(){
        System.out.println("Tells how dangerous fish could be.");
    }
    public int getSize() {return size;}
    public void setSize(int size) {this.size = size;}

    @Override
    public void eat(String foodName) {
        System.out.printf("Eats corals,%s or something like that. Drinks water or something like that.\n",foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Makes a sound");
    }
}
