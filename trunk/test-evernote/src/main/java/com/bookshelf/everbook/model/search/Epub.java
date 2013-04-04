
package com.bookshelf.everbook.model.search;


public class Epub{
   	private boolean isAvailable;

 	public boolean getIsAvailable(){
		return this.isAvailable;
	}
	public void setIsAvailable(boolean isAvailable){
		this.isAvailable = isAvailable;
	}
	
	@Override
	public String toString() {
		return "Epub [isAvailable=" + isAvailable + "]";
	}
	
}
