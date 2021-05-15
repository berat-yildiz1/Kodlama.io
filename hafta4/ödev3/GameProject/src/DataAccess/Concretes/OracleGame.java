package DataAccess.Concretes;

import DataAccess.Abstract.DataSystemGames;
import Entities.Concretes.Games;







public class OracleGame implements DataSystemGames {

	@Override
	public void add(Games games) {
		System.out.println("Ürün Veritabanýna eklendi :" + games.getGamename());
		
	}

	@Override
	public void update(Games games) {
		System.out.println("Ürün Veritabanýnda güncellendi :" + games.getGamename());
		
	}

	@Override
	public void delete(Games games) {
		System.out.println("Ürün Veritabanýndan silindi :" + games.getGamename());
		
	}

	



}
