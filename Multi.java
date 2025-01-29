// multi level inheritence
class Name{
   public void name(){
      System.out.println("Name: Vansh");
   }
}
class AGE extends  Name{
   public void age(){
      System.out.println("\n age: 22");
   }
}
class UID extends  AGE{
   public void uid(){
      System.out.println("\n uid:22BCA10001");
   }
}
public class Multi{
   public static void main(String args[]){
      UID uid = new UID();
      uid.name();
      uid.age();
      uid.uid();
   }
}
