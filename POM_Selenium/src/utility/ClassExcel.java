package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ClassExcel 
{
	static String path="C:\\Users\\Zeus\\Desktop\\UserRepo.xlsx";
	static InputStream ios ;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;

	public static int getIndex(String Locator)
	{
		int index=0;

		try 
		{
			ios= new FileInputStream(path);
			wb = new XSSFWorkbook(path);
			sheet = wb.getSheetAt(0);
			row=sheet.getRow(0);
			for(int i=0; i<row.getPhysicalNumberOfCells();i++)
			{
				cell=row.getCell(i);
				if(Locator.equalsIgnoreCase(cell.toString()))
				{
					if(Locator.equalsIgnoreCase("Xpath"))
					{
						index=i;
						return index;
					}
					else	if(Locator.equalsIgnoreCase("Class"))
					{
						index=i;
						return index;
					}
					else if(Locator.equalsIgnoreCase("ID"))
					{
						index=i;
						return index;
					}
					else if(Locator.equalsIgnoreCase("Link"))
					{
						index=i;
						return index;
					}
					else if(Locator.equalsIgnoreCase("Name"))
					{
						index=i;
						return index;
					}
					else
					{
						index=i;
						return index;	
					}
				}
			}
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return index;
	}
	public	static String getDataCell(String userInput,String Locator)
	{
		String DataValue;
		int index=getIndex(Locator);
		try {
			ios= new FileInputStream(path);
			wb = new XSSFWorkbook(path);
			sheet = wb.getSheetAt(0);
			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++)
			{
				row=sheet.getRow(i);
				cell=row.getCell(0);
				if(cell.toString().equalsIgnoreCase(userInput))
				{
					cell=row.getCell(index);
					DataValue=cell.toString();
					return DataValue;
				}
			}
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return Locator;
	}

	public static void main(String[] args) 
	{
		ClassExcel ce = new ClassExcel();
		String num=ce.getDataCell("Test128","Link");
		System.out.println(num);
		
	}
}
