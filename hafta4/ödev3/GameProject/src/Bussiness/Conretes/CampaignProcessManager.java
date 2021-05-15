package Bussiness.Conretes;

import Bussiness.Abstract.CampaignProcess;
import Entities.Concretes.Campaign;
import Entities.Concretes.Games;

public class CampaignProcessManager implements CampaignProcess {

	@Override
	public void discount(Games games, Campaign campaign) {
		
		
		games.setPrice(games.getPrice()-(campaign.getCampaignAmount()*games.getPrice()));
		
	}

}
