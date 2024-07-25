public class Computer {
	private String Company;
	private String CPU;
	private String RAM;
    private String storage;
    private String motherboard;
    
    // Constructor
    private Computer(Builder build)
    {
    	this.Company=build.Company;
    	this.CPU=build.CPU;
    	this.RAM=build.RAM;
    	this.storage=build.storage;
    	this.motherboard=build.motherboard;
    }
    
    // Getters 
    public String getCompany(){
    	return Company;
    }
    public String getCPU() {
		return CPU;
    }
    public String getRAM() {
		return RAM;
	}
    public String getStorage() {
		return storage;
	}
	public String getMotherboard() {
		return motherboard;
	}
	
	// Setters
	public void setCompany(String Company){
		this.Company=Company;
	}
	public void setCPU(String CPU) {
		this.CPU = CPU;
	}
	public void setRAM(String RAM) {
		this.RAM = RAM;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}
	
	// Nested Class
    public static class Builder
    {
    	private String Company;
    	private String CPU;
    	private String RAM;
        private String storage;
        private String motherboard;
        
        public Builder setCompany(String Company) {
        	this.Company=Company;
        	return this;
        }
		public Builder setCPU(String CPU) {
			this.CPU = CPU;
			return this;
		}
		public Builder setRAM(String RAM) {
			this.RAM = RAM;
			return this;
		}
		public Builder setStorage(String storage) {
			this.storage = storage;
			return this;
		}
		public Builder setMotherboard(String motherboard) {
			this.motherboard = motherboard;
			return this;
		}
		
		public Computer build() {
	        return new Computer(this);
	    }
    }
    
    public String toString() {
        return Company+" Computer with CPU = " + CPU + ", RAM = " + RAM + ", Storage = " + storage + ", Motherboard = " + motherboard;
    }
}
