package CybertekInterviewQs;

public class TV {
	
	private int channel = 1;
	private int volumeLevel = 1;
	private boolean on = false;
	private String brand = "undefined";
	
	public TV() {
		System.out.println("Creating TV object using no Args-constructor");
	}

	public TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg -constructor");
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
	
	public void volumeUp() {
		volumeLevel++;
	}
	
	public void volumeDown() {
		volumeLevel--;
	}
	
	public void isOn() {
		
	}
	
	public void turnOn() {
		if(on == true) {
			System.out.println("TV is already ON");
		}else {
			on = true;
		}
		
	}
	
	public boolean turnOff() {
		return on = false;
	}

	
	
}
