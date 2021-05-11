
public class Pyramid {
	
	private float height;
	private String modern_name;
	private String pharaoh;
	private String site;
	
	public Pyramid(String pharaoh, String modern_name, String site, float height){
		this.pharaoh = pharaoh;
		this.modern_name = modern_name;
		this.site = site;
		this.height = height;
	}
	
	public String getPharaoh() {
        return pharaoh;
    }
	
	public void setPharaoh(String pharaoh) {
		this.pharaoh = pharaoh;
	}
	
	public String getModernName() {
        return modern_name;
    }
	
	public void setModern_name(String modern_name) {
		this.modern_name = modern_name;
	}
	
	public String getSite() {
        return site;
    }
	
	public void setSite(String site) {
		this.site = site;
	}

    public float getHeight() {
        return height;
    }
    
    public void setHeight(float height) {
		this.height = height;
	}


}
