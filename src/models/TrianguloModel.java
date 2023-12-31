package models;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class TrianguloModel extends FiguraModel {

	public TrianguloModel() {
		super();
		nombre = "Triangulo";
		puntos = new PointsModel(3);
	}

	@Override
	public void dibujar(Graphics2D g) {

		if (!canDraw()) {
			puntos.dibujar(g);
			return;
		}

		if (isSelected()) {
			g.setStroke(new BasicStroke(10));
			g.setColor(Color.BLUE);
		} else {
			g.setColor(background);
		}

		g.drawPolygon(puntos.getXPointsInt(), puntos.getYPointsInt(), puntos.size());

		g.setStroke(new BasicStroke(2));
		g.setColor(background);
		g.fillPolygon(puntos.getXPointsInt(), puntos.getYPointsInt(), puntos.size());

		// Reset color
		g.setColor(Color.BLACK);
	}

}
