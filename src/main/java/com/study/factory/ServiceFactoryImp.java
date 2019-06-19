package com.study.factory;

public class ServiceFactoryImp extends ServiceFactory {

	@Override
	Service createService(int type) {
		// TODO Auto-generated method stub
		
		switch(type){
			case 1 : return new Service001Imp();
			case 2 : return new Service002Imp();
		};
				
		return null;
	}

}
