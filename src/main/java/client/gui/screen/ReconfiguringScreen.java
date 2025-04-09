package yarnwrap.client.gui.screen;
public class ReconfiguringScreen { public net.minecraft.client.gui.screen.ReconfiguringScreen wrapperContained; public ReconfiguringScreen(net.minecraft.client.gui.screen.ReconfiguringScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public yarnwrap.client.gui.widget.ButtonWidget disconnectButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.disconnectButton); }
// public int tick() { return wrapperContained.tick; }
// public yarnwrap.client.gui.widget.DirectionalLayoutWidget layout() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.layout); }

}