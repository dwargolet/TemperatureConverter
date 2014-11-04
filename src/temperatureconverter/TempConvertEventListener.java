package temperatureconverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 *
 * @author dworgolet
 */
public class TempConvertEventListener implements ActionListener {
    private RadioButtonWindow window;
    
    public TempConvertEventListener(RadioButtonWindow window){
        this.window = window;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        
        double convertedTemp;
        double originalTemp = Double.valueOf(window.getTxtTempInput().getText());
        DecimalFormat df = new DecimalFormat("#.##");
        
        if(window.getRadioButtonCelsius().isSelected()){
           convertedTemp = originalTemp * (9 / 5) + 32;
        }else{
           convertedTemp = ((originalTemp - 32) * 5) / 9;
        }
        String finalConvertedTemp = String.valueOf(df.format(convertedTemp));
        window.getLabelConvertedTemp().setText(finalConvertedTemp);
    }                
        
   
    
    
    
    
  

        
    
    
    
    
}
