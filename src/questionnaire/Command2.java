package questionnaire;

import java.awt.EventQueue;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Command2 {

	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldSurname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Command2 window = new Command2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Command2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 859, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("\u0E0A\u0E37\u0E48\u0E2D");
		
		JLabel label_1 = new JLabel("\u0E2D\u0E32\u0E22\u0E38");
		
		JRadioButton radioButton1 = new JRadioButton("<15");
		
		JRadioButton radioButton2 = new JRadioButton("15-17");
		
		JRadioButton radioButton3 = new JRadioButton("18-20");
		
		JRadioButton radioButton4 = new JRadioButton(">20");
		
		ButtonGroup groupAge = new ButtonGroup();
		groupAge.add(radioButton1);
		groupAge.add(radioButton2);
		groupAge.add(radioButton3);
		groupAge.add(radioButton4);
		
		
		JLabel label_2 = new JLabel("\u0E40\u0E1E\u0E28");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"","\u0E0A\u0E32\u0E22", "\u0E2B\u0E0D\u0E34\u0E07"}));
		
		JLabel label_3 = new JLabel("\u0E2A\u0E16\u0E32\u0E19\u0E30");
		
		JRadioButton singleRB = new JRadioButton("\u0E42\u0E2A\u0E14");
		
		JRadioButton singleRB2 = new JRadioButton("\u0E41\u0E15\u0E48\u0E07\u0E07\u0E32\u0E19");
		
		JRadioButton singleRB3 = new JRadioButton("\u0E2B\u0E22\u0E48\u0E32\u0E23\u0E49\u0E32\u0E07");
		ButtonGroup groupsingle = new ButtonGroup();
		groupsingle.add(singleRB);
		groupsingle.add(singleRB2);
		groupsingle.add(singleRB3);
		
		
		
		JLabel label_4 = new JLabel("\u0E07\u0E32\u0E19\u0E2D\u0E14\u0E34\u0E40\u0E23\u0E01");
		
		JCheckBox checkBox1 = new JCheckBox("\u0E40\u0E02\u0E35\u0E22\u0E19\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21");
		
		JCheckBox checkBox2 = new JCheckBox("\u0E2D\u0E48\u0E32\u0E19\u0E2B\u0E19\u0E31\u0E07\u0E2A\u0E37\u0E2D");
		
		JCheckBox checkBox3 = new JCheckBox("\u0E40\u0E25\u0E48\u0E19\u0E40\u0E01\u0E21\u0E2A\u0E4C");
		
		
		
		JTextPane textPane = new JTextPane();
		textPane.setText("\u0E41\u0E2A\u0E14\u0E07\u0E1C\u0E25\u0E25\u0E31\u0E1E\u0E18\u0E4C\u0E17\u0E35\u0E48\u0E19\u0E35\u0E49....");
		
		JButton button = new JButton("\u0E27\u0E34\u0E40\u0E04\u0E23\u0E32\u0E30\u0E2B\u0E4C");
		button.setIcon(new ImageIcon(Command2.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-confirm.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
Analisys an = new Analisys();
				
				String name = textFieldName.getText();
				String sur = textFieldSurname.getText();
				
				an.setName(name,sur);
				
				String age ="";
				if(radioButton1.isSelected()){
					age = radioButton1.getText();
				}else if(radioButton2.isSelected()){
					age = radioButton2.getText();
				}else if(radioButton3.isSelected()){
					age = radioButton3.getText();
				}else if(radioButton4.isSelected()){
					age = radioButton4.getText();
				}
				
				String sex = comboBox.getSelectedItem().toString();
				
				String dio = null;
				if(singleRB.isSelected()){
					dio = singleRB.getText();
				}else if(singleRB2.isSelected()){
					dio = singleRB2.getText();
				}else if(singleRB3.isSelected()){
					dio = singleRB3.getText();

				}
				
				
				String like1 = "",like2 = "",like3 ="";
				if(checkBox1.isSelected()){
					 like1 = checkBox1.getText();
				}if(checkBox2.isSelected()){
					 like2 = checkBox2.getText();
				}if(checkBox3.isSelected()){
					 like3 = checkBox3.getText();

				}
				
				
			
				
				an.setAge(age,sex,dio);
				an.setCan(age);
				an.setLike(like1,like2,like3);
			
				String can = an.getCan();
				String like = an.getLike();
				
				textPane.setText(an.getName()+like+can);
				
			}
		});
		
		JButton btnNewButton = new JButton("\u0E25\u0E1A\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25");
		btnNewButton.setIcon(new ImageIcon(Command2.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textFieldName.setText(null);
				textFieldSurname.setText(null);
				groupAge.clearSelection();
				comboBox.setSelectedItem("");
				groupsingle.clearSelection();
				checkBox1.setSelected(false);
				checkBox2.setSelected(false);
				checkBox3.setSelected(false);
				
				textPane.setText("\u0E41\u0E2A\u0E14\u0E07\u0E1C\u0E25\u0E25\u0E31\u0E1E\u0E18\u0E4C\u0E17\u0E35\u0E48\u0E19\u0E35\u0E49....");
				
			
				
			}
		});
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		
		JLabel label_5 = new JLabel("\u0E19\u0E32\u0E21\u0E2A\u0E01\u0E38\u0E25");
		
		textFieldSurname = new JTextField();
		textFieldSurname.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_3)
						.addComponent(label_2)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1)
						.addComponent(label_4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(label_5)
							.addGap(10)
							.addComponent(textFieldSurname, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(24)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(singleRB)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(singleRB2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(singleRB3))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(radioButton1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(radioButton2)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(radioButton3)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(radioButton4))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(checkBox1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(checkBox2)
									.addGap(18)
									.addComponent(checkBox3)))))
					.addGap(60)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE))
					.addGap(41))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(68)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_1)
								.addComponent(radioButton1)
								.addComponent(radioButton2)
								.addComponent(radioButton3)
								.addComponent(radioButton4))
							.addGap(106)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_3)
								.addComponent(singleRB)
								.addComponent(singleRB2)
								.addComponent(singleRB3)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label))
							.addGap(106)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_2)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(label_5))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(textFieldSurname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(checkBox1)
								.addComponent(checkBox2)
								.addComponent(checkBox3)
								.addComponent(label_4)))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
