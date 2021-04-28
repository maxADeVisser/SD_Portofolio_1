//Shape er superclass til circle, rectangle, og triangle. Shape definerer nogle fælles attributter, som er fælles for alle shapes.
//Shape er en abstrakt klasse, eftersom den alddrig skal instantieres.

public abstract class Shape implements ShapeMethods {
    double drawPointX;
    double drawPointY;

    //Her opretter vi et nyt point objekt, som bruges til at give alle shapes en midterpunkt
    Point center = new Point(0,0); //er default 0,0 fordi center er nødt til at være defineret og ikke null

    //konstruktør
    public Shape(double posX, double posY){
        this.drawPointX = posX;
        this.drawPointY = posY;
    }

    //Metode til at udregne distance mellem to punkter
    public double distanceBetweenTwoPoints(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}



