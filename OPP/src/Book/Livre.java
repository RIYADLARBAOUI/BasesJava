package Book;

public class Livre {

    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Livre(String name , Author[] authors, double price){
        this.name= name;
        this.authors = authors;
        this.price = price;
    }

    public Livre(String name , Author[] authors, double price, int qty){
        this.name= name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return this.name;
    }

    public Author[] getAuthors(){
        return this.authors;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price=price;
    }


    public int getQty(){
        return this.qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString(){
        String test = "Livre[name="+this.name+",authors = {Authors";
        for(int i = 0 ; i < authors.length;++i){
            test+= "[name="+this.getAuthors()[i].getName()+",email="+this.getAuthors()[i].getEmail()+",gender="+this.getAuthors()[i].getGender()+"]}";
        }
        return  test+=",price="+this.price+",qty="+this.qty+"]";
    }

    public String getAuthorNames(){
        String stk="";
        for(Author element : authors ){
            stk += element.getName()+",";

        }
        return stk;

    }





}
