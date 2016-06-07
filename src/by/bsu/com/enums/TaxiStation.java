package by.bsu.com.enums;
public enum TaxiStation {
	MERSEDES(10), TOYOTA(7), VOLVO;
	private int freeCabs;
	TaxiStation() {}
	TaxiStation(int cabs) {
		freeCabs = cabs;
	}
	public int getFreeCabs() {
		return freeCabs;
	}
	public void setFreeCabs(int cabs) {
		freeCabs = cabs;
	}
	@Override
	public String toString() {
		return String.format("%s : free cabs = %d", name(), freeCabs);
	}
}