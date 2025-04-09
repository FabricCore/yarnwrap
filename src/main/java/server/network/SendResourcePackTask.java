package yarnwrap.server.network;
public class SendResourcePackTask { public net.minecraft.server.network.SendResourcePackTask wrapperContained; public SendResourcePackTask(net.minecraft.server.network.SendResourcePackTask wrapperContained) { this.wrapperContained = wrapperContained; }

public Object KEY() { return wrapperContained.KEY; }
// public Object packProperties() { return wrapperContained.packProperties; }

}