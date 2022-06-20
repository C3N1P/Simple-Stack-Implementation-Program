public class LinkStack {
    private LinkList theList;

    // Konstruktor
    public LinkStack() {
        theList = new LinkList();
    }

    // Meletakkan Item ke Stack Teratas
    public void push(double j) {
        theList.insertFirst(j);
    }

    // Mengambil Item dari Stack Teratas
    public double pop() {
        return theList.delFirst();
    }

    // Bernilai TRUE jika Stack Kosong
    public boolean isEmpty() {
        return (theList.isEmpty());
    }

    // Menampilkan isi Stack
    public void displayStack() {
        System.out.println("Tumpukan Data Stack : ");
        if(theList.isEmpty()) {
            System.out.println("Stack Kosong");
        } else {
        theList.displayList();
        }
    }

    // Melihat dan Mengambil Data Teratas Dalam Stack
    public void peek() {
        theList.peekFirst();
    }

    // Membersihkan Stack
    public void clear() {
        theList.clear();
    }
}
