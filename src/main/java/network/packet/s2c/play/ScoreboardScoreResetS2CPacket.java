package yarnwrap.network.packet.s2c.play;
public class ScoreboardScoreResetS2CPacket { public net.minecraft.network.packet.s2c.play.ScoreboardScoreResetS2CPacket wrapperContained; public ScoreboardScoreResetS2CPacket(net.minecraft.network.packet.s2c.play.ScoreboardScoreResetS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String scoreHolderName() { return wrapperContained.scoreHolderName; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public java.lang.String scoreHolderName() { return wrapperContained.scoreHolderName(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}