package yarnwrap.network.packet.s2c.play;
public class BlockUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket wrapperContained; public BlockUpdateS2CPacket(net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.block.BlockState getState() { return new yarnwrap.block.BlockState(wrapperContained.getState()); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }

}