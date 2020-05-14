package ie.exactest.services;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebElement;

/*
 * image exists. When this applet attempts to draw the image on
 * the screen, the data will be loaded. The graphics primitives 
 * that draw the image will incrementally paint on the screen. 
 *
 * @param  imgElement :  WebElement contains <img> tag
 * @return imageStatus : boolean - True if the status code is 200
 * 
 * */
public class ImageValidator {
	
	boolean imageStatus;
	
	public boolean verifyimageActive(WebElement imgElement) {
	try {
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(imgElement.getAttribute("src"));
		HttpResponse response = client.execute(request);			
		if (response.getStatusLine().getStatusCode() != 200)
			
			imageStatus = false;
		
		else {
			
			imageStatus = true;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return imageStatus;
	
	}
	

}
