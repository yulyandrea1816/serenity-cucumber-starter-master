package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class directorio {
    private directorio (){}

    public static final Target directorio = Target.the("modulo directorio")
            .locatedBy("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(9) > a > span");
}
