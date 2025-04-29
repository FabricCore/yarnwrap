package yarnwrap.network.packet.c2s.play;
public class BoatPaddleStateC2SPacket { public net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket wrapperContained; public BoatPaddleStateC2SPacket(net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean rightPaddling() { return wrapperContained.rightPaddling; }
// public void rightPaddling(boolean value) { wrapperContained.rightPaddling = value; }
// public static boolean rightPaddling() { return net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket.rightPaddling; }
// public static void rightPaddling(boolean value, ) { net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket.rightPaddling = value; }

// public boolean leftPaddling() { return wrapperContained.leftPaddling; }
// public void leftPaddling(boolean value) { wrapperContained.leftPaddling = value; }
// public static boolean leftPaddling() { return net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket.leftPaddling; }
// public static void leftPaddling(boolean value, ) { net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket.leftPaddling = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket.CODEC = value.wrapperContained; }

// public BoatPaddleStateC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket(buf.wrapperContained); }
public BoatPaddleStateC2SPacket(boolean leftPaddling,boolean rightPaddling) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket(leftPaddling,rightPaddling); }
public boolean isLeftPaddling() { return wrapperContained.isLeftPaddling(); }
// public static boolean isLeftPaddling() { return net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket.isLeftPaddling(); }
public boolean isRightPaddling() { return wrapperContained.isRightPaddling(); }
// public static boolean isRightPaddling() { return net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket.isRightPaddling(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket.write(buf.wrapperContained); }

}