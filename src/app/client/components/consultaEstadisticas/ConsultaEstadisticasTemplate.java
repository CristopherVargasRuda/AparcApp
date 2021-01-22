package app.client.components.consultaEstadisticas;

import app.services.ObjGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class ConsultaEstadisticasTemplate extends JPanel {

    private ConsultaEstadisticasComponent consultaEstadisticasComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    public ConsultaEstadisticasTemplate(ConsultaEstadisticasComponent consultaEstadisticasComponent) {
        this.consultaEstadisticasComponent = consultaEstadisticasComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearJTextFields();
        this.crearJPasswordFields();
        this.crearJButtons();
        this.crearJCheckBoxes();
        this.crearJLabels();
        
        this.setBorder(sRecursos.getBordeNegro());
        this.setBackground(sRecursos.getColorAzulOscuro());
        this.setPreferredSize(new Dimension(880, 1000));
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public void crearObjetosDecoradores(){
    
    }
    
    public void crearJPanels(){
    
    }
    
    public void crearJTextFields(){
    
    }
    
    public void crearJPasswordFields(){
    
    }
    
    public void crearJButtons(){
    
    }
    
    public void crearJCheckBoxes(){
    
    }
    
    public void crearJLabels(){
    
    }
    
}
