package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;
import Entities.Play;

public class CampaignService implements ICampaignService {

	@Override
	public void apply(Campaign campaign, Play play) {
		double result = play.getPrice() - campaign.getCampapignPrice();
		System.out.println(play.getPlayName() + " oyununa " + (play.getPrice() - result) + "TL kampanya uygulandý");
		System.out.println(play.getPlayName() + " " + result + "TL Fiyatýna Satýldý");
	}

	@Override
	public void update(Campaign campaign, Play play) {
		double result = play.getPrice() - campaign.getCampapignPrice();
		System.out.println("Kampanya güncellendi" + result + " Tl'ye satýldý");
	}

	@Override
	public void delete(Campaign campaign, Play play) {
		System.out.println("Kampanya silindi oyun kendi fiyatýndan " + play.getPrice() + " Tl'ye satýldý");
	}

	
	
}
