package homework;

public class Phraseomatic {
    public static void main(String[] args) {
        String[] wordListOne = {"Lakers", "Suns", "Kings", "Clippers", "Warriors"};
        String[] wordListTwo = {"Celtics", "Knicks", "Nets", "Raptors", "Seventy Sixers"};
        String[] wordListThree = {"Mavericks", "Spurs", "Pelicans", "Grizzlies", "Rockets"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase + " Face off!");
    }
}
