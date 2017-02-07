package com.reviewapp.services;

import java.util.ArrayList;
import java.util.List;

import com.reviewapp.models.WordCloud;

public class WordCloudService {
	
	
	public List<WordCloud> getWordCloud(){
		
	WordCloud w1 = new WordCloud("Tarzan", 20);
	WordCloud w2 = new WordCloud("Jungle Book", 18);
	WordCloud w3 = new WordCloud("Avengers", 24);
	
	List<WordCloud> words = new ArrayList<>();
	
	words.add(w1);
	words.add(w2);
	words.add(w3);
	
	return words;
	}

}
