package yarnwrap.block.dispenser;
public class ShearsDispenserBehavior { public net.minecraft.block.dispenser.ShearsDispenserBehavior wrapperContained; public ShearsDispenserBehavior(net.minecraft.block.dispenser.ShearsDispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean tryShearBlock(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.tryShearBlock(world.wrapperContained,pos.wrapperContained); }
// public static boolean tryShearBlock(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.dispenser.ShearsDispenserBehavior.tryShearBlock(world.wrapperContained,pos.wrapperContained); }
// public boolean tryShearEntity(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.tryShearEntity(world.wrapperContained,pos.wrapperContained); }
// public static boolean tryShearEntity(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.dispenser.ShearsDispenserBehavior.tryShearEntity(world.wrapperContained,pos.wrapperContained); }
// public boolean method_40054(Object state) { return wrapperContained.method_40054(state); }
// public static boolean method_40054(Object state, ) { return net.minecraft.block.dispenser.ShearsDispenserBehavior.method_40054(state); }
// public void method_56167(yarnwrap.item.Item item) { wrapperContained.method_56167(item.wrapperContained); }
// public static void method_56167(yarnwrap.item.Item item, ) { net.minecraft.block.dispenser.ShearsDispenserBehavior.method_56167(item.wrapperContained); }

}