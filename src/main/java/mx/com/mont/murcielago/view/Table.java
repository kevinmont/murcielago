package mx.com.mont.murcielago.view;

import java.util.Iterator;
import java.util.LinkedHashMap;

import mx.com.mont.murcielago.view.model.Data;

public class Table extends ShowData {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3974295261654725045L;
	
	private LinkedHashMap<String, Data> table;

	public Table() {
		table = new LinkedHashMap<String, Data>();
	}

	public Data put(Data dat) {
		Data da = null;
		if (table.containsKey(dat.getVar())) {
			da = (Data) table.get(dat.getVar());
			da.setCounter(dat.getCounter() + da.getCounter());
		} else {
			table.put(dat.getVar(), dat);
		}
		return dat;
	}

	public Data find(String key) {
		return table.get(key);
	}

	@Override
	public String toString() {
		@SuppressWarnings("rawtypes")
		Iterator iterator = table.keySet().iterator();
		String cad = "";
		while (iterator.hasNext()) {
			Data s = (Data) iterator.next();
			cad += "Type: " + s.getType() + "\tNameVar: " + s.getVar() + "\tValue: " + s.getValue() + "\n" + "\tState: "
					+ s.getState() + "\tType of Value: " + s.getTypeValue() + "\n";
		}
		return cad;
	}

	@Override
	public void addData() {
		// TODO Auto-generated method stub
		model.getDataVector().removeAllElements();
		revalidate();
		for (String val : table.keySet()) {
			Data tipo;
			tipo = table.get(val);
			model.addRow(new Object[] { tipo.getType(), tipo.getVar(), tipo.getTypeValue(), tipo.getCounter(),
					tipo.getValue(), tipo.getState() });
		}
	}
}
