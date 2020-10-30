
class Sports
{
   String game="carromboard";
}
class Indoor extends Sports
{
	String  game_second="chess";
}
class Chess extends Indoor
{
    void data()
    {
        System.out.println(game);
		 System.out.println(game_second);
		  
    }
	public static void main(String[] args)
	
	{
		
	Chess play=new Chess( );
		play.data();
	}
}
