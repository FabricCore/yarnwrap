package yarnwrap.network.packet.s2c.play;
public class ScoreboardScoreUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.ScoreboardScoreUpdateS2CPacket wrapperContained; public ScoreboardScoreUpdateS2CPacket(net.minecraft.network.packet.s2c.play.ScoreboardScoreUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String scoreHolderName() { return wrapperContained.scoreHolderName; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public java.lang.String scoreHolderName() { return wrapperContained.scoreHolderName(); }

}