package yarnwrap.world.gen.blockpredicate;
public class BlockPredicate { public net.minecraft.world.gen.blockpredicate.BlockPredicate wrapperContained; public BlockPredicate(net.minecraft.world.gen.blockpredicate.BlockPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
public yarnwrap.world.gen.blockpredicate.BlockPredicate IS_AIR() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.IS_AIR); }
// public void IS_AIR(yarnwrap.world.gen.blockpredicate.BlockPredicate value) { wrapperContained.IS_AIR = value.wrapperContained; }
public yarnwrap.world.gen.blockpredicate.BlockPredicate IS_AIR_OR_WATER() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.IS_AIR_OR_WATER); }
// public void IS_AIR_OR_WATER(yarnwrap.world.gen.blockpredicate.BlockPredicate value) { wrapperContained.IS_AIR_OR_WATER = value.wrapperContained; }
public yarnwrap.world.gen.blockpredicate.BlockPredicateType getType() { return new yarnwrap.world.gen.blockpredicate.BlockPredicateType(wrapperContained.getType()); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate not(yarnwrap.world.gen.blockpredicate.BlockPredicate predicate) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.not(predicate.wrapperContained)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate bothOf(yarnwrap.world.gen.blockpredicate.BlockPredicate first,yarnwrap.world.gen.blockpredicate.BlockPredicate second) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.bothOf(first.wrapperContained,second.wrapperContained)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate allOf(java.util.List predicates) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.allOf(predicates)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate matchingBlocks(yarnwrap.util.math.Vec3i offset,java.util.List blocks) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.matchingBlocks(offset.wrapperContained,blocks)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate allOf(net.minecraft.world.gen.blockpredicate.BlockPredicate[] predicates) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.allOf(predicates)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate replaceable() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.replaceable()); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate eitherOf(yarnwrap.world.gen.blockpredicate.BlockPredicate first,yarnwrap.world.gen.blockpredicate.BlockPredicate second) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.eitherOf(first.wrapperContained,second.wrapperContained)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate anyOf(java.util.List predicates) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.anyOf(predicates)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate matchingFluids(yarnwrap.util.math.Vec3i offset,java.util.List fluids) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.matchingFluids(offset.wrapperContained,fluids)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate anyOf(net.minecraft.world.gen.blockpredicate.BlockPredicate[] predicates) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.anyOf(predicates)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate wouldSurvive(yarnwrap.block.BlockState state,yarnwrap.util.math.Vec3i offset) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.wouldSurvive(state.wrapperContained,offset.wrapperContained)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate replaceable(yarnwrap.util.math.Vec3i offset) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.replaceable(offset.wrapperContained)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate alwaysTrue() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.alwaysTrue()); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate solid(yarnwrap.util.math.Vec3i offset) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.solid(offset.wrapperContained)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate solid() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.solid()); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate insideWorldBounds(yarnwrap.util.math.Vec3i offset) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.insideWorldBounds(offset.wrapperContained)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate matchingBlockTag(yarnwrap.registry.tag.TagKey offset) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.matchingBlockTag(offset.wrapperContained)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate matchingBlockTag(yarnwrap.util.math.Vec3i offset,yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.matchingBlockTag(offset.wrapperContained,tag.wrapperContained)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate hasSturdyFace(yarnwrap.util.math.Vec3i offset,yarnwrap.util.math.Direction face) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.hasSturdyFace(offset.wrapperContained,face.wrapperContained)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate matchingBlocks(java.util.List blocks) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.matchingBlocks(blocks)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate hasSturdyFace(yarnwrap.util.math.Direction face) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.hasSturdyFace(face.wrapperContained)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate matchingBlocks(yarnwrap.util.math.Vec3i offset,net.minecraft.block.Block[] blocks) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.matchingBlocks(offset.wrapperContained,blocks)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate matchingFluids(yarnwrap.util.math.Vec3i offset,net.minecraft.fluid.Fluid[] fluids) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.matchingFluids(offset.wrapperContained,fluids)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate matchingBlocks(net.minecraft.block.Block[] blocks) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.matchingBlocks(blocks)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate matchingFluids(net.minecraft.fluid.Fluid[] fluids) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.matchingFluids(fluids)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate noFluid(yarnwrap.util.math.Vec3i offset) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.noFluid(offset.wrapperContained)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate noFluid() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.noFluid()); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate unobstructed(yarnwrap.util.math.Vec3i offset) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.unobstructed(offset.wrapperContained)); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate unobstructed() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.unobstructed()); }

}