import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;





//archivos
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
//librerias ajenas a itext
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
//import javax.swing.text.Document;
/**
 * @web http://jc-mouse.blogspot.com/
 * @author Mouse
 */
public class llamaalpdf {
   
    private File ruta_destino=null;
    
    public llamaalpdf(){    
    }
    
    /* metodo que hace uso de la clase itext para manipular archivos PDF*/
    public void crear_PDF(String t, String a, String s, String k, String c){
        //abre ventana de dialogo "guardar"
        Colocar_Destino();
        //si destino es diferente de null
        if(this.ruta_destino!=null){
            try {
                // se crea instancia del documento
                Document mipdf = new Document() {};
                // se establece una instancia a un documento pdf
                PdfWriter.getInstance(mipdf, new FileOutputStream(this.ruta_destino + ".pdf"));
                mipdf.open();// se abre el documento
                mipdf.addTitle(t); // se añade el titulo
                mipdf.addAuthor(a); // se añade el autor del documento
                mipdf.addSubject(s); //se añade el asunto del documento
                mipdf.addKeywords(k); //Se agregan palabras claves  
                mipdf.add(new Paragraph(c)); // se añade el contendio del PDF
                mipdf.close(); //se cierra el PDF&
                JOptionPane.showMessageDialog(null,"Documento PDF creado");
            } catch (DocumentException ex) {
                
            } catch (FileNotFoundException ex) {
              
            }            
        }        
    }
    /* abre la ventana de dialogo GUARDAR*/
    public void Colocar_Destino(){
       FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo PDF","pdf","PDF");
       JFileChooser fileChooser = new JFileChooser();       
       fileChooser.setFileFilter(filter);
       int result = fileChooser.showSaveDialog(null);
       if ( result == JFileChooser.APPROVE_OPTION ){   
           this.ruta_destino = fileChooser.getSelectedFile().getAbsoluteFile();
        }
    }    
}



