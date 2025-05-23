package yarnwrap.predicate;
public class BlockPredicate { public net.minecraft.predicate.BlockPredicate wrapperContained; public BlockPredicate(net.minecraft.predicate.BlockPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional state() { return wrapperContained.state; }
// public void state(java.util.Optional value) { wrapperContained.state = value; }
// public static java.util.Optional state() { return net.minecraft.predicate.BlockPredicate.state; }
// public static void state(java.util.Optional value, ) { net.minecraft.predicate.BlockPredicate.state = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.BlockPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.BlockPredicate.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.predicate.BlockPredicate.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.predicate.BlockPredicate.PACKET_CODEC = value.wrapperContained; }

// public java.util.Optional state() { return wrapperContained.state(); }
// // public static java.util.Optional state() { return net.minecraft.predicate.BlockPredicate.state(); }
public boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.test(world.wrapperContained,pos.wrapperContained); }
// public static boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.predicate.BlockPredicate.test(world.wrapperContained,pos.wrapperContained); }
public boolean hasNbt() { return wrapperContained.hasNbt(); }
// public static boolean hasNbt() { return net.minecraft.predicate.BlockPredicate.hasNbt(); }
// public com.mojang.datafixers.kinds.App method_57144(Object instance) { return wrapperContained.method_57144(instance); }
// public static com.mojang.datafixers.kinds.App method_57144(Object instance, ) { return net.minecraft.predicate.BlockPredicate.method_57144(instance); }
// public boolean testNbt(yarnwrap.world.WorldView world,yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.predicate.NbtPredicate nbtPredicate) { return wrapperContained.testNbt(world.wrapperContained,blockEntity.wrapperContained,nbtPredicate.wrapperContained); }
// public static boolean testNbt(yarnwrap.world.WorldView world,yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.predicate.NbtPredicate nbtPredicate, ) { return net.minecraft.predicate.BlockPredicate.testNbt(world.wrapperContained,blockEntity.wrapperContained,nbtPredicate.wrapperContained); }
// public boolean testState(yarnwrap.block.BlockState state) { return wrapperContained.testState(state.wrapperContained); }
// public static boolean testState(yarnwrap.block.BlockState state, ) { return net.minecraft.predicate.BlockPredicate.testState(state.wrapperContained); }
public boolean test(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.test(pos.wrapperContained); }
// public static boolean test(yarnwrap.block.pattern.CachedBlockPosition pos, ) { return net.minecraft.predicate.BlockPredicate.test(pos.wrapperContained); }
// public boolean testComponents(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.predicate.component.ComponentsPredicate components) { return wrapperContained.testComponents(blockEntity.wrapperContained,components.wrapperContained); }
// public static boolean testComponents(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.predicate.component.ComponentsPredicate components, ) { return net.minecraft.predicate.BlockPredicate.testComponents(blockEntity.wrapperContained,components.wrapperContained); }

}