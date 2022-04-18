package DesignPatterns.CreationalDesignPatterns.FactoryMethodPattern.Example;

abstract class ElectricityPlan {

	double rate;
	abstract double getRate();
	 public void calculateBill(int units) {
		 System.out.print(units* getRate());
	 }
}

class DomesticPlan extends ElectricityPlan{

double rate;
    
	public DomesticPlan(double rate) {
		super();
		this.rate = rate;
	}

	@Override
	double getRate() {
		 return this.rate;
		
	}
}

class CommercialPlan extends ElectricityPlan{

    double rate;
    
	public CommercialPlan(double rate) {
		super();
		this.rate = rate;
	}

	@Override
	double getRate() {
		 return this.rate;
		
	}
	
}

class InternationalPlan extends ElectricityPlan{

	  double rate;
	    
		public InternationalPlan(double rate) {
			super();
			this.rate = rate;
		}

		@Override
		double getRate() {
			 return this.rate;
			
		}
}
