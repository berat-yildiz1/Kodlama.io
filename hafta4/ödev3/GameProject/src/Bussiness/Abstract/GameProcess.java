package Bussiness.Abstract;

import Entities.Concretes.Games;

public interface GameProcess {
	
	public void add(Games games);
	public void update(Games games);
	public void delete(Games games);

}
