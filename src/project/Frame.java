package project;
import javax.swing.*;

public class Frame {
    
    public static JFrame frame;
    public static JTextArea textArea;

    public static void main(String[] args) {
        createFrame();
        createTextarea();
        createMenu();

        frame.setVisible(true);
        
    }

    public static void createFrame(){
        frame = new JFrame("Note Keeper");

        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void createTextarea() {
        
        textArea = new JTextArea();
        frame.add(textArea);

        JScrollPane scrollbar = new JScrollPane(textArea);
        scrollbar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollbar.setBorder(BorderFactory.createEmptyBorder());
        frame.add(scrollbar);
    }

    public static void createMenu(){
        JMenuBar menu = new JMenuBar();
        frame.setJMenuBar(menu);
        
        JMenu filemenu = new JMenu("File");
        menu.add(filemenu);
        JMenu editmenu = new JMenu("Edit");
        menu.add(editmenu);
        JMenu formatmenu = new JMenu("Format");
        menu.add(formatmenu);

        JMenuItem New = new JMenuItem("New");
        New.addActionListener(e -> FileMenu.newFile());
        filemenu.add(New);

        JMenuItem Open = new JMenuItem("Open");
        Open.addActionListener(e -> FileMenu.openFile());
        filemenu.add(Open);

        JMenuItem Save = new JMenuItem("Save");
        Save.addActionListener(e -> FileMenu.save());
        filemenu.add(Save);

        JMenuItem saveAs = new JMenuItem("Save As..");
        saveAs.addActionListener(e -> FileMenu.saveAs());
        filemenu.add(saveAs);

    }

}
