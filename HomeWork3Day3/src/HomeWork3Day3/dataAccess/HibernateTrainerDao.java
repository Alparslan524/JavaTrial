package HomeWork3Day3.dataAccess;

import HomeWork3Day3.entities.Trainer;

public class HibernateTrainerDao implements ITrainerDao{

	@Override
	public void add(Trainer trainer) {
		System.out.println(trainer.getTrainerName() + " Trainer added to Database with HiberNate");
		
	}

}
