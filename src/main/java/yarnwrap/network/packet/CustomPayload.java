package yarnwrap.network.packet;
public class CustomPayload { public net.minecraft.network.packet.CustomPayload wrapperContained; public CustomPayload(net.minecraft.network.packet.CustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

public Object getId() { return wrapperContained.getId(); }
// public static Object getId() { return net.minecraft.network.packet.CustomPayload.getId(); }
// public Object id(java.lang.String id) { return wrapperContained.id(id); }
// public static Object id(java.lang.String id, ) { return net.minecraft.network.packet.CustomPayload.id(id); }
// public yarnwrap.network.codec.PacketCodec codecOf(yarnwrap.network.codec.ValueFirstEncoder encoder,yarnwrap.network.codec.PacketDecoder decoder) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.codecOf(encoder.wrapperContained,decoder.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec codecOf(yarnwrap.network.codec.ValueFirstEncoder encoder,yarnwrap.network.codec.PacketDecoder decoder, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.CustomPayload.codecOf(encoder.wrapperContained,decoder.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec createCodec(Object unknownCodecFactory,java.util.List types) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createCodec(unknownCodecFactory,types)); }
// public static yarnwrap.network.codec.PacketCodec createCodec(Object unknownCodecFactory,java.util.List types, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.CustomPayload.createCodec(unknownCodecFactory,types)); }
// public yarnwrap.util.Identifier method_56486(Object type) { return new yarnwrap.util.Identifier(wrapperContained.method_56486(type)); }
// public static yarnwrap.util.Identifier method_56486(Object type, ) { return new yarnwrap.util.Identifier(net.minecraft.network.packet.CustomPayload.method_56486(type)); }

}