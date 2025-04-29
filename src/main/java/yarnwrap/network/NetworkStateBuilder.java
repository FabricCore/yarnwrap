package yarnwrap.network;
public class NetworkStateBuilder { public net.minecraft.network.NetworkStateBuilder wrapperContained; public NetworkStateBuilder(net.minecraft.network.NetworkStateBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.NetworkPhase type() { return new yarnwrap.network.NetworkPhase(wrapperContained.type); }
// public void type(yarnwrap.network.NetworkPhase value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.network.NetworkPhase type() { return new yarnwrap.network.NetworkPhase(net.minecraft.network.NetworkStateBuilder.type); }
// public static void type(yarnwrap.network.NetworkPhase value, ) { net.minecraft.network.NetworkStateBuilder.type = value.wrapperContained; }

// public yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(wrapperContained.side); }
// public void side(yarnwrap.network.NetworkSide value) { wrapperContained.side = value.wrapperContained; }
// public static yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(net.minecraft.network.NetworkStateBuilder.side); }
// public static void side(yarnwrap.network.NetworkSide value, ) { net.minecraft.network.NetworkStateBuilder.side = value.wrapperContained; }

// public java.util.List packetTypes() { return wrapperContained.packetTypes; }
// public void packetTypes(java.util.List value) { wrapperContained.packetTypes = value; }
// public static java.util.List packetTypes() { return net.minecraft.network.NetworkStateBuilder.packetTypes; }
// public static void packetTypes(java.util.List value, ) { net.minecraft.network.NetworkStateBuilder.packetTypes = value; }

// public yarnwrap.network.handler.PacketBundleHandler bundleHandler() { return new yarnwrap.network.handler.PacketBundleHandler(wrapperContained.bundleHandler); }
// public void bundleHandler(yarnwrap.network.handler.PacketBundleHandler value) { wrapperContained.bundleHandler = value.wrapperContained; }
// public static yarnwrap.network.handler.PacketBundleHandler bundleHandler() { return new yarnwrap.network.handler.PacketBundleHandler(net.minecraft.network.NetworkStateBuilder.bundleHandler); }
// public static void bundleHandler(yarnwrap.network.handler.PacketBundleHandler value, ) { net.minecraft.network.NetworkStateBuilder.bundleHandler = value.wrapperContained; }

public NetworkStateBuilder(yarnwrap.network.NetworkPhase type,yarnwrap.network.NetworkSide side) { this.wrapperContained = new net.minecraft.network.NetworkStateBuilder(type.wrapperContained,side.wrapperContained); }
public Object buildFactory() { return wrapperContained.buildFactory(); }
// public static Object buildFactory() { return net.minecraft.network.NetworkStateBuilder.buildFactory(); }
public yarnwrap.network.NetworkState build(java.util.function.Function bufUpgrader) { return new yarnwrap.network.NetworkState(wrapperContained.build(bufUpgrader)); }
// public static yarnwrap.network.NetworkState build(java.util.function.Function bufUpgrader, ) { return new yarnwrap.network.NetworkState(net.minecraft.network.NetworkStateBuilder.build(bufUpgrader)); }
// public yarnwrap.network.codec.PacketCodec createCodec(java.util.function.Function bufUpgrader,java.util.List packetTypes) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createCodec(bufUpgrader,packetTypes)); }
// public static yarnwrap.network.codec.PacketCodec createCodec(java.util.function.Function bufUpgrader,java.util.List packetTypes, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.NetworkStateBuilder.createCodec(bufUpgrader,packetTypes)); }
// public Object c2s(yarnwrap.network.NetworkPhase type,java.util.function.Consumer registrar) { return wrapperContained.c2s(type.wrapperContained,registrar); }
// public static Object c2s(yarnwrap.network.NetworkPhase type,java.util.function.Consumer registrar, ) { return net.minecraft.network.NetworkStateBuilder.c2s(type.wrapperContained,registrar); }
// public Object build(yarnwrap.network.NetworkPhase type,yarnwrap.network.NetworkSide side,java.util.function.Consumer registrar) { return wrapperContained.build(type.wrapperContained,side.wrapperContained,registrar); }
// public static Object build(yarnwrap.network.NetworkPhase type,yarnwrap.network.NetworkSide side,java.util.function.Consumer registrar, ) { return net.minecraft.network.NetworkStateBuilder.build(type.wrapperContained,side.wrapperContained,registrar); }
public yarnwrap.network.NetworkStateBuilder addBundle(yarnwrap.network.packet.PacketType id,java.util.function.Function bundler,yarnwrap.network.packet.BundleSplitterPacket splitter) { return new yarnwrap.network.NetworkStateBuilder(wrapperContained.addBundle(id.wrapperContained,bundler,splitter.wrapperContained)); }
// public static yarnwrap.network.NetworkStateBuilder addBundle(yarnwrap.network.packet.PacketType id,java.util.function.Function bundler,yarnwrap.network.packet.BundleSplitterPacket splitter, ) { return new yarnwrap.network.NetworkStateBuilder(net.minecraft.network.NetworkStateBuilder.addBundle(id.wrapperContained,bundler,splitter.wrapperContained)); }
public yarnwrap.network.NetworkStateBuilder add(yarnwrap.network.packet.PacketType id,yarnwrap.network.codec.PacketCodec codec) { return new yarnwrap.network.NetworkStateBuilder(wrapperContained.add(id.wrapperContained,codec.wrapperContained)); }
// public static yarnwrap.network.NetworkStateBuilder add(yarnwrap.network.packet.PacketType id,yarnwrap.network.codec.PacketCodec codec, ) { return new yarnwrap.network.NetworkStateBuilder(net.minecraft.network.NetworkStateBuilder.add(id.wrapperContained,codec.wrapperContained)); }
// public Object s2c(yarnwrap.network.NetworkPhase type,java.util.function.Consumer registrar) { return wrapperContained.s2c(type.wrapperContained,registrar); }
// public static Object s2c(yarnwrap.network.NetworkPhase type,java.util.function.Consumer registrar, ) { return net.minecraft.network.NetworkStateBuilder.s2c(type.wrapperContained,registrar); }

}