package yarnwrap.block.dispenser;
public class ShearsDispenserBehavior { public net.minecraft.block.dispenser.ShearsDispenserBehavior wrapperContained; public ShearsDispenserBehavior(net.minecraft.block.dispenser.ShearsDispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean tryShearBlock(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.tryShearBlock(world.wrapperContained,pos.wrapperContained); }
// public boolean tryShearEntity(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.tryShearEntity(world.wrapperContained,pos.wrapperContained); }
// public boolean method_40054(Object state) { return wrapperContained.method_40054(state); }
// public void method_56167(yarnwrap.item.Item item) { wrapperContained.method_56167(item.wrapperContained); }

}