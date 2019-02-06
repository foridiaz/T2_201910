package model.logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

import api.IMovingViolationsManager;
import model.data_structures.IteratorList;
import model.data_structures.LinkedList;
import model.vo.VOMovingViolations;
public class MovingViolationsManager implements IMovingViolationsManager {

	private LinkedList<VOMovingViolations> list;

	public MovingViolationsManager (){
		list=new LinkedList<>();
	}
	public void loadMovingViolations(String movingViolationsFile){
		
		CSVReader reader=null;
		
		try{
			
			reader=new CSVReader(new FileReader(movingViolationsFile));
			String[] linea=reader.readNext();
			linea=reader.readNext();
			while(linea!=null){
				list.add(new VOMovingViolations(Integer.parseInt(linea[0]), linea[2], linea[13], Integer.parseInt(linea[9]), linea[12], linea[15], linea[14]));
				linea=reader.readNext();
			}

		}catch( Exception e){
			e.printStackTrace();

		}finally{
			if (reader!=null){
				try{
					reader.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}


	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {
		// TODO Auto-generated method stub
		LinkedList<VOMovingViolations> retornar= new LinkedList<>();
		IteratorList<VOMovingViolations> iterator=list.iterator();
		while(iterator.hasNext()){
			VOMovingViolations actual=iterator.next();
			if(actual.getViolationCode().equals(violationCode)){
				retornar.add(actual);
			}
		}
		System.out.println(retornar.getSize()+"");
		return retornar; 
	}

	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {
		// TODO Auto-generated method stub
		LinkedList<VOMovingViolations> retornar= new LinkedList<>();
		IteratorList<VOMovingViolations> iterator=(IteratorList<VOMovingViolations>)list.iterator();
		while(iterator.hasNext()){
			VOMovingViolations actual=iterator.next();
			if(actual.getAccidentIndicator().equals(accidentIndicator)){
				retornar.add(actual);
			}
		}
		return retornar; 
	}	


}
