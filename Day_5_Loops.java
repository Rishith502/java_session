public class Day_5_Loops {
    public static void main(String[] args) {
        //System.out.println("JAVA");

        //10 times
        //couunt = 0
        //count = 1
        //count = 2
        //count = 3

        for(int i = 1; i<=10; i++){
            System.out.println("JAVA");
        }


        String s = "Phone";
        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
        System.out.println("b" + 1 +"a" + 2 * 8);
        System.out.println("A" + 2 + 2);
    }
    public String stringTimes(String str, int n) {
        String s="";
        for(int i=0;i<n;i++){
          s=str+s;
        }
        return s;
      }
      public String stringBits(String str) {
        String s="";
        for(int i=0; i<str.length();i++){
          if(i%2==0){
            s += str.charAt(i);
          }
        }
        return s;
      }
      
}
    

