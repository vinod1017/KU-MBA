package org.cruxframework.crux.core.client.screen.views;

import org.cruxframework.crux.core.client.Crux;
import com.google.gwt.core.client.GWT;
import org.cruxframework.crux.core.client.screen.views.View;

public class xStandardResources_largeDisplayMouse {
  public static void init(){
    if (!View.containsResource("xStandardResources")){
      org.cruxframework.crux.themes.widgets.xstandard.client.resource.large.XStandardResourcesLarge resource1= GWT.create(org.cruxframework.crux.themes.widgets.xstandard.client.resource.large.XStandardResourcesLarge.class);
      resource1.css().ensureInjected();
      if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
        logger2.fine(Crux.getMessages().resourceCsssInjected("CssXStandardLarge"));
      }
      View.addResource("xStandardResources", resource1);
      if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
        logger2.fine(Crux.getMessages().resourcesInitialized("xStandardResources"));
      }
    }
  }
  private static java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(xStandardResources_largeDisplayMouse.class.getName());
}
