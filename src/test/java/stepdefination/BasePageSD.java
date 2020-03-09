package stepdefination;


import org.openqa.selenium.By;

public class BasePageSD {


        private By ChildrenMESSage=By.xpath("//div[@class='widget-query-room-children-notice']");

        public String getMessage()

        { return SharedSD.getDriver().findElement(ChildrenMESSage).getText();}
        }




