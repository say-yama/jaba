package practice3;

import practice2.Bas;
import practice2.Stopable;
import practice2.Taxi;
import practice2.Train;
import practice2.Vehicle;

public class UseVehicle {

	public static void main(String[] args) {
		Vehicle[] v = new Vehicle[3];
		v[0] = new Taxi(4);
		v[1] = new Train(160);
		v[2] = new Bas(80);

		for (int i = 0; i < v.length; i++) {
			v[i].showCrewNum();
			if (v[i] instanceof Stopable) {
				Stopable s = (Stopable) v[i];
				s.stop();
			}
		}
	}

}
