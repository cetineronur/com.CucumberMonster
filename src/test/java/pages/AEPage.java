package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AEPage {

public AEPage(){

    PageFactory.initElements(Driver.getDriver(),this);

}

//---------------Cem--------------------------------------------------------->
//---------------Emin--------------------------------------------------------->
//---------------Guenter--------------------------------------------------------->
//---------------Kubra--------------------------------------------------------->
//---------------Mali--------------------------------------------------------->
//---------------Mustafa--------------------------------------------------------->
//---------------Onur--------------------------------------------------------->
    //MainPage--->Products Linki
@FindBy (xpath = "//a[@href='/products']")
public WebElement products;

    //MainPage--->products Linki----->All Products text
@FindBy(xpath = "//h2[@class='title text-center']")
public WebElement allproducts;

    //MainPage--->products Linki----->SearchBox
@FindBy(xpath = "//input[@id='search_product']")
public WebElement searchBox;

    //MainPage--->products Linki----->SearchBox arama tusu
@FindBy(xpath = "//button[@id='submit_search']")
public WebElement searchBoxTik;

    //MainPage--->products Linki----->Searached Product yazisi
@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/h2")
    public WebElement searchedProduct;

@FindBy(xpath = "//div[@class='product-image-wrapper']")
    public List<WebElement> searchedProductsList;

//---------------Salih--------------------------------------------------------->

    // mainPage/logo
    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    public WebElement mainPageLogoElementi;

    //mainPage/Home Linki
    @FindBy(xpath = "(//a[@href='/'])[2]")
    public WebElement mainPageHomeLinkiElementi;

    //mainPage/Products Linki
    @FindBy(xpath = "//a[@href='/products']")
    public WebElement mainPageProductsLinkiElementi;

    //mainPage/Cart Linki
    @FindBy(xpath = "//a[@href='/view_cart']")
    public WebElement mainPageCartLinkiElementi;

    //mainPage/SignupLogin Linki
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement mainPageSignupLoginLinkiElementi;

    //mainPage/Test Cases Linki
    @FindBy(xpath = "//a[@href='/test_cases']")
    public WebElement mainPageTestCasesLinkiElementi;

    //mainPage/Api Testing Linki
    @FindBy(xpath = "//a[@href='/api_list']")
    public WebElement mainPageApiTestiLinkiElementi;

    //mainPage/Contact us Linki
    @FindBy(xpath = "//a[@href='/contact_us']")
    public WebElement mainPageContactUsLinkiElementi;

    //mainPage/imageSlider(0) Butonu
    @FindBy(xpath = "//li[@data-slide-to='0']")
    public WebElement mainPageImageSlider0ButonElementi;

    //mainPage/imageSlider(1) Butonu
    @FindBy(xpath = "//li[@data-slide-to='1']")
    public WebElement mainPageImageSlider1ButonElementi;

    //mainPage/imageSlider(2) Butonu
    @FindBy(xpath = "//li[@data-slide-to='2']")
    public WebElement mainPageImageSlider2ButonElementi;

    //mainPage/imageGirl1
    @FindBy(xpath = "//img[@src='/static/images/home/girl2.jpg']")
    public WebElement mainPageimageGirl1Elementi;

    //mainPage/ImageGirl2
    @FindBy(xpath = "//img[@src='/static/images/home/girl1.jpg']")
    public WebElement mainPageimageGirl2Elementi;

    //mainPage/ImageGirl3
    @FindBy(xpath = "//img[@src='/static/images/home/girl3.jpg']")
    public WebElement mainPageimageGirl3Elementi;

    //mainPage/image Riht Transition
    @FindBy(xpath = "//i[@class='fa fa-angle-right']")
    public WebElement mainPageImageRightTransitionElementi;

    //mainPage/Image1 Test Cases Button
    @FindBy(xpath = "(//button[@class='btn btn-success'])[1]")
    public WebElement mainPageImage1TestCasesButtonElementi;

    //mainPage/Image2 Test Cases Button
    @FindBy(xpath = "(//button[@class='btn btn-success'])[3]")
    public WebElement mainPageImage2TestCasesButtonElementi;

    //mainPage/Image3 Test Cases Button
    @FindBy(xpath = "(//button[@class='btn btn-success'])[5]")
    public WebElement mainPageImage3TestCasesButtonElementi;

    //mainPage/Image1 APIsList button
    @FindBy(xpath = "(//button[@class='btn btn-success'])[2]")
    public WebElement mainPageImage1APIsListButtonElementi;

    //mainPage/Image2 APIsList button
    @FindBy(xpath = "(//button[@class='btn btn-success'])[4]")
    public WebElement mainPageImage2APIsListButtonElementi;

    //mainPage/Image3 APIsList button
    @FindBy(xpath = "(//button[@class='btn btn-success'])[6]")
    public WebElement mainPageImage3APIsListButtonElementi;

    //mainPage/Category/Women linki
    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement mainPageCategoryWomenLinkiElementi;

    //mainPage/Category/Men Linki
    @FindBy(xpath = "//a[@href='#Men']")
    public WebElement mainPageCategoryMenLinkiElementi;

    //mainPage/Category/Kids Linki
    @FindBy(xpath = "//a[@href='#Kids']")
    public WebElement mainPageCategoryKidsLinkiElementi;

    //mainPage/Brands/Polo Linki
    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    public WebElement mainPageBrandsPoloLinkiElementi;

    //mainPage/Brands/H&M Linki
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    public WebElement mainPageBrandsHMLinkiElementi;

    //mainPage/Brands/Madame Linki
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    public WebElement mainPageBrandsMadameLinkiElementi;

    //mainPage/Brands/Mast&Harbour Linki
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    public WebElement mainPageBrandsMastHarbourLinkiElementi;

    //mainPage/Brands/Babyhug Linki
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    public WebElement mainPageBrandsBabyhugLinkiElementi;

    //mainPage/Brands/AllenSollyJunior Linki
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    public WebElement mainPageBrandsAllenSollyJuniorLinkiElementi;

    //mainPage/Brands/KookieKids Linki
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    public WebElement mainPageBrandsKookieKidsLinkiElementi;

    //mainPage/Brands/Biba Linki
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    public WebElement mainPageBrandsBibaLinkiElementi;

    //mainPage/Subscription/EmailBox
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement mainPageSubscriptionEmailBoxElementi;

    //mainPage/Subscription/OkButton
    @FindBy(xpath = "//button[@id='subscribe']")
    public WebElement mainPageSubscriptionOkButtonElementi;

    //mainPage/Features Item
    @FindBy(xpath = "(//div[@class='productinfo text-center'])[34]")
    public WebElement mainPageFeaturesItemElement;

    //mainPage/FeaturesItem/Son urun Add to Card butonu
    @FindBy(xpath = "//a[@data-product-id='43']")
    public WebElement mainPageFeaturesItemSonUrunAddToCardElementi;

    //mainPage/FeaturesItem/Son urun View Product butonu
    @FindBy(xpath = "//a[@href='/product_details/43']")
    public WebElement mainPageFeaturesItemSonUrunViewProductElementi;

    //mainPage/AddtoCard Eklendi yazisi
    @FindBy(xpath = "//h4[@class='modal-title w-100']")
    public WebElement mainPageAddtoCardEklendiYaziElementi;

    //mainPage/Add to Card/Continue Shopping butonun
    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement mainPageAddtoCardContinueShoppingButonElementi;


//---------------Sezen--------------------------------------------------------->
//---------------Zeynep--------------------------------------------------------->

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUpLoginButton;

    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement loginToYourAccountYazisi;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmailTextBox;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//li[9]//a[1]")
    public WebElement loggedInAsYazisi;


}
