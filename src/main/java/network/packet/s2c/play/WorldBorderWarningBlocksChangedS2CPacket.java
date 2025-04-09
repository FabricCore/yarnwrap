package yarnwrap.network.packet.s2c.play;
public class WorldBorderWarningBlocksChangedS2CPacket { public net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket wrapperContained; public WorldBorderWarningBlocksChangedS2CPacket(net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int warningBlocks() { return wrapperContained.warningBlocks; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getWarningBlocks() { return wrapperContained.getWarningBlocks(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}