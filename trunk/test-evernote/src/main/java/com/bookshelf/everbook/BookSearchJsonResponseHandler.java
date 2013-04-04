package com.bookshelf.everbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

import com.bookshelf.everbook.model.search.BookSearchResult;
import com.google.gson.Gson;

public class BookSearchJsonResponseHandler implements ResponseHandler<BookSearchResult> {

	public BookSearchResult handleResponse(HttpResponse response)
			throws ClientProtocolException, IOException {
		StatusLine statusLine = response.getStatusLine();
        HttpEntity entity = response.getEntity();
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                entity.getContent(), "utf-8"), 8);
        if (statusLine.getStatusCode() >= 300) {
            EntityUtils.consume(entity);
            throw new HttpResponseException(statusLine.getStatusCode(),
                    statusLine.getReasonPhrase());
        }
        BookSearchResult book = null;
        if(reader != null){
        	Gson gson = new Gson();
        	book = gson.fromJson(reader, BookSearchResult.class);
        }
		return book;
	}

}
