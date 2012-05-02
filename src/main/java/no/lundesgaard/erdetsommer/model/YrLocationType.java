package no.lundesgaard.erdetsommer.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class YrLocationType {
	@XmlElement
	public String name;
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("{ name: \"");
		result.append(name);
		result.append("\" }");
		return result.toString();
	}
}
