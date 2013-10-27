class MyDrawPanel extends JPanel{
		public void paintComponent(Graphics g){
			//g.setColor(Color.white);
			//g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.blue);
			g.fillOval(x, y, 50, 50);
		}
	}
