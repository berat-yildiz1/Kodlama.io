package DataAccess.Abstract;

import Entities.Concretes.Players;

public interface DataSystemPlayers {
	
	public void add(Players players);
	public void update(Players players);
	public void delete(Players players);
	

}
