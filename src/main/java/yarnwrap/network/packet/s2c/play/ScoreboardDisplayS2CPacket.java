package yarnwrap.network.packet.s2c.play;
public class ScoreboardDisplayS2CPacket { public net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket wrapperContained; public ScoreboardDisplayS2CPacket(net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.scoreboard.ScoreboardDisplaySlot slot() { return new yarnwrap.scoreboard.ScoreboardDisplaySlot(wrapperContained.slot); }
// public void slot(yarnwrap.scoreboard.ScoreboardDisplaySlot value) { wrapperContained.slot = value.wrapperContained; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public java.lang.String getName() { return wrapperContained.getName(); }
public yarnwrap.scoreboard.ScoreboardDisplaySlot getSlot() { return new yarnwrap.scoreboard.ScoreboardDisplaySlot(wrapperContained.getSlot()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}