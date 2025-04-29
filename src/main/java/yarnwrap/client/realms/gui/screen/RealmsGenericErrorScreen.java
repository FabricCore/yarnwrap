package yarnwrap.client.realms.gui.screen;
public class RealmsGenericErrorScreen { public net.minecraft.client.realms.gui.screen.RealmsGenericErrorScreen wrapperContained; public RealmsGenericErrorScreen(net.minecraft.client.realms.gui.screen.RealmsGenericErrorScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.realms.gui.screen.RealmsGenericErrorScreen.parent); }
// public static void parent(yarnwrap.client.gui.screen.Screen value, ) { net.minecraft.client.realms.gui.screen.RealmsGenericErrorScreen.parent = value.wrapperContained; }

// public Object errorMessages() { return wrapperContained.errorMessages; }
// // public void errorMessages(Object value) { wrapperContained.errorMessages = value; }
// // public static Object errorMessages() { return net.minecraft.client.realms.gui.screen.RealmsGenericErrorScreen.errorMessages; }
// // public static void errorMessages(Object value, ) { net.minecraft.client.realms.gui.screen.RealmsGenericErrorScreen.errorMessages = value; }

// public yarnwrap.client.font.MultilineText description() { return new yarnwrap.client.font.MultilineText(wrapperContained.description); }
// public void description(yarnwrap.client.font.MultilineText value) { wrapperContained.description = value.wrapperContained; }
// public static yarnwrap.client.font.MultilineText description() { return new yarnwrap.client.font.MultilineText(net.minecraft.client.realms.gui.screen.RealmsGenericErrorScreen.description); }
// public static void description(yarnwrap.client.font.MultilineText value, ) { net.minecraft.client.realms.gui.screen.RealmsGenericErrorScreen.description = value.wrapperContained; }

public RealmsGenericErrorScreen(yarnwrap.text.Text title,yarnwrap.text.Text description,yarnwrap.client.gui.screen.Screen parent) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsGenericErrorScreen(title.wrapperContained,description.wrapperContained,parent.wrapperContained); }
public RealmsGenericErrorScreen(yarnwrap.text.Text description,yarnwrap.client.gui.screen.Screen parent) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsGenericErrorScreen(description.wrapperContained,parent.wrapperContained); }
public RealmsGenericErrorScreen(yarnwrap.client.realms.exception.RealmsServiceException realmsServiceException,yarnwrap.client.gui.screen.Screen parent) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsGenericErrorScreen(realmsServiceException.wrapperContained,parent.wrapperContained); }
// public Object getErrorMessages(yarnwrap.text.Text description) { return wrapperContained.getErrorMessages(description.wrapperContained); }
// public static Object getErrorMessages(yarnwrap.text.Text description, ) { return net.minecraft.client.realms.gui.screen.RealmsGenericErrorScreen.getErrorMessages(description.wrapperContained); }
// public Object getErrorMessages(yarnwrap.text.Text title,yarnwrap.text.Text description) { return wrapperContained.getErrorMessages(title.wrapperContained,description.wrapperContained); }
// public static Object getErrorMessages(yarnwrap.text.Text title,yarnwrap.text.Text description, ) { return net.minecraft.client.realms.gui.screen.RealmsGenericErrorScreen.getErrorMessages(title.wrapperContained,description.wrapperContained); }
// public void method_25160(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_25160(button.wrapperContained); }
// public static void method_25160(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.realms.gui.screen.RealmsGenericErrorScreen.method_25160(button.wrapperContained); }
// public Object getErrorMessages(yarnwrap.client.realms.exception.RealmsServiceException exception) { return wrapperContained.getErrorMessages(exception.wrapperContained); }
// public static Object getErrorMessages(yarnwrap.client.realms.exception.RealmsServiceException exception, ) { return net.minecraft.client.realms.gui.screen.RealmsGenericErrorScreen.getErrorMessages(exception.wrapperContained); }

}