package Bussiness.Abstract;

import Entities.Concretes.Campaign;
import Entities.Concretes.Games;
import Entities.Concretes.Players;


public interface Sales {
	
	public void salling(Games games,Players players,Campaign campaign);
	public void givenback(Games games,Players players);
	public void chancing(Games games,Players players);

}
