package yarnwrap.network.listener;
public class ServerCrashSafePacketListener { public net.minecraft.network.listener.ServerCrashSafePacketListener wrapperContained; public ServerCrashSafePacketListener(net.minecraft.network.listener.ServerCrashSafePacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }

}