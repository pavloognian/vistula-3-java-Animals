public class Main {
    public static void main(String[] args) {

        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("Tilop",2,2,"Bat");
        animal[1] = new Dog("Jack","pudel");
        animal[2] = new Bird("Norik",2,1,"White");
        animal[3] = new Pigeon("Hol",8,2,"Black","italy");
        animal[4] = new Fish("Bulka",1,3,"Mixed");
        animal[5] = new BlowFish();


        animal[1].eat("Lemon");
        animal[1].getVoice();
        animal[1].setAge(5);
        animal[1].setWeight(10);
        System.out.println();

        animal[3].eat("Lantaropa");
        animal[3].getVoice();
        System.out.println();

        animal[5].eat("Apple");
        animal[5].getVoice();
    }
}
