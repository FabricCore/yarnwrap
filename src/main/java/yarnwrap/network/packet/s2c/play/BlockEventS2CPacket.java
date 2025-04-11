package yarnwrap.network.packet.s2c.play;
public class BlockEventS2CPacket { public net.minecraft.network.packet.s2c.play.BlockEventS2CPacket wrapperContained; public BlockEventS2CPacket(net.minecraft.network.packet.s2c.play.BlockEventS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int data() { return wrapperContained.data; }
// public void data(int value) { wrapperContained.data = value; }
// public int type() { return wrapperContained.type; }
// public void type(int value) { wrapperContained.type = value; }
// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int getType() { return wrapperContained.getType(); }
public yarnwrap.block.Block getBlock() { return new yarnwrap.block.Block(wrapperContained.getBlock()); }
public int getData() { return wrapperContained.getData(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}