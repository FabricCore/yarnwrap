package yarnwrap.network.packet.s2c.play;
public class ClearTitleS2CPacket { public net.minecraft.network.packet.s2c.play.ClearTitleS2CPacket wrapperContained; public ClearTitleS2CPacket(net.minecraft.network.packet.s2c.play.ClearTitleS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean reset() { return wrapperContained.reset; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public boolean shouldReset() { return wrapperContained.shouldReset(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}