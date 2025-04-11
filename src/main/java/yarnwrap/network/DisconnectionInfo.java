package yarnwrap.network;
public class DisconnectionInfo { public net.minecraft.network.DisconnectionInfo wrapperContained; public DisconnectionInfo(net.minecraft.network.DisconnectionInfo wrapperContained) { this.wrapperContained = wrapperContained; }

public DisconnectionInfo(yarnwrap.text.Text reason) { this.wrapperContained = new net.minecraft.network.DisconnectionInfo(reason.wrapperContained); }

}