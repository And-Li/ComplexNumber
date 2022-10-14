import java.util.Objects;

public class Main {
    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }
        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }
        public double getRe() {return re;}
        public double getIm() {return im;}

        @Override
        public boolean equals(Object o) {
            if (this == o) {return true;} // проверка ссылки на один и тот же объект
            if (o == null || getClass() != o.getClass()) {return false;} // проверка на null и соответсвие класса
            ComplexNumber that = (ComplexNumber) o; // в переменную кладем объект о, явно приведённый к нашемму классу
            return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash();
        }

    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        System.out.println(a.re);
        System.out.println(a.im);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.equals(b));
        System.out.println(Double.compare(a.re, b.re));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.hashCode() == b.hashCode());

    }
}