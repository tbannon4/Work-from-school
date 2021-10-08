package loops;

public class GasMileageRunner
{

	public static void main(String[] args) 
	{
		GasMileage gasmileage = new GasMileage(" Honda ");
		
		gasmileage.fillTank(12, 12);
		gasmileage.milesPerGallon();
		System.out.println(gasmileage);
		
	}

}
