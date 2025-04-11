package yarnwrap.network.packet.s2c.play;
public class BlockUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket wrapperContained; public BlockUpdateS2CPacket(net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public void state(yarnwrap.block.BlockState value) { wrapperContained.state = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public BlockUpdateS2CPacket(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket(world.wrapperContained,pos.wrapperContained); }
public BlockUpdateS2CPacket(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket(pos.wrapperContained,state.wrapperContained); }
public yarnwrap.block.BlockState getState() { return new yarnwrap.block.BlockState(wrapperContained.getState()); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }

}