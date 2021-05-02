package Abstract;

import Entities.Campaign;
import Entities.Play;

public interface ICampaignService {

	void apply(Campaign campaign,Play play);
	void update(Campaign campaign,Play play);
	void delete(Campaign campaign,Play play);
	
}
