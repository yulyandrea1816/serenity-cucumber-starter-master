package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class home {
    private home () {}
        public static final Target DASHBOARD_TEXT = Target.the("Texto Dashboard")
                .locatedBy("css:h6.oxd-topbar-header-breadcrumb-module"
              //  .locatedBy("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]//h6[normalize-space()='Dashboard']"
          );

    }
