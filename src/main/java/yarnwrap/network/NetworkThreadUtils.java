package yarnwrap.network;
public class NetworkThreadUtils { public net.minecraft.network.NetworkThreadUtils wrapperContained; public NetworkThreadUtils(net.minecraft.network.NetworkThreadUtils wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public void forceMainThread(yarnwrap.network.packet.Packet packet,yarnwrap.network.listener.PacketListener listener,yarnwrap.server.world.ServerWorld world) { wrapperContained.forceMainThread(packet.wrapperContained,listener.wrapperContained,world.wrapperContained); }
public void forceMainThread(yarnwrap.network.packet.Packet packet,yarnwrap.network.listener.PacketListener listener,yarnwrap.util.thread.ThreadExecutor engine) { wrapperContained.forceMainThread(packet.wrapperContained,listener.wrapperContained,engine.wrapperContained); }
public void fillCrashReport(yarnwrap.util.crash.CrashReport report,yarnwrap.network.listener.PacketListener listener,yarnwrap.network.packet.Packet packet) { wrapperContained.fillCrashReport(report.wrapperContained,listener.wrapperContained,packet.wrapperContained); }
public yarnwrap.util.crash.CrashException createCrashException(java.lang.Exception exception,yarnwrap.network.packet.Packet packet,yarnwrap.network.listener.PacketListener listener) { return new yarnwrap.util.crash.CrashException(wrapperContained.createCrashException(exception,packet.wrapperContained,listener.wrapperContained)); }

}