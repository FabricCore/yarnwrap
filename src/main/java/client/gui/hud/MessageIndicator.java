package yarnwrap.client.gui.hud;
public class MessageIndicator { public net.minecraft.client.gui.hud.MessageIndicator wrapperContained; public MessageIndicator(net.minecraft.client.gui.hud.MessageIndicator wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String loggedName() { return wrapperContained.loggedName; }
// public yarnwrap.text.Text NOT_SECURE_TEXT() { return new yarnwrap.text.Text(wrapperContained.NOT_SECURE_TEXT); }
// public yarnwrap.text.Text MODIFIED_TEXT() { return new yarnwrap.text.Text(wrapperContained.MODIFIED_TEXT); }
// public int NOT_SECURE_COLOR() { return wrapperContained.NOT_SECURE_COLOR; }
// public int MODIFIED_COLOR() { return wrapperContained.MODIFIED_COLOR; }
// public yarnwrap.text.Text SYSTEM_TEXT() { return new yarnwrap.text.Text(wrapperContained.SYSTEM_TEXT); }
// public yarnwrap.text.Text SINGLE_PLAYER_TEXT() { return new yarnwrap.text.Text(wrapperContained.SINGLE_PLAYER_TEXT); }
// public yarnwrap.client.gui.hud.MessageIndicator SINGLE_PLAYER() { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.SINGLE_PLAYER); }
// public yarnwrap.text.Text ERROR_TEXT() { return new yarnwrap.text.Text(wrapperContained.ERROR_TEXT); }
// public java.lang.String loggedName() { return wrapperContained.loggedName(); }
public yarnwrap.client.gui.hud.MessageIndicator notSecure() { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.notSecure()); }
public yarnwrap.client.gui.hud.MessageIndicator modified(java.lang.String originalText) { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.modified(originalText)); }
public yarnwrap.client.gui.hud.MessageIndicator system() { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.system()); }
public yarnwrap.client.gui.hud.MessageIndicator singlePlayer() { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.singlePlayer()); }
public yarnwrap.client.gui.hud.MessageIndicator chatError() { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.chatError()); }

}