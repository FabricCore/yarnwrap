package yarnwrap.network.packet.s2c.play;
public class BlockEntityUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket wrapperContained; public BlockEntityUpdateS2CPacket(net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.entity.BlockEntityType blockEntityType() { return new yarnwrap.block.entity.BlockEntityType(wrapperContained.blockEntityType); }
// public void blockEntityType(yarnwrap.block.entity.BlockEntityType value) { wrapperContained.blockEntityType = value.wrapperContained; }
// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
// public void nbt(yarnwrap.nbt.NbtCompound value) { wrapperContained.nbt = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getNbt()); }
public yarnwrap.block.entity.BlockEntityType getBlockEntityType() { return new yarnwrap.block.entity.BlockEntityType(wrapperContained.getBlockEntityType()); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket create(yarnwrap.block.entity.BlockEntity blockEntity) { return new yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket(wrapperContained.create(blockEntity.wrapperContained)); }
public yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket create(yarnwrap.block.entity.BlockEntity blockEntity,java.util.function.BiFunction nbtGetter) { return new yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket(wrapperContained.create(blockEntity.wrapperContained,nbtGetter)); }

}