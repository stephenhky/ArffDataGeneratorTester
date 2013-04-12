package edu.umd.physics.datagen.console;

import java.io.IOException;
import java.util.Vector;

import edu.umd.physics.datagen.GaussianKernelDataGenerator;

public class GaussianGeneratorConsole {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		double[] s0Array = {1.0, 1.0};
		Vector<Double> s0 = new Vector<Double>();
		for (double s0Comp: s0Array) {
			s0.add(s0Comp);
		}
		double[] s1Array = {1.0, 0.0};
		Vector<Double> s1 = new Vector<Double>();
		for (double s1Comp: s1Array) {
			s1.add(s1Comp);
		}
		double[] s2Array = {-1.0, 0.0};
		Vector<Double> s2 = new Vector<Double>();
		for (double s2Comp: s2Array) {
			s2.add(s2Comp);
		}
		GaussianKernelDataGenerator gaussianKernel = new GaussianKernelDataGenerator();
		
		gaussianKernel.setAttributeName(0, "x1");
		gaussianKernel.setAttributeName(1, "x2");
		gaussianKernel.setSupportVector(0, s0);
		gaussianKernel.setSupportVector(1, s1);
		gaussianKernel.setSupportVector(2, s2);
		
		gaussianKernel.writeArffFile("/Users/hok1/Documents/SVM/test3.arff", "gaussian", 1000);
	}

}
