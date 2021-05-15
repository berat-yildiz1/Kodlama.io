package DataAccess.Concretes;

import DataAccess.Abstract.DataSystemPlayers;
import Entities.Concretes.Players;

public class MySQLPlayer implements DataSystemPlayers {
	
	@Override
	public void add(Players players) {
		System.out.println("Ki�i Veritaban�na eklendi :" + players.getFirstName());
		
	}

	@Override
	public void update(Players players) {
		System.out.println("Ki�i Veritaban�nda g�ncellendi :" + players.getFirstName());
		
	}

	@Override
	public void delete(Players players) {
		System.out.println("Ki�i Veritaban�ndan silindi :" + players.getFirstName());
		
	}


}
