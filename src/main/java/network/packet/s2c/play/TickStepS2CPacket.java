package yarnwrap.network.packet.s2c.play;
public class TickStepS2CPacket { public net.minecraft.network.packet.s2c.play.TickStepS2CPacket wrapperContained; public TickStepS2CPacket(net.minecraft.network.packet.s2c.play.TickStepS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.network.packet.s2c.play.TickStepS2CPacket create(yarnwrap.world.tick.TickManager tickManager) { return new yarnwrap.network.packet.s2c.play.TickStepS2CPacket(wrapperContained.create(tickManager.wrapperContained)); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}