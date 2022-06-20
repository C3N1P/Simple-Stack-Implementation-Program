public class LinkList {
    private Link first;                 // ref to first item on list

    // Konstruktor
    public LinkList() {
        first = null;                   // List Kosong (Belum ada Data)
    }

    // Bernilai TRUE jika List kosong
    public boolean isEmpty() {
        return (first == null);
    }

    // insert at start of list
    public void insertFirst(double dd) {
        Link newLink = new Link(dd);    // make new link
        newLink.next = first;           // newLink --> old first
        first = newLink;                // first --> newLink
    }

    // Menghapus Item Pertama
    public double delFirst() {          // (assumes list not empty)
        Link temp = first;              // save reference to link
        first = first.next;             // delete it: first-->old next
        return temp.dData;              // return deleted link
    }

    // Menampilkan List
    public void displayList() {
        Link current = first;           // start at beginning of list
        while (current != null)         // until end of list,
        {
            current.displayLink();      // print data
            current = current.next;     // move to next link
        }
        System.out.println("");
    }

    // Menampilkan Data Pertama
    public void peekFirst() {
        Link current = first;           // start at beginning of list
        current.displayLink();          // print data
        System.out.println("");
    }

    // Membersihkan List
    public void clear() {
        while (!isEmpty())              // until end of list,
        {
            delFirst();                 // print data
        }
    }
}
