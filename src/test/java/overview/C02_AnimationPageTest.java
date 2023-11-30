package overview;

import org.testng.annotations.Test;
import page.AnimationPage;
import utls.Hooks;

public class C02_AnimationPageTest extends Hooks {

    AnimationPage animationPage ;

    @Test
    public void test01(){
        animationPage = new AnimationPage() ;
        animationPage.getAnimationButton().click();


    }
}
