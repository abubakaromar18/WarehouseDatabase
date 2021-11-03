public class LoadData {
    
    public static LoadData run(ClientList cList, productList pList){

        // Client
		Client c1= new Client("John","21 Ave SE", "736-345-4434", "03949", 0);
        Client c2= new Client("Mike","7th Ave SE", "493-948-5039", "34283", 0);
        Client c3= new Client("Emily","2088 3rd Ave NE", "459-394-3984", "49582", 0);
        Client c4= new Client("Tim","864 2th Ave S", "073-895-5938", "93029", 0);
        Client c5= new Client("Paul","212 Ave N", "304-683-1647", "95827", 0);
        Client c6= new Client("Ken","468 8th Ave", "594-474-5920", "62456", 0);
        Client c7= new Client("Tom","2100 2th Ave", "968-483-2648", "68798", 0);
        Client c8= new Client("Fray","956 9th Ave NE", "485-960-4839", "12584", 0);
        Client c9= new Client("Jack","39932 3rd Ave SE", "990-594-9483", "32855", 0);
        Client c10= new Client("Miku","Milkyroad 2453 N", "445-839-4060", "10552", 0);

        // Product
        products prod1 = new products("Pen","P1245", "Ball-point Pen", 100, 1.75 );
        products prod2 = new products("NoteBook","P3267", "College Ruled 80 page", 200, 3.75 );
        products prod3 = new products("Backpack","P1795", "8 Pocket Backpack", 250, 34.99 );
        products prod4 = new products("Planners","P1345", "2021 Daily Planner", 100, 12.99 );
        products prod5 = new products("Pencil","P1655", "No.7 Pencil", 150, 1.75 );
        products prod6 = new products("Sharpener","P2135", "Electrical Sharpener", 50, 7.99 );
        products prod7 = new products("Folders", "P2897", "2 Pocket Folder", 150, 2.50);
        products prod8 = new products("Binder","P6455", "2 inch Binder", 125, 4.99 );
        products prod9 = new products("Highlighter","P3657", "8 Pack Multi-Color", 0, 5.49 );
        products prod10 = new products("Calculator","P4526", "TI-84 Graphing Calculator", 20, 114.99 );


        // Add Client To List
        cList.insertClientInfo(c1);
        cList.insertClientInfo(c2);
        cList.insertClientInfo(c3);
        cList.insertClientInfo(c4);
        cList.insertClientInfo(c5);
        cList.insertClientInfo(c6);
        cList.insertClientInfo(c7);
        cList.insertClientInfo(c8);
        cList.insertClientInfo(c9);
        cList.insertClientInfo(c10);


        // Add Product To List

        pList.addProductList(prod1);
        pList.addProductList(prod2);
        pList.addProductList(prod3);
        pList.addProductList(prod4);
        pList.addProductList(prod5);
        pList.addProductList(prod6);
        pList.addProductList(prod7);
        pList.addProductList(prod8);
        pList.addProductList(prod9);
        pList.addProductList(prod10);

        return null;

    }

}
