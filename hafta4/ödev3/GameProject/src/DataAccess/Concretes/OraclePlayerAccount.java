package DataAccess.Concretes;

import DataAccess.Abstract.DataSystemPlayerAccount;
import Entities.Concretes.Games;
import Entities.Concretes.Players;

public class OraclePlayerAccount implements DataSystemPlayerAccount {
	
	@Override
	public void add(Players players, Games games) {
		System.out.println(players.getFirstName()+" Adlý kiþinin hesabýna "+games.getGamename() + " eklendi");
	}

	@Override
	public void update(Players players, Games games) {
		System.out.println(players.getFirstName()+" Adlý kiþinin hesabýnda "+games.getGamename() + " güncellendi");
		
	}

	@Override
	public void delete(Players players, Games games) {
		System.out.println(players.getFirstName()+" Adlý kiþinin hesabýndan "+games.getGamename() + " çýkrýldý");
		
	}

}
