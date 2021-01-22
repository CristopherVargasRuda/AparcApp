package app.client.components.consultaProcesos;

import app.services.ObjGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConsultarProcesosTemplate extends JPanel {

    private ConsultarProcesosComponent consultarProcesosComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    public ConsultarProcesosTemplate(ConsultarProcesosComponent consultarProcesosComponent) {
        this.consultarProcesosComponent = consultarProcesosComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearJTextFields();
        this.crearJPasswordFields();
        this.crearJButtons();
        this.crearJCheckBoxes();
        this.crearJComboBox();
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
    
    public void crearJComboBox() {
    }
    
    public void crearJCheckBoxes(){
    
    }
    
    public void crearJLabels(){
        
    }
    
}
