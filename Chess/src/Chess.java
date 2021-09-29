


class ChessBoard
{
	ChessBoardSquare[] square;
	
	ChessBoard()
	{
		square[0]  = new ChessBoardSquare(1, 1, true);
		square[1]  = new ChessBoardSquare(2, 1, true);
		square[2]  = new ChessBoardSquare(3, 1, true);
		square[3]  = new ChessBoardSquare(4, 1, true);
		square[4]  = new ChessBoardSquare(5, 1, true);
		square[5]  = new ChessBoardSquare(6, 1, true);
		square[6]  = new ChessBoardSquare(7, 1, true);
		square[7]  = new ChessBoardSquare(8, 1, true);
		square[8]  = new ChessBoardSquare(1, 2, true);
		square[9]  = new ChessBoardSquare(2, 2, true);
		square[10] = new ChessBoardSquare(3, 2, false);
		square[11] = new ChessBoardSquare(4, 2, false);
		square[12] = new ChessBoardSquare(5, 2, false);
		square[13] = new ChessBoardSquare(6, 2, false);
		square[14] = new ChessBoardSquare(7, 2, true);
		square[15] = new ChessBoardSquare(8, 2, true);
		square[16] = new ChessBoardSquare(1, 3, true);
		square[17] = new ChessBoardSquare(2, 3, true);
		square[18] = new ChessBoardSquare(3, 3, false);
		square[19] = new ChessBoardSquare(4, 3, false);
		square[20] = new ChessBoardSquare(5, 3, false);
		square[21] = new ChessBoardSquare(6, 3, false);
		square[22] = new ChessBoardSquare(7, 3, true);
		square[23] = new ChessBoardSquare(8, 3, true);
		square[24] = new ChessBoardSquare(1, 4, true);
		square[25] = new ChessBoardSquare(2, 4, true);
		square[26] = new ChessBoardSquare(3, 4, false);
		square[27] = new ChessBoardSquare(4, 4, false);
		square[28] = new ChessBoardSquare(5, 4, false);
		square[29] = new ChessBoardSquare(6, 4, false);
		square[30] = new ChessBoardSquare(7, 4, true);
		square[31] = new ChessBoardSquare(8, 4, true);
		square[32] = new ChessBoardSquare(1, 5, true);
		square[33] = new ChessBoardSquare(2, 5, true);
		square[34] = new ChessBoardSquare(3, 5, false);
		square[35] = new ChessBoardSquare(4, 5, false);
		square[36] = new ChessBoardSquare(5, 5, false);
		square[37] = new ChessBoardSquare(6, 5, false);
		square[38] = new ChessBoardSquare(7, 5, true);
		square[39] = new ChessBoardSquare(8, 5, true);
		square[40] = new ChessBoardSquare(1, 6, true);
		square[41] = new ChessBoardSquare(2, 6, true);
		square[42] = new ChessBoardSquare(3, 6, false);
		square[43] = new ChessBoardSquare(4, 6, false);
		square[44] = new ChessBoardSquare(5, 6, false);
		square[45] = new ChessBoardSquare(6, 6, false);
		square[46] = new ChessBoardSquare(7, 6, false);
		square[47] = new ChessBoardSquare(8, 6, false);
		square[48] = new ChessBoardSquare(1, 7, true);
		square[49] = new ChessBoardSquare(2, 7, true);
		square[50] = new ChessBoardSquare(3, 7, true);
		square[51] = new ChessBoardSquare(4, 7, true);
		square[52] = new ChessBoardSquare(5, 7, true);
		square[53] = new ChessBoardSquare(6, 7, true);
		square[54] = new ChessBoardSquare(7, 7, true);
		square[55] = new ChessBoardSquare(8, 7, true);
		square[56] = new ChessBoardSquare(1, 8, true);
		square[57] = new ChessBoardSquare(2, 8, true);
		square[58] = new ChessBoardSquare(3, 8, true);
		square[59] = new ChessBoardSquare(4, 8, true);
		square[60] = new ChessBoardSquare(5, 8, true);
		square[61] = new ChessBoardSquare(6, 8, true);
		square[62] = new ChessBoardSquare(7, 8, true);
		square[63] = new ChessBoardSquare(8, 8, true);
	}
}

class ChessBoardSquare
{
	int yLocation;
	int xLocation;
	boolean isSquareOccupied;
	
	ChessBoardSquare(int xLocation, int yLocation, boolean isSquareOccupied)
	{
		this.xLocation = xLocation;
		this.yLocation= yLocation;
		this.isSquareOccupied = isSquareOccupied;
	}
}

class WhitePlayer
{

	Pawn whitePawn1;
	Pawn whitePawn2;
	Pawn whitePawn3;
	Pawn whitePawn4;
	Pawn whitePawn5;
	Pawn whitePawn6;
	Pawn whitePawn7;
	Pawn whitePawn8;
	Bishop whiteBishop1;
	Bishop whiteBishop2;
	Knight whiteKnight1;
	Knight whiteKnight2;
	Rook whiteRook1;
	Rook whiteRook2;
	Queen whiteQueen;
	static King whiteKing;
	
	WhitePlayer()
	{
		whitePawn1 = new Pawn(1, 2, true);
		whitePawn2 = new Pawn(2, 2, true);
		whitePawn3 = new Pawn(3, 2, true);
		whitePawn4 = new Pawn(4, 2, true);
		whitePawn5 = new Pawn(5, 2, true);
		whitePawn6 = new Pawn(6, 2, true);
		whitePawn7 = new Pawn(7, 2, true);
		whitePawn8 = new Pawn(8, 2, true);
		whiteBishop1 = new Bishop(3, 1, true);
		whiteBishop2 = new Bishop(6, 1, true);
		whiteKnight1 = new Knight(2, 1, true);
		whiteKnight2 = new Knight(7, 1, true);
		whiteRook1 = new Rook(1, 1, true);
		whiteRook2 = new Rook(8, 1, true);
		whiteQueen = new Queen(5, 1, true);
		whiteKing = new King(4, 1, true);
	}
}

class BlackPlayer
{
	Pawn blackPawn1;
	Pawn blackPawn2;
	Pawn blackPawn3;
	Pawn blackPawn4;
	Pawn blackPawn5;
	Pawn blackPawn6;
	Pawn blackPawn7;
	Pawn blackPawn8;
	Bishop blackBishop1;
	Bishop blackBishop2;
	Knight blackKnight1;
	Knight blackKnight2;
	Rook blackRook1;
	Rook blackRook2;
	Queen blackQueen;
	static King blackKing;
	
	BlackPlayer()
	{
		blackPawn1 = new Pawn(1, 7, false);
		blackPawn2 = new Pawn(2, 7, false);
		blackPawn3 = new Pawn(3, 7, false);
		blackPawn4 = new Pawn(4, 7, false);
		blackPawn5 = new Pawn(5, 7, false);
		blackPawn6 = new Pawn(6, 7, false);
		blackPawn7 = new Pawn(7, 7, false);
		blackPawn8 = new Pawn(8, 7, false);
		blackBishop1 = new Bishop(3, 8, false);
		blackBishop2 = new Bishop(6, 8, false);
		blackKnight1 = new Knight(2, 8, false);
		blackKnight2 = new Knight(7, 8, false);
		blackRook1 = new Rook(1, 8, false);
		blackRook2 = new Rook(8, 8, false);
		blackQueen = new Queen(5, 8, false);
		blackKing = new King(4, 8, false);
	}
}
class Pawn
{
	int xLocation;
	int yLocation;
	boolean isAlive;
	boolean isWhite;
	
	Pawn(int xLocation, int yLocation, boolean isWhite) 
	{
		this.xLocation = xLocation;
		this.yLocation = yLocation;
		this.isWhite = isWhite;
		isAlive = true;
	}
	
}

class Bishop
{
	int xLocation;
	int yLocation;
	boolean isAlive;
	boolean isWhite;
	
	Bishop(int xLocation, int yLocation, boolean isWhite) 
	{
		this.xLocation = xLocation;
		this.yLocation = yLocation;
		this.isWhite = isWhite;
		
		isAlive = true;
		
	}
}

class Knight
{
	int xLocation;
	int yLocation;
	boolean isAlive;
	boolean isWhite;
	
	Knight(int xLocation, int yLocation, boolean isWhite) 
	{
		this.xLocation = xLocation;
		this.yLocation = yLocation;
		this.isWhite = isWhite;
		isAlive = true;
	}
}

class Rook
{
	int xLocation;
	int yLocation;
	boolean isAlive;
	boolean isWhite;
	
	Rook(int xLocation, int yLocation, boolean isWhite) 
	{
		this.xLocation = xLocation;
		this.yLocation = yLocation;
		this.isWhite = isWhite;
		isAlive = true;
	}
}

class Queen
{
	int xLocation;
	int yLocation;
	boolean isAlive;
	boolean isWhite;
	
	Queen(int xLocation, int yLocation, boolean isWhite) 
	{
		this.xLocation = xLocation;
		this.yLocation = yLocation;
		this.isWhite = isWhite;
		isAlive = true;
	}
}

class King
{
	int xLocation;
	int yLocation;
	boolean isAlive;
	boolean isWhite;
	
	King(int xLocation, int yLocation, boolean isWhite) 
	{
		this.xLocation = xLocation;
		this.yLocation = yLocation;
		this.isWhite = isWhite;
		isAlive = true;
	}
}

class ChessGame
{
	WhitePlayer whitePlayer;
	BlackPlayer blackPlayer;
	ChessBoard chessBoard;
	static boolean isOver;
	static boolean isWhiteTurn;
	
	static void isWhiteTurn() //For loop that keeps track of whose turn it is
	{
		for(int i = 1; isOver == false; i++)
		{
			if(i % 2 == 0)
			{
				isWhiteTurn = false;
			}
			else
			{
				isWhiteTurn = true;
			}
		}
	}
	
	ChessGame() //sets up a new Board
	//9-29-21: added isOver conditions
	{
		whitePlayer = new WhitePlayer();
		blackPlayer = new BlackPlayer();
		chessBoard = new ChessBoard();
		isOver = false;
		
		if((WhitePlayer.whiteKing.isAlive == false) || (BlackPlayer.blackKing.isAlive == false))
		{
			isOver = true;
		}
	}
}



