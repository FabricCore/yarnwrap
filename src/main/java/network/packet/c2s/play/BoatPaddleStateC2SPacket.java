package yarnwrap.network.packet.c2s.play;
public class BoatPaddleStateC2SPacket { public net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket wrapperContained; public BoatPaddleStateC2SPacket(net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean rightPaddling() { return wrapperContained.rightPaddling; }
// public boolean leftPaddling() { return wrapperContained.leftPaddling; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public boolean isLeftPaddling() { return wrapperContained.isLeftPaddling(); }
public boolean isRightPaddling() { return wrapperContained.isRightPaddling(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}