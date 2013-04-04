
package com.bookshelf.everbook.model.search;


public class ImageLinks{
   	private String smallThumbnail;
   	private String thumbnail;

 	public String getSmallThumbnail(){
		return this.smallThumbnail;
	}
	public void setSmallThumbnail(String smallThumbnail){
		this.smallThumbnail = smallThumbnail;
	}
 	public String getThumbnail(){
		return this.thumbnail;
	}
	public void setThumbnail(String thumbnail){
		this.thumbnail = thumbnail;
	}
	@Override
	public String toString() {
		return "ImageLinks [smallThumbnail=" + smallThumbnail + ", thumbnail="
				+ thumbnail + "]";
	}
	
}
