package HomeWork3Day3.business;

import HomeWork3Day3.core.ILogger;
import HomeWork3Day3.dataAccess.ITrainerDao;
import HomeWork3Day3.entities.Trainer;

public class TrainerManager implements ITrainerService {

	private ITrainerDao trainerDao;
	private ILogger[] loggers;

	public TrainerManager(ITrainerDao trainerDao, ILogger[] loggers) {
		this.trainerDao = trainerDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Trainer trainer) {
		trainerDao.add(trainer);
		for (ILogger logger : loggers) {
			logger.log(trainer.getTrainerName());
		}
	}

}
