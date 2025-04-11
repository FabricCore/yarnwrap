package yarnwrap.network.packet.c2s.play;
public class DebugSampleSubscriptionC2SPacket { public net.minecraft.network.packet.c2s.play.DebugSampleSubscriptionC2SPacket wrapperContained; public DebugSampleSubscriptionC2SPacket(net.minecraft.network.packet.c2s.play.DebugSampleSubscriptionC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}