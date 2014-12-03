package honr.gamedesign.plantsinspace.backend;

public class Responses {
	
	private static boolean onEarth, withLight;

	public static void growPlantOnEarth(){
		onEarth=true;
	}
	
	public static void growPlantInSpace(){
		onEarth=false;
	}
	
	public static void growPlantWithLight(){
		withLight=true;
	}
	
	public static void growPlantInDarkness(){
		withLight=false;
	}
	
	public static boolean getQuestion1Respose(){
		return onEarth;
	}
	
	public static boolean getQuestion2Response(){
		return withLight;
	}
	
}
