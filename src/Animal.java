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

    public void probabilityToSurvive() {
    }

    public void howDangerous() {
    }

    public void howBeautifulVoice() {
    }
}
class Main{
    public static void main(String[] args) {

        Animal obj[] = new Animal[3];
        obj[0] = new Dog("Jack","pudel");
        obj[1] = new BlowFish("Tiki",10,20, 100);
        obj[2] = new Pigeon();

        obj[0].eat("Lemon");
        obj[0].getVoice();
        obj[0].probabilityToSurvive();
        obj[0].setAge(5);
        obj[0].setWeight(10);
        System.out.println();

        obj[1].eat("Lantaropa");
        obj[1].getVoice();
        obj[1].howDangerous();
        System.out.println();

        obj[2].eat("Apple");
        obj[2].getVoice();
        obj[2].howBeautifulVoice();
    }
}
