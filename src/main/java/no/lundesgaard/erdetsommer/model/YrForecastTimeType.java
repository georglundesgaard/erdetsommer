package no.lundesgaard.erdetsommer.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class YrForecastTimeType {
	@XmlAttribute
	public Date from;
	
	@XmlAttribute
	public Date to;
	
	@XmlElement
	public YrForecastTemperatureType temperature;
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("{ from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(", temparature: ");
		result.append(temperature);
		result.append(" }");
		return result.toString();
	}
}
