package hipster.view;

import javax.swing.*;

import hipster.controller.Controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class HipsterPanel extends JPanel
{
	private Controller baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	private JLabel bookPageCountLabel;
	private JLabel
	
	public HipsterPanel(Controller baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		String [] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);		
	}
	
	/**
	 * Helper method to load all GUI components into the panel.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.add(phraseComboBox);
	}
	
	/**
	 * Helper method for arranging panel.
	 * Dumping ground for all layout code.
	 */
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent section)
			{
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				setBackground(new Color(red, green, blue));
				String updatedTitle = phraseComboBox.getSelectedItem().toStng();
				baseController.getBaseFrame().setTitle(updatedTitle);
			}	
		});
	}

}
