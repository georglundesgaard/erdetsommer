package no.lundesgaard.erdetsommer.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class YrCreditType {
	@XmlElement
	public YrLinkType link;
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("{ link: ");
		result.append(link);
		result.append(" }");
		return result.toString();
	}
}
