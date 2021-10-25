/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pingpong;

/**
 *
 * @author Maria Malvesada
 */
/*public class Game {



    public static final int MAX_TURNS = 10;



    public static void main(String[] args) {



        Player player1 = new Player("ping");

        Player player2 = new Player("pong");



        player1.setNextPlayer(player2);

        player2.setNextPlayer(player1);



        System.out.println("Game starting...!");



        player1.play();



        System.out.println("Game finished!");

    }

}*/

/*public class Game {



    public static final int MAX_TURNS = 10;



    public static void main(String[] args) {



        Player player1 = new Player("ping");

        Player player2 = new Player("pong");



        player1.setNextPlayer(player2);

        player2.setNextPlayer(player1);



        System.out.println("Game starting...!");



        player1.setMustPlay(true);



        Thread thread2 = new Thread(player2);

        thread2.start();

        Thread thread1 = new Thread(player1);

        thread1.start();



        System.out.println("Game finished!");

    }



}
*/

/*public class Game {



    public static final int MAX_TURNS = 10;



    public static void main(String[] args) {



        Player player1 = new Player("ping");

        Player player2 = new Player("pong");



        player1.setNextPlayer(player2);

        player2.setNextPlayer(player1);



        System.out.println("Game starting...!");



        player1.setMustPlay(true);



        Thread thread2 = new Thread(player2);

        thread2.start();

        Thread thread1 = new Thread(player1);

        thread1.start();



        System.out.println("Game finished!");

    }



}
*/
/*los hilos terminan controlado aunue se queda pillado y no termina
*hay que reconfigura el codigo 
*/
public class Game {



    public static final int MAX_TURNS = 10;



    public static void main(String[] args) {



        Player player1 = new Player("ping");

        Player player2 = new Player("pong");



        player1.setNextPlayer(player2);

        player2.setNextPlayer(player1);



        System.out.println("Game starting...!");



        player1.setMustPlay(true); 



        Thread thread2 = new Thread(player2);

        thread2.start();

        Thread thread1 = new Thread(player1);

        thread1.start();



        try {

            thread1.join();

            thread2.join();

        } catch (InterruptedException e) {

            e.printStackTrace();

        }



        System.out.println("Game finished!");

    }



}
