package app.client.components.registrarIngreso;

import app.services.ObjGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class RegistrarIngresoTemplate extends JPanel {

    private RegistrarIngresoComponent registrarIngresoComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JLabel lTitulo, lDatosVehiculo, lPlaca, lTipo, lContrato, lCupo, lFechaIng, lHoraIng;
    private JTextField tPlaca, tCupo;
    private JComboBox cbTipo, cbDiaInicio, cbMesInicio, cbAnioInicio, cbHora, cbMinuto, cbAmPm;

    public RegistrarIngresoTemplate(RegistrarIngresoComponent registrarIngresoComponent) {

        this.registrarIngresoComponent = registrarIngresoComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearJTextFields();
        this.crearJPasswordFields();
        this.crearJButtons();
        this.crearJCheckBoxes();
        this.crearJLabels();
        this.crearJComboBox();
        
        this.setBorder(sRecursos.getBordeNegro());
        this.setBackground(sRecursos.getColorAzulOscuro());
        this.setPreferredSize(new Dimension(880, 1000));
        this.setLayout(null);
        this.setVisible(true);
    }

    private void crearJCheckBoxes() {
    }

    public void crearObjetosDecoradores(){
    }
    
    public void crearJPanels(){
    }
    
    public void crearJTextFields(){

        // PLACA -------------------------------------------------------------------------------------------------------
        tPlaca = sObjGraficos.construirJTextField(
                "Placa del vehículo", 390, 240, 350, 40, null, Color.WHITE,
                sRecursos.getColorNaranja(), sRecursos.getFontText(), null, "c"
        );
        tPlaca.setBorder(sRecursos.getBordeNaranja());
        tPlaca.addFocusListener(registrarIngresoComponent);
        this.add(tPlaca);
        // CUPO -------------------------------------------------------------------------------------------------------
        tCupo = sObjGraficos.construirJTextField(
                "Cupo", 520, 530, 100, 40, null, Color.WHITE,
                sRecursos.getColorNaranja(), sRecursos.getFontText(), null, "c"
        );
        tCupo.setBorder(sRecursos.getBordeNaranja());
        tCupo.addFocusListener(registrarIngresoComponent);
        this.add(tCupo);
    }
    
    public void crearJPasswordFields(){
    
    }
    
    public void crearJButtons(){
    
    }
    
    public void crearJComboBox() {
        
        cbTipo = sObjGraficos.construirJComboBox(
                "Tipo_Automóvil_Campero_Camioneta_Vehículo Pesado_Motocicleta_Bicicleta"
                , 390, 320, 350, 40, Color.WHITE, Color.BLACK, "c"
        );
        cbTipo.setFont(sRecursos.getFontText());
        cbTipo.setBorder(BorderFactory.createLineBorder(sRecursos.getColorNaranja(), 1));
        cbTipo.addFocusListener(registrarIngresoComponent);
        this.add(cbTipo);

        String texto = "";
        for (int i=0; i<32; i++){
            texto = texto + "_" + i;
        }

        // DIA ---------------------------------------------------------------------------------------------------------
        cbDiaInicio = sObjGraficos.construirJComboBox(
                "Día" + texto, 390, 390, 100, 40, Color.WHITE,
                Color.BLACK, "c"
        );
        cbDiaInicio.setFont(sRecursos.getFontText());
        cbDiaInicio.setBorder(BorderFactory.createLineBorder(sRecursos.getColorNaranja(), 1));
        cbDiaInicio.addFocusListener(registrarIngresoComponent);
        this.add(cbDiaInicio);

        // MES ---------------------------------------------------------------------------------------------------------
        cbMesInicio = sObjGraficos.construirJComboBox(
                "Mes_Enero_Febrero_Marzo_Abril_Mayo_Junio_Julio_Agosto_"
                        + "Setptiembre_Octubre_Noviembre_Diciembre", 490, 390,
                150, 40, Color.WHITE, Color.BLACK, "c"
        );
        cbMesInicio.setFont(sRecursos.getFontText());
        cbMesInicio.setBorder(BorderFactory.createLineBorder(sRecursos.getColorNaranja(), 1));
        cbMesInicio.addFocusListener(registrarIngresoComponent);
        this.add(cbMesInicio);

        // AÑO ---------------------------------------------------------------------------------------------------------
        cbAnioInicio = sObjGraficos.construirJComboBox(
                "Año_2018_2019_2020_2021_2022_2023_2024_2025_2026_2027_2028", 640, 390, 100, 40, Color.WHITE,
                Color.BLACK, "c"
        );
        cbAnioInicio.setFont(sRecursos.getFontText());
        cbAnioInicio.setBorder(BorderFactory.createLineBorder(sRecursos.getColorNaranja(), 1));
        cbAnioInicio.addFocusListener(registrarIngresoComponent);
        this.add(cbAnioInicio);

        // HORA --------------------------------------------------------------------------------------------------------
        String hora = "";
        for (int i=2; i<13 ;i++){
            if(i<10){
                hora += "_"+"0"+i;
            }else{
                hora+= "_"+i;
            }
        }
        cbHora = sObjGraficos.construirJComboBox(
                "01"+hora, 450, 460, 70, 40, Color.WHITE,
                Color.BLACK, "c"
        );
        cbHora.setFont(sRecursos.getFontText());
        cbHora.setBorder(BorderFactory.createLineBorder(sRecursos.getColorNaranja(), 1));
        cbHora.addFocusListener(registrarIngresoComponent);
        this.add(cbHora);

        // MINUTO ------------------------------------------------------------------------------------------------------
        String minuto = "";
        for (int i=1; i<60 ;i++){
            if(i<10){
                minuto += "_"+"0"+i;
            }else{
                minuto += "_"+i;
            }
        }
        cbMinuto = sObjGraficos.construirJComboBox(
                "00"+minuto, 530, 460, 70, 40, Color.WHITE,
                Color.BLACK, "c"
        );
        cbMinuto.setFont(sRecursos.getFontText());
        cbMinuto.setBorder(BorderFactory.createLineBorder(sRecursos.getColorNaranja(), 1));
        cbMinuto.addFocusListener(registrarIngresoComponent);
        this.add(cbMinuto);

        // AM/PM ------------------------------------------------------------------------------------------------------
        cbAmPm = sObjGraficos.construirJComboBox(
                "AM_PM", 610, 460, 70, 40, Color.WHITE,
                Color.BLACK, "c"
        );
        cbAmPm.setFont(sRecursos.getFontText());
        cbAmPm.setBorder(BorderFactory.createLineBorder(sRecursos.getColorNaranja(), 1));
        cbAmPm.addFocusListener(registrarIngresoComponent);
        this.add(cbAmPm);
    }
    
    public void crearJLabels(){

        // Creacion TITULO ---------------------------------------------------------------------------------------------
        lTitulo = sObjGraficos.construirJLabel(
                "Registrar Ingreso", 110, 20, 680, 80, null,
                sRecursos.getColorNaranja(), null,
                sRecursos.getFontTituloUsuario(), "c"
        );
        this.add(lTitulo);

        // DATOS VEHICULO ----------------------------------------------------------------------------------------------
        lDatosVehiculo = sObjGraficos.construirJLabel(
                "Datos del Vehículo", 20, 150, 880, 40, null, Color.WHITE, null,
                sRecursos.getFontSeccion(), "c"
        );
        this.add(lDatosVehiculo);

        // Creacion PLACA ----------------------------------------------------------------------------------------------
        lPlaca = sObjGraficos.construirJLabel(
                "Placa del vehículo:", 170, 250, 260, 40, null, Color.WHITE, null,
                sRecursos.getFontComponente(), "l"
        );
        this.add(lPlaca);

        // Creacion TIPO -----------------------------------------------------------------------------------------------
        lTipo = sObjGraficos.construirJLabel(
                "Tipo de vehiculo:", 170, 320, 260, 40, null, Color.WHITE, null,
                sRecursos.getFontComponente(), "l"
        );
        this.add(lTipo);

        // Creacion FECHA DE INGRESO -----------------------------------------------------------------------------------
        lFechaIng = sObjGraficos.construirJLabel(
                "Fecha de Ingreso:", 170, 390, 260, 40, null, Color.WHITE, null,
                sRecursos.getFontComponente(), "l"
        );
        this.add(lFechaIng);

        // Creacion HORA DE INGRESO ------------------------------------------------------------------------------------
        lHoraIng = sObjGraficos.construirJLabel(
                "Hora de Ingreso:", 170, 460, 260, 40, null, Color.WHITE, null,
                sRecursos.getFontComponente(), "l"
        );
        this.add(lHoraIng);

        // Creacion CUPO ASIGNADO --------------------------------------------------------------------------------------
        lCupo = sObjGraficos.construirJLabel(
                "Cupo asignado:", 170, 530, 260, 40, null, Color.WHITE, null,
                sRecursos.getFontComponente(), "l"
        );
        this.add(lCupo);
    }

    public RegistrarIngresoComponent getRegistrarIngresoComponent() {
        return registrarIngresoComponent;
    }

    public ObjGraficosService getsObjGraficos() {
        return sObjGraficos;
    }

    public RecursosService getsRecursos() {
        return sRecursos;
    }
}
