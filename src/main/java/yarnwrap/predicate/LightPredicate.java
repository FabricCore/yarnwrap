package yarnwrap.predicate;
public class LightPredicate { public net.minecraft.predicate.LightPredicate wrapperContained; public LightPredicate(net.minecraft.predicate.LightPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object range() { return wrapperContained.range; }
// // public void range(Object value) { wrapperContained.range = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public LightPredicate(Object range) { this.wrapperContained = new net.minecraft.predicate.LightPredicate(range); }
// public Object range() { return wrapperContained.range(); }
public boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.test(world.wrapperContained,pos.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53172(Object instance) { return wrapperContained.method_53172(instance); }

}