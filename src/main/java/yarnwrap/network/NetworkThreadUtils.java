package yarnwrap.network;
public class NetworkThreadUtils { public net.minecraft.network.NetworkThreadUtils wrapperContained; public NetworkThreadUtils(net.minecraft.network.NetworkThreadUtils wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.network.NetworkThreadUtils.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.network.NetworkThreadUtils.LOGGER = value; }

// public void forceMainThread(yarnwrap.network.packet.Packet packet,yarnwrap.network.listener.PacketListener listener,yarnwrap.server.world.ServerWorld world) { wrapperContained.forceMainThread(packet.wrapperContained,listener.wrapperContained,world.wrapperContained); }
// public static void forceMainThread(yarnwrap.network.packet.Packet packet,yarnwrap.network.listener.PacketListener listener,yarnwrap.server.world.ServerWorld world, ) { net.minecraft.network.NetworkThreadUtils.forceMainThread(packet.wrapperContained,listener.wrapperContained,world.wrapperContained); }
// public void forceMainThread(yarnwrap.network.packet.Packet packet,yarnwrap.network.listener.PacketListener listener,yarnwrap.util.thread.ThreadExecutor engine) { wrapperContained.forceMainThread(packet.wrapperContained,listener.wrapperContained,engine.wrapperContained); }
// public static void forceMainThread(yarnwrap.network.packet.Packet packet,yarnwrap.network.listener.PacketListener listener,yarnwrap.util.thread.ThreadExecutor engine, ) { net.minecraft.network.NetworkThreadUtils.forceMainThread(packet.wrapperContained,listener.wrapperContained,engine.wrapperContained); }
// public void fillCrashReport(yarnwrap.util.crash.CrashReport report,yarnwrap.network.listener.PacketListener listener,yarnwrap.network.packet.Packet packet) { wrapperContained.fillCrashReport(report.wrapperContained,listener.wrapperContained,packet.wrapperContained); }
// public static void fillCrashReport(yarnwrap.util.crash.CrashReport report,yarnwrap.network.listener.PacketListener listener,yarnwrap.network.packet.Packet packet, ) { net.minecraft.network.NetworkThreadUtils.fillCrashReport(report.wrapperContained,listener.wrapperContained,packet.wrapperContained); }
// public yarnwrap.util.crash.CrashException createCrashException(java.lang.Exception exception,yarnwrap.network.packet.Packet packet,yarnwrap.network.listener.PacketListener listener) { return new yarnwrap.util.crash.CrashException(wrapperContained.createCrashException(exception,packet.wrapperContained,listener.wrapperContained)); }
// public static yarnwrap.util.crash.CrashException createCrashException(java.lang.Exception exception,yarnwrap.network.packet.Packet packet,yarnwrap.network.listener.PacketListener listener, ) { return new yarnwrap.util.crash.CrashException(net.minecraft.network.NetworkThreadUtils.createCrashException(exception,packet.wrapperContained,listener.wrapperContained)); }

}