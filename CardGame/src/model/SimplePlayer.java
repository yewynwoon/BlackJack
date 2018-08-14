package model;

import model.interfaces.Player;

public class SimplePlayer implements Player 
{
	String playerID = "";
	String playerName = "";
	int initialPoints = 0;
	int updatedPoints = 0;
	int bet = 0;
	
	public SimplePlayer(String playerID, String playerName, int initialPoints)
	{
		this.playerID = playerID;
		this.playerName = playerName;
		this.initialPoints = initialPoints;
	}
	@Override
	public String getPlayerName() 
	{
		return playerName;
	}

	@Override
	public void setPlayerName(String playerName) 
	{
		this.playerName = playerName;
	}

	@Override
	public int getPoints() 
	{
		return initialPoints;
	}

	@Override
	public void setPoints(int points) 
	{
		updatedPoints = points;
	}

	@Override
	public String getPlayerId() 
	{
		return playerID;
	}

	@Override
	public boolean placeBet(int bet) 
	{
		boolean verify;
		if (bet >= 0)
		{
		verify = true;
		this.bet = bet;
		}
		else
		{
		verify = false;
		}
		return verify;
	}

	@Override
	public int getBet() 
	{
		return bet;
	}

	@Override
	public void resetBet() 
	{
		this.bet = 0;
	}

	@Override
	public int getResult() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setResult(int result) {
		// TODO Auto-generated method stub

	}

}
