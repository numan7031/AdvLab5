package volume;



public class Volume {
	
	double cal,di;
	
	public void setVolume(double height, double diameter) {
		// TODO Auto-generated method stub
		
		di = diameter/2;
	
		 cal  = 3.142857142857143 * (di*di) * height;  
	}
	
	public double getVolume(){
		
		return cal;
	}

	

}
