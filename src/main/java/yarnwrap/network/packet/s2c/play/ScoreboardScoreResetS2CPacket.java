package yarnwrap.network.packet.s2c.play;
public class ScoreboardScoreResetS2CPacket { public net.minecraft.network.packet.s2c.play.ScoreboardScoreResetS2CPacket wrapperContained; public ScoreboardScoreResetS2CPacket(net.minecraft.network.packet.s2c.play.ScoreboardScoreResetS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String scoreHolderName() { return wrapperContained.scoreHolderName; }
// public void scoreHolderName(java.lang.String value) { wrapperContained.scoreHolderName = value; }
// public static java.lang.String scoreHolderName() { return net.minecraft.network.packet.s2c.play.ScoreboardScoreResetS2CPacket.scoreHolderName; }
// public static void scoreHolderName(java.lang.String value, ) { net.minecraft.network.packet.s2c.play.ScoreboardScoreResetS2CPacket.scoreHolderName = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ScoreboardScoreResetS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ScoreboardScoreResetS2CPacket.CODEC = value.wrapperContained; }

// public ScoreboardScoreResetS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ScoreboardScoreResetS2CPacket(buf.wrapperContained); }
// public java.lang.String scoreHolderName() { return wrapperContained.scoreHolderName(); }
// // public static java.lang.String scoreHolderName() { return net.minecraft.network.packet.s2c.play.ScoreboardScoreResetS2CPacket.scoreHolderName(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ScoreboardScoreResetS2CPacket.write(buf.wrapperContained); }

}