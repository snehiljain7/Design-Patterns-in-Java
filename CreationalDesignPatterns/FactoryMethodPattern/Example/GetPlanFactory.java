package DesignPatterns.CreationalDesignPatterns.FactoryMethodPattern.Example;

class GetPlanFactory{  
    
	   //use getPlan method to get object of type Plan   
	       public static ElectricityPlan getInstance(String planType){  
	            if(planType == null){  
	             return null;  
	            }  
	          if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
	                 return new DomesticPlan(3.5);  
	               }   
	           else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
	                return new CommercialPlan(5.0);  
	            }   
	          else if(planType.equalsIgnoreCase("INTERNATIONALPLAN")) {  
	                return new InternationalPlan(10);  
	          }  
	      return null;  
	   }  
}