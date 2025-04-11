package yarnwrap.predicate;
public class FluidPredicate { public net.minecraft.predicate.FluidPredicate wrapperContained; public FluidPredicate(net.minecraft.predicate.FluidPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional state() { return wrapperContained.state; }
// public void state(java.util.Optional value) { wrapperContained.state = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.util.Optional state() { return wrapperContained.state(); }
public boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.test(world.wrapperContained,pos.wrapperContained); }

}