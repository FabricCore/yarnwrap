package yarnwrap.network;
public class NetworkStateBuilder { public net.minecraft.network.NetworkStateBuilder wrapperContained; public NetworkStateBuilder(net.minecraft.network.NetworkStateBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.NetworkPhase type() { return new yarnwrap.network.NetworkPhase(wrapperContained.type); }
// public yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(wrapperContained.side); }
// public java.util.List packetTypes() { return wrapperContained.packetTypes; }
// public yarnwrap.network.handler.PacketBundleHandler bundleHandler() { return new yarnwrap.network.handler.PacketBundleHandler(wrapperContained.bundleHandler); }
public Object buildFactory() { return wrapperContained.buildFactory(); }
public yarnwrap.network.NetworkState build(java.util.function.Function bufUpgrader) { return new yarnwrap.network.NetworkState(wrapperContained.build(bufUpgrader)); }
// public yarnwrap.network.codec.PacketCodec createCodec(java.util.function.Function bufUpgrader,java.util.List packetTypes) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createCodec(bufUpgrader,packetTypes)); }
public Object c2s(yarnwrap.network.NetworkPhase type,java.util.function.Consumer registrar) { return wrapperContained.c2s(type.wrapperContained,registrar); }
// public Object build(yarnwrap.network.NetworkPhase type,yarnwrap.network.NetworkSide side,java.util.function.Consumer registrar) { return wrapperContained.build(type.wrapperContained,side.wrapperContained,registrar); }
public yarnwrap.network.NetworkStateBuilder addBundle(yarnwrap.network.packet.PacketType id,java.util.function.Function bundler,yarnwrap.network.packet.BundleSplitterPacket splitter) { return new yarnwrap.network.NetworkStateBuilder(wrapperContained.addBundle(id.wrapperContained,bundler,splitter.wrapperContained)); }
public yarnwrap.network.NetworkStateBuilder add(yarnwrap.network.packet.PacketType id,yarnwrap.network.codec.PacketCodec codec) { return new yarnwrap.network.NetworkStateBuilder(wrapperContained.add(id.wrapperContained,codec.wrapperContained)); }
public Object s2c(yarnwrap.network.NetworkPhase type,java.util.function.Consumer registrar) { return wrapperContained.s2c(type.wrapperContained,registrar); }

}