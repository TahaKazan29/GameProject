package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;
import Entities.Play;

public class CampaignService implements ICampaignService {

	@Override
	public void apply(Campaign campaign, Play play) {
		double result = play.getPrice() - campaign.getCampapignPrice();
		System.out.println(play.getPlayName() + " oyununa " + (play.getPrice() - result) + "TL kampanya uyguland�");
		System.out.println(play.getPlayName() + " " + result + "TL Fiyat�na Sat�ld�");
	}

	@Override
	public void update(Campaign campaign, Play play) {
		double result = play.getPrice() - campaign.getCampapignPrice();
		System.out.println("Kampanya g�ncellendi" + result + " Tl'ye sat�ld�");
	}

	@Override
	public void delete(Campaign campaign, Play play) {
		System.out.println("Kampanya silindi oyun kendi fiyat�ndan " + play.getPrice() + " Tl'ye sat�ld�");
	}

	
	
}
