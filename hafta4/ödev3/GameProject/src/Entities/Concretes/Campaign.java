package Entities.Concretes;

public class Campaign {
	
	private String CampaignName;
	private double CampaignAmount;
	public Campaign() {
		
	}
	
		public Campaign(String campaignName, double campaignAmount) {
		super();
		CampaignName = campaignName;
		CampaignAmount = campaignAmount;
	}
	
	
	
	public String getCampaignName() {
		return CampaignName;
	}

	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}

	public double getCampaignAmount() {
		return CampaignAmount;
	}

	public void setCampaignAmount(double campaignAmount) {
		CampaignAmount = campaignAmount;
	}



}
