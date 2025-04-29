package yarnwrap.network.packet.s2c.play;
public class WorldBorderWarningBlocksChangedS2CPacket { public net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket wrapperContained; public WorldBorderWarningBlocksChangedS2CPacket(net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int warningBlocks() { return wrapperContained.warningBlocks; }
// public void warningBlocks(int value) { wrapperContained.warningBlocks = value; }
// public static int warningBlocks() { return net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket.warningBlocks; }
// public static void warningBlocks(int value, ) { net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket.warningBlocks = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket.CODEC = value.wrapperContained; }

// public WorldBorderWarningBlocksChangedS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket(buf.wrapperContained); }
public WorldBorderWarningBlocksChangedS2CPacket(yarnwrap.world.border.WorldBorder worldBorder) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket(worldBorder.wrapperContained); }
public int getWarningBlocks() { return wrapperContained.getWarningBlocks(); }
// public static int getWarningBlocks() { return net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket.getWarningBlocks(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket.write(buf.wrapperContained); }

}