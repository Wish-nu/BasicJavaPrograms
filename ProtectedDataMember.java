//PROTECTED DATA MEMBER WITH INHERITANCE



class BikePrt{
    protected int speedlimit =100;
    //created a protected data member
}

class Bajaj extends BikePrt{
    int speedlimit = 140;


public static void main(String[] args){
    BikePrt obj= new Bajaj();
    
    System.out.println(obj.speedlimit);
    /*speedlimit under BikePrt class is printed as it s protected data member / speedlimit under bajaj class is over riden */
    
}
}
