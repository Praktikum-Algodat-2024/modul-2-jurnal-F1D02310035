public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue("Kazuma", "Tidak Ada");
        queue.addBook("Belajar Java", "Raysen", "Edukasi", "Buku Biasa");
        queue.addBook("Cara Menjadi Orang Kaya", "Teguh", "Fantasi", "Buku Biasa");

        queue.enQueue("Hu Tao", "Ada");
        queue.addBook("Cara Tidur Cepat", "Teguh", "Edukasi Kayaknya", "Terlarang");
        queue.addBook("Belajar C++", "Raysen", "Edukasi", "Buku Biasa");
        queue.addBook("Belajar Ilmu Hitam", "Mengumin", "Unknown", "Terlarang");

        queue.enQueue("Kafka", "Tidak Ada");
        queue.addBook("Raysen the Forgotten One", "Unknown", "Sejarah", "Terlarang");
        queue.addBook("Misteri Menghilangnya Nasi Puyung", "Optimus", "Misteri", "Buku Biasa");
        queue.addBook("Cara Menjadi Milioner Dalam 1 Jam", "Master Oogway", "Edukasi", "Buku Biasa");

        queue.enQueue("Xiangling", "Tidak Ada");
        queue.addBook("Unknown", "Unknown", "Unknown", "Buku Biasa");

        queue.tampilanBuku();
        queue.deQueue();
        queue.tampilanAntrian();
        System.out.println("\n");

        queue.tampilanBuku();
        queue.deQueue();
        queue.tampilanAntrian();
        System.out.println("\n");

        queue.enQueue("Sucrose", "Ada");
        queue.addBook("Resurection", "Unknown", "Unknown", "Terlarang");
        queue.addBook("Alhcemy", "Albedo", "Sience", "Terlarang");
        queue.addBook("Durin The Forgotten Dragon", "Gold", "Misteri", "Buku Biasa");

        queue.tampilanAntrian();
        System.out.println("\n");

        queue.hapus("Xiangling");
        queue.tampilanAntrian();
        System.out.println("\n");

        queue.tukar("Sucrose", "Kafka");
        queue.tampilanAntrian();
        System.out.println("\n");

        queue.tampilanBuku();
        queue.deQueue();
        queue.tampilanAntrian();
        System.out.println("\n");

        queue.tampilanBuku();
        queue.deQueue();
        System.out.println("\n");

        queue.first.stack.pop();
        queue.tampilanBuku();
        System.out.println("\n");

        queue.deQueue();
        queue.tampilanAntrian();
        System.out.println("\n");
    }
}
