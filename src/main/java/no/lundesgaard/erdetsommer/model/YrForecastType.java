package no.lundesgaard.erdetsommer.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class YrForecastType {
	@XmlElement
	public YrForecastTabularType tabular;

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("{ tabular: ");
		result.append(tabular);
		result.append(" }");
		return result.toString();
	}
}
