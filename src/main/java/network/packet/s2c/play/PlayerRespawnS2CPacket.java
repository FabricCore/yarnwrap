package yarnwrap.network.packet.s2c.play;
public class PlayerRespawnS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket wrapperContained; public PlayerRespawnS2CPacket(net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte flag() { return wrapperContained.flag; }
public byte KEEP_ATTRIBUTES() { return wrapperContained.KEEP_ATTRIBUTES; }
public byte KEEP_TRACKED_DATA() { return wrapperContained.KEEP_TRACKED_DATA; }
public byte KEEP_ALL() { return wrapperContained.KEEP_ALL; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public byte flag() { return wrapperContained.flag(); }
public boolean hasFlag(byte flag) { return wrapperContained.hasFlag(flag); }
// public void write() { wrapperContained.write(); }

}