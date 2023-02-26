
	package shapes;

	public class Square {
	    private double side;

	    public Square(double side) {
	        this.side = side;
	    }

	    public double getSide() {
	        return side;
	    }

	    public void setSide(double side) {
	        this.side = side;
	    }

	    public double getArea() {
	        return side * side;
	    }

	    public double getPerimeter() {
	        return 4 * side;
	    }
	}



	public class Circle {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    public double getRadius() {
	        return radius;
	    }

	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    public double getArea() {
	        return Math.PI * radius * radius;
	    }

	    public double getPerimeter() {
	        return 2 * Math.PI * radius;
	    }
	}
