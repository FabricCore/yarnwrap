package yarnwrap.network.packet.c2s.play;
public class UpdateSignC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket wrapperContained; public UpdateSignC2SPacket(net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String[] text() { return wrapperContained.text; }
// public void text(java.lang.String[] value) { wrapperContained.text = value; }
// public static java.lang.String[] text() { return net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket.text; }
// public static void text(java.lang.String[] value, ) { net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket.text = value; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket.pos = value.wrapperContained; }

// public int MAX_LINE_LENGTH() { return wrapperContained.MAX_LINE_LENGTH; }
// public void MAX_LINE_LENGTH(int value) { wrapperContained.MAX_LINE_LENGTH = value; }
// public static int MAX_LINE_LENGTH() { return net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket.MAX_LINE_LENGTH; }
// public static void MAX_LINE_LENGTH(int value, ) { net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket.MAX_LINE_LENGTH = value; }

// public boolean front() { return wrapperContained.front; }
// public void front(boolean value) { wrapperContained.front = value; }
// public static boolean front() { return net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket.front; }
// public static void front(boolean value, ) { net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket.front = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket.CODEC = value.wrapperContained; }

public UpdateSignC2SPacket(yarnwrap.util.math.BlockPos pos,boolean front,java.lang.String line1,java.lang.String line2,java.lang.String line3,java.lang.String line4) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket(pos.wrapperContained,front,line1,line2,line3,line4); }
// public UpdateSignC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket(buf.wrapperContained); }
public java.lang.String[] getText() { return wrapperContained.getText(); }
// public static java.lang.String[] getText() { return net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket.getText(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket.getPos()); }
public boolean isFront() { return wrapperContained.isFront(); }
// public static boolean isFront() { return net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket.isFront(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket.write(buf.wrapperContained); }

}