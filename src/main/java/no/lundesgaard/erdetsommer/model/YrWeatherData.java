package no.lundesgaard.erdetsommer.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="weatherdata")
public class YrWeatherData {
	@XmlElement
	public YrLocationType location;
	
	@XmlElement
	public YrCreditType credit;
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("{ location: ");
		result.append(location);
		result.append(", credit: ");
		result.append(credit);
		result.append(" }");
		return result.toString();
	}
}
