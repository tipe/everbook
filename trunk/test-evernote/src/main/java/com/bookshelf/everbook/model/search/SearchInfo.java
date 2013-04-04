
package com.bookshelf.everbook.model.search;


public class SearchInfo{
   	private String textSnippet;

 	public String getTextSnippet(){
		return this.textSnippet;
	}
	public void setTextSnippet(String textSnippet){
		this.textSnippet = textSnippet;
	}
	@Override
	public String toString() {
		return "SearchInfo [textSnippet=" + textSnippet + "]";
	}
	
	
}
