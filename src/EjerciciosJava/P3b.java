package EjerciciosJava;

import java.util.Scanner;

public class P3b {
		
		private int x;
	    private int y;
	    private int z;
	    private int idp;
	    
	    public P3b(int x, int y, int z, int idp) {
	         this.x = x;
	         this.y = y;
	         this.z = z;
	         this.idp = idp;
	         
	    }

	    public int getXPos() {
	         return x;
	    }
	    public int getYPos() {
	         return y;
	    }
	    public int getZPos() {
	         return z;
	    }
	    public int getIDP() {
	         return x;
	    }
	    public void setX(int x) {
		this.x = x;
	    }
	    public void setY(int y) {
			this.y = y;
	    }
	    public void setZ(int z) {
			this.z = z;
	    }
	    public void setIDP(int idp) {
			this.idp = idp;
	    }
	  
	    
		 // Name-constants to represent the seeds and cell contents
		   public static final int EMPTY = 0;
		   public static final int CROSS = 1;
		   public static final int NOUGHT = 2;
		 
		   // Name-constants to represent the various states of the game
		   public static final int PLAYING = 0;
		   public static final int DRAW = 1;
		   public static final int CROSS_WON = 2;
		   public static final int NOUGHT_WON = 3;
		 
		   // The game board and the game status
		   public static final int ROWS = 10, COLS = 10; // number of rows and columns
		   public static int[][] board = new int[ROWS][COLS]; // game board in 2D array
		                                                      //  containing (EMPTY, CROSS, NOUGHT)
		   public static int currentState;  // the current state of the game
		                                    // (PLAYING, DRAW, CROSS_WON, NOUGHT_WON)
		   public static int currentPlayer; // the current player (CROSS or NOUGHT)
		   public static int currntRow, currentCol; // current seed's row and column
		 
		   public static Scanner in = new Scanner(System.in); // the input Scanner
		 
		 
		   /** Initialize the game-board contents and the current states */
		   public static void initGame() {
		      for (int row = 0; row < ROWS; ++row) {
		         for (int col = 0; col < COLS; ++col) {
		            board[row][col] = EMPTY;  // all cells empty
		         }
		      }
		      currentState = PLAYING; // ready to play
		      currentPlayer = CROSS;  // cross plays first
		   }
		 
		   /** Player with the "theSeed" makes one move, with input validation.
		       Update global variables "currentRow" and "currentCol". */

		
		   public static void playerMove(int theSeed) {
		      boolean validInput = false;  // for input validation
		      do {
		         if (theSeed == CROSS) {
		            System.out.print("Please, enter your destination (row[1-10] column[1-10]): ");
		         } else {
		            System.out.print("Please, enter your destination (row[1-10] column[1-10]): ");
		         }
		         int row = in.nextInt() - 1 ;  // array index starts at 0 instead of 1
		         int col = in.nextInt() - 1 ;
		         
		         if (row >= 0 && row < ROWS && col >= 0 && col < COLS && board[row][col] == EMPTY) {
		            currntRow = row;
		            currentCol = col;
		            board[currntRow][currentCol] = theSeed;  // update game-board content
		            
		       
		            validInput = true;  // input okay, exit loop
		         } else {
		            System.out.println("This move at (" + (row + 1) + "," + (col + 1)
		                  + ") is not valid. Try again...");
		         }
		      } while (!validInput);  // repeat until input is valid
		   }
		 
		   /** Update the "currentState" after the player with "theSeed" has placed on
		       (currentRow, currentCol). */
		  // public static void updateGame(int theSeed, int currentRow, int currentCol) {
		    //  if (isDraw() = false) {  // check if winning move
		      //   currentState = (theSeed == CROSS) ? CROSS_WON : NOUGHT_WON;
		     // } else if (isDraw()) {  // check for draw
		       //  currentState = DRAW;
		      //}
		      // Otherwise, no change to currentState (still PLAYING).
		   //}
		 
		   /** Return true if it is a draw (no more empty cell) */
		   // TODO: Shall declare draw if no player can "possibly" win
		   public static boolean isDraw() {
		      for (int row = 0; row < ROWS; ++row) {
		         for (int col = 0; col < COLS; ++col) {
		            if (board[row][col] == EMPTY) {
		               return false;  // an empty cell found, not draw, exit
		            }
		         }
		      }
		      return true;  // no empty cell, it's a draw
		   }
		 
		   
		  
		   /** Print the game board */
		   public static void printBoard() {
		      for (int row = 0; row < ROWS; ++row) {
		         for (int col = 0; col < COLS; ++col) {
		            printCell(board[row][col]); // print each of the cells
		            if (col != COLS - 1) {
		               System.out.print("|");   // print vertical partition
		            }
		         }
		         System.out.println();
		         if (row != ROWS - 1) {
		            System.out.println("--------------------------------------"); // print horizontal partition
		         }
		      }
		      System.out.println();
		   }
		 
		   /** Print a cell with the specified "content" */
		   public static void printCell(int content) {
		      switch (content) {
		         case EMPTY:  System.out.print("   "); break;
		         case CROSS:  System.out.print(" X "); break;
		         case NOUGHT: System.out.print("   "); break;
		      }
		   }
		   
		   /** The entry main method (the program starts here) */
		   
		public static void main(String[] args) {		   		
			   		initGame();
			   	
			   	while(isDraw() == false) {
			   		
			   		String respuesta;
			   		
			   		System.out.print("\n Desea remover un pallet? \n");
			   		
					respuesta = in.nextLine();
					
					  if(respuesta.equals("Si")) {
						  printBoard();
						currentPlayer = NOUGHT;
						
						playerMove(currentPlayer);
						 
					  }else {
						  printBoard();
						  currentPlayer = CROSS;
						  playerMove(currentPlayer);
						  
					  }
					  
					 
			   		
			   		
			   	//	updateGame(currentPlayer, currntRow, currentCol);
			   		
				   	if(isDraw() == true) {
				   		System.out.println("La Bodega esta llena");
				   	}
				   	
			   	}
			      // Play the game once   
		   }
		
}
