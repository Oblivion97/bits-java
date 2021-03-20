package core;



// The main method must be in a class named "Main".
class MultiDimentionalArray {
    public static void main(String[] args) {
        int [][] grid ={
            {3, 5, 7},
            {2, 4, 8},
            {10, 20, 30}
        };
        
        //System.out.println(grid[0][2]);
        for(int  row = 0; row < grid[row].length; row++){
            for(int col = 0; col<grid[row].length; col++){
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }
}