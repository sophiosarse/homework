public class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double perimeter() {
        return 2 * (length + width);
    }

    double area() {
        return length * width;
    }

    double diagonal() {
        return Math.sqrt(length * length + width * width);
    }

    // 4
     String isSquare() {
        if (length == width) {
            return "Yes";
        }else {
            return "No";
        }

    }
}
