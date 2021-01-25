import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GitJRGS2021 {
    private JPanel GitPanelJRGS2021;
    private JTextField aluNombre;
    private JSpinner aluNota;
    private JButton agregarButton;
    private JTextArea listaAlumnos;
    private Alumnos misAlumnos = new Alumnos();

    public GitJRGS2021() {
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Alumno miAlumno = new Alumno();
                miAlumno.SetNombre(aluNombre.getText());
                miAlumno.SetNota((Integer)aluNota.getValue());
                misAlumnos.Agregar(miAlumno);
                listaAlumnos.append(aluNombre.getText()+" "+Integer.toString((Integer)aluNota.getValue())+ "\n");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GitJRGS2021");
        frame.setContentPane(new GitJRGS2021().GitPanelJRGS2021);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        aluNota = new JSpinner();
        aluNota.setModel( new SpinnerNumberModel(5,0,10,1));
    }
}

