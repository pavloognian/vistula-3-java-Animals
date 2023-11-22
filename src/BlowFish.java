public class BlowFish extends Fish{
    private int diametr;
    public BlowFish(String name, int age, int weight, String scaleColor, int diametr){
        super(name, age, weight,scaleColor);
        this.diametr = diametr;
    }
    public BlowFish(){
        super();
    }
    public BlowFish(String name, String scaleColor){
        super(name,scaleColor);
    }
    public void howDangerous(){
        System.out.println("Blow Fish is dangerous enough, but speed could be a problem.");
    }

    public int getDiametr() {return diametr;}
    public void setDiametr(int diametr) {this.diametr = diametr;}

    @Override
    public void eat(String foodName) {
        System.out.printf("Blow Fish: %s. Eats corals,%s. Drinks water.\n",getName(),foodName);
    }
    @Override
    public void getVoice() {
        System.out.printf("Blow Fish: %s. Bul bul bul\n",getName());
    }
}
