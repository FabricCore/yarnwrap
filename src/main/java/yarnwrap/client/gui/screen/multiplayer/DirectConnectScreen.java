package yarnwrap.client.gui.screen.multiplayer;
public class DirectConnectScreen { public net.minecraft.client.gui.screen.multiplayer.DirectConnectScreen wrapperContained; public DirectConnectScreen(net.minecraft.client.gui.screen.multiplayer.DirectConnectScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.booleans.BooleanConsumer callback() { return wrapperContained.callback; }
// public void callback(it.unimi.dsi.fastutil.booleans.BooleanConsumer value) { wrapperContained.callback = value; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.client.network.ServerInfo serverEntry() { return new yarnwrap.client.network.ServerInfo(wrapperContained.serverEntry); }
// public void serverEntry(yarnwrap.client.network.ServerInfo value) { wrapperContained.serverEntry = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ButtonWidget selectServerButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.selectServerButton); }
// public void selectServerButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.selectServerButton = value.wrapperContained; }
// public yarnwrap.client.gui.widget.TextFieldWidget addressField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.addressField); }
// public void addressField(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.addressField = value.wrapperContained; }
// public yarnwrap.text.Text ENTER_IP_TEXT() { return new yarnwrap.text.Text(wrapperContained.ENTER_IP_TEXT); }
// public void ENTER_IP_TEXT(yarnwrap.text.Text value) { wrapperContained.ENTER_IP_TEXT = value.wrapperContained; }
public DirectConnectScreen(yarnwrap.client.gui.screen.Screen parent,it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,yarnwrap.client.network.ServerInfo server) { this.wrapperContained = new net.minecraft.client.gui.screen.multiplayer.DirectConnectScreen(parent.wrapperContained,callback,server.wrapperContained); }
// public void method_19376(java.lang.String text) { wrapperContained.method_19376(text); }
// public void method_19812(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19812(button.wrapperContained); }
// public void method_19813(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19813(button.wrapperContained); }
// public void saveAndClose() { wrapperContained.saveAndClose(); }
// public void onAddressFieldChanged() { wrapperContained.onAddressFieldChanged(); }

}