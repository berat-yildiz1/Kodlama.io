package DataAccess.Abstract;


import Entities.Concretes.Games;


public interface DataSystemGames {
	
	public void add(Games games);
	public void update(Games games);
	public void delete(Games games);
	

}
