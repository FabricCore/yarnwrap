package yarnwrap.client.realms.gui;
public class RealmsPopups { public net.minecraft.client.realms.gui.RealmsPopups wrapperContained; public RealmsPopups(net.minecraft.client.realms.gui.RealmsPopups wrapperContained) { this.wrapperContained = wrapperContained; }

// public int INFO_TEXT_COLOR() { return wrapperContained.INFO_TEXT_COLOR; }
// public yarnwrap.text.Text INFO_TEXT() { return new yarnwrap.text.Text(wrapperContained.INFO_TEXT); }
// public yarnwrap.text.Text WARNING_TEXT() { return new yarnwrap.text.Text(wrapperContained.WARNING_TEXT); }
public yarnwrap.client.gui.screen.PopupScreen createInfoPopup(yarnwrap.client.gui.screen.Screen parent,yarnwrap.text.Text message,java.util.function.Consumer onContinuePressed) { return new yarnwrap.client.gui.screen.PopupScreen(wrapperContained.createInfoPopup(parent.wrapperContained,message.wrapperContained,onContinuePressed)); }
public yarnwrap.client.gui.screen.PopupScreen createContinuableWarningPopup(yarnwrap.client.gui.screen.Screen parent,yarnwrap.text.Text message,java.util.function.Consumer onContinuePressed) { return new yarnwrap.client.gui.screen.PopupScreen(wrapperContained.createContinuableWarningPopup(parent.wrapperContained,message.wrapperContained,onContinuePressed)); }
public yarnwrap.client.gui.screen.PopupScreen createNonContinuableWarningPopup(yarnwrap.client.gui.screen.Screen parent,yarnwrap.text.Text message,java.util.function.Consumer onOkPressed) { return new yarnwrap.client.gui.screen.PopupScreen(wrapperContained.createNonContinuableWarningPopup(parent.wrapperContained,message.wrapperContained,onOkPressed)); }

}