package ru.job4j.oop;

/**
 * История колобка с хорошим концом.
 * @author Kustrin Sergei.
 * @version 1.
 */
public class BallStory {

    /**
     * method main.
     * @param args - args.
     */
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        ball.run();
        hare.tryEat(ball);
        ball.runAway(hare);
        wolf.tryEat(ball);
        ball.runAway(wolf);
        fox.tryEat(ball);
        ball.runAway(fox);
    }
}
