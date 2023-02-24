package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.MarioGame;
import com.in28minutes.learnspringframework.GameRunner;

public class App01GamingBasic {

    public static void main(String[] args) {
        var game = new PacMan();
        // var marioGame = new SuperContraGame();
        var gameRunner = new GameRunner(game);  //wiring dependecies
        // game is a dependency of game runner
        //
        gameRunner.run();
    }
}
