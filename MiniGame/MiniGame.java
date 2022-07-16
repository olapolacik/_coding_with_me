package MiniGame;// easy mini game

public class MiniGame {
    public static void main(String[] args){
        System.out.println("Zagrajmy w prosta gre! Zgadnij liczbe z zakresu 1-15!");
        Game miniGame = new Game();
        miniGame.getNum();
    }
}


