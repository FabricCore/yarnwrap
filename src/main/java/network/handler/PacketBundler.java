package yarnwrap.network.handler;
public class PacketBundler { public net.minecraft.network.handler.PacketBundler wrapperContained; public PacketBundler(net.minecraft.network.handler.PacketBundler wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object currentBundler() { return wrapperContained.currentBundler; }
// public yarnwrap.network.handler.PacketBundleHandler handler() { return new yarnwrap.network.handler.PacketBundleHandler(wrapperContained.handler); }
// public void ensureNotTransitioning(yarnwrap.network.packet.Packet packet) { wrapperContained.ensureNotTransitioning(packet.wrapperContained); }

}