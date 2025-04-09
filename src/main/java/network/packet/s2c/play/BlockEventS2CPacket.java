package yarnwrap.network.packet.s2c.play;
public class BlockEventS2CPacket { public net.minecraft.network.packet.s2c.play.BlockEventS2CPacket wrapperContained; public BlockEventS2CPacket(net.minecraft.network.packet.s2c.play.BlockEventS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int data() { return wrapperContained.data; }
// public int type() { return wrapperContained.type; }
// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getType() { return wrapperContained.getType(); }
public yarnwrap.block.Block getBlock() { return new yarnwrap.block.Block(wrapperContained.getBlock()); }
public int getData() { return wrapperContained.getData(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}