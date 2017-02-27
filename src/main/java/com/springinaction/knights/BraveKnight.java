package com.springinaction.knights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class BraveKnight implements Knight {
	private Quest quest;


	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	
	public void embarkOnQuest() {
		quest.embark();
	}
}
