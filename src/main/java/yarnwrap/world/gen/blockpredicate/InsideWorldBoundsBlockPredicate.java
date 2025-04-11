package yarnwrap.world.gen.blockpredicate;
public class InsideWorldBoundsBlockPredicate { public net.minecraft.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate wrapperContained; public InsideWorldBoundsBlockPredicate(net.minecraft.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.math.Vec3i offset() { return new yarnwrap.util.math.Vec3i(wrapperContained.offset); }
// public void offset(yarnwrap.util.math.Vec3i value) { wrapperContained.offset = value.wrapperContained; }
public InsideWorldBoundsBlockPredicate(yarnwrap.util.math.Vec3i offset) { this.wrapperContained = new net.minecraft.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate(offset.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_39588(Object instance) { return wrapperContained.method_39588(instance); }
// public yarnwrap.util.math.Vec3i method_39589(yarnwrap.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate predicate) { return new yarnwrap.util.math.Vec3i(wrapperContained.method_39589(predicate.wrapperContained)); }
// public boolean test(java.lang.Object world,java.lang.Object pos) { return wrapperContained.test(world,pos); }

}