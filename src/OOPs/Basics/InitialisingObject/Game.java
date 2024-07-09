package OOPs.Basics.InitialisingObject;

// 2. Using Method

public class Game {
    String name;
    int number;

    public void games(String a, int b){

        name = a;
        number= b;
    }

    public void display() {
        System.out.println(name+" "+number);
    }

    public static void main(String[] args) {

        Game Dota = new Game();
        Dota.games("Gun" , 109);
        Dota.display();
    }
}
