package edu.umd.physics.datagen.console;

import java.io.IOException;
import java.util.Vector;

import edu.umd.physics.datagen.LinearKernelDataGenerator;

public class LinearGeneratorConsole {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		double[] wArray = {1.0, 1.0};
		Vector<Double> w = new Vector<Double>();
		for (double wValue: wArray) {
			w.add(wValue);
		}
		LinearKernelDataGenerator linearKernel = new LinearKernelDataGenerator();
		linearKernel.setB(0);
		linearKernel.setW(w);
		
		linearKernel.setAttributeName(0, "x1");
		linearKernel.setAttributeName(1, "x2");
		
		linearKernel.writeArffFile("/Users/hok1/Documents/SVM/test2.arff", "linear", 1000);
	}

}
