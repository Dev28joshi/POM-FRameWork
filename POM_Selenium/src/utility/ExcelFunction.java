package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import pageUtility.CallFunction;

public class ExcelFunction 
{

	static String path="C:\\Users\\Zeus\\Desktop\\PomTest.xlsx";
	static String path1="C:\\Users\\Zeus\\Desktop\\PomTest1.xlsx";
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	List<String> cellVal= new ArrayList<>();
	static List<Integer> cellInt = new ArrayList<>();
	static InputStream ios;
	static OutputStream os;
	
	static List<Integer> getValue()
	{
		List<Integer> cellInt1 = new ArrayList<>();
		try
		{
			
			ios = new FileInputStream(path);
			wb = new XSSFWorkbook(ios);
			sheet = wb.getSheetAt(0);
			for(int i=1; i<sheet.getPhysicalNumberOfRows();i++)
			{
				row = sheet.getRow(i);
				cell= row.getCell(3);
				if(cell.toString().equalsIgnoreCase("Yes")&& cell!=null)
				{
				cellInt1.add(i);
			//	System.out.println(i);
				}
				/*else
				{
					continue;
				}*/
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
		
		return cellInt1;
		
	}
	
	public ArrayList<String> gettcNstatus()
	{
		List<Integer> il = new ArrayList<>();
		ArrayList<String> tc = new ArrayList<>();
		il= getValue();
		for(int i=0; i<il.size();i++)
		{
			int num=il.get(i);
			row= sheet.getRow(num);
			cell=row.getCell(1);
			String tcCell=cell.toString();
			System.out.println(tcCell);
			tc.add(tcCell);
			
		}
		return tc;
		
	}
	
	public static void writeExcel(WebDriver driver) throws InterruptedException
	{
	//	CellStyle style=wb.createCellStyle();
		CallFunction dfo = new CallFunction();
		List<Integer> getIndex= new ArrayList<>();
		List<String> getvalname= new ArrayList<>();
		getIndex=getValue();
		getvalname=dfo.getResult(driver);
		try 
		{
			os = new FileOutputStream(path1);
			for(int i=0; i<getIndex.size();i++)
			{
				int num= getIndex.get(i);
				row= sheet.getRow(num);
				cell=row.createCell(4);
				cell.setCellValue(getvalname.get(i));
				System.out.println(cell.toString());
			}
			wb.write(os);
			os.flush();
			os.close();
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) 
	{
	ExcelFunction ef = new ExcelFunction();
	//ef.writeExcel();
	}
}
