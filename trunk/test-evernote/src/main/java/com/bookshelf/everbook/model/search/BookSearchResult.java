
package com.bookshelf.everbook.model.search;

import java.util.List;

public class BookSearchResult{
   	private List<Items> items;
   	private String kind;
   	private Number totalItems;

 	public List<Items> getItems(){
		return this.items;
	}
	public void setItems(List<Items> items){
		this.items = items;
	}
 	public String getKind(){
		return this.kind;
	}
	public void setKind(String kind){
		this.kind = kind;
	}
 	public Number getTotalItems(){
		return this.totalItems;
	}
	public void setTotalItems(Number totalItems){
		this.totalItems = totalItems;
	}
	@Override
	public String toString() {
		return "GoogleBook [items=" + items + ", kind=" + kind
				+ ", totalItems=" + totalItems + "]";
	}
	
}
