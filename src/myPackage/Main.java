package myPackage;

public class Main {
    public static void main(String[] args) 
    {
      /*  DossierBancaire obj=new DossierBancaire();
        GUI g = new GUI(obj);
        //System.out.println("Solde: " + obj.get_solde()); */
    	
        Client c= new Client("Diouf", "Annastasie",9);
        GUI g = new GUI(c);
      
    }

}
