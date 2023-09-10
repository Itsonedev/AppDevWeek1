package homework;

public class Phraseomatic {
    public static void main(String[] args) {
        String[] pacificDvsn = {"Lakers", "Suns", "Kings", "Clippers", "Warriors"};
        String[] atlanticDvsn = {"Celtics", "Knicks", "Nets", "Raptors", "Seventy Sixers"};
        String[] southwestDvsn = {"Mavericks", "Spurs", "Pelicans", "Grizzlies", "Rockets"};

        int oneLength = pacificDvsn.length;
        int twoLength = atlanticDvsn.length;
        int threeLength = southwestDvsn.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = pacificDvsn[rand1] + " " + atlanticDvsn[rand2] + " " + southwestDvsn[rand3];
        System.out.println("What we need is a " + phrase + " Face off!");
    }
}
