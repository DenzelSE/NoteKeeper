package project;

import javax.swing.JFrame;
import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMenu {

    public static JFrame frame;
    public static String fileName;
    public static String filepath;
    public static String directory;

    public static void newFile(){
        Frame.textArea.setText("");
        Frame.frame.setTitle("New");

    }

    public static void openFile(){
        FileDialog filedialog = new FileDialog(frame, "Open File ", FileDialog.LOAD);
        filedialog.setVisible(true);

        if (filedialog.getFile() != null){
            directory = filedialog.getDirectory();
            fileName = filedialog.getFile();
            filepath = directory + fileName;
            Frame.frame.setTitle(fileName);

            try (BufferedReader reader = new BufferedReader(new FileReader(filepath))){
                String Line;
                Frame.textArea.setText("");
                while ((Line = reader.readLine()) != null){
                    Frame.textArea.append(Line + "\n");
                }
            }
            catch (IOException e){
                System.out.println("File not opened");
            }
        }
    }
    public static void saveAs(){
        FileDialog filedialog = new FileDialog(frame, "Save File", FileDialog.SAVE);
        filedialog.setVisible(true);

        if (filedialog.getFile() != null){
            directory = filedialog.getDirectory();
            fileName = filedialog.getName();
            filepath = directory + fileName;
            Frame.frame.setTitle(fileName);

            try {
                FileWriter writer = new FileWriter(filepath);
                writer.write(Frame.textArea.getText());
                writer.close();


            } catch (Exception e) {
                System.out.println("file can not be saved");
            }
        }

    }
}
