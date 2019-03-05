package com.m2i.tp.essai;

import javax.swing.JOptionPane;

public class AfficheurGraphique implements Afficheur {

	@Override
	public double saisir(String message) {
		String sValSaisie = JOptionPane.showInputDialog(null, message);
		return Double.parseDouble(sValSaisie);
	}

	@Override
	public void afficher(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

}
