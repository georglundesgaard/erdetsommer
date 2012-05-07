package no.lundesgaard.erdetsommer.controller;

import no.lundesgaard.erdetsommer.integration.yr.YrIntegration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErDetSommerController {
	private final static Log LOG = LogFactory.getLog(ErDetSommerController.class);

	@Autowired
	private YrIntegration yrIntegration;
	
	@RequestMapping(method=RequestMethod.GET, value="")
	public @ResponseBody String erDetSommer() {
		//LOG.info("erDetSommer()");
		StringBuilder response = new StringBuilder("Er det sommer? "); 
		int highestTemp = yrIntegration.getHighestTemperatureNext24h();
		if (highestTemp >= 20) {
			String message = "JA! Høyeste temperatur i Oslo de neste 24 timene er på eller over 20°C: " + highestTemp + "°C";
			response.append(message);
		} else {
			String message = "NEI! Høyeste temperatur i Oslo de neste 24 timene er under 20°C: " + highestTemp + "°C";
			response.append(message);
		}
		response.append("\n\nVærvarsel fra yr.no, levert av Meteorologisk institutt og NRK: http://www.yr.no/sted/Norge/Oslo/Oslo/Oslo/");
		LOG.info(response);
		return response.toString();
	}
}
