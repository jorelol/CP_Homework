import java.io.File;
import java.util.Scanner;

/**
 * Created by jorel on 15/6/17.
 */

/* This program is written to solve any sudoku puzzle within a few hundred milli-seconds
   The user must first input the puzzle either by:
        1) Keying in the puzzle in a text file (using zeroes to represent blanks)
        2) Keying in the puzzle into the console (using zeroes to represent blanks)
   The program reads the text file and stores it as an array
   The blanks (zeros) are tested with numbers 1 to 9 and must adhere to the following rules:
        1) Each row can only have one instance of each number
        2) Each column can only have one instance of each number
        3) Each 3x3 square can only have one instance of each number
   If a number satisfies all three requirements it is stored in the array replacing the zeroes
   The program ends by printing out the solution that is found
 */

public class SudokuSolver {
    public static void main(String[] args) {

        // The user input is captured and saved as strings which are then converted into integers
        // and placed into their repsective locations in a 9x9 array representing a sudoku board
        Scanner in = new Scanner(System.in);

        String[] input = new String[9];

        for (int y = 0; y<9; y++) {
            System.out.println("Enter numbers in row " + (y + 1) + " (separated by commas):");
            input[y] = in.next();
        }

        String row1 = input[0];
        String row12[] = row1.split(",");
        int[] array1 = new int[row12.length];
        for (int i=0; i<row12.length; i++){
            array1[i] = Integer.parseInt(row12[i]);
        }

        String row2 = input[1];
        String row22[] = row2.split(",");
        int[] array2 = new int[row22.length];
        for (int i=0; i<row22.length; i++){
            array2[i] = Integer.parseInt(row22[i]);
        }

        String row3 = input[2];
        String row32[] = row3.split(",");
        int[] array3 = new int[row32.length];
        for (int i=0; i<row32.length; i++){
            array3[i] = Integer.parseInt(row32[i]);
        }

        String row4 = input[3];
        String row42[] = row4.split(",");
        int[] array4 = new int[row42.length];
        for (int i=0; i<row42.length; i++){
            array4[i] = Integer.parseInt(row42[i]);
        }

        String row5 = input[4];
        String row52[] = row5.split(",");
        int[] array5 = new int[row52.length];
        for (int i=0; i<row52.length; i++){
            array5[i] = Integer.parseInt(row52[i]);
        }

        String row6 = input[5];
        String row62[] = row6.split(",");
        int[] array6 = new int[row62.length];
        for (int i=0; i<row62.length; i++){
            array6[i] = Integer.parseInt(row62[i]);
        }

        String row7 = input[6];
        String row72[] = row7.split(",");
        int[] array7 = new int[row72.length];
        for (int i=0; i<row72.length; i++){
            array7[i] = Integer.parseInt(row72[i]);
        }

        String row8 = input[7];
        String row82[] = row8.split(",");
        int[] array8 = new int[row82.length];
        for (int i=0; i<row82.length; i++){
            array8[i] = Integer.parseInt(row82[i]);
        }

        String row9 = input[8];
        String row92[] = row9.split(",");
        int[] array9 = new int[row92.length];
        for (int i=0; i<row92.length; i++){
            array9[i] = Integer.parseInt(row92[i]);
        }

        //The following lines are to place the digits into the 9x9 sudoku array
        int[][] sudoku = new int[9][9];

        sudoku[0][0] = array1[0];
        sudoku[0][1] = array1[1];
        sudoku[0][2] = array1[2];
        sudoku[0][3] = array1[3];
        sudoku[0][4] = array1[4];
        sudoku[0][5] = array1[5];
        sudoku[0][6] = array1[6];
        sudoku[0][7] = array1[7];
        sudoku[0][8] = array1[8];

        sudoku[1][0] = array2[0];
        sudoku[1][1] = array2[1];
        sudoku[1][2] = array2[2];
        sudoku[1][3] = array2[3];
        sudoku[1][4] = array2[4];
        sudoku[1][5] = array2[5];
        sudoku[1][6] = array2[6];
        sudoku[1][7] = array2[7];
        sudoku[1][8] = array2[8];

        sudoku[2][0] = array3[0];
        sudoku[2][1] = array3[1];
        sudoku[2][2] = array3[2];
        sudoku[2][3] = array3[3];
        sudoku[2][4] = array3[4];
        sudoku[2][5] = array3[5];
        sudoku[2][6] = array3[6];
        sudoku[2][7] = array3[7];
        sudoku[2][8] = array3[8];

        sudoku[3][0] = array4[0];
        sudoku[3][1] = array4[1];
        sudoku[3][2] = array4[2];
        sudoku[3][3] = array4[3];
        sudoku[3][4] = array4[4];
        sudoku[3][5] = array4[5];
        sudoku[3][6] = array4[6];
        sudoku[3][7] = array4[7];
        sudoku[3][8] = array4[8];

        sudoku[4][0] = array5[0];
        sudoku[4][1] = array5[1];
        sudoku[4][2] = array5[2];
        sudoku[4][3] = array5[3];
        sudoku[4][4] = array5[4];
        sudoku[4][5] = array5[5];
        sudoku[4][6] = array5[6];
        sudoku[4][7] = array5[7];
        sudoku[4][8] = array5[8];

        sudoku[5][0] = array6[0];
        sudoku[5][1] = array6[1];
        sudoku[5][2] = array6[2];
        sudoku[5][3] = array6[3];
        sudoku[5][4] = array6[4];
        sudoku[5][5] = array6[5];
        sudoku[5][6] = array6[6];
        sudoku[5][7] = array6[7];
        sudoku[5][8] = array6[8];

        sudoku[6][0] = array7[0];
        sudoku[6][1] = array7[1];
        sudoku[6][2] = array7[2];
        sudoku[6][3] = array7[3];
        sudoku[6][4] = array7[4];
        sudoku[6][5] = array7[5];
        sudoku[6][6] = array7[6];
        sudoku[6][7] = array7[7];
        sudoku[6][8] = array7[8];

        sudoku[7][0] = array8[0];
        sudoku[7][1] = array8[1];
        sudoku[7][2] = array8[2];
        sudoku[7][3] = array8[3];
        sudoku[7][4] = array8[4];
        sudoku[7][5] = array8[5];
        sudoku[7][6] = array8[6];
        sudoku[7][7] = array8[7];
        sudoku[7][8] = array8[8];

        sudoku[8][0] = array9[0];
        sudoku[8][1] = array9[1];
        sudoku[8][2] = array9[2];
        sudoku[8][3] = array9[3];
        sudoku[8][4] = array9[4];
        sudoku[8][5] = array9[5];
        sudoku[8][6] = array9[6];
        sudoku[8][7] = array9[7];
        sudoku[8][8] = array9[8];

        /* A MORE PRIMITIVE METHOD IS TO SIMPLY READ THE SUDOKU PUZZLE FROM A TEXT FILE


        // User will input file path here
        // Text file can be modified at any time
        Scanner scanner = new Scanner(new File(
                "/Users/jorel/Google Drive/SMU/Exchange/Classes/Computer Programming/sudoku.txt"));

        //create new array to hold the text file data
        int[][] sudoku = new int[9][9];
        String line = scanner.nextLine();

        //create loop to place digits into respective positions in the array
        for (int y = 0; y < 9; y++)
        {
            for (int x = 0; x < 9; x++)
            {
                //Converts character from text file into an integer
                sudoku[y][x] = Character.getNumericValue(line.charAt(x));

                //At the end of each line
                //Check if next line exists
                //Add next line
                if (x == 8 && scanner.hasNextLine())
                {
                    line = scanner.nextLine();
                }
            }
        }
        */

        System.out.println("Input Puzzle:");

        System.out.println("-------------");

        for (int y=0; y<9; y++)
        {

            if (y == 3 || y == 6)
            {
                System.out.println("-------------");
            }

            if (y <= 8)
            {
                System.out.print("|");
            }

            for (int x=0; x<9; x++)
            {

                System.out.print(sudoku[y][x]);

                if(x == 2 || x == 5)
                {
                    System.out.print("|");
                }

                if (x == 8)
                {
                    System.out.print("|");
                    System.out.println();
                }
            }
        }
        System.out.println("-------------");

        System.out.println();

        //Solves the sudoku puzzle
        solve(sudoku, 0, 0);

    }

    //This method goes through each blank (zeros) on the sudoku board and fills in numbers according to sudoku rules
    private static void solve(int[][] sudoku, int cellX, int cellY)
    {
        //Once the y value is 9, the sudoku puzzle is solved
        if(cellY > 8)
        {
            printSudoku(sudoku);
            System.out.println();
            //The first solution found is printed, in the case of more than one solution
        }
        else
        {
            //Calculate next digit for the solve method to try
            int nextX = cellX;
            int nextY = cellY;
            if(cellX == 8)
            {
                //At the end of the row, add 1 and reset the row to 0
                nextX = 0;
                nextY++;
            }
            else
            {
                nextX++;
            }

            //If the cell on the sudoku board is already given in the puzzle (not zero), the program skips that cell
            if(sudoku[cellY][cellX] != 0)
            {
                solve(sudoku, nextX, nextY);
            }
            else
            {
                //If the cell is blank, the program will try numbers 1 to 9
                //The number is accepted if it follows the rules of sudoku
                for(int checkNumber = 1; checkNumber < 10; checkNumber++) {
                    if (checkSquare(sudoku, cellX, cellY, checkNumber)
                            && checkRow(sudoku, cellY, checkNumber)
                            && checkCol(sudoku, cellX, checkNumber)) {
                        sudoku[cellY][cellX] = checkNumber;
                        solve(sudoku, nextX, nextY);
                    }
                }
                sudoku[cellY][cellX] = 0;
            }
        }
    }

    //This method ensures that a digit is the only digit in that 3x3 square
    private static boolean checkSquare(int[][] sudoku, int reqX, int reqY, int toCheck)
    {
        int rowY;
        int colX;

        //This identifies which column the 3x3 square of concern is
        //X value < 3 means first column
        //X value < 6 means second column
        //X value > 6 means third column
        if(reqX < 3)
        {
            colX = 0;
        }
        else if (reqX < 6)
        {
            colX = 3;
        }
        else
        {
            colX = 6;
        }

        //This identifies which row the 3x3 square of concern is
        //Y value < 3 means first row
        //Y value < 6 means second row
        //Y value > 6 means third row
        if(reqY < 3)
        {
            rowY = 0;
        }
        else if (reqY < 6)
        {
            rowY = 3;
        }
        else
        {
            rowY = 6;
        }
        //The square is now defined

        //The following checks if a digit is unique within the 3x3 square
        //Returns false if the digit already exists
        for(int y = rowY; y < rowY + 3; y++)
        {
            for(int x = colX; x < colX + 3; x++)
            {
                if(sudoku[y][x] == toCheck)
                {
                    return false;
                }
            }
        }

        //Returns true is the digit does not exist yet
        return true;

    }

    //This method ensures that a digit is unique across the entire 9 cell row
    private static boolean checkRow(int[][] sudoku, int rowY, int toCheck)
    {
        //loops through each digit in the row
        for(int x = 0; x < 9; x++)
        {
            //Checks if a digit is unique in the row
            //Returns false if it matches an existing digit
            if (toCheck == sudoku[rowY][x])
            {
                return false;
            }
        }
        //Returns true if it is a unique digit
        return true;
    }

    //This method ensures that a digit is unique across the entire 9 cell column
    private static boolean checkCol(int[][] sudoku, int colX, int toCheck)
    {
        //Loops through each digit in the column
        for(int y = 0; y < 9; y++)
        {
            //Checks if a digit is unique in the column
            //Returns false if it matches an existing digit
            if (toCheck == sudoku[y][colX])
            {
                return false;
            }
        }
        //Returns true if the digit is unique
        return true;
    }

    //This method prints out the completed sudoku board
    private static void printSudoku(int sudoku[][])
    {
        //Loops through the array and prints it
        //For statements are used to format the array into a sudoku grid

        System.out.println("Output Solution:");

        System.out.println("-------------");

        for(int y = 0; y < 9; y++)
        {
            if (y == 3 || y == 6)
            {
                System.out.println("-------------");
            }

            if (y <= 8)
            {
                System.out.print("|");
            }

            for(int x = 0; x < 9; x++)
            {
                System.out.print(sudoku[y][x]);
                if (x == 2 || x == 5)
                {
                    System.out.print("|");
                }
                //Start new line at the end of each row
                if(x == 8)
                {
                    System.out.print("|");
                    System.out.println();
                }
            }
        }

        System.out.println("-------------");
    }
}
