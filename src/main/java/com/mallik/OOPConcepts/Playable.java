package main.java.com.mallik.OOPConcepts;

interface Playable1 {
    void play();
}

class Vollyball implements Playable1 {
    public void play() {
        System.out.println("Playing vollyball");

    }
}

class basketball implements Playable1 {
    public void play() {
        System.out.println("Playing basketball");
    }
}


public class Playable {
    public static void main(String[] args) {
        Playable1 p1 = new Vollyball();
        p1.play();
        Playable1 p2 = new basketball();
        p2.play();


    }

}
