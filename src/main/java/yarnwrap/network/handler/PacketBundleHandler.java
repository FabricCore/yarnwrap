package yarnwrap.network.handler;
public class PacketBundleHandler { public net.minecraft.network.handler.PacketBundleHandler wrapperContained; public PacketBundleHandler(net.minecraft.network.handler.PacketBundleHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_PACKETS() { return wrapperContained.MAX_PACKETS; }
// public void MAX_PACKETS(int value) { wrapperContained.MAX_PACKETS = value; }
// public yarnwrap.network.handler.PacketBundleHandler create(yarnwrap.network.packet.PacketType id,java.util.function.Function bundleFunction,yarnwrap.network.packet.BundleSplitterPacket splitter) { return new yarnwrap.network.handler.PacketBundleHandler(wrapperContained.create(id.wrapperContained,bundleFunction,splitter.wrapperContained)); }
public Object createBundler(yarnwrap.network.packet.Packet splitter) { return wrapperContained.createBundler(splitter.wrapperContained); }
public void forEachPacket(yarnwrap.network.packet.Packet packet,java.util.function.Consumer consumer) { wrapperContained.forEachPacket(packet.wrapperContained,consumer); }

}