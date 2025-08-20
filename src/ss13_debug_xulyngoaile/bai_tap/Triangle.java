package ss13_debug_xulyngoaile.bai_tap;

class Triangle {
    private double a;
    private double  b;
    private double  c;

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("phai lon hon 0");
        }
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException(" tonng 2 canh phai lon hon canh con lai");
        }
    }

    public void display() {
        System.out.println("la 1 tam giac");
    }
}
