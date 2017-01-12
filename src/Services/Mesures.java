package Services;

public class Mesures {
	public String mouseNumber = "M00017";
	
	private int condValue;
	private int tempValue;
	private String mesureDate;
	
	
	
	public String getMouseNumber() {
		return mouseNumber;
	}
	
	public int getCondValue() {
		return condValue;
	}
	public void setCondValue(int condValue) {
		this.condValue = condValue;
	}
	public int getTempValue() {
		return tempValue;
	}
	public void setTempValue(int tempValue) {
		this.tempValue = tempValue;
	}
	public String getMesureDate() {
		return mesureDate;
	}
	public void setMesureDate(String mesureDate) {
		this.mesureDate = mesureDate;
	}
	
	

}
