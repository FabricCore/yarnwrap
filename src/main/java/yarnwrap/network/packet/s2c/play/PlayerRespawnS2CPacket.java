package yarnwrap.network.packet.s2c.play;
public class PlayerRespawnS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket wrapperContained; public PlayerRespawnS2CPacket(net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte flag() { return wrapperContained.flag; }
// public void flag(byte value) { wrapperContained.flag = value; }
public byte KEEP_ATTRIBUTES() { return wrapperContained.KEEP_ATTRIBUTES; }
// public void KEEP_ATTRIBUTES(byte value) { wrapperContained.KEEP_ATTRIBUTES = value; }
public byte KEEP_TRACKED_DATA() { return wrapperContained.KEEP_TRACKED_DATA; }
// public void KEEP_TRACKED_DATA(byte value) { wrapperContained.KEEP_TRACKED_DATA = value; }
public byte KEEP_ALL() { return wrapperContained.KEEP_ALL; }
// public void KEEP_ALL(byte value) { wrapperContained.KEEP_ALL = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public byte flag() { return wrapperContained.flag(); }
public boolean hasFlag(byte flag) { return wrapperContained.hasFlag(flag); }
// public void write() { wrapperContained.write(); }

}