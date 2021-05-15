package Bussiness.Conretes;

import Bussiness.Abstract.GameProcess;
import DataAccess.Abstract.DataSystemGames;
import Entities.Concretes.Games;

public class GameProcessManager implements GameProcess{

	private DataSystemGames datasystemgames;
	
	
	
	public GameProcessManager(DataSystemGames datasystemgames) {
		super();
		this.datasystemgames = datasystemgames;
	}

	@Override
	public void add(Games games) {
		this.datasystemgames.add(games);
		
	}

	@Override
	public void update(Games games) {
		this.datasystemgames.update(games);
		
	}

	@Override
	public void delete(Games games) {
		this.datasystemgames.delete(games);
		
	}

}
