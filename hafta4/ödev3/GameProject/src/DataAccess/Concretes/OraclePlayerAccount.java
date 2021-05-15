package DataAccess.Concretes;

import DataAccess.Abstract.DataSystemPlayerAccount;
import Entities.Concretes.Games;
import Entities.Concretes.Players;

public class OraclePlayerAccount implements DataSystemPlayerAccount {
	
	@Override
	public void add(Players players, Games games) {
		System.out.println(players.getFirstName()+" Adl� ki�inin hesab�na "+games.getGamename() + " eklendi");
	}

	@Override
	public void update(Players players, Games games) {
		System.out.println(players.getFirstName()+" Adl� ki�inin hesab�nda "+games.getGamename() + " g�ncellendi");
		
	}

	@Override
	public void delete(Players players, Games games) {
		System.out.println(players.getFirstName()+" Adl� ki�inin hesab�ndan "+games.getGamename() + " ��kr�ld�");
		
	}

}
