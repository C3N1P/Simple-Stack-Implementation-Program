public class Link {
    public double dData;        // Variabel Data
    public Link next;           // next link in list

    // Konstruktor
    public Link(double dd) {
        dData = dd;
    }

    // Menampilkan Data
    public void displayLink() {
        System.out.println(dData);
    }

    public double getLink() {
        return dData;
    }
}
