public class Test {
   
    public static void main(String[] args){

        String search; 

        Scanner input = new Scanner(System.in);
     
        Client a = new Client("Jack", "123 1ST Ave", "(123) 456-8789", "ID1");

        Client b = new Client("Lucy", "456 2ND Ave", "(456) 799-1324", "ID2");

        Cart e = new Cart("Pen", "Jack", "ID1", "12.32", "14", "100");

        Cart f = new Cart("Apple", "Lucy", "ID2", "15.32", "12", "456");

        Transaction g = new Transaction("ID456", "A123264", "152.32");

        Transaction h = new Transaction("ID789", "A98764", "1542.23");

        ClientList d = new ClientList();

        d.insertClientInfo(a);
        d.insertClientInfo(b);

        e.insertItemToCart(e);
        f.insertItemToCart(f);

        g.insertItemToTransaction(g);
        h.insertItemToTransaction(h);


        // Display Information
        d.displayAllClient();  
        e.displayAllCart();
        g.displayAllTranscation();
        
    }

}