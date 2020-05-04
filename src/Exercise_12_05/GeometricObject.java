package Exercise_12_05;

import java.util.Date;

public class GeometricObject{
    private String colour = "white";
    private boolean filled;
    private Date dateCreated;

    // Construct af default geometric object
    public GeometricObject(){
        dateCreated = new java.util.Date();
    }

    // Construct a geometric object with a specified colour and filled value
    public GeometricObject(String colour, boolean filled){
        dateCreated = new java.util.Date();
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    // Return a string representation of this object
    @Override
    public String toString(){
        return "created on " + dateCreated + "\ncolour: " + colour + " and filled: " + filled;
    }
}