package yarnwrap.network.packet.s2c.play;
public class WorldBorderWarningTimeChangedS2CPacket { public net.minecraft.network.packet.s2c.play.WorldBorderWarningTimeChangedS2CPacket wrapperContained; public WorldBorderWarningTimeChangedS2CPacket(net.minecraft.network.packet.s2c.play.WorldBorderWarningTimeChangedS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int warningTime() { return wrapperContained.warningTime; }
// public void warningTime(int value) { wrapperContained.warningTime = value; }
// public static int warningTime() { return net.minecraft.network.packet.s2c.play.WorldBorderWarningTimeChangedS2CPacket.warningTime; }
// public static void warningTime(int value, ) { net.minecraft.network.packet.s2c.play.WorldBorderWarningTimeChangedS2CPacket.warningTime = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.WorldBorderWarningTimeChangedS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.WorldBorderWarningTimeChangedS2CPacket.CODEC = value.wrapperContained; }

// public WorldBorderWarningTimeChangedS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderWarningTimeChangedS2CPacket(buf.wrapperContained); }
public WorldBorderWarningTimeChangedS2CPacket(yarnwrap.world.border.WorldBorder worldBorder) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderWarningTimeChangedS2CPacket(worldBorder.wrapperContained); }
public int getWarningTime() { return wrapperContained.getWarningTime(); }
// public static int getWarningTime() { return net.minecraft.network.packet.s2c.play.WorldBorderWarningTimeChangedS2CPacket.getWarningTime(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.WorldBorderWarningTimeChangedS2CPacket.write(buf.wrapperContained); }

}