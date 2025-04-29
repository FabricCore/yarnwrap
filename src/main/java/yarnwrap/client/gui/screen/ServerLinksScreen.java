package yarnwrap.client.gui.screen;
public class ServerLinksScreen { public net.minecraft.client.gui.screen.ServerLinksScreen wrapperContained; public ServerLinksScreen(net.minecraft.client.gui.screen.ServerLinksScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public int LIST_WIDTH() { return wrapperContained.LIST_WIDTH; }
// public void LIST_WIDTH(int value) { wrapperContained.LIST_WIDTH = value; }
// public static int LIST_WIDTH() { return net.minecraft.client.gui.screen.ServerLinksScreen.LIST_WIDTH; }
// public static void LIST_WIDTH(int value, ) { net.minecraft.client.gui.screen.ServerLinksScreen.LIST_WIDTH = value; }

// public int ENTRY_HEIGHT() { return wrapperContained.ENTRY_HEIGHT; }
// public void ENTRY_HEIGHT(int value) { wrapperContained.ENTRY_HEIGHT = value; }
// public static int ENTRY_HEIGHT() { return net.minecraft.client.gui.screen.ServerLinksScreen.ENTRY_HEIGHT; }
// public static void ENTRY_HEIGHT(int value, ) { net.minecraft.client.gui.screen.ServerLinksScreen.ENTRY_HEIGHT = value; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ServerLinksScreen.TITLE); }
// public static void TITLE(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ServerLinksScreen.TITLE = value.wrapperContained; }

// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.gui.screen.ServerLinksScreen.parent); }
// public static void parent(yarnwrap.client.gui.screen.Screen value, ) { net.minecraft.client.gui.screen.ServerLinksScreen.parent = value.wrapperContained; }

// public Object list() { return wrapperContained.list; }
// // public void list(Object value) { wrapperContained.list = value; }
// // public static Object list() { return net.minecraft.client.gui.screen.ServerLinksScreen.list; }
// // public static void list(Object value, ) { net.minecraft.client.gui.screen.ServerLinksScreen.list = value; }

// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layoutWidget() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layoutWidget); }
// public void layoutWidget(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.layoutWidget = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.ThreePartsLayoutWidget layoutWidget() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(net.minecraft.client.gui.screen.ServerLinksScreen.layoutWidget); }
// public static void layoutWidget(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value, ) { net.minecraft.client.gui.screen.ServerLinksScreen.layoutWidget = value.wrapperContained; }

// public yarnwrap.server.ServerLinks serverLinks() { return new yarnwrap.server.ServerLinks(wrapperContained.serverLinks); }
// public void serverLinks(yarnwrap.server.ServerLinks value) { wrapperContained.serverLinks = value.wrapperContained; }
// public static yarnwrap.server.ServerLinks serverLinks() { return new yarnwrap.server.ServerLinks(net.minecraft.client.gui.screen.ServerLinksScreen.serverLinks); }
// public static void serverLinks(yarnwrap.server.ServerLinks value, ) { net.minecraft.client.gui.screen.ServerLinksScreen.serverLinks = value.wrapperContained; }

public ServerLinksScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.server.ServerLinks serverLinks) { this.wrapperContained = new net.minecraft.client.gui.screen.ServerLinksScreen(parent.wrapperContained,serverLinks.wrapperContained); }
// public void method_60875(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_60875(button.wrapperContained); }
// public static void method_60875(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ServerLinksScreen.method_60875(button.wrapperContained); }
// public void method_60876(yarnwrap.client.gui.screen.ServerLinksScreen child) { wrapperContained.method_60876(child.wrapperContained); }
// public static void method_60876(yarnwrap.client.gui.screen.ServerLinksScreen child, ) { net.minecraft.client.gui.screen.ServerLinksScreen.method_60876(child.wrapperContained); }

}