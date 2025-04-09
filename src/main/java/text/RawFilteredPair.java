package yarnwrap.text;
public class RawFilteredPair { public net.minecraft.text.RawFilteredPair wrapperContained; public RawFilteredPair(net.minecraft.text.RawFilteredPair wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.RawFilteredPair of(yarnwrap.server.filter.FilteredMessage message) { return new yarnwrap.text.RawFilteredPair(wrapperContained.of(message.wrapperContained)); }
public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec baseCodec) { return wrapperContained.createCodec(baseCodec); }
public yarnwrap.text.RawFilteredPair of(java.lang.Object raw) { return new yarnwrap.text.RawFilteredPair(wrapperContained.of(raw)); }
public yarnwrap.text.RawFilteredPair map(java.util.function.Function mapper) { return new yarnwrap.text.RawFilteredPair(wrapperContained.map(mapper)); }
public yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.network.codec.PacketCodec basePacketCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(basePacketCodec.wrapperContained)); }
public java.lang.Object get(boolean shouldFilter) { return wrapperContained.get(shouldFilter); }
public java.util.Optional resolve(java.util.function.Function resolver) { return wrapperContained.resolve(resolver); }

}