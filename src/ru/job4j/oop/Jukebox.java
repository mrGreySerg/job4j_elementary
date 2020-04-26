package ru.job4j.oop;

/**
 * выводит текст песни в зависимости от выбранной позиции.
 * @author Kustrin Sergei.
 * @version 1.
 */
public class Jukebox {

    /**
     * выводит текст песни в зависимости от выбранной позиции.
     * @param position - номер позиции песни.
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    /**
     * method main.
     * @param args - args.
     */
    public static void main(String[] args) {
        Jukebox songFirst = new Jukebox();
        int positionFirst = 1;
        songFirst.music(1);
        Jukebox songSecond = new Jukebox();
        int positionSecond = 2;
        songSecond.music(positionSecond);
        Jukebox songNotFound = new Jukebox();
        int positionThird = 3;
        songNotFound.music(positionThird);
    }
}
