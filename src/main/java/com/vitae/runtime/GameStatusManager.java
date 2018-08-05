package com.vitae.runtime;

import java.util.Map;

import com.vitae.model.GameStatus;
import com.vitae.model.HeroStatus;

public interface GameStatusManager {

	public GameStatus getGamStatus();
	public Map<String, GameStatus> listGameStatuses();
	public void loadGameStatus(String id);
	public void saveGameStatus();
	public void resetGameStatus();
	
	public HeroStatus getCurrentHeroStatus();
	public void resetHeroStatus();
	
}
