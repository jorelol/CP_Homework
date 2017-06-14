import java.io.File;
import java.util.Scanner;

/**
 * Created by jorel on 11/6/17.
 */

/* This program is written to solve any sudoku puzzle within a few hundred milli-seconds
   The user must first input the puzzle into a text file with zeros representing blanks
   The program reads the text file and stores it as an array
   The blanks (zeros) are tested with numbers 1 to 9 and must adhere to the following rules:
        1) Each row can only have one instance of each number
        2) Each column can only have one instance of each number
        3) Each 3x3 square can only have one instance of each number
   If a number satisfies all three requirements it is stored in the array replacing the zeroes
   The program ends by printing out the solution that is found
 */

public class Solver
{

    public static void main(String[] args) throws Exception
    {
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

        //Loop to print out the text file stored as an array
        //For statements are used to format the text file into a sudoku grid

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