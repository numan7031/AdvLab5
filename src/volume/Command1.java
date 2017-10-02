package volume;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Command1 {

	private JFrame frmCylinderVolume;
	private JTextField heightTextField;
	private JTextField diameterTextField;
	private JTextField volumeTextField;
	private JButton btnCal;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Command1 window = new Command1();
					window.frmCylinderVolume.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Command1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCylinderVolume = new JFrame();
		frmCylinderVolume.setTitle("Cylinder Volume");
		frmCylinderVolume.setSize(new Dimension(400, 270));
		frmCylinderVolume.setBounds(100, 100, 450, 300);
		frmCylinderVolume.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("CordiaUPC", Font.BOLD | Font.ITALIC, 20));

		heightTextField = new JTextField();
		heightTextField.setColumns(10);

		JLabel lblDiameter = new JLabel("Diameter");
		lblDiameter.setFont(new Font("CordiaUPC", Font.BOLD | Font.ITALIC, 20));

		diameterTextField = new JTextField();
		diameterTextField.setColumns(10);

		JLabel lblCylinderVolume = new JLabel("Cylinder Volume");
		lblCylinderVolume.setFont(new Font("CordiaUPC",
				Font.BOLD | Font.ITALIC, 20));

		volumeTextField = new JTextField();
		volumeTextField.setColumns(10);
		volumeTextField.setEditable(false);

		btnCal = new JButton("Calculate");
		btnCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Volume vo = new Volume();

				double height = Double.parseDouble(heightTextField.getText());
				double diameter = Double.parseDouble(diameterTextField
						.getText());

				vo.setVolume(height, diameter);

				volumeTextField.setText(String.format("%.2f", vo.getVolume()));

			}
		});
		btnCal.setIcon(new ImageIcon(Command1.class
				.getResource("/com/sun/java/swing/plaf/windows/icons/Warn.gif")));
		btnCal.setSelectedIcon(new ImageIcon(
				Command1.class
						.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));

		btnClear = new JButton("Clear");
		btnClear.setPreferredSize(new Dimension(77, 23));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				heightTextField.setText(null);
				diameterTextField.setText(null);
				volumeTextField.setText(null);

			}
		});
		
		GroupLayout groupLayout = new GroupLayout(
				frmCylinderVolume.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnCal)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblHeight)
								.addComponent(lblDiameter)
								.addComponent(lblCylinderVolume))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(volumeTextField, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
								.addComponent(diameterTextField, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
								.addComponent(heightTextField, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(82, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblHeight)
							.addGap(33)
							.addComponent(lblDiameter)
							.addGap(33)
							.addComponent(lblCylinderVolume))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(heightTextField, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(diameterTextField, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(volumeTextField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnClear, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCal))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		frmCylinderVolume.getContentPane().setLayout(groupLayout);
	}

}
