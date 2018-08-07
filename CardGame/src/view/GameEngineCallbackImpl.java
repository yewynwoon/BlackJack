package view;

import java.util.logging.Level;
import java.util.logging.Logger;

import model.interfaces.GameEngine;
import model.interfaces.Player;
import model.interfaces.PlayingCard;
import view.interfaces.GameEngineCallback;

/**
 * 
 * Skeleton/Partial example implementation of GameEngineCallback showing Java logging behaviour
 * 
 * @author Caspar Ryan
 * @see view.interfaces.GameEngineCallback
 * 
 */
public class GameEngineCallbackImpl implements GameEngineCallback
{
   private final Logger logger = Logger.getLogger(this.getClass().getName());

   public GameEngineCallbackImpl()
   {
      // FINE shows dealing output, INFO only shows result
      logger.setLevel(Level.FINE);
   }

   @Override
   public void nextCard(Player player, PlayingCard card, GameEngine engine)
   {
      // intermediate results logged at Level.FINE
      logger.log(Level.FINE, "Intermediate data to log .. String.format() is good here!");
      // TODO: complete this method to log results
   }

   @Override
   public void result(Player player, int result, GameEngine engine)
   {
      // final results logged at Level.INFO
      logger.log(Level.INFO, "Result data to log .. String.format() is good here!");
      // TODO: complete this method to log results
   }

@Override
public void bustCard(Player player, PlayingCard card, GameEngine engine) {
	// TODO Auto-generated method stub
	
}

@Override
public void nextHouseCard(PlayingCard card, GameEngine engine) {
	// TODO Auto-generated method stub
	
}

@Override
public void houseBustCard(PlayingCard card, GameEngine engine) {
	// TODO Auto-generated method stub
	
}

@Override
public void houseResult(int result, GameEngine engine) {
	// TODO Auto-generated method stub
	
}

   // TODO implement the rest of the GameEngineCallback interface
}
