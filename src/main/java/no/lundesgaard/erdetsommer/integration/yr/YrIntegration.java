package no.lundesgaard.erdetsommer.integration.yr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class YrIntegration {
	private static final Log LOG = LogFactory.getLog(YrIntegration.class);

	@Autowired 
	private RestTemplate restTemplate;
	
	public int getTodaysTemperature() {
		String result = restTemplate.getForObject("http://www.yr.no/sted/Norge/Oslo/Oslo/Oslo/varsel.xml"
				, String.class);
		LOG.info(result);
		return 0;
	}
}
