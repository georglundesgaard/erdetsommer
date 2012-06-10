package no.lundesgaard.erdetsommer.controller;

import no.lundesgaard.erdetsommer.integration.yr.YrIntegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErDetSommerController {
//	private final static Log LOG = LogFactory.getLog(ErDetSommerController.class);

	@Autowired
	private YrIntegration yrIntegration;
	
	@RequestMapping(method=RequestMethod.GET, value="/")
	public ModelAndView erDetSommer(Model model) {
		int highestTemp = yrIntegration.getHighestTemperatureNext24h();
		model.addAttribute("highestTemp", highestTemp);
		model.addAttribute("erdetsommer", highestTemp >= 20);
		return new ModelAndView("erdetsommer", model.asMap());
//		return "erdetsommer";
	}
}
