
class name {
   public void userName(){
       System.out.println("Hello My Name is Ankush Thakur");
   }
   
}

class multiLevel extends name {
   public void skills(){
       System.out.println("I am React JS Developer");
   }
}

class company extends multiLevel {
   public void works(){
       System.out.println("I am a Trainee at Mobile Programmin LLC");
   }
}

public class multilevelInheritancex{
   public static void main(String[] args)
   {
       company a = new company();
       a.userName();
       a.skills();
       a.works();
   }
}