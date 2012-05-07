package no.lundesgaard.erdetsommer.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class YrForecastTabularType {
	@XmlElements(
		@XmlElement(name="time", type=YrForecastTimeType.class)	
	)
	public List<YrForecastTimeType> times;
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("{ times: ");
		for (int i = 0; i < times.size(); i++) {
			if (i > 0) {
				result.append(", ");
			}
			result.append(times.get(i));
		}
		result.append(" }");
		return result.toString();
	}
}
