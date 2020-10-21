import java.util.List;

public class Woord {
    private String woord;

    public Woord(String woord) {
        this.woord = woord;
    }

    public String getWoord() {
        return woord;
    }

    @Override
    public String toString() {
        return "Woord{" +
                "woord='" + woord + '\'' +
                '}';
    }
}
