import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class nilai extends JFrame {

	private JPanel contentPane;
	private JTextField nama;
	private JTextField nilai;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nilai frame = new nilai();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public nilai() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nama = new JTextField();
		nama.setBounds(117, 66, 86, 20);
		contentPane.add(nama);
		nama.setColumns(10);
		
		JLabel lblNama = new JLabel("Nama:");
		lblNama.setBounds(10, 69, 46, 14);
		contentPane.add(lblNama);
		
		JLabel lblNilai = new JLabel("Nilai:");
		lblNilai.setBounds(10, 130, 46, 14);
		contentPane.add(lblNilai);
		
		nilai = new JTextField();
		nilai.setBounds(117, 127, 86, 20);
		contentPane.add(nilai);
		nilai.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String namaku = nama.getText();
				String nilaiku = nilai.getText();
				String grade, keterangan;
				String tampil;
				int nilaisaya = Integer.parseInt(nilaiku);
				
				if(nilaisaya >= 90){
					grade = "A";
					keterangan = "Lulus";
				}else if(nilaisaya >=80){
					grade = "B";
					keterangan = "Lulus";
				}else if(nilaisaya >=70){
					grade = "C";
					keterangan = "Tidak Lulus";
				}else if(nilaisaya >=60){
					grade = "D";
					keterangan = "Tidak Lulus";
				}else{
					grade = "E";
					keterangan = "Tidak Lulus";
				}
				
				JOptionPane.showMessageDialog(null, "Halo " + namaku + " nilai kamu " + grade + ", kamu " +  keterangan);
				
			}
		});
		btnOk.setBounds(61, 180, 89, 23);
		contentPane.add(btnOk);
	}
}
