package yarnwrap.network.packet.s2c.play;
public class BlockUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket wrapperContained; public BlockUpdateS2CPacket(net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public void state(yarnwrap.block.BlockState value) { wrapperContained.state = value.wrapperContained; }
// public static yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket.state); }
// public static void state(yarnwrap.block.BlockState value, ) { net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket.state = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket.pos = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket.CODEC = value.wrapperContained; }

public BlockUpdateS2CPacket(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket(world.wrapperContained,pos.wrapperContained); }
public BlockUpdateS2CPacket(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket(pos.wrapperContained,state.wrapperContained); }
public yarnwrap.block.BlockState getState() { return new yarnwrap.block.BlockState(wrapperContained.getState()); }
// public static yarnwrap.block.BlockState getState() { return new yarnwrap.block.BlockState(net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket.getState()); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket.getPos()); }

}