package Bussiness.Conretes;

import Bussiness.Abstract.PlayerProcess;
import DataAccess.Abstract.DataSystemPlayers;
import Entities.Concretes.Players;

public class PlayerProcessManager implements PlayerProcess {

	private DataSystemPlayers datasystemplayers;
	
	
	
	public PlayerProcessManager(DataSystemPlayers datasystemplayers) {
		super();
		this.datasystemplayers = datasystemplayers;
	}

	@Override
	public void add(Players players) {
		this.datasystemplayers.add(players);
		
	}

	@Override
	public void update(Players players) {
		this.datasystemplayers.update(players);
		
	}

	@Override
	public void delete(Players players) {
		this.datasystemplayers.delete(players);
		
	}

}
