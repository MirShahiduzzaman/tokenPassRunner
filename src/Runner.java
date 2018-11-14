public class Runner
{
    public static void main(String[] args)
    {
        TokenPass game1 = new TokenPass(6);

        //repeats until one player has 0 tokens
        //gameOver returns the number of the winning player
        while(game1.gameOver()<0)
        {
            game1.printBoard(); //printBoard prints the player and their tokens
            game1.distributeCurrentPlayerTokens();
            game1.nextPlayer(); //advances currentPlayer to the next player
        }
        game1.printBoard();
        System.out.println("Game Winner: Player " + game1.gameOver());
    }
}
