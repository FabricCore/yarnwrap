package yarnwrap.predicate;
public class LightPredicate { public net.minecraft.predicate.LightPredicate wrapperContained; public LightPredicate(net.minecraft.predicate.LightPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object range() { return wrapperContained.range; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public Object range() { return wrapperContained.range(); }
public boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.test(world.wrapperContained,pos.wrapperContained); }

}