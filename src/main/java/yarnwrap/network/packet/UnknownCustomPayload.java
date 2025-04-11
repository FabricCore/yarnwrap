package yarnwrap.network.packet;
public class UnknownCustomPayload { public net.minecraft.network.packet.UnknownCustomPayload wrapperContained; public UnknownCustomPayload(net.minecraft.network.packet.UnknownCustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec createCodec(yarnwrap.util.Identifier id,int maxBytes) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createCodec(id.wrapperContained,maxBytes)); }

}