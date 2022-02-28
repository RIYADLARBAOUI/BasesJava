



public class Customer {
    private int ID;
    private String name;
    private char gender;

    public Customer(int ID,String name,char gender){
        this.ID = ID;
        this.name = name;
        if(gender == 'm' || gender == 'f'){
            this.gender = gender;
        }
        else{
            System.out.println("Enter correct value for gender");
        }

    }

    public int getID(){
        return this.ID;
    }

    public String getName(){
        return this.name;
    }

    public char getGender(){
        return this.gender;
    }

    public String toString(){
        return this.name+"(ID="+this.ID+")";
    }


}
