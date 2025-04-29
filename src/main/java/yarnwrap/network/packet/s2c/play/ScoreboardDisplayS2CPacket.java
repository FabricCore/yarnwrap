package yarnwrap.network.packet.s2c.play;
public class ScoreboardDisplayS2CPacket { public net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket wrapperContained; public ScoreboardDisplayS2CPacket(net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.scoreboard.ScoreboardDisplaySlot slot() { return new yarnwrap.scoreboard.ScoreboardDisplaySlot(wrapperContained.slot); }
// public void slot(yarnwrap.scoreboard.ScoreboardDisplaySlot value) { wrapperContained.slot = value.wrapperContained; }
// public static yarnwrap.scoreboard.ScoreboardDisplaySlot slot() { return new yarnwrap.scoreboard.ScoreboardDisplaySlot(net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket.slot); }
// public static void slot(yarnwrap.scoreboard.ScoreboardDisplaySlot value, ) { net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket.slot = value.wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket.name; }
// public static void name(java.lang.String value, ) { net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket.name = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket.CODEC = value.wrapperContained; }

// public ScoreboardDisplayS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket(buf.wrapperContained); }
public ScoreboardDisplayS2CPacket(yarnwrap.scoreboard.ScoreboardDisplaySlot slot,yarnwrap.scoreboard.ScoreboardObjective objective) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket(slot.wrapperContained,objective.wrapperContained); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket.getName(); }
public yarnwrap.scoreboard.ScoreboardDisplaySlot getSlot() { return new yarnwrap.scoreboard.ScoreboardDisplaySlot(wrapperContained.getSlot()); }
// public static yarnwrap.scoreboard.ScoreboardDisplaySlot getSlot() { return new yarnwrap.scoreboard.ScoreboardDisplaySlot(net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket.getSlot()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket.write(buf.wrapperContained); }

}