package ru.job4j.array;

/**
 * class EndWith verifies array of char ends in a defined sequence.
 * @author Kustrin Sergei.
 * @version 1.
 */
public class EndsWith {

    /**
     * method endsWith verifies array of char ends in a defined sequence.
     * @param word - first array.
     * @param post - second array.
     * @return boolean result.
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int numberElemInPost = post.length;
        int numberElemInWord = word.length;
        int firstIndexOfPost = 0;
        for (int index = numberElemInWord - numberElemInPost; index < numberElemInWord; index++) {
            if (word[index] != post[firstIndexOfPost]) {
                result = false;
                break;
            }
            firstIndexOfPost++;
        }
        return result;
    }
}
