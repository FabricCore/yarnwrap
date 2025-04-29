package yarnwrap.server.network;
public class ServerPlayerConfigurationTask { public net.minecraft.server.network.ServerPlayerConfigurationTask wrapperContained; public ServerPlayerConfigurationTask(net.minecraft.server.network.ServerPlayerConfigurationTask wrapperContained) { this.wrapperContained = wrapperContained; }

public Object getKey() { return wrapperContained.getKey(); }
// public static Object getKey() { return net.minecraft.server.network.ServerPlayerConfigurationTask.getKey(); }
public void sendPacket(java.util.function.Consumer sender) { wrapperContained.sendPacket(sender); }
// public static void sendPacket(java.util.function.Consumer sender, ) { net.minecraft.server.network.ServerPlayerConfigurationTask.sendPacket(sender); }

}