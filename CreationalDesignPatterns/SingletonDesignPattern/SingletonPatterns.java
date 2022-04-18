package DesignPatterns.CreationalDesignPatterns.SingletonDesignPattern;

import javax.jws.Oneway;

public class SingletonPatterns {

}

class EarlyInstantiation{
	
	private static EarlyInstantiation instance = new EarlyInstantiation();		//instantiation at load time
	
	private EarlyInstantiation() {}
	
	public static EarlyInstantiation getInstance() {
		return instance;
	}
}

class LazyInstantiation{
	
	private static LazyInstantiation instance;
	
	private LazyInstantiation() {}
	
	public static LazyInstantiation getInstance() {
		if(instance == null) {
			return new LazyInstantiation();						//instantiation when required but it is thread unsafe
		}
		return instance;
	}
}


class SingletonSnchronizedMethod{
	
	private static SingletonSnchronizedMethod instance;
	
	private SingletonSnchronizedMethod() {}
	
	public static synchronized SingletonSnchronizedMethod getInstance() {
		if(instance == null) {
			return new SingletonSnchronizedMethod();						//instantiation when required and thread safe but it makes whole method synchronized
		}
		return instance;
	}
}


class SingletonSnchronized{
	
	private static SingletonSnchronized instance;
	
	private SingletonSnchronized() {}
	
	public static synchronized SingletonSnchronized getInstance() {
		if(instance == null) {
			synchronized(SingletonSnchronized.class){
				if(instance == null) {
					return new SingletonSnchronized();		
				}
			
							//instantiation when required and thread safe and only makes block synchronized
		}
		
	}
		return instance;
}
}