package kata3;

public class main {

    public static void main(String[] args) {
        HistogramBuilder<String> builder = new HistogramBuilder<>();
        builder.calculate(new String[] {"A","B","A","D","A","F","H","A","B"});
        HistogramViewer<String> viewer = new HistogramViewer<>(builder.getHistogram());
        viewer.show();
    }
}
