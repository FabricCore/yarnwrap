package yarnwrap.network.packet.c2s.play;
public class JigsawGeneratingC2SPacket { public net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket wrapperContained; public JigsawGeneratingC2SPacket(net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public int maxDepth() { return wrapperContained.maxDepth; }
// public void maxDepth(int value) { wrapperContained.maxDepth = value; }
// public boolean keepJigsaws() { return wrapperContained.keepJigsaws; }
// public void keepJigsaws(boolean value) { wrapperContained.keepJigsaws = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public JigsawGeneratingC2SPacket(yarnwrap.util.math.BlockPos pos,int maxDepth,boolean keepJigsaws) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket(pos.wrapperContained,maxDepth,keepJigsaws); }
// public JigsawGeneratingC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket(buf.wrapperContained); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public int getMaxDepth() { return wrapperContained.getMaxDepth(); }
public boolean shouldKeepJigsaws() { return wrapperContained.shouldKeepJigsaws(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}