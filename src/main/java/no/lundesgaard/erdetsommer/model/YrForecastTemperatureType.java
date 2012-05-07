package no.lundesgaard.erdetsommer.model;

import javax.xml.bind.annotation.XmlAttribute;

public class YrForecastTemperatureType {
	@XmlAttribute
	public int value;
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("{ value: ");
		result.append(value);
		result.append(" }");
		return result.toString();
	}
}
