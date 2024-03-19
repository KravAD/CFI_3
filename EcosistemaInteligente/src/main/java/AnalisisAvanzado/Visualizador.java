package AnalisisAvanzado;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;

public class Visualizador {
    public void visualizarDatos() {
        XYSeries series = new XYSeries("Datos de la Simulación");

        // TODO: Añadir datos a la serie

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Datos de la Simulación",
                "Tiempo",
                "Valor",
                dataset
        );

        JFrame frame = new JFrame("Visualización de Datos");
        frame.setContentPane(new ChartPanel(chart));
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
