package adapter;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MyDateAdapter extends XmlAdapter<String, LocalDate> {

	@Override
	public LocalDate unmarshal(String d) throws Exception {
		return LocalDate.parse(d);
	}

	@Override
	public String marshal(LocalDate d) throws Exception {
		return d.toString();
	}

}
