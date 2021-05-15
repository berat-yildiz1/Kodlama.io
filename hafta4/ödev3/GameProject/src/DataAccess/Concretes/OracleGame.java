package DataAccess.Concretes;

import DataAccess.Abstract.DataSystemGames;
import Entities.Concretes.Games;







public class OracleGame implements DataSystemGames {

	@Override
	public void add(Games games) {
		System.out.println("�r�n Veritaban�na eklendi :" + games.getGamename());
		
	}

	@Override
	public void update(Games games) {
		System.out.println("�r�n Veritaban�nda g�ncellendi :" + games.getGamename());
		
	}

	@Override
	public void delete(Games games) {
		System.out.println("�r�n Veritaban�ndan silindi :" + games.getGamename());
		
	}

	



}
