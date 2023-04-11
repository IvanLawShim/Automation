package animationtest;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.Objects;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;


public class windowtest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowtest frame = new windowtest();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public windowtest() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 500, 500);
		contentPane = new JPanel();
		FlowLayout flowLayout = (FlowLayout) contentPane.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				
		setContentPane(contentPane);
		
		//add image element
		Icon userIcon1 = new ImageIcon( Objects.requireNonNull(this.getClass().getResource("/bg_1.png")));
		Icon userIcon2 = new ImageIcon( Objects.requireNonNull(this.getClass().getResource("/bg_2.png")));
		Icon userIcon3 = new ImageIcon( Objects.requireNonNull(this.getClass().getResource("/bg_3.png")));
		Icon userIcon4 = new ImageIcon( Objects.requireNonNull(this.getClass().getResource("/bg_4.png")));
		Icon userIcon5 = new ImageIcon( Objects.requireNonNull(this.getClass().getResource("/bg_5.png")));
		Icon select_chrome = new ImageIcon( Objects.requireNonNull(this.getClass().getResource("/select_chrome.png")));
		Icon select_edge = new ImageIcon( Objects.requireNonNull(this.getClass().getResource("/select_edge.png")));
		Icon select_firefox = new ImageIcon( Objects.requireNonNull(this.getClass().getResource("/select_firefox.png")));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(50, 50, 124));
		panel.setPreferredSize(new Dimension(500,500));
		contentPane.add(panel);
		panel.setLayout(null);
		
		//JLabel elements
		JLabel bg1 = new JLabel(userIcon1);
		JLabel bg2 = new JLabel(userIcon2);
		JLabel bg3 = new JLabel(userIcon3);
		JLabel bg4 = new JLabel(userIcon4);
		JLabel bg5 = new JLabel(userIcon5);
		JLabel select_chrome_label = new JLabel(select_chrome);
		JLabel select_edge_label = new JLabel(select_edge);
		JLabel select_firefox_label = new JLabel(select_firefox);
		
		//position & coordinates
		bg1.setBounds(0, 0, 500, 500);
		bg2.setBounds(44, 221, 133, 62);
		bg3.setBounds(185, 221, 133, 62);
		bg4.setBounds(325, 221, 133, 62);
		bg5.setBounds(214, 415, 77, 36);
		select_chrome_label.setBounds(325, 221, 133, 62);
		select_edge_label.setBounds(185, 221, 133, 62);
		select_firefox_label.setBounds(44, 221, 133, 62);
		
		//visibility
		select_chrome_label.setVisible(false);
		select_edge_label.setVisible(false);
		select_firefox_label.setVisible(false);

		//layering
		panel.add(select_chrome_label);
		panel.add(select_edge_label);
		panel.add(select_firefox_label);
		panel.add(bg2);
		panel.add(bg3);
		panel.add(bg4);
		panel.add(bg5);
		panel.add(bg1);
		
		//mouse events
		bg2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				select_firefox_label.setVisible(true);
			}
		});
		
		bg3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				select_edge_label.setVisible(true);
			}
		});
		
		bg4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				select_chrome_label.setVisible(true);
			}
		});
		
		select_firefox_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				select_firefox_label.setVisible(false);
			}
		});
		
		select_edge_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				select_edge_label.setVisible(false);
			}
		});
		
		select_chrome_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				select_chrome_label.setVisible(false);
			}
		});
		
		//setcursor
		bg2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bg3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bg4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bg5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		select_firefox_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		select_edge_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		select_chrome_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		JCheckBox SEO_Checklist = new JCheckBox("SEO Checklist");
		SEO_Checklist.setBounds(59, 316, 118, 23);
		panel.add(SEO_Checklist);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(73, 136, 368, 23);
		panel.add(textField);
		textField.setColumns(10);
	}
}