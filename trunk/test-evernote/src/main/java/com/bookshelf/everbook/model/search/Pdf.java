
package com.bookshelf.everbook.model.search;


public class Pdf{
   	private boolean isAvailable;

 	public boolean getIsAvailable(){
		return this.isAvailable;
	}
	public void setIsAvailable(boolean isAvailable){
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Pdf [isAvailable=" + isAvailable + "]";
	}
	
	
}
