package yarnwrap.predicate;
public class FluidPredicate { public net.minecraft.predicate.FluidPredicate wrapperContained; public FluidPredicate(net.minecraft.predicate.FluidPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional state() { return wrapperContained.state; }
// public void state(java.util.Optional value) { wrapperContained.state = value; }
// public static java.util.Optional state() { return net.minecraft.predicate.FluidPredicate.state; }
// public static void state(java.util.Optional value, ) { net.minecraft.predicate.FluidPredicate.state = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.FluidPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.FluidPredicate.CODEC = value; }

// public java.util.Optional state() { return wrapperContained.state(); }
// // public static java.util.Optional state() { return net.minecraft.predicate.FluidPredicate.state(); }
public boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.test(world.wrapperContained,pos.wrapperContained); }
// public static boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.predicate.FluidPredicate.test(world.wrapperContained,pos.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53156(Object instance) { return wrapperContained.method_53156(instance); }
// public static com.mojang.datafixers.kinds.App method_53156(Object instance, ) { return net.minecraft.predicate.FluidPredicate.method_53156(instance); }

}