package yarnwrap.client.realms.gui.screen;
public class RealmsParentalConsentScreen { public net.minecraft.client.realms.gui.screen.RealmsParentalConsentScreen wrapperContained; public RealmsParentalConsentScreen(net.minecraft.client.realms.gui.screen.RealmsParentalConsentScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text PRIVACY_INFO_TEXT() { return new yarnwrap.text.Text(wrapperContained.PRIVACY_INFO_TEXT); }
// public void PRIVACY_INFO_TEXT(yarnwrap.text.Text value) { wrapperContained.PRIVACY_INFO_TEXT = value.wrapperContained; }
// public yarnwrap.client.gui.widget.DirectionalLayoutWidget layout() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.DirectionalLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.client.gui.widget.MultilineTextWidget privacyInfoWidget() { return new yarnwrap.client.gui.widget.MultilineTextWidget(wrapperContained.privacyInfoWidget); }
// public void privacyInfoWidget(yarnwrap.client.gui.widget.MultilineTextWidget value) { wrapperContained.privacyInfoWidget = value.wrapperContained; }
public RealmsParentalConsentScreen(yarnwrap.client.gui.screen.Screen parent) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsParentalConsentScreen(parent.wrapperContained); }
// public void method_54573(yarnwrap.client.realms.gui.screen.RealmsParentalConsentScreen child) { wrapperContained.method_54573(child.wrapperContained); }
// public void method_54574(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_54574(button.wrapperContained); }

}