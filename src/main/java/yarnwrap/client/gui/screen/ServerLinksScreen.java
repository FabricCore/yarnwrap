package yarnwrap.client.gui.screen;
public class ServerLinksScreen { public net.minecraft.client.gui.screen.ServerLinksScreen wrapperContained; public ServerLinksScreen(net.minecraft.client.gui.screen.ServerLinksScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public int LIST_WIDTH() { return wrapperContained.LIST_WIDTH; }
// public void LIST_WIDTH(int value) { wrapperContained.LIST_WIDTH = value; }
// public int ENTRY_HEIGHT() { return wrapperContained.ENTRY_HEIGHT; }
// public void ENTRY_HEIGHT(int value) { wrapperContained.ENTRY_HEIGHT = value; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public Object list() { return wrapperContained.list; }
// // public void list(Object value) { wrapperContained.list = value; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layoutWidget() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layoutWidget); }
// public void layoutWidget(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.layoutWidget = value.wrapperContained; }
// public yarnwrap.server.ServerLinks serverLinks() { return new yarnwrap.server.ServerLinks(wrapperContained.serverLinks); }
// public void serverLinks(yarnwrap.server.ServerLinks value) { wrapperContained.serverLinks = value.wrapperContained; }
public ServerLinksScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.server.ServerLinks serverLinks) { this.wrapperContained = new net.minecraft.client.gui.screen.ServerLinksScreen(parent.wrapperContained,serverLinks.wrapperContained); }
// public void method_60875(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_60875(button.wrapperContained); }
// public void method_60876(yarnwrap.client.gui.screen.ServerLinksScreen child) { wrapperContained.method_60876(child.wrapperContained); }

}