package yarnwrap.predicate;
public class BlockPredicate { public net.minecraft.predicate.BlockPredicate wrapperContained; public BlockPredicate(net.minecraft.predicate.BlockPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional state() { return wrapperContained.state; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public java.util.Optional state() { return wrapperContained.state(); }
public boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.test(world.wrapperContained,pos.wrapperContained); }
public boolean hasNbt() { return wrapperContained.hasNbt(); }
// public boolean testBlockEntity(yarnwrap.world.WorldView world,yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.predicate.NbtPredicate nbtPredicate) { return wrapperContained.testBlockEntity(world.wrapperContained,blockEntity.wrapperContained,nbtPredicate.wrapperContained); }
// public boolean testState(yarnwrap.block.BlockState state) { return wrapperContained.testState(state.wrapperContained); }
public boolean test(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.test(pos.wrapperContained); }

}