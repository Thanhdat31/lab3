package lab3;

public class Triangle {
       public static void main(String[] args) {
    	   Triangle();
		
	}
       public static void Triangle() {
	    private float width;
	    private float height;
	    
	    public Triangle() {
	        this.width = 0.0f;
	        this.height = 0.0f;
	    }
	    
	    public Triangle(float width, float height) {
	        this.width = width;
	        this.height = height;
	    }
	    
	    public float getWidth() {
	        return width;
	    }
	    
	    public float getHeight() {
	        return height;
	    }
	    
	    public void setWidth(float width) {
	        this.width = width;
	    }
	    
	    public void setHeight(float height) {
	        this.height = height;
	    }
	    
	    public String toString() {
	        return "Triangle with width " + width + " and height " + height;
	    }
	}
}
}
