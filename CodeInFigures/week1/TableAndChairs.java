package week1;

public class TableAndChairs {
    public static void main(String [] args){
        for(int i =0; i < 6; i++){
            for(int j = 0; j < 9; j++){
                if(j==2*i || 8-2*i == j)
                    System.out.print("X");
                else if(8-2*i < j && j > 2*i)
                    break;
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}
