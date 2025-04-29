package yarnwrap.client.gui.screen;
public class ReconfiguringScreen { public net.minecraft.client.gui.screen.ReconfiguringScreen wrapperContained; public ReconfiguringScreen(net.minecraft.client.gui.screen.ReconfiguringScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public void connection(yarnwrap.network.ClientConnection value) { wrapperContained.connection = value.wrapperContained; }
// public static yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(net.minecraft.client.gui.screen.ReconfiguringScreen.connection); }
// public static void connection(yarnwrap.network.ClientConnection value, ) { net.minecraft.client.gui.screen.ReconfiguringScreen.connection = value.wrapperContained; }

// public yarnwrap.client.gui.widget.ButtonWidget disconnectButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.disconnectButton); }
// public void disconnectButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.disconnectButton = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.ButtonWidget disconnectButton() { return new yarnwrap.client.gui.widget.ButtonWidget(net.minecraft.client.gui.screen.ReconfiguringScreen.disconnectButton); }
// public static void disconnectButton(yarnwrap.client.gui.widget.ButtonWidget value, ) { net.minecraft.client.gui.screen.ReconfiguringScreen.disconnectButton = value.wrapperContained; }

// public int tick() { return wrapperContained.tick; }
// public void tick(int value) { wrapperContained.tick = value; }
// public static int tick() { return net.minecraft.client.gui.screen.ReconfiguringScreen.tick; }
// public static void tick(int value, ) { net.minecraft.client.gui.screen.ReconfiguringScreen.tick = value; }

// public yarnwrap.client.gui.widget.DirectionalLayoutWidget layout() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.DirectionalLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.DirectionalLayoutWidget layout() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(net.minecraft.client.gui.screen.ReconfiguringScreen.layout); }
// public static void layout(yarnwrap.client.gui.widget.DirectionalLayoutWidget value, ) { net.minecraft.client.gui.screen.ReconfiguringScreen.layout = value.wrapperContained; }

public ReconfiguringScreen(yarnwrap.text.Text title,yarnwrap.network.ClientConnection connection) { this.wrapperContained = new net.minecraft.client.gui.screen.ReconfiguringScreen(title.wrapperContained,connection.wrapperContained); }
// public void method_52757(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_52757(button.wrapperContained); }
// public static void method_52757(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ReconfiguringScreen.method_52757(button.wrapperContained); }
// public void method_52758(yarnwrap.client.gui.screen.ReconfiguringScreen child) { wrapperContained.method_52758(child.wrapperContained); }
// public static void method_52758(yarnwrap.client.gui.screen.ReconfiguringScreen child, ) { net.minecraft.client.gui.screen.ReconfiguringScreen.method_52758(child.wrapperContained); }

}