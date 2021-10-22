all: compile compile2 compile3 compile4 compile5
compile:
	javac Client.java ClientList.java

compile2:
	javac products.java productList.java

compile3:
	javac Supplier.java SupplierList.java

compile4:
	javac Cart.java Transaction.java UnpaidBalance.java

compile5:
	javac FinalStage.java


clean:
	rm *.class
