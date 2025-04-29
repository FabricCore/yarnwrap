package yarnwrap.text;
public class RawFilteredPair { public net.minecraft.text.RawFilteredPair wrapperContained; public RawFilteredPair(net.minecraft.text.RawFilteredPair wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.RawFilteredPair of(yarnwrap.server.filter.FilteredMessage message) { return new yarnwrap.text.RawFilteredPair(wrapperContained.of(message.wrapperContained)); }
// public static yarnwrap.text.RawFilteredPair of(yarnwrap.server.filter.FilteredMessage message, ) { return new yarnwrap.text.RawFilteredPair(net.minecraft.text.RawFilteredPair.of(message.wrapperContained)); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec baseCodec) { return wrapperContained.createCodec(baseCodec); }
// public static com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec baseCodec, ) { return net.minecraft.text.RawFilteredPair.createCodec(baseCodec); }
// public com.mojang.datafixers.kinds.App method_57136(com.mojang.serialization.Codec instance) { return wrapperContained.method_57136(instance); }
// public static com.mojang.datafixers.kinds.App method_57136(com.mojang.serialization.Codec instance, ) { return net.minecraft.text.RawFilteredPair.method_57136(instance); }
// public yarnwrap.text.RawFilteredPair of(java.lang.Object raw) { return new yarnwrap.text.RawFilteredPair(wrapperContained.of(raw)); }
// public static yarnwrap.text.RawFilteredPair of(java.lang.Object raw, ) { return new yarnwrap.text.RawFilteredPair(net.minecraft.text.RawFilteredPair.of(raw)); }
public yarnwrap.text.RawFilteredPair map(java.util.function.Function mapper) { return new yarnwrap.text.RawFilteredPair(wrapperContained.map(mapper)); }
// public static yarnwrap.text.RawFilteredPair map(java.util.function.Function mapper, ) { return new yarnwrap.text.RawFilteredPair(net.minecraft.text.RawFilteredPair.map(mapper)); }
// public yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.network.codec.PacketCodec basePacketCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(basePacketCodec.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.network.codec.PacketCodec basePacketCodec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.text.RawFilteredPair.createPacketCodec(basePacketCodec.wrapperContained)); }
public java.lang.Object get(boolean shouldFilter) { return wrapperContained.get(shouldFilter); }
// public static java.lang.Object get(boolean shouldFilter, ) { return net.minecraft.text.RawFilteredPair.get(shouldFilter); }
public java.util.Optional resolve(java.util.function.Function resolver) { return wrapperContained.resolve(resolver); }
// public static java.util.Optional resolve(java.util.function.Function resolver, ) { return net.minecraft.text.RawFilteredPair.resolve(resolver); }

}