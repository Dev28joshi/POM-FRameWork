package utility;

import config.ConfigFileReader;

public class Pagedetails 
{
	//locator Name
	public static  final String locator_id="ID";
	public static  final String locator_Name="Name";
	
	///*Registration Page
	public static  String txtfirstName= ClassExcel.getDataCell("genderchk","ID");
	public static String txtLastName=ClassExcel.getDataCell("txtLastName","ID");
	public static String email= ClassExcel.getDataCell("email","ID");
	public static String pwd=ClassExcel.getDataCell("pwd","ID");
	public static String cnpw =ClassExcel.getDataCell("cnpw","ID");
	public static String lk_reg = ClassExcel.getDataCell("lk_reg","Xpath");
	public static String lkLogin =ClassExcel.getDataCell("lkLogin","Xpath");
	public static String btnReg =ClassExcel.getDataCell("btnReg","ID");
	
	
	///*Login Page
	public static  String txt_login= ClassExcel.getDataCell("txt_login","Xpath1");
	public static  String txt_pwd= ClassExcel.getDataCell("txt_pwd",locator_Name);
	public static  String btn_login= ClassExcel.getDataCell("btn_login","Xpath");
	
	///*Universal
	public static final String filepath="C:\\Users\\Zeus\\Desktop";
	public static final String file="PomTest.xlsx";
	public static final String fullpath=filepath+file;
	//public static final String url="http://demowebshop.tricentis.com/";
	public static String genderchk= ClassExcel.getDataCell("genderchk","ID");
	public static final String url= ConfigFileReader.methodPro("URL");
	
	//login data config file
	public static String login_username = ConfigFileReader.methodPro("Login_username");
	public static String login_usernamelast = ConfigFileReader.methodPro("Login_usernamelast");
	public static String login_email = ConfigFileReader.methodPro("Login_email");
	public static String Login_pwd= ConfigFileReader.methodPro("Login_pwd");
	public static String Login_cpwd = ConfigFileReader.methodPro("Login_cpwd");
}
