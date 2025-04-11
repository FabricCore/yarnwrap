package yarnwrap.block.dispenser;
public class ShearsDispenserBehavior { public net.minecraft.block.dispenser.ShearsDispenserBehavior wrapperContained; public ShearsDispenserBehavior(net.minecraft.block.dispenser.ShearsDispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean tryShearBlock(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.tryShearBlock(world.wrapperContained,pos.wrapperContained); }
// public boolean tryShearEntity(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.tryShearEntity(world.wrapperContained,pos.wrapperContained); }

}