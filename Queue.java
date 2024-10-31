public class Queue {
    public Peminjam first;
    public Peminjam last;

    public void enQueue(String nama, String kartu){
        Peminjam dataBaru = new Peminjam(nama, kartu);
        if(first==null){
            first=dataBaru;
            last=dataBaru;
        }
        else{
            last.next=dataBaru;
            last=dataBaru;
        }
    }

    public void deQueue(){
        if(first==null){
            System.out.println("Data Kosong");
            return;
        }
        else{
            if(first.kartu=="Tidak Ada" && first.stack.spesial()==true){
                System.out.println("Tidak dapat meminjam buku");
            }
            else{
                first=first.next;
            }
        }
    }

    public void addBook(String tittle, String author, String genre, String status){
        last.stack.push(tittle, author, genre, status);
        last.jumlah++;
    }

    public void hapus(String nama){
        Peminjam current=first;
        while(current!=null){
            if(current.next.nama==nama){
                current.next=current.next.next;
                return;
            }
            current=current.next;
        }
    }

    public void tukar(String nama1, String nama2){
        if(nama1==nama2){
            System.out.println("Tidak perlu ditukar");
            return;
        }

        Peminjam prevP=null, currentP=first;
        while(currentP!=null){
            if(currentP.nama==nama1){
                break;
            }
            prevP=currentP;
            currentP=currentP.next;
        }

        Peminjam prevQ=null, currentQ=first;
        while(currentQ!=null){
            if(currentQ.nama==nama2){
                break;
            }
            prevQ=currentQ;
            currentQ=currentQ.next;
        }

        if(prevP!=null){
            prevP.next=currentQ;
        }else{
            first=currentQ;
        }

        if(prevQ!=null){
            prevQ.next=currentP;
        }else{
            first=currentP;
        }

        Peminjam bantu=currentP.next;
        currentP.next=currentQ.next;
        currentQ.next=bantu;
    }

    public void tampilanBuku(){
        System.out.println("=========================================");
        System.out.println("=\t\tBUKU " + first.nama.toUpperCase() + "\t\t=");
        first.stack.tampilan();
    }

    public void tampilanAntrian(){
        Peminjam current=first;
        int counter=0;
        System.out.println("=========================================");
        System.out.println("=             DAFTAR ANTIAN             =");
        if(current==null){
            System.out.println("Antrian Kosong");
        }
        while(current!=null){
            current.antrian=++counter;
            System.out.println("=========================================");
            System.out.println("Nama : "+ current.nama);
            System.out.println("Antrian ke : "+ current.antrian);
            System.out.println("Jumlah Buku : "+ current.jumlah);
            System.out.println("Kartu Special : "+ current.kartu);
            System.out.println("=========================================");
            current=current.next;
        }
    }
}
