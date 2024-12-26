public class Duck extends Animal implements Flyable{
    String name;
    public Duck(String name){
        this.name = name;
    }

    @Override
    void sound() {
        System.out.println("Gap Gap");
    }

    @Override
    public void fly() {
        System.out.println("prbbb prbbb");
    }

    @Override
    public void glide() {
        System.out.println("hi yahhh");
    }

    void clean(Animal animal){
        System.out.println(this + " is cleaning " + animal);
        //System.out.println(this.toString() + "is cleaning " + animal.toString());
    }

    public String toString(){
        return "เป็ด : " + this.name;
    }
}
