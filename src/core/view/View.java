package core.view;

import javax.swing.JFrame;

public abstract class View extends JFrame {
	
	protected int width;
	protected int height;

	public View() {
		init();
		addComponent();
		addListener();
	}
	
	public void showView() {
		setSize(width, height);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	protected abstract void init();
	protected abstract void addComponent();
	protected abstract void addListener();
	
}
