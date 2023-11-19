public class BlowFish extends Fish{
    public BlowFish(String name, int age, int weight, int size){
        super(name, age, weight,size);
    }
    public BlowFish(){
        super();
    }
    public BlowFish(String name, int size){
        super(name,size);
    }
    public void howDangerous(){
        System.out.println("Blow Fish is dangerous enough, but speed could be a problem.");
    }
    @Override
    public void eat(String foodName) {
        System.out.printf("Blow Fish: %s. Eats corals,%s. Drinks water.\n",getName(),foodName);
    }
    @Override
    public void getVoice() {
        System.out.printf("Blow Fish: %s. Bul bul bul\n",getName());
    }
}
