package yarnwrap.world.gen.feature;
public class DesertWellFeature { public net.minecraft.world.gen.feature.DesertWellFeature wrapperContained; public DesertWellFeature(net.minecraft.world.gen.feature.DesertWellFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState fluidInside() { return new yarnwrap.block.BlockState(wrapperContained.fluidInside); }
// public yarnwrap.predicate.block.BlockStatePredicate CAN_GENERATE() { return new yarnwrap.predicate.block.BlockStatePredicate(wrapperContained.CAN_GENERATE); }
// public yarnwrap.block.BlockState wall() { return new yarnwrap.block.BlockState(wrapperContained.wall); }
// public yarnwrap.block.BlockState slab() { return new yarnwrap.block.BlockState(wrapperContained.slab); }
// public yarnwrap.block.BlockState sand() { return new yarnwrap.block.BlockState(wrapperContained.sand); }
// public void generateSuspiciousSand(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.generateSuspiciousSand(world.wrapperContained,pos.wrapperContained); }

}