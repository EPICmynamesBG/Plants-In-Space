package honr.gamedesign.plantsinspace.backend;

public class Responses {
	
	private static boolean onEarth, withLight;

	public static void Responses(){
		
	}
	
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
	
	public boolean getQuestion1Respose(){
		return onEarth;
	}
	
	public boolean getQuestion2Response(){
		return withLight;
	}
	
}
