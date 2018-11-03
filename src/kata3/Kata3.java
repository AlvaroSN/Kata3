package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.es");
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.es");
        histogram.increment("ulpgc.es");
        new HistogramDisplay(histogram).execute();
    }
    
}
