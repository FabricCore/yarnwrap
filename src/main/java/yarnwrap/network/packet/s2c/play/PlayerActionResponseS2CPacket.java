package yarnwrap.network.packet.s2c.play;
public class PlayerActionResponseS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerActionResponseS2CPacket wrapperContained; public PlayerActionResponseS2CPacket(net.minecraft.network.packet.s2c.play.PlayerActionResponseS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public PlayerActionResponseS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlayerActionResponseS2CPacket(buf.wrapperContained); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}