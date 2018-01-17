package com.example.demo;

import org.springframework.stereotype.Component;

import com.example.demo.Knight;
import com.example.demo.Quest;

public class BraveKnight implements Knight {
	private Quest quest;
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
	public void embarkOnQuest() {
		quest.embark();
	}
}
