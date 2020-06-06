public class Zmogus {
    static int nr = 1;
    int id;
    int amzius;
    public Zmogus() {
        id = nr++;
    }

    @Override
    public String toString() {
        return "Zmogus{" +
                "id=" + id +
                ", amzius=" + amzius +
                '}';
    }
}