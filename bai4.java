package lab3;

	public class Vector {
	    private double x;
	    private double y;
	    private double z;

	    public Vector(double x, double y, double z) {
	        this.x = x;
	        this.y = y;
	        this.z = z;
	    }

	    public double getX() {
	        return x;
	    }

	    public void setX(double x) {
	        this.x = x;
	    }

	    public double getY() {
	        return y;
	    }

	    public void setY(double y) {
	        this.y = y;
	    }

	    public double getZ() {
	        return z;
	    }

	    public void setZ(double z) {
	        this.z = z;
	    }

	    public Vector add(Vector other) {
	        double newX = this.x + other.getX();
	        double newY = this.y + other.getY();
	        double newZ = this.z + other.getZ();
	        return new Vector(newX, newY, newZ);
	    }

	    public Vector subtract(Vector other) {
	        double newX = this.x - other.getX();
	        double newY = this.y - other.getY();
	        double newZ = this.z - other.getZ();
	        return new Vector(newX, newY, newZ);
	    }

	    public Vector multiply(double scalar) {
	        double newX = this.x * scalar;
	        double newY = this.y * scalar;
	        double newZ = this.z * scalar;
	        return new Vector(newX, newY, newZ);
	    }

	    public double dotProduct(Vector other) {
	        return (this.x * other.getX()) + (this.y * other.getY()) + (this.z * other.getZ());
	    }
	}

}
