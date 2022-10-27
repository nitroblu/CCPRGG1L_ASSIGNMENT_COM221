 public class Exercise {
    public static void main(String[] args) throws Exception {
  
  
  
       int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};
    
  
  
  
      //  PATTERN 1
        System.out.println("1. SUM OF PATTERN 1");

        int sum = 0;  
        for (int rows = 0; rows < 4; rows++) {

          for (int columns = 0; columns < 4; columns++) {
              if (rows == 0) {
                sum += mdArray[rows][columns];
              }
          }  
        }
        
        System.out.println(sum);
      
    
        
        // PATTERN 2
        System.out.println("");
        System.out.println("2. SUM OF PATTERN 2");

        int sum1 = 0;  
        for (int rows = 0; rows < 4; rows++) {

         for (int columns = 0; columns < 4; columns++) {
             if (columns == 0) {
               sum1 += mdArray[rows][columns];

           }
         }
       }

        System.out.println(sum1);
      
        
        // PATTERN 3
        System.out.println("");
        System.out.println("3. SUM OF PATTERN 3");

        int sum2 = 0;  
        for (int columns = 0; columns < 4; columns++) {

          for (int rows = 0; rows < 4; rows++) {
              if (columns == 0 || rows == 0) {
                sum2 += mdArray[rows][columns];

            }
          }  
        }
        
        System.out.println(sum2);
        
        // PATTERN 4
        System.out.println("");
        System.out.println("4. SUM OF PATTERN 4");

        int sum3 = 0;  
        for (int rows = 0; rows < 4; rows++) {

          for (int columns = 0; columns < 4; columns++) {

              if ((columns == 0 && rows == 0) || (columns == 0 && rows == 3) || (columns == 3 && rows == 0) || (columns == 3 && rows == 3)){

                sum3 += mdArray[rows][columns];

            }
          }  
        }
        
        System.out.println(sum3);

      

       
        
        // PATTERN 5
        System.out.println("");
        System.out.println("5. SUM OF PATTERN 5");

        int sum4 = 0;  

        for (int rows = 0; rows < 4; rows++) {

          for (int columns = 0; columns < 4; columns++) {

              if ((rows == 1 && columns== 1) || (rows == 1 && columns == 2) || (rows == 2 && columns == 1) || (rows == 2 && columns == 2)){

                sum4 += mdArray[rows][columns];

            }

          }  

        }

        System.out.println(sum4);
        

      
        // PATTERN 6
        System.out.println("");
        System.out.println("6. SUM OF PATTERN 6");
        int sum5 = 0;  
        for (int rows = 0; rows < 4; rows++) {

          for (int columns = 0; columns < 4; columns++) {

            if ((rows == 0 && columns== 0) || (rows == 0 && columns == 3) || (rows == 3 && columns == 0) || (rows == 3 && columns == 3) || (rows == 1 && columns== 1) || (rows == 1 && columns == 2) || (rows == 2 && columns == 1) || (rows == 2 && columns == 2)){
                sum5 += mdArray[rows][columns];
  }
}
}
         System.out.println(sum5);
}
}

        
