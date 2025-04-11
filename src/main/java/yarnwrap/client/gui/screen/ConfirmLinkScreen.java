package yarnwrap.client.gui.screen;
public class ConfirmLinkScreen { public net.minecraft.client.gui.screen.ConfirmLinkScreen wrapperContained; public ConfirmLinkScreen(net.minecraft.client.gui.screen.ConfirmLinkScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean drawWarning() { return wrapperContained.drawWarning; }
// public void drawWarning(boolean value) { wrapperContained.drawWarning = value; }
// public java.lang.String link() { return wrapperContained.link; }
// public void link(java.lang.String value) { wrapperContained.link = value; }
// public yarnwrap.text.Text WARNING() { return new yarnwrap.text.Text(wrapperContained.WARNING); }
// public void WARNING(yarnwrap.text.Text value) { wrapperContained.WARNING = value.wrapperContained; }
// public yarnwrap.text.Text COPY() { return new yarnwrap.text.Text(wrapperContained.COPY); }
// public void COPY(yarnwrap.text.Text value) { wrapperContained.COPY = value.wrapperContained; }
public ConfirmLinkScreen(it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,java.lang.String link,boolean linkTrusted) { this.wrapperContained = new net.minecraft.client.gui.screen.ConfirmLinkScreen(callback,link,linkTrusted); }
public ConfirmLinkScreen(it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,yarnwrap.text.Text title,java.lang.String link,boolean linkTrusted) { this.wrapperContained = new net.minecraft.client.gui.screen.ConfirmLinkScreen(callback,title.wrapperContained,link,linkTrusted); }
public ConfirmLinkScreen(it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,yarnwrap.text.Text title,java.net.URI link,boolean linkTrusted) { this.wrapperContained = new net.minecraft.client.gui.screen.ConfirmLinkScreen(callback,title.wrapperContained,link,linkTrusted); }
public ConfirmLinkScreen(it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,yarnwrap.text.Text title,yarnwrap.text.Text message,java.lang.String link,yarnwrap.text.Text noText,boolean linkTrusted) { this.wrapperContained = new net.minecraft.client.gui.screen.ConfirmLinkScreen(callback,title.wrapperContained,message.wrapperContained,link,noText.wrapperContained,linkTrusted); }
public ConfirmLinkScreen(it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,yarnwrap.text.Text title,yarnwrap.text.Text message,java.net.URI link,yarnwrap.text.Text noText,boolean linkTrusted) { this.wrapperContained = new net.minecraft.client.gui.screen.ConfirmLinkScreen(callback,title.wrapperContained,message.wrapperContained,link,noText.wrapperContained,linkTrusted); }
// public void method_19795(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19795(button.wrapperContained); }
// public void method_19796(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19796(button.wrapperContained); }
// public void method_19797(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19797(button.wrapperContained); }
public void copyToClipboard() { wrapperContained.copyToClipboard(); }
// public yarnwrap.text.MutableText getConfirmText(boolean linkTrusted,java.lang.String link) { return new yarnwrap.text.MutableText(wrapperContained.getConfirmText(linkTrusted,link)); }
// public yarnwrap.text.MutableText getConfirmText(boolean linkTrusted) { return new yarnwrap.text.MutableText(wrapperContained.getConfirmText(linkTrusted)); }
// public void method_49622(java.lang.String confirmed) { wrapperContained.method_49622(confirmed); }
public void open(yarnwrap.client.gui.screen.Screen parent,java.lang.String url) { wrapperContained.open(parent.wrapperContained,url); }
// public void method_49624(yarnwrap.client.gui.screen.Screen button) { wrapperContained.method_49624(button.wrapperContained); }
public Object opening(yarnwrap.client.gui.screen.Screen parent,java.lang.String url) { return wrapperContained.opening(parent.wrapperContained,url); }
public void open(yarnwrap.client.gui.screen.Screen parent,java.lang.String url,boolean linkTrusted) { wrapperContained.open(parent.wrapperContained,url,linkTrusted); }
public Object opening(yarnwrap.client.gui.screen.Screen parent,java.lang.String url,boolean linkTrusted) { return wrapperContained.opening(parent.wrapperContained,url,linkTrusted); }
public void open(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri) { wrapperContained.open(parent.wrapperContained,uri); }
public void open(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri,boolean linkTrusted) { wrapperContained.open(parent.wrapperContained,uri,linkTrusted); }
// public void method_61035(yarnwrap.client.gui.screen.Screen button) { wrapperContained.method_61035(button.wrapperContained); }
// public void method_61036(java.net.URI confirmed) { wrapperContained.method_61036(confirmed); }
public Object opening(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri) { return wrapperContained.opening(parent.wrapperContained,uri); }
public Object opening(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri,boolean linkTrusted) { return wrapperContained.opening(parent.wrapperContained,uri,linkTrusted); }

}