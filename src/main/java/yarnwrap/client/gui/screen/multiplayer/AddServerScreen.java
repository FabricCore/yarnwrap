package yarnwrap.client.gui.screen.multiplayer;
public class AddServerScreen { public net.minecraft.client.gui.screen.multiplayer.AddServerScreen wrapperContained; public AddServerScreen(net.minecraft.client.gui.screen.multiplayer.AddServerScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.booleans.BooleanConsumer callback() { return wrapperContained.callback; }
// public void callback(it.unimi.dsi.fastutil.booleans.BooleanConsumer value) { wrapperContained.callback = value; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.client.network.ServerInfo server() { return new yarnwrap.client.network.ServerInfo(wrapperContained.server); }
// public void server(yarnwrap.client.network.ServerInfo value) { wrapperContained.server = value.wrapperContained; }
// public yarnwrap.client.gui.widget.TextFieldWidget serverNameField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.serverNameField); }
// public void serverNameField(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.serverNameField = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ButtonWidget addButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.addButton); }
// public void addButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.addButton = value.wrapperContained; }
// public yarnwrap.client.gui.widget.TextFieldWidget addressField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.addressField); }
// public void addressField(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.addressField = value.wrapperContained; }
// public yarnwrap.text.Text ENTER_NAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.ENTER_NAME_TEXT); }
// public void ENTER_NAME_TEXT(yarnwrap.text.Text value) { wrapperContained.ENTER_NAME_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text ENTER_IP_TEXT() { return new yarnwrap.text.Text(wrapperContained.ENTER_IP_TEXT); }
// public void ENTER_IP_TEXT(yarnwrap.text.Text value) { wrapperContained.ENTER_IP_TEXT = value.wrapperContained; }
public AddServerScreen(yarnwrap.client.gui.screen.Screen parent,it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,yarnwrap.client.network.ServerInfo server) { this.wrapperContained = new net.minecraft.client.gui.screen.multiplayer.AddServerScreen(parent.wrapperContained,callback,server.wrapperContained); }
// public void addAndClose() { wrapperContained.addAndClose(); }
// public void method_36218(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_36218(button.wrapperContained); }
// public void method_36219(yarnwrap.client.gui.widget.CyclingButtonWidget button,Object resourcePackPolicy) { wrapperContained.method_36219(button.wrapperContained,resourcePackPolicy); }
// public void method_36220(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_36220(button.wrapperContained); }
// public void method_36221(java.lang.String address) { wrapperContained.method_36221(address); }
// public void method_36222(java.lang.String serverName) { wrapperContained.method_36222(serverName); }
// public void updateAddButton() { wrapperContained.updateAddButton(); }

}