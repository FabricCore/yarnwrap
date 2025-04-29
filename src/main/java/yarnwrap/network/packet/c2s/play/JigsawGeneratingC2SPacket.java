package yarnwrap.network.packet.c2s.play;
public class JigsawGeneratingC2SPacket { public net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket wrapperContained; public JigsawGeneratingC2SPacket(net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket.pos = value.wrapperContained; }

// public int maxDepth() { return wrapperContained.maxDepth; }
// public void maxDepth(int value) { wrapperContained.maxDepth = value; }
// public static int maxDepth() { return net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket.maxDepth; }
// public static void maxDepth(int value, ) { net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket.maxDepth = value; }

// public boolean keepJigsaws() { return wrapperContained.keepJigsaws; }
// public void keepJigsaws(boolean value) { wrapperContained.keepJigsaws = value; }
// public static boolean keepJigsaws() { return net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket.keepJigsaws; }
// public static void keepJigsaws(boolean value, ) { net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket.keepJigsaws = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket.CODEC = value.wrapperContained; }

public JigsawGeneratingC2SPacket(yarnwrap.util.math.BlockPos pos,int maxDepth,boolean keepJigsaws) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket(pos.wrapperContained,maxDepth,keepJigsaws); }
// public JigsawGeneratingC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket(buf.wrapperContained); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket.getPos()); }
public int getMaxDepth() { return wrapperContained.getMaxDepth(); }
// public static int getMaxDepth() { return net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket.getMaxDepth(); }
public boolean shouldKeepJigsaws() { return wrapperContained.shouldKeepJigsaws(); }
// public static boolean shouldKeepJigsaws() { return net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket.shouldKeepJigsaws(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket.write(buf.wrapperContained); }

}