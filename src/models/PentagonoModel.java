/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class PentagonoModel extends FiguraModel {

	public PentagonoModel() {
		super();
		nombre = "Pentágono";
		puntos = new PointsModel(5);
	}

	@Override
	public void dibujar(Graphics2D g) {

		if (!canDraw()) {
			puntos.dibujar(g);
			return;
		}

		if (isSelected()) {
			g.setStroke(new BasicStroke(10));
			g.setColor(Color.YELLOW);
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
