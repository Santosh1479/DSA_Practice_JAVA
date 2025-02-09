// BANK>JAVA M HA SAB KUCH

//package bank;

class Account {
   public String name;
   protected String Email;
   private String Pass;

   // when a thing is pribate we use
   /// GETTERS & SETTERS

   public String GetPass(){
      return this.Pass;
   }   
   public void SetPass(String pass){
      this.Pass=pass;
   }
}
public class OOPS5 {
   public static void main(String[] args) {
      Account account1=new Account();
      account1.name="santosh";
      account1.Email="santosh@gmail.com";
      account1.SetPass("ABCD");
      System.out.println(account1.GetPass());
   }
}
 
