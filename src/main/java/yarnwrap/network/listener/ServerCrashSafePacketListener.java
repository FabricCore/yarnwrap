package yarnwrap.network.listener;
public class ServerCrashSafePacketListener { public net.minecraft.network.listener.ServerCrashSafePacketListener wrapperContained; public ServerCrashSafePacketListener(net.minecraft.network.listener.ServerCrashSafePacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public static org.slf4j.Logger LOGGER() { return net.minecraft.network.listener.ServerCrashSafePacketListener.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.network.listener.ServerCrashSafePacketListener.LOGGER = value; }


}