package yarnwrap.network.handler;
public class PacketBundler { public net.minecraft.network.handler.PacketBundler wrapperContained; public PacketBundler(net.minecraft.network.handler.PacketBundler wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object currentBundler() { return wrapperContained.currentBundler; }
// // public void currentBundler(Object value) { wrapperContained.currentBundler = value; }
// // public static Object currentBundler() { return net.minecraft.network.handler.PacketBundler.currentBundler; }
// // public static void currentBundler(Object value, ) { net.minecraft.network.handler.PacketBundler.currentBundler = value; }

// public yarnwrap.network.handler.PacketBundleHandler handler() { return new yarnwrap.network.handler.PacketBundleHandler(wrapperContained.handler); }
// public void handler(yarnwrap.network.handler.PacketBundleHandler value) { wrapperContained.handler = value.wrapperContained; }
// public static yarnwrap.network.handler.PacketBundleHandler handler() { return new yarnwrap.network.handler.PacketBundleHandler(net.minecraft.network.handler.PacketBundler.handler); }
// public static void handler(yarnwrap.network.handler.PacketBundleHandler value, ) { net.minecraft.network.handler.PacketBundler.handler = value.wrapperContained; }

public PacketBundler(yarnwrap.network.handler.PacketBundleHandler handler) { this.wrapperContained = new net.minecraft.network.handler.PacketBundler(handler.wrapperContained); }
// public void decode(io.netty.channel.ChannelHandlerContext context,java.lang.Object packet,java.util.List packets) { wrapperContained.decode(context,packet,packets); }
// public static void decode(io.netty.channel.ChannelHandlerContext context,java.lang.Object packet,java.util.List packets, ) { net.minecraft.network.handler.PacketBundler.decode(context,packet,packets); }
// public void ensureNotTransitioning(yarnwrap.network.packet.Packet packet) { wrapperContained.ensureNotTransitioning(packet.wrapperContained); }
// public static void ensureNotTransitioning(yarnwrap.network.packet.Packet packet, ) { net.minecraft.network.handler.PacketBundler.ensureNotTransitioning(packet.wrapperContained); }

}