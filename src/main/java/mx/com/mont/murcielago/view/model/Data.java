package mx.com.mont.murcielago.view.model;

public class Data {

	private String type, var, typeValue;
	private int counter, state;
	private Float value;

	public Data(String type, String var, String typeValue, int counter, int value, int state) {
		this.type = type;
		this.var = var;
		this.typeValue = typeValue;
		this.counter = counter;
		this.value = (float) value;
		this.state = state;
	}

	public Data(String type, String var, String typeValue, int counter, int value) {
		this.type = type;
		this.var = var;
		this.typeValue = typeValue;
		this.counter = counter;
		this.value = (float) value;
		this.state = 0;
	}

	public Data(String type, String var, String typeValue, int counter) {
		this.type = type;
		this.var = var;
		this.typeValue = typeValue;
		this.counter = counter;
		this.value = 0f;
		this.state = 0;
	}

	/**
	 * Type of the symbol. The symbols are Integer, String, Character, Float
	 * 
	 * @return <strong> String <strong>
	 **/
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            set the value of type if this has been change
	 **/
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Name of the id
	 * 
	 * @return String
	 **/
	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getTypeValue() {
		return typeValue;
	}

	public void setTypeValue(String typeValue) {
		this.typeValue = typeValue;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
