package yarnwrap.network.packet.s2c.play;
public class SignEditorOpenS2CPacket { public net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket wrapperContained; public SignEditorOpenS2CPacket(net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket.pos = value.wrapperContained; }

// public boolean front() { return wrapperContained.front; }
// public void front(boolean value) { wrapperContained.front = value; }
// public static boolean front() { return net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket.front; }
// public static void front(boolean value, ) { net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket.front = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket.CODEC = value.wrapperContained; }

public SignEditorOpenS2CPacket(yarnwrap.util.math.BlockPos pos,boolean front) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket(pos.wrapperContained,front); }
// public SignEditorOpenS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket(buf.wrapperContained); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket.getPos()); }
public boolean isFront() { return wrapperContained.isFront(); }
// public static boolean isFront() { return net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket.isFront(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket.write(buf.wrapperContained); }

}