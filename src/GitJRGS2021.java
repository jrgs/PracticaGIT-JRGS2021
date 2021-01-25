import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GitJRGS2021 {
    private JPanel GitPanelJRGS2021;
    private JTextField aluNombre;
    private JTextField aluNota;
    private JButton agregarButton;
    private JTextArea listaAlumnos;
    private Alumnos misAlumnos = new Alumnos();

    public GitJRGS2021() {
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Alumno miAlumno = new Alumno();
                miAlumno.SetNombre(aluNombre.getText());
                miAlumno.SetNota(Integer.parseInt(aluNota.getText()));
                misAlumnos.Agregar(miAlumno);
                String miLinea = aluNombre.getText();
                if (miAlumno.GetNota() < 5)
                    miLinea += " Suspenso";
                else if (miAlumno.GetNota() < 7)
                    miLinea += " Aprobado";
                else if (miAlumno.GetNota() < 9)
                    miLinea += " Notable";
                else
                    miLinea += " Sobresaliente";
                miLinea += "\n";
                listaAlumnos.append(miLinea);
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
    }
}

