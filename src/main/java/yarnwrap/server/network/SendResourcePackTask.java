package yarnwrap.server.network;
public class SendResourcePackTask { public net.minecraft.server.network.SendResourcePackTask wrapperContained; public SendResourcePackTask(net.minecraft.server.network.SendResourcePackTask wrapperContained) { this.wrapperContained = wrapperContained; }

public Object KEY() { return wrapperContained.KEY; }
// // public void KEY(Object value) { wrapperContained.KEY = value; }
// public Object packProperties() { return wrapperContained.packProperties; }
// // public void packProperties(Object value) { wrapperContained.packProperties = value; }
// public SendResourcePackTask(Object packProperties) { this.wrapperContained = new net.minecraft.server.network.SendResourcePackTask(packProperties); }

}