package yarnwrap.network.packet.s2c.play;
public class BlockEntityUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket wrapperContained; public BlockEntityUpdateS2CPacket(net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.entity.BlockEntityType blockEntityType() { return new yarnwrap.block.entity.BlockEntityType(wrapperContained.blockEntityType); }
// public void blockEntityType(yarnwrap.block.entity.BlockEntityType value) { wrapperContained.blockEntityType = value.wrapperContained; }
// public static yarnwrap.block.entity.BlockEntityType blockEntityType() { return new yarnwrap.block.entity.BlockEntityType(net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket.blockEntityType); }
// public static void blockEntityType(yarnwrap.block.entity.BlockEntityType value, ) { net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket.blockEntityType = value.wrapperContained; }

// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
// public void nbt(yarnwrap.nbt.NbtCompound value) { wrapperContained.nbt = value.wrapperContained; }
// public static yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket.nbt); }
// public static void nbt(yarnwrap.nbt.NbtCompound value, ) { net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket.nbt = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket.pos = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket.CODEC = value.wrapperContained; }

// public BlockEntityUpdateS2CPacket(yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.BlockEntityType blockEntityType,yarnwrap.nbt.NbtCompound nbt) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket(pos.wrapperContained,blockEntityType.wrapperContained,nbt.wrapperContained); }
public yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getNbt()); }
// public static yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket.getNbt()); }
public yarnwrap.block.entity.BlockEntityType getBlockEntityType() { return new yarnwrap.block.entity.BlockEntityType(wrapperContained.getBlockEntityType()); }
// public static yarnwrap.block.entity.BlockEntityType getBlockEntityType() { return new yarnwrap.block.entity.BlockEntityType(net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket.getBlockEntityType()); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket.getPos()); }
// public yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket create(yarnwrap.block.entity.BlockEntity blockEntity) { return new yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket(wrapperContained.create(blockEntity.wrapperContained)); }
// public static yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket create(yarnwrap.block.entity.BlockEntity blockEntity, ) { return new yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket(net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket.create(blockEntity.wrapperContained)); }
// public yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket create(yarnwrap.block.entity.BlockEntity blockEntity,java.util.function.BiFunction nbtGetter) { return new yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket(wrapperContained.create(blockEntity.wrapperContained,nbtGetter)); }
// public static yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket create(yarnwrap.block.entity.BlockEntity blockEntity,java.util.function.BiFunction nbtGetter, ) { return new yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket(net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket.create(blockEntity.wrapperContained,nbtGetter)); }

}