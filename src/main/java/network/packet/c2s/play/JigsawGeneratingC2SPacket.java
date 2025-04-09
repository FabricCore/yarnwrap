package yarnwrap.network.packet.c2s.play;
public class JigsawGeneratingC2SPacket { public net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket wrapperContained; public JigsawGeneratingC2SPacket(net.minecraft.network.packet.c2s.play.JigsawGeneratingC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public int maxDepth() { return wrapperContained.maxDepth; }
// public boolean keepJigsaws() { return wrapperContained.keepJigsaws; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public int getMaxDepth() { return wrapperContained.getMaxDepth(); }
public boolean shouldKeepJigsaws() { return wrapperContained.shouldKeepJigsaws(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}