//package swt;//: swt/DisplayProperties.java
//import org.eclipse.swt.*;
//import org.eclipse.swt.widgets.*;
//import org.eclipse.swt.layout.*;
//
//import javax.xml.soap.Text;
//import java.io.*;
//
//import static javafx.application.ConditionalFeature.SWT;
//
//public class DisplayProperties {
//  public static void main(String [] args) {
//    Display display = new Display();
//    Shell shell = new Shell(display);
//    shell.setText("Display Properties");
//    shell.setLayout(new FillLayout());
//    Text text = new Text(shell, SWT.WRAP | SWT.V_SCROLL);
//    StringWriter props = new StringWriter();
//    System.getProperties().list(new PrintWriter(props));
//    text.setText(props.toString());
//    shell.open();
//    while(!shell.isDisposed())
//      if(!display.readAndDispatch())
//        display.sleep();
//    display.dispose();
//  }
//} ///:~
