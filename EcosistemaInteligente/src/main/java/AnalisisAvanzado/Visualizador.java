package AnalisisAvanzado;

import ModeladoIdentidades.Organismo;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.util.List;

public class Visualizador {
    private List<Organismo> organismos;

    public Visualizador(List<Organismo> organismos) {
        this.organismos = organismos;
    }

    public void visualizarDatos() {
        XYSeries series = new XYSeries("Datos de la Simulación");

        for (Organismo organismo : organismos) {
            series.add(organismo.getPosicionX(), organismo.getPosicionY());
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Datos de la Simulación",
                "Posición X",
                "Posición Y",
                dataset
        );

        JFrame frame = new JFrame("Visualización de Datos");
        frame.setContentPane(new ChartPanel(chart));
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}