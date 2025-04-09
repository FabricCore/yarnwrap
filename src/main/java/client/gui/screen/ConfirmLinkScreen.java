package yarnwrap.client.gui.screen;
public class ConfirmLinkScreen { public net.minecraft.client.gui.screen.ConfirmLinkScreen wrapperContained; public ConfirmLinkScreen(net.minecraft.client.gui.screen.ConfirmLinkScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean drawWarning() { return wrapperContained.drawWarning; }
// public java.lang.String link() { return wrapperContained.link; }
// public yarnwrap.text.Text WARNING() { return new yarnwrap.text.Text(wrapperContained.WARNING); }
// public yarnwrap.text.Text COPY() { return new yarnwrap.text.Text(wrapperContained.COPY); }
public void copyToClipboard() { wrapperContained.copyToClipboard(); }
// public yarnwrap.text.MutableText getConfirmText(boolean linkTrusted,java.lang.String link) { return new yarnwrap.text.MutableText(wrapperContained.getConfirmText(linkTrusted,link)); }
// public yarnwrap.text.MutableText getConfirmText(boolean linkTrusted) { return new yarnwrap.text.MutableText(wrapperContained.getConfirmText(linkTrusted)); }
public void open(yarnwrap.client.gui.screen.Screen parent,java.lang.String url) { wrapperContained.open(parent.wrapperContained,url); }
public Object opening(yarnwrap.client.gui.screen.Screen parent,java.lang.String url) { return wrapperContained.opening(parent.wrapperContained,url); }
public void open(yarnwrap.client.gui.screen.Screen parent,java.lang.String url,boolean linkTrusted) { wrapperContained.open(parent.wrapperContained,url,linkTrusted); }
public Object opening(yarnwrap.client.gui.screen.Screen parent,java.lang.String url,boolean linkTrusted) { return wrapperContained.opening(parent.wrapperContained,url,linkTrusted); }
public void open(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri) { wrapperContained.open(parent.wrapperContained,uri); }
public void open(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri,boolean linkTrusted) { wrapperContained.open(parent.wrapperContained,uri,linkTrusted); }
public Object opening(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri) { return wrapperContained.opening(parent.wrapperContained,uri); }
public Object opening(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri,boolean linkTrusted) { return wrapperContained.opening(parent.wrapperContained,uri,linkTrusted); }

}