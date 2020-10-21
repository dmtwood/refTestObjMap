public class Nummer {
    private int nr;

    public Nummer(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    @Override
    public String toString() {
        return "Nummer{" +
                "nr=" + nr +
                '}';
    }
}
