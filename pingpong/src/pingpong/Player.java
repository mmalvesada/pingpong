/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pingpong;

/**
 *
 * @author María Malvesada
 */
/*public class Player {



    private final String text;



    private int turns = Game.MAX_TURNS;



    private Player nextPlayer;



    public Player(String text) {

        this.text = text;

    }



    public void play() {

        if (!gameFinished()) {

            System.out.println(text);

            turns--;

            nextPlayer.play();

        }

    }



    private boolean gameFinished() {

        return turns == 0;

    }



    public void setNextPlayer(Player nextPlayer) {

        this.nextPlayer = nextPlayer;

    }



}*/

public class Player implements Runnable {



    private final String text;



    private int turns = Game.MAX_TURNS;



    private Player nextPlayer;




    private volatile boolean mustPlay = false;

    




    public Player(String text) {

        this.text = text;

    }



    @Override

    public void run() {

        while(!gameFinished()) {

            while(!mustPlay);


            System.out.println(text);

            turns--;



            this.mustPlay = false;

            nextPlayer.mustPlay = true;



        }

    }



    private boolean gameFinished() {

        return turns == 0;

    }



    public void setNextPlayer(Player nextPlayer) {

        this.nextPlayer = nextPlayer;

    }



    public void setMustPlay(boolean mustPlay) {

        this.mustPlay = mustPlay;

    }

}
