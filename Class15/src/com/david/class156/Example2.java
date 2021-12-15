package com.david.class156;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Example2 {
	public static void main(String[] args) {
		HttpClient httpClient = HttpClient.newHttpClient();
		try {
			HttpRequest req = HttpRequest.newBuilder().uri(new URI("https://www.google.com"))
							.GET().build();
			HttpResponse<String> resp = httpClient.send(req,
					HttpResponse.BodyHandlers.ofString());
			System.out.println("Response : "+resp.body());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
