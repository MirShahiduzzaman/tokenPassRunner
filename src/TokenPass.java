public class TokenPass
{
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        for(int i = 0;i<playerCount;i++)
        {
            board[i] = (int)(Math.random()*10+1);
        }
        currentPlayer = (int)(Math.random()*playerCount);
    }

    public void printBoard()
    {
        String out = "";
        for(int i =0;i<board.length;i++)
        {
            out += "Player " + i + ": " + board[i];
        }
        out += "\nCurrent Player: " + currentPlayer;
    }

    public void distributeCurrentPlayerTokens()
    {
        int tokens = board[currentPlayer];
        board[currentPlayer] = 0;

        for(int i = 0;tokens>0;i++)
        {
            if(currentPlayer+i==board.length)
            {
                i= -currentPlayer-1;
            }
            else
            {
                board[currentPlayer+i]+=1;
                tokens--;
            }
        }
    }

    public void nextPlayer()
    {
        currentPlayer++;
        if(currentPlayer>board.length)
        {
            currentPlayer=0;
        }
    }

    public int gameOver()
    {
        int gameOver = -1;
        for(int i =0;i<board.length;i++)
        {
            if(board[i]==0)
            {
                gameOver = currentPlayer;
            }
        }
        return(gameOver);
    }
}
