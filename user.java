
package constructor;

public class user {
    public String username;
    public String password;
    
    public user(String username, String password){
        this.username = username;
        this.password = password;
    }
       
}

class DemoConstructor{
    public static void main(String[] args) {
        user petani = new user("petanikode", "kopi");
        System.out.println("Username: " + petani.username);
        System.out.println("Password: " + petani.password);
    }
}