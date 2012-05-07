package no.lundesgaard.erdetsommer.integration.yr;

import no.lundesgaard.erdetsommer.model.YrWeatherData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class YrIntegration {
	private static final Log LOG = LogFactory.getLog(YrIntegration.class);

	@Autowired 
	private RestTemplate restTemplate;
	
	public int getHighestTemperatureNext24h() {
//		LOG.info("getTodaysTemperature()");
		try {
			YrWeatherData result = restTemplate.getForObject("http://www.yr.no/sted/Norge/Oslo/Oslo/Oslo/varsel_time_for_time.xml"
					, YrWeatherData.class);
			//LOG.info("result: " + result);
			int highestTemp = Integer.MIN_VALUE;
			for (int i = 0; i < 24 && i < result.forecast.tabular.times.size(); i++) {
				if (highestTemp < result.forecast.tabular.times.get(i).temperature.value) {
					highestTemp = result.forecast.tabular.times.get(i).temperature.value;
				}
			}
			return highestTemp;
		} catch (RestClientException rce) {
			LOG.error("could not parse weather xml", rce);
		} catch (Exception e) {
			LOG.error("unexpected exception", e);
		}
		return Integer.MIN_VALUE;
	}
}
