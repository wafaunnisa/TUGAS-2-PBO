import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Books book = new Books("Wafaunnisa", "Laskar Pelangi", 40000.00, 1);

        String informasi = book.infromasi();
        System.out.println("\nInformasi buku " + informasi);

        System.out.print("Masukkan jumlah buku yang ingin dibeli: ");
        int jumlahBuku = scanner.nextInt();
        double totalPrice = book.calculateBooks(jumlahBuku);
        System.out.println("Total pembelian buku : Rp." + totalPrice + '\n');

        scanner.close();
    }
}

class Books {
    private String author;
    private String title;
    private double price;
    private int publisher_number;

    public Books(String author, String title, double price, int publisher_number) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher_number = publisher_number;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public int getPublisher_number() {
        return this.publisher_number;
    }

    public double calculateBooks(int jumlahBuku) {
        return jumlahBuku * this.price;
    }

    public String infromasi() {
        return '\n' +
                "author          : " + author + '\n' +
                "title           : " + title + '\n' +
                "price           : " + price + '\n' +
                "publisherNumber : " + publisher_number + '\n';
    }
}