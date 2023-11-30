package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utls.Hooks;

public class AnimationPage extends Hooks {

    public AnimationPage(){
        PageFactory.initElements(androidDriver,this);
    }

    // findElementAccessibilityId(String id)
    // methodunu android driver uzerinden findElementAccessibilityId locator larini
    // okumak icin olusturduk

    public WebElement findelementByAccessibilityId(String id){
        return androidDriver.findElementByAccessibilityId(id) ;
    }

    public WebElement getAccessibilityButton(){
        return findelementByAccessibilityId("Access'ibility");
    }
    public WebElement getViewsButton(){
        return findelementByAccessibilityId("Views");
    }
    public WebElement getListsButton(){
        return findelementByAccessibilityId("Lists");
    }
    public void clickElement(WebElement element){
        element.click();
    }


    public WebElement getAnimationButton(){
        return findelementByAccessibilityId("Animation");
    }


}
