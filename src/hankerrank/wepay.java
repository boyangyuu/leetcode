package hankerrank;

/**
 * Created by yuboyang on 8/7/17.
 */
/*
Nurikabeis a puzzle where a 2d grid is given with many blank spaces and some numbers.The challenge is to fill in the grid with '.' (water) and '#' (islands) in sucha way that
   - Each number is with a connectedgroup of island squares that, including the number square itself, containsexactly that many squares are connected up-down-left-right only, not diagonally
   - Each connected group of islandsquares contains exactly one numbered square
   - All of the water squares areconnected to each other
   - There no 2x2 blocks of wateranywhere in the grid
   - No other characters appear in thegrid (cheater!)
   Your task is to write a function thattakes a 2d array representing a solved Nurikabe puzzle and returns Trueif the puzzle is correctly solved and False otherwise.
   For example, given the 5x5 puzzle
   ~~~~
   .#2.1
   .....
   #2.#.
   ...2.
   #2..1
   ~~~~
   you would return true, but given
   ~~~
   ..2.1
   ..#..
   #2.#.
   ...2.
   #2..1
鏉ユ簮涓€浜�
 */
/*
 * Complete the function below.
 */
class wepay{

    public static void main(String[] args) {
        String [][] puzzle = new String[5][5];
        String given =
                "5###5" +
                "....." +
                "#2.#." +
                "...2." +
                "#2..1";

        int index = 0;
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[0].length; j++) {
                puzzle[i][j] =  given.charAt(index++) + "";
            }
        }
        System.out.println(verify(puzzle));
    }

    private static int [][] visited;
    static boolean verify(String[][] puzzle) {
        visited = new int[puzzle.length][puzzle[0].length];
        for(int i = 0; i < puzzle.length;i++) {
            for(int j= 0;j < puzzle[0].length;j++) {
                String ch = puzzle[i][j];
                if(ch.equals(".")) {
                    visited[i][j] = 1;
                    if (isCube(puzzle, i ,j)) return false;
                } else if(!ch.equals("#") && (!isValidNumberOfSquares(puzzle,i,j)))
                    return false;
            }
        }
        for(int i =0; i< puzzle.length;i++)
            for(int j=0;j< puzzle[0].length;j++)
                if (visited[i][j] != 1 ) return false;
        return true;
    }

    static boolean isValidNumberOfSquares(String[][] puzzle, int i, int j) {
        int num = 1;
        try{
            num = Integer.parseInt(puzzle[i][j]);

        }
        catch(Exception e){
            return false;
        }
        if (visited[i][j] == 1) {
            System.out.println("false");
            return false;
        }
        int[] count = new int[1];
        countNumber(puzzle, i, j, count);
//        System.out.println(count[0]);
        if(count[0] == num - 1) return true;
        else {
//            System.out.println("count");
            return false;
        }
    }

    static void countNumber(String[][] puzzle, int i, int j, int[] cnt) {
        if (cnt[0] == -1) return;
        if (i >= puzzle.length || i < 0 || j >= puzzle[0].length || j < 0) return;
        String cur = puzzle[i][j];
        if (visited[i][j] == 1 || cur.equals(".")) return;
        visited[i][j] = 1;
        if (puzzle[i][j].equals("#")) cnt[0]++;
        countNumber(puzzle, i + 1, j, cnt);
        countNumber(puzzle, i - 1, j, cnt);
        countNumber(puzzle, i, j + 1, cnt);
        countNumber(puzzle, i, j - 1, cnt);
    }

    static boolean isCube(String[][] puzzle, int i, int j) {
        String dot = ".";
        if(i + 1 != puzzle.length && j + 1 != puzzle[0].length) {
            if(dot.equals(puzzle[i][j]) && dot.equals(puzzle[i+1][j]) && dot.equals(puzzle[i][j+1])&&dot.equals(puzzle[i+1][j+1])){
                System.out.println("c");
                return true;
            }
        }
        return false;
    }



}



