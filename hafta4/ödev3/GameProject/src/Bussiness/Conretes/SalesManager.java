package Bussiness.Conretes;


import Bussiness.Abstract.CampaignProcess;
import Bussiness.Abstract.Sales;
import DataAccess.Abstract.DataSystemPlayerAccount;
import Entities.Concretes.Campaign;
import Entities.Concretes.Games;
import Entities.Concretes.Players;


public class SalesManager  implements Sales {
	
	
	private DataSystemPlayerAccount dataSystemPlayerAccount;
	
	
	public SalesManager(DataSystemPlayerAccount dataSystemPlayerAccount) {
		
		
		this.dataSystemPlayerAccount=dataSystemPlayerAccount;
		
	}
	
	CampaignProcessManager CampaignProcessManager = new CampaignProcessManager();

	@Override
	public void salling(Games games,Players players,Campaign campaign) {
		
		
		CampaignProcessManager.discount(games, campaign);
		games.setAmount(games.getAmount()-1);
		System.out.println("Satin alýndý : " +games.getGamename()+ " ürün sayýsý : "+games.getAmount()+" Fiyat : "+games.getPrice());
		
		
		
		this.dataSystemPlayerAccount.add(players, games);
		
		
	}

	@Override
	public void givenback(Games games,Players players) {
		
		
		
		games.setAmount(games.getAmount()+1);
		System.out.println("iade edildi : " +games.getGamename()+ " ürün sayýsý :"+games.getAmount());
		
		
		this.dataSystemPlayerAccount.delete(players, games);
		
	}

	@Override
	public void chancing(Games games, Players players) {
		
			
			System.out.println("deðiþtirildi: " +games.getGamename());
			
			
			
			this.dataSystemPlayerAccount.update(players, games);
		
	}

	
	
	
	
}
