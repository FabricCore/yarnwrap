package yarnwrap.network.packet.s2c.play;
public class WorldBorderWarningBlocksChangedS2CPacket { public net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket wrapperContained; public WorldBorderWarningBlocksChangedS2CPacket(net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int warningBlocks() { return wrapperContained.warningBlocks; }
// public void warningBlocks(int value) { wrapperContained.warningBlocks = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public WorldBorderWarningBlocksChangedS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket(buf.wrapperContained); }
public WorldBorderWarningBlocksChangedS2CPacket(yarnwrap.world.border.WorldBorder worldBorder) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket(worldBorder.wrapperContained); }
public int getWarningBlocks() { return wrapperContained.getWarningBlocks(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}