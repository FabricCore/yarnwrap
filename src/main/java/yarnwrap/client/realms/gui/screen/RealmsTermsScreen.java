package yarnwrap.client.realms.gui.screen;
public class RealmsTermsScreen { public net.minecraft.client.realms.gui.screen.RealmsTermsScreen wrapperContained; public RealmsTermsScreen(net.minecraft.client.realms.gui.screen.RealmsTermsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.realms.dto.RealmsServer realmsServer() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.realmsServer); }
// public void realmsServer(yarnwrap.client.realms.dto.RealmsServer value) { wrapperContained.realmsServer = value.wrapperContained; }
// public boolean onLink() { return wrapperContained.onLink; }
// public void onLink(boolean value) { wrapperContained.onLink = value; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public yarnwrap.text.Text SENTENCE_ONE_TEXT() { return new yarnwrap.text.Text(wrapperContained.SENTENCE_ONE_TEXT); }
// public void SENTENCE_ONE_TEXT(yarnwrap.text.Text value) { wrapperContained.SENTENCE_ONE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text SENTENCE_TWO_TEXT() { return new yarnwrap.text.Text(wrapperContained.SENTENCE_TWO_TEXT); }
// public void SENTENCE_TWO_TEXT(yarnwrap.text.Text value) { wrapperContained.SENTENCE_TWO_TEXT = value.wrapperContained; }
public RealmsTermsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.realms.dto.RealmsServer realmsServer) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsTermsScreen(parent.wrapperContained,realmsServer.wrapperContained); }
// public void agreedToTos() { wrapperContained.agreedToTos(); }
// public void method_25274(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_25274(button.wrapperContained); }
// public void method_25275(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_25275(button.wrapperContained); }

}