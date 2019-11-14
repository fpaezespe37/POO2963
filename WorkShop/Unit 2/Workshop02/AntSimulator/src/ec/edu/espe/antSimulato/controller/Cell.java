/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antSimulato.controller;


import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Labs-DCCO
 */
public class Cell {
int numh = 10;
	private int row;
	private int col;

	/**
	 * 
	 * @param Pheromone
	 */
	public void ReceivePheromone(int Pheromone) {
		// TODO - implement Cell.ReceivePheromone
		throw new UnsupportedOperationException();
	}

	public List<Ant> GetAnts() {
		// TODO - implement Cell.GetAnts
		
               System.out.println("El numero de hormigas en cell es de: " + numh); 
    return null;
	}

}
