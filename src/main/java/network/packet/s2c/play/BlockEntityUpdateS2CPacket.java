package yarnwrap.network.packet.s2c.play;
public class BlockEntityUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket wrapperContained; public BlockEntityUpdateS2CPacket(net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.entity.BlockEntityType blockEntityType() { return new yarnwrap.block.entity.BlockEntityType(wrapperContained.blockEntityType); }
// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getNbt()); }
public yarnwrap.block.entity.BlockEntityType getBlockEntityType() { return new yarnwrap.block.entity.BlockEntityType(wrapperContained.getBlockEntityType()); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket create(yarnwrap.block.entity.BlockEntity blockEntity) { return new yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket(wrapperContained.create(blockEntity.wrapperContained)); }
public yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket create(yarnwrap.block.entity.BlockEntity blockEntity,java.util.function.BiFunction nbtGetter) { return new yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket(wrapperContained.create(blockEntity.wrapperContained,nbtGetter)); }

}