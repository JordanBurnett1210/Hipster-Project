package hipster.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hipster.view.HipsterPanel;
import hipster.controller.Controller;

public class HipsterFrame extends JFrame
{
	private Controller baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(Controller baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		setupFrame();
	}
	
	public String getResponse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500,500);
		this.setResizable(true);
		this.setVisible(true);
	}
	
	public Controller getBaseController()
	{
		return baseController;
	}

}
