package BT_Locators.XpathTuongDoi;

public class Locators {
    //Trang Login CRM
    public static String headerLoginPage = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String LinkForgotPassword = "//a[normalize-space()='Forgot Password?']";
    public static String checkboxRemember = "//input[@id='remember']";

    //Trang Dashboard
    public static String menuDashboard = "//ul[@id='side-menu']//span[normalize-space()='Dashboard']";
    public static String menuCustomers = "//ul[@id='side-menu']//span[normalize-space()='Customers']";
    public static String menuProjects = "//ul[@id='side-menu']//span[normalize-space()='Projects']";
    public static String menuTasks= "//ul[@id='side-menu']//span[normalize-space()='Tasks']";

    //Trang Customers List
    public static String buttonAddNewCustomer= "//a[normalize-space()='New Customer']";
    public static String buttonImportCustomer= "///a[normalize-space()='Import Customers']";
    public static String buttonContacts = "//a[contains(@href, 'clients/all_contacts')]";
    public static String headerCustomerPage= "//h4[normalize-space()='Customers Summary']";
    public static String inputSearchCustomer= "//div[@id='clients_filter']//input']";

    //Add New Customer
    public static String inputCompany= "//input[@id='company']";
    public static String inputVatNumber= "//input[@id='vat']";
    public static String inputPhone= "//input[@id='phonenumber']";
    public static String inputWebsie= "//input[@id='website']']";
    public static String dropdownGruops= "//button[@data-id='groups_in[]']";
    public static String inputsearchGroup= "//div[@app-field-wrapper='groups_in[]']//input[@type='search']";
    public static String dropdownCurrency= "//button[@data-id='default_currency']";
}
