class IDCard {
    String name, id, department, institution;

    
    IDCard(String n, String i, String d, String inst) {
        name = n;
        id = i;
        department = d;
        institution = inst;
    }

    
    void showID() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Institution: " + institution);
    }

    
    public static void main(String[] args) {
        IDCard myCard = new IDCard("Shuvo", "12345", "CCC", "IIUC");
        myCard.showID();
    }
}
