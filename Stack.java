public class Stack {
    public Buku top;
    
     public void push(String tittle, String author, String genre, String status){
        Buku dataBaru = new Buku(tittle, author, genre, status);
        if(top==null){
            top=dataBaru;
        }
        else{
            dataBaru.next=top;
            top=dataBaru;
        }
    }
    
    public void pop(){
        if(top==null){
            System.out.println("Data Kosong");
        }
        else{
            top=top.next;
        }  
    }

    public boolean spesial(){
        Buku current=top;
        while(current!=null){
            if(current.status=="Terlarang"){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    public void tukar(String tittle1, String tittle2){
        if(tittle1==tittle2){
            System.out.println("Tidak perlu ditukar");
            return;
        }  

        Buku prevP=null, currentP=top;
            while(currentP!=null){
                if(currentP.tittle==tittle1){
                    break;
                }
                prevP=currentP;
                currentP=currentP.next;
        }
        
        Buku prevQ=null, currentQ=top;
            while(currentQ!=null){
                if(currentQ.tittle==tittle2){
                    break;
                }
                prevQ=currentQ;
                currentQ=currentQ.next;
        }

        if(prevP!=null){
            prevP.next=currentQ;
        }else{
            top=currentQ;
        }

        if(prevQ!=null){
            prevQ.next=currentP;
        }else{
            top=currentP;
        }

        Buku bantu=currentP.next;
        currentP.next=currentQ.next;
        currentQ.next=bantu;  
    }

    public void tampilan(){
        Buku current=top;
        while(current!=null){
            System.out.println("=========================================");
            System.out.println("Judul Buku : " + current.tittle);
            System.out.println("Pengarang : " + current.author);
            System.out.println("Genre : " + current.genre);
            System.out.println("Status Buku : " + current.status);
            System.out.println("=========================================");
            current=current.next; 
        }
    }
}
    

