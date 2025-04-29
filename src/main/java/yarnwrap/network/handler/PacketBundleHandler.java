package yarnwrap.network.handler;
public class PacketBundleHandler { public net.minecraft.network.handler.PacketBundleHandler wrapperContained; public PacketBundleHandler(net.minecraft.network.handler.PacketBundleHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_PACKETS() { return wrapperContained.MAX_PACKETS; }
// public void MAX_PACKETS(int value) { wrapperContained.MAX_PACKETS = value; }
public static int MAX_PACKETS() { return net.minecraft.network.handler.PacketBundleHandler.MAX_PACKETS; }
// public static void MAX_PACKETS(int value, ) { net.minecraft.network.handler.PacketBundleHandler.MAX_PACKETS = value; }

// public yarnwrap.network.handler.PacketBundleHandler create(yarnwrap.network.packet.PacketType id,java.util.function.Function bundleFunction,yarnwrap.network.packet.BundleSplitterPacket splitter) { return new yarnwrap.network.handler.PacketBundleHandler(wrapperContained.create(id.wrapperContained,bundleFunction,splitter.wrapperContained)); }
// public static yarnwrap.network.handler.PacketBundleHandler create(yarnwrap.network.packet.PacketType id,java.util.function.Function bundleFunction,yarnwrap.network.packet.BundleSplitterPacket splitter, ) { return new yarnwrap.network.handler.PacketBundleHandler(net.minecraft.network.handler.PacketBundleHandler.create(id.wrapperContained,bundleFunction,splitter.wrapperContained)); }
public Object createBundler(yarnwrap.network.packet.Packet splitter) { return wrapperContained.createBundler(splitter.wrapperContained); }
// public static Object createBundler(yarnwrap.network.packet.Packet splitter, ) { return net.minecraft.network.handler.PacketBundleHandler.createBundler(splitter.wrapperContained); }
public void forEachPacket(yarnwrap.network.packet.Packet packet,java.util.function.Consumer consumer) { wrapperContained.forEachPacket(packet.wrapperContained,consumer); }
// public static void forEachPacket(yarnwrap.network.packet.Packet packet,java.util.function.Consumer consumer, ) { net.minecraft.network.handler.PacketBundleHandler.forEachPacket(packet.wrapperContained,consumer); }

}