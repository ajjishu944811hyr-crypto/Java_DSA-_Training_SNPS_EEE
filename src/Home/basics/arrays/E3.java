package Home.basics.arrays;

public class E3 {
    public static void main(String[] args) {
        int[ ] arr = {1,3,5,7,9};
        System.out.println(arr.length);
        // 2D Array Matrix or [Array of Arrays]
        int[][] matrix = {{1,2,3}, // 0 col
                          {4,5,6}, // 1 col
                          {7,8,9}, // 2 col
                          {9,8,7}}; // 3 col  to get col
        // Total number of rows = length of the matrix
        System.out.println(matrix.length);// total no of rows
        System.out.println(matrix[0].length); // length of the 1st row

        for(int r=0; r< matrix.length ; r++){
            for(int c=0 ; c< matrix[0].length; c++){  //cols
                System.out.print(matrix[r][c] + " ");  // call[r][c]
            }
            System.out.println();
        }
        //when in 2 d array or in matrix the rows are not equal the this array is called "JAGGED ARRAY" .

        char [][] languages = {{'K','a','n','n','a','d','a'},
                               {'T','e','l','u','g','u'},
                               {'M','a','l','a','y','a','l','a','m'},
                               {'T','a','m','i','l'},
                               {'K','o','n','k','a','n','i'}};
        System.out.println(languages[0].length); // Length of 1st row
        System.out.println(languages[3].length); // Length of 4th row
        System.out.println(languages[4].length); // length of 5th row
        for(int r = 0 ; r< languages.length ; r++){   // row 0 till row 4
            for(int c=0 ; c< languages[r].length ; c++){
                System.out.print(languages[r][c] + " ");
            }
            System.out.println();
        }

        int [][] jagged = {{1,2,3,4,5,6,7,8,9},
                        {1,2,3,4,5,},
                        {1}};
        for(int r=0 ; r< jagged.length; r++){
            for(int c=0 ; c< jagged[r].length;c++){
                System.out.print(jagged[r][c] +" ");
            }
            System.out.println();
        }
    }
}
