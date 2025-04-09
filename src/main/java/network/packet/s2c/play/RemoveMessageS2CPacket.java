package yarnwrap.network.packet.s2c.play;
public class RemoveMessageS2CPacket { public net.minecraft.network.packet.s2c.play.RemoveMessageS2CPacket wrapperContained; public RemoveMessageS2CPacket(net.minecraft.network.packet.s2c.play.RemoveMessageS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}