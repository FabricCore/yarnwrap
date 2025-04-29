package yarnwrap.network.packet.s2c.play;
public class ClearTitleS2CPacket { public net.minecraft.network.packet.s2c.play.ClearTitleS2CPacket wrapperContained; public ClearTitleS2CPacket(net.minecraft.network.packet.s2c.play.ClearTitleS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean reset() { return wrapperContained.reset; }
// public void reset(boolean value) { wrapperContained.reset = value; }
// public static boolean reset() { return net.minecraft.network.packet.s2c.play.ClearTitleS2CPacket.reset; }
// public static void reset(boolean value, ) { net.minecraft.network.packet.s2c.play.ClearTitleS2CPacket.reset = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ClearTitleS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ClearTitleS2CPacket.CODEC = value.wrapperContained; }

// public ClearTitleS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ClearTitleS2CPacket(buf.wrapperContained); }
public ClearTitleS2CPacket(boolean reset) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ClearTitleS2CPacket(reset); }
public boolean shouldReset() { return wrapperContained.shouldReset(); }
// public static boolean shouldReset() { return net.minecraft.network.packet.s2c.play.ClearTitleS2CPacket.shouldReset(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ClearTitleS2CPacket.write(buf.wrapperContained); }

}