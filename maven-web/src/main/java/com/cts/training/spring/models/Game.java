package com.cts.training.spring.models;

public class Game {
		String name;
		String genre;
		String[] tags = {"shooting","action","fps"};
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			if(genre ==null)
			{
				this.genre = "default GENRE";
			}
			else
			{
				this.genre = genre;
			}
			
		}
		public String[] getTags() {
			return tags;
		}
		public void setTags(String[] tags) {
			this.tags = tags;
		}
		
		
}
