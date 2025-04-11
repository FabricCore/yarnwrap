package yarnwrap.network.packet.s2c.play;
public class ScoreboardScoreUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.ScoreboardScoreUpdateS2CPacket wrapperContained; public ScoreboardScoreUpdateS2CPacket(net.minecraft.network.packet.s2c.play.ScoreboardScoreUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String scoreHolderName() { return wrapperContained.scoreHolderName; }
// public void scoreHolderName(java.lang.String value) { wrapperContained.scoreHolderName = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public java.lang.String scoreHolderName() { return wrapperContained.scoreHolderName(); }

}