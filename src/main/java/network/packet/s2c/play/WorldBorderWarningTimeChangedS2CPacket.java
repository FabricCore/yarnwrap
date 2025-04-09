package yarnwrap.network.packet.s2c.play;
public class WorldBorderWarningTimeChangedS2CPacket { public net.minecraft.network.packet.s2c.play.WorldBorderWarningTimeChangedS2CPacket wrapperContained; public WorldBorderWarningTimeChangedS2CPacket(net.minecraft.network.packet.s2c.play.WorldBorderWarningTimeChangedS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int warningTime() { return wrapperContained.warningTime; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getWarningTime() { return wrapperContained.getWarningTime(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}