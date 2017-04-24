
import java.io.*;

import javax.imageio.ImageIO;

import net.sourceforge.tess4j.*;

public class Main {
	public static void main(String[] args) {
		Tesseract instance = Tesseract.getInstance(); //
		Grayscale grayScale = new Grayscale();
		File test = new File("D:\\Users\\RPESCH\\Documents\\GitHub\\ID\\Tess4J\\Output4.jpg");
		
		try {
			instance.setDatapath("D:\\Users\\RPESCH\\Documents\\GitHub\\ID\\Tess4J");
			ImageIO.write(grayScale.grayImage, "jpg", test);
			String result = instance.doOCR(grayScale.grayImage);
			System.out.println(result);

		} catch (TesseractException e) {
			System.err.println(e.getMessage());
		}catch (IOException ex){
			System.out.println(ex);
		}
	}
}