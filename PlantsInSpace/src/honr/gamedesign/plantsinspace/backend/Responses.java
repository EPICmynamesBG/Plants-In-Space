package honr.gamedesign.plantsinspace.backend;

public class Responses {
	
	private static boolean onEarth, withLight;

	public Responses(){
		
	}
	
	public void growPlantOnEarth(){
		onEarth=true;
	}
	
	public void growPlantInSpace(){
		onEarth=false;
	}
	
	public void growPlantWithLight(){
		withLight=true;
	}
	
	public void growPlantInDarkness(){
		withLight=false;
	}
	
	public boolean getQuestion1Respose(){
		return onEarth;
	}
	
	public boolean getQuestion2Response(){
		return withLight;
	}
	
}
