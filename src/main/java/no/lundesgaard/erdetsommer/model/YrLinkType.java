package no.lundesgaard.erdetsommer.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class YrLinkType {
	@XmlAttribute
	public String id;
	
	@XmlAttribute
	public String text;
	
	@XmlAttribute
	public String url;
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("{ id: \"");
		result.append(id);
		result.append("\", text: \"");
		result.append(text);
		result.append("\", url: \"");
		result.append(url);
		result.append("\" }");
		return result.toString();
	}
}
