public class Main {

    public static void main(String[] args) {

        MobilePhone iPhone = new MobilePhone("0770 615 563");

        iPhone.addNewContact(new Contact("Cicoare Vlad", "0740 632 882"));
        iPhone.addNewContact(new Contact("Dodu Ionut", "0774 341 231"));
        iPhone.addNewContact(new Contact("Varu Costel", "0722 940 541"));
        iPhone.addNewContact(new Contact("Ignat Andrei", "0751 140 559"));
        iPhone.addNewContact(new Contact("Popa Doru", "0740 522 730"));
//        iPhone.addNewContact(new Contact("Popa Doru", "0740 522 730"));




        iPhone.printContacts();
        System.out.println(iPhone.queryContact("Varu Costel"));

    }
}
