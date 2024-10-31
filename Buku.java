public class Buku {
    public Buku next;
    public String tittle, author, genre, status;

    
    public Buku (String tittle, String author, String genre, String status){
        this.tittle=tittle;
        this.author=author;
        this.genre=genre;
        this.status=status;
    }
}