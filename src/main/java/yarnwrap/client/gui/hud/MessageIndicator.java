package yarnwrap.client.gui.hud;
public class MessageIndicator { public net.minecraft.client.gui.hud.MessageIndicator wrapperContained; public MessageIndicator(net.minecraft.client.gui.hud.MessageIndicator wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String loggedName() { return wrapperContained.loggedName; }
// public void loggedName(java.lang.String value) { wrapperContained.loggedName = value; }
// public yarnwrap.text.Text NOT_SECURE_TEXT() { return new yarnwrap.text.Text(wrapperContained.NOT_SECURE_TEXT); }
// public void NOT_SECURE_TEXT(yarnwrap.text.Text value) { wrapperContained.NOT_SECURE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text MODIFIED_TEXT() { return new yarnwrap.text.Text(wrapperContained.MODIFIED_TEXT); }
// public void MODIFIED_TEXT(yarnwrap.text.Text value) { wrapperContained.MODIFIED_TEXT = value.wrapperContained; }
// public int NOT_SECURE_COLOR() { return wrapperContained.NOT_SECURE_COLOR; }
// public void NOT_SECURE_COLOR(int value) { wrapperContained.NOT_SECURE_COLOR = value; }
// public int MODIFIED_COLOR() { return wrapperContained.MODIFIED_COLOR; }
// public void MODIFIED_COLOR(int value) { wrapperContained.MODIFIED_COLOR = value; }
// public yarnwrap.text.Text SYSTEM_TEXT() { return new yarnwrap.text.Text(wrapperContained.SYSTEM_TEXT); }
// public void SYSTEM_TEXT(yarnwrap.text.Text value) { wrapperContained.SYSTEM_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text SINGLE_PLAYER_TEXT() { return new yarnwrap.text.Text(wrapperContained.SINGLE_PLAYER_TEXT); }
// public void SINGLE_PLAYER_TEXT(yarnwrap.text.Text value) { wrapperContained.SINGLE_PLAYER_TEXT = value.wrapperContained; }
// public yarnwrap.client.gui.hud.MessageIndicator SINGLE_PLAYER() { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.SINGLE_PLAYER); }
// public void SINGLE_PLAYER(yarnwrap.client.gui.hud.MessageIndicator value) { wrapperContained.SINGLE_PLAYER = value.wrapperContained; }
// public yarnwrap.text.Text ERROR_TEXT() { return new yarnwrap.text.Text(wrapperContained.ERROR_TEXT); }
// public void ERROR_TEXT(yarnwrap.text.Text value) { wrapperContained.ERROR_TEXT = value.wrapperContained; }
// public java.lang.String loggedName() { return wrapperContained.loggedName(); }
public yarnwrap.client.gui.hud.MessageIndicator notSecure() { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.notSecure()); }
public yarnwrap.client.gui.hud.MessageIndicator modified(java.lang.String originalText) { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.modified(originalText)); }
public yarnwrap.client.gui.hud.MessageIndicator system() { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.system()); }
public yarnwrap.client.gui.hud.MessageIndicator singlePlayer() { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.singlePlayer()); }
public yarnwrap.client.gui.hud.MessageIndicator chatError() { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.chatError()); }

}