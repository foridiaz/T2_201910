package model.logic;

import api.IMovingViolationsManager;
import model.vo.VOMovingViolations;
import model.data_structures.LinkedList;
import opencsv
public class MovingViolationsManager implements IMovingViolationsManager {

	
	public void loadMovingViolations(String movingViolationsFile){
		// TODO Auto-generated method stub
		CSVReader reader=null; 
	}

		
	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {
		// TODO Auto-generated method stub
		return null;
	}	


}
