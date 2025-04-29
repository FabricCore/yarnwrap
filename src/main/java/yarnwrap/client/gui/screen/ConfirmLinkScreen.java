package yarnwrap.client.gui.screen;
public class ConfirmLinkScreen { public net.minecraft.client.gui.screen.ConfirmLinkScreen wrapperContained; public ConfirmLinkScreen(net.minecraft.client.gui.screen.ConfirmLinkScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean drawWarning() { return wrapperContained.drawWarning; }
// public void drawWarning(boolean value) { wrapperContained.drawWarning = value; }
// public static boolean drawWarning() { return net.minecraft.client.gui.screen.ConfirmLinkScreen.drawWarning; }
// public static void drawWarning(boolean value, ) { net.minecraft.client.gui.screen.ConfirmLinkScreen.drawWarning = value; }

// public java.lang.String link() { return wrapperContained.link; }
// public void link(java.lang.String value) { wrapperContained.link = value; }
// public static java.lang.String link() { return net.minecraft.client.gui.screen.ConfirmLinkScreen.link; }
// public static void link(java.lang.String value, ) { net.minecraft.client.gui.screen.ConfirmLinkScreen.link = value; }

// public yarnwrap.text.Text WARNING() { return new yarnwrap.text.Text(wrapperContained.WARNING); }
// public void WARNING(yarnwrap.text.Text value) { wrapperContained.WARNING = value.wrapperContained; }
// public static yarnwrap.text.Text WARNING() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ConfirmLinkScreen.WARNING); }
// public static void WARNING(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ConfirmLinkScreen.WARNING = value.wrapperContained; }

// public yarnwrap.text.Text COPY() { return new yarnwrap.text.Text(wrapperContained.COPY); }
// public void COPY(yarnwrap.text.Text value) { wrapperContained.COPY = value.wrapperContained; }
// public static yarnwrap.text.Text COPY() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ConfirmLinkScreen.COPY); }
// public static void COPY(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ConfirmLinkScreen.COPY = value.wrapperContained; }

public ConfirmLinkScreen(it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,java.lang.String link,boolean linkTrusted) { this.wrapperContained = new net.minecraft.client.gui.screen.ConfirmLinkScreen(callback,link,linkTrusted); }
public ConfirmLinkScreen(it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,yarnwrap.text.Text title,java.lang.String link,boolean linkTrusted) { this.wrapperContained = new net.minecraft.client.gui.screen.ConfirmLinkScreen(callback,title.wrapperContained,link,linkTrusted); }
public ConfirmLinkScreen(it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,yarnwrap.text.Text title,java.net.URI link,boolean linkTrusted) { this.wrapperContained = new net.minecraft.client.gui.screen.ConfirmLinkScreen(callback,title.wrapperContained,link,linkTrusted); }
public ConfirmLinkScreen(it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,yarnwrap.text.Text title,yarnwrap.text.Text message,java.lang.String link,yarnwrap.text.Text noText,boolean linkTrusted) { this.wrapperContained = new net.minecraft.client.gui.screen.ConfirmLinkScreen(callback,title.wrapperContained,message.wrapperContained,link,noText.wrapperContained,linkTrusted); }
public ConfirmLinkScreen(it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,yarnwrap.text.Text title,yarnwrap.text.Text message,java.net.URI link,yarnwrap.text.Text noText,boolean linkTrusted) { this.wrapperContained = new net.minecraft.client.gui.screen.ConfirmLinkScreen(callback,title.wrapperContained,message.wrapperContained,link,noText.wrapperContained,linkTrusted); }
// public void method_19795(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19795(button.wrapperContained); }
// public static void method_19795(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ConfirmLinkScreen.method_19795(button.wrapperContained); }
// public void method_19796(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19796(button.wrapperContained); }
// public static void method_19796(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ConfirmLinkScreen.method_19796(button.wrapperContained); }
// public void method_19797(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19797(button.wrapperContained); }
// public static void method_19797(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ConfirmLinkScreen.method_19797(button.wrapperContained); }
public void copyToClipboard() { wrapperContained.copyToClipboard(); }
// public static void copyToClipboard() { net.minecraft.client.gui.screen.ConfirmLinkScreen.copyToClipboard(); }
// public yarnwrap.text.MutableText getConfirmText(boolean linkTrusted,java.lang.String link) { return new yarnwrap.text.MutableText(wrapperContained.getConfirmText(linkTrusted,link)); }
// public static yarnwrap.text.MutableText getConfirmText(boolean linkTrusted,java.lang.String link, ) { return new yarnwrap.text.MutableText(net.minecraft.client.gui.screen.ConfirmLinkScreen.getConfirmText(linkTrusted,link)); }
// public yarnwrap.text.MutableText getConfirmText(boolean linkTrusted) { return new yarnwrap.text.MutableText(wrapperContained.getConfirmText(linkTrusted)); }
// public static yarnwrap.text.MutableText getConfirmText(boolean linkTrusted, ) { return new yarnwrap.text.MutableText(net.minecraft.client.gui.screen.ConfirmLinkScreen.getConfirmText(linkTrusted)); }
// public void method_49622(java.lang.String confirmed) { wrapperContained.method_49622(confirmed); }
// public static void method_49622(java.lang.String confirmed, ) { net.minecraft.client.gui.screen.ConfirmLinkScreen.method_49622(confirmed); }
// public void open(yarnwrap.client.gui.screen.Screen parent,java.lang.String url) { wrapperContained.open(parent.wrapperContained,url); }
// public static void open(yarnwrap.client.gui.screen.Screen parent,java.lang.String url, ) { net.minecraft.client.gui.screen.ConfirmLinkScreen.open(parent.wrapperContained,url); }
// public void method_49624(yarnwrap.client.gui.screen.Screen button) { wrapperContained.method_49624(button.wrapperContained); }
// public static void method_49624(yarnwrap.client.gui.screen.Screen button, ) { net.minecraft.client.gui.screen.ConfirmLinkScreen.method_49624(button.wrapperContained); }
// public Object opening(yarnwrap.client.gui.screen.Screen parent,java.lang.String url) { return wrapperContained.opening(parent.wrapperContained,url); }
// public static Object opening(yarnwrap.client.gui.screen.Screen parent,java.lang.String url, ) { return net.minecraft.client.gui.screen.ConfirmLinkScreen.opening(parent.wrapperContained,url); }
// public void open(yarnwrap.client.gui.screen.Screen parent,java.lang.String url,boolean linkTrusted) { wrapperContained.open(parent.wrapperContained,url,linkTrusted); }
// public static void open(yarnwrap.client.gui.screen.Screen parent,java.lang.String url,boolean linkTrusted, ) { net.minecraft.client.gui.screen.ConfirmLinkScreen.open(parent.wrapperContained,url,linkTrusted); }
// public Object opening(yarnwrap.client.gui.screen.Screen parent,java.lang.String url,boolean linkTrusted) { return wrapperContained.opening(parent.wrapperContained,url,linkTrusted); }
// public static Object opening(yarnwrap.client.gui.screen.Screen parent,java.lang.String url,boolean linkTrusted, ) { return net.minecraft.client.gui.screen.ConfirmLinkScreen.opening(parent.wrapperContained,url,linkTrusted); }
// public void open(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri) { wrapperContained.open(parent.wrapperContained,uri); }
// public static void open(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri, ) { net.minecraft.client.gui.screen.ConfirmLinkScreen.open(parent.wrapperContained,uri); }
// public void open(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri,boolean linkTrusted) { wrapperContained.open(parent.wrapperContained,uri,linkTrusted); }
// public static void open(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri,boolean linkTrusted, ) { net.minecraft.client.gui.screen.ConfirmLinkScreen.open(parent.wrapperContained,uri,linkTrusted); }
// public void method_61035(yarnwrap.client.gui.screen.Screen button) { wrapperContained.method_61035(button.wrapperContained); }
// public static void method_61035(yarnwrap.client.gui.screen.Screen button, ) { net.minecraft.client.gui.screen.ConfirmLinkScreen.method_61035(button.wrapperContained); }
// public void method_61036(java.net.URI confirmed) { wrapperContained.method_61036(confirmed); }
// public static void method_61036(java.net.URI confirmed, ) { net.minecraft.client.gui.screen.ConfirmLinkScreen.method_61036(confirmed); }
// public Object opening(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri) { return wrapperContained.opening(parent.wrapperContained,uri); }
// public static Object opening(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri, ) { return net.minecraft.client.gui.screen.ConfirmLinkScreen.opening(parent.wrapperContained,uri); }
// public Object opening(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri,boolean linkTrusted) { return wrapperContained.opening(parent.wrapperContained,uri,linkTrusted); }
// public static Object opening(yarnwrap.client.gui.screen.Screen parent,java.net.URI uri,boolean linkTrusted, ) { return net.minecraft.client.gui.screen.ConfirmLinkScreen.opening(parent.wrapperContained,uri,linkTrusted); }

}