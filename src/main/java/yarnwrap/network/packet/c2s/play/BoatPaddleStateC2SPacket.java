package yarnwrap.network.packet.c2s.play;
public class BoatPaddleStateC2SPacket { public net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket wrapperContained; public BoatPaddleStateC2SPacket(net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean rightPaddling() { return wrapperContained.rightPaddling; }
// public void rightPaddling(boolean value) { wrapperContained.rightPaddling = value; }
// public boolean leftPaddling() { return wrapperContained.leftPaddling; }
// public void leftPaddling(boolean value) { wrapperContained.leftPaddling = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public BoatPaddleStateC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket(buf.wrapperContained); }
public BoatPaddleStateC2SPacket(boolean leftPaddling,boolean rightPaddling) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket(leftPaddling,rightPaddling); }
public boolean isLeftPaddling() { return wrapperContained.isLeftPaddling(); }
public boolean isRightPaddling() { return wrapperContained.isRightPaddling(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}