abstract class Animal {
    private String name;
    private int age;
    private int weight;

    public Animal(){
        age = weight = 0;
        name = "NULL";

    }
    public Animal(String name, int age, int weight){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Animal(String name){
        this.name = name;
    }
    public abstract void eat(String foodName);
    public abstract void getVoice();

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}
}
class Main{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Jack","pudel");
        dog1.eat("Lemon");
        dog1.getVoice();
        dog1.probabilityToSurvive();
        System.out.println();

        BlowFish fish1 = new BlowFish("Tiki",100);
        fish1.eat("Lantaropa");
        fish1.getVoice();
        fish1.howDangerousFish();
        System.out.println();

        Pigeon bird1 = new Pigeon("Simon","white");
        bird1.eat("Apple");
        bird1.getVoice();
        bird1.howBeautifulVoice();
    }
}
