package yarnwrap.world.gen.blockpredicate;
public class WouldSurviveBlockPredicate { public net.minecraft.world.gen.blockpredicate.WouldSurviveBlockPredicate wrapperContained; public WouldSurviveBlockPredicate(net.minecraft.world.gen.blockpredicate.WouldSurviveBlockPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.math.Vec3i offset() { return new yarnwrap.util.math.Vec3i(wrapperContained.offset); }
// public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }

}