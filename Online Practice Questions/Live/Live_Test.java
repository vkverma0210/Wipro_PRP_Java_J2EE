package Live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Live_Test {
    public static void main(String[] args) {
        Veena v1 = new Veena();
        v1.play();

        Saxophone s1 = new Saxophone();
        s1.play();

        Playable v2 = new Veena();
        v2.play();

        Playable s2 = new Saxophone();
        s2.play();
    }
}
