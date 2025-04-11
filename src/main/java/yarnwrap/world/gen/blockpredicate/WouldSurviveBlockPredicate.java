package yarnwrap.world.gen.blockpredicate;
public class WouldSurviveBlockPredicate { public net.minecraft.world.gen.blockpredicate.WouldSurviveBlockPredicate wrapperContained; public WouldSurviveBlockPredicate(net.minecraft.world.gen.blockpredicate.WouldSurviveBlockPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.math.Vec3i offset() { return new yarnwrap.util.math.Vec3i(wrapperContained.offset); }
// public void offset(yarnwrap.util.math.Vec3i value) { wrapperContained.offset = value.wrapperContained; }
// public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public void state(yarnwrap.block.BlockState value) { wrapperContained.state = value.wrapperContained; }
// public WouldSurviveBlockPredicate(yarnwrap.util.math.Vec3i offset,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.world.gen.blockpredicate.WouldSurviveBlockPredicate(offset.wrapperContained,state.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_39018(Object instance) { return wrapperContained.method_39018(instance); }
// public yarnwrap.block.BlockState method_39019(yarnwrap.world.gen.blockpredicate.WouldSurviveBlockPredicate predicate) { return new yarnwrap.block.BlockState(wrapperContained.method_39019(predicate.wrapperContained)); }
// public yarnwrap.util.math.Vec3i method_39020(yarnwrap.world.gen.blockpredicate.WouldSurviveBlockPredicate predicate) { return new yarnwrap.util.math.Vec3i(wrapperContained.method_39020(predicate.wrapperContained)); }
// public boolean test(java.lang.Object world,java.lang.Object pos) { return wrapperContained.test(world,pos); }

}