package DataAccess.Abstract;

import Entities.Concretes.Games;
import Entities.Concretes.Players;

public interface DataSystemPlayerAccount {
	
	public void add(Players players,Games games);
	public void update(Players players,Games games);
	public void delete(Players players,Games games);

}
