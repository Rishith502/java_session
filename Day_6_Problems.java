public class Day_6_Problems {
    public static void main(String[] args){
        //nested loop
        //outer loop for rows
        for(int i=0; i<=4; i++){
            //inner loops for columns
            for(int j=0; j<i; j++){
                System.out.print("y ");
            }
            System.out.println();
        }
    }
    
}
