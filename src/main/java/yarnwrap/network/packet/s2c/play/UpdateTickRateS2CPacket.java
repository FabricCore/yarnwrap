package yarnwrap.network.packet.s2c.play;
public class UpdateTickRateS2CPacket { public net.minecraft.network.packet.s2c.play.UpdateTickRateS2CPacket wrapperContained; public UpdateTickRateS2CPacket(net.minecraft.network.packet.s2c.play.UpdateTickRateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.UpdateTickRateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.UpdateTickRateS2CPacket.CODEC = value.wrapperContained; }

// public UpdateTickRateS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.UpdateTickRateS2CPacket(buf.wrapperContained); }
// public yarnwrap.network.packet.s2c.play.UpdateTickRateS2CPacket create(yarnwrap.world.tick.TickManager tickManager) { return new yarnwrap.network.packet.s2c.play.UpdateTickRateS2CPacket(wrapperContained.create(tickManager.wrapperContained)); }
// public static yarnwrap.network.packet.s2c.play.UpdateTickRateS2CPacket create(yarnwrap.world.tick.TickManager tickManager, ) { return new yarnwrap.network.packet.s2c.play.UpdateTickRateS2CPacket(net.minecraft.network.packet.s2c.play.UpdateTickRateS2CPacket.create(tickManager.wrapperContained)); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.UpdateTickRateS2CPacket.write(buf.wrapperContained); }

}