package ConsoleUI;

import java.util.Date;

import Concrete.CampaignService;
import Concrete.GamerService;
import Concrete.PlayService;
import Concrete.Verification;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Play;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1,"Taha","Kazan",2000,"00000000");
		Play play = new Play(1, "Fifa 2021",new Date(2021-1-17),500);
		Play play2 = new Play(1, "Call Of Duty",new Date(2021-1-17),300);
		Campaign campaign = new Campaign(50);
		Campaign campaign2 = new Campaign(100);
		
		GamerService gamerService = new GamerService(new Verification());
		gamerService.add(gamer);
		
		PlayService playService = new PlayService();
		playService.sell(gamer, play);
		
		CampaignService campaignService = new CampaignService();
		campaignService.apply(campaign, play2);
		campaignService.delete(campaign, play2);
		campaignService.update(campaign, play2);
		
	}

}
