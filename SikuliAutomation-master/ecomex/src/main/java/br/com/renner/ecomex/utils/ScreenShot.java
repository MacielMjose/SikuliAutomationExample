package br.com.renner.ecomex.utils;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.codec.binary.Base64;

public class ScreenShot {

	public static String captureToBase64() {
		System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
		System.out.println(Toolkit.getDefaultToolkit().getScreenResolution());
	    Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	    BufferedImage screenCapture = null;
	    String base64Encoded = "";

	    try {
	        screenCapture = new Robot().createScreenCapture(screenSize);
	        File outputfile = new File("C:\\Users\\mariana.minossi\\eclipse-workspace\\renner-rpm\\teste.jpg");
//	        ImageIO.write(screenCapture, "jpg", outputfile);
	        ByteArrayOutputStream baos = new ByteArrayOutputStream();
	        ImageIO.write(screenCapture, "png", baos);
	        baos.flush();
	        
	        byte[] encodeBase64 =  Base64.encodeBase64(baos.toByteArray());
	        base64Encoded = new String(encodeBase64);
	        baos.close();
	    } catch (AWTException | IOException e) {
	        e.getMessage();
	    }

	    return base64Encoded;
	}

}
