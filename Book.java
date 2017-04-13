class Author{
	String name;
	String email;
	char gender;
	Author(String na,String em,char ge){
	name=na;
    email=em;
	gender=ge;
	}
}

class Book{
	 Author author;
	 String name;
	 double price;
	 int qtyInStock;
	
	Book(Author a,String na,double pr,int q){
	
    author=a;
    name=na;
    price=pr;
    qtyInStock=q;	
	}
	
	void getAuthor(){
	System.out.println(author.name+" "+author.email+" "+author.gender);
	}
	
	void getName(){
		System.out.println(name);
	}
	void getPrice(){
		System.out.println(price);
	}
	
	void getQtyInStock(){
		System.out.println(qtyInStock);
	}
	public static void main(String args[]){
		Author ao=new Author("dharani","dharani@",'f');
		Book bk=new Book(ao,"chandu",250.0,4);
		Book bk1=new Book(ao,"sneha",300.0,10);
		
		bk.getAuthor();
		bk.getName();
		bk.getPrice();
		bk.getQtyInStock();
		
		bk1.getAuthor();
		bk1.getName();
		bk1.getPrice();
		bk1.getQtyInStock();
	}
}


