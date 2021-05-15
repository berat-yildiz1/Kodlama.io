package DataAccess.Concretes;

import DataAccess.Abstract.DataSystemPlayers;
import Entities.Concretes.Players;

public class MySQLPlayer implements DataSystemPlayers {
	
	@Override
	public void add(Players players) {
		System.out.println("Kiþi Veritabanýna eklendi :" + players.getFirstName());
		
	}

	@Override
	public void update(Players players) {
		System.out.println("Kiþi Veritabanýnda güncellendi :" + players.getFirstName());
		
	}

	@Override
	public void delete(Players players) {
		System.out.println("Kiþi Veritabanýndan silindi :" + players.getFirstName());
		
	}


}
