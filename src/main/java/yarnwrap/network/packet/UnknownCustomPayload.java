package yarnwrap.network.packet;
public class UnknownCustomPayload { public net.minecraft.network.packet.UnknownCustomPayload wrapperContained; public UnknownCustomPayload(net.minecraft.network.packet.UnknownCustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.packet.UnknownCustomPayload method_56491(int buf) { return new yarnwrap.network.packet.UnknownCustomPayload(wrapperContained.method_56491(buf)); }
// public static yarnwrap.network.packet.UnknownCustomPayload method_56491(int buf, ) { return new yarnwrap.network.packet.UnknownCustomPayload(net.minecraft.network.packet.UnknownCustomPayload.method_56491(buf)); }
// public yarnwrap.network.codec.PacketCodec createCodec(yarnwrap.util.Identifier id,int maxBytes) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createCodec(id.wrapperContained,maxBytes)); }
// public static yarnwrap.network.codec.PacketCodec createCodec(yarnwrap.util.Identifier id,int maxBytes, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.UnknownCustomPayload.createCodec(id.wrapperContained,maxBytes)); }
// public void method_56493(yarnwrap.network.packet.UnknownCustomPayload value,yarnwrap.network.PacketByteBuf buf) { wrapperContained.method_56493(value.wrapperContained,buf.wrapperContained); }
// public static void method_56493(yarnwrap.network.packet.UnknownCustomPayload value,yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.UnknownCustomPayload.method_56493(value.wrapperContained,buf.wrapperContained); }

}