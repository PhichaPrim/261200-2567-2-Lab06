//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Cow wagyu = new Cow();
        Duck donald = new Duck("โดนัลด์") ;
        Duck dasiy = new Duck("เดซี่") ;
        Pig burin = new Pig() ;
        Owl hedwig = new Owl();
        donald.sound();
        wagyu.sound();
        burin.sound();
        hedwig.sound();
        donald.clean(wagyu);
        dasiy.clean(donald);
        PekingDuck jiaTongHeng = new PekingDuck("JTH");
        jiaTongHeng.clean(dasiy);
        jiaTongHeng.fly();
        burin.run();
        hedwig.glide();
        donald.clean(new Cow());
        donald.clean(new Cow());

    }
}