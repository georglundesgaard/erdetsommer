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
		int todaysTemperature = yrIntegration.getTodaysTemperature();
		if (todaysTemperature >= 20) {
			LOG.info("JA!");
			return "JA!";
		}
		LOG.info("NEI!");
		return "NEI!";
	}
}
