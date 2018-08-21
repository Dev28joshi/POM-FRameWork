package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFileReader 
{
	public static Properties po = new Properties();
	static File file= new File("C:\\\\Users\\\\Zeus\\\\eclipse-workspace\\\\POM_Selenium\\\\configs\\\\Configuation.properties");
	static String nameData;
	public static String methodPro(String input)
	{
		po = new Properties();
		try {

			InputStream ios = new FileInputStream(file);
			po.load(ios);
			//System.out.println(po.getProperty(input));
			nameData=po.getProperty(input);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nameData;

	}
	public static void main(String[] args) 
	{
		String data;
		ConfigFileReader con= new ConfigFileReader();
		data=methodPro("URL");
		System.out.println(data);
	}
}
