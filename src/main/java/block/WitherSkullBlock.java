package yarnwrap.block;
public class WitherSkullBlock { public net.minecraft.block.WitherSkullBlock wrapperContained; public WitherSkullBlock(net.minecraft.block.WitherSkullBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.pattern.BlockPattern witherDispenserPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.witherDispenserPattern); }
// public yarnwrap.block.pattern.BlockPattern witherBossPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.witherBossPattern); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.block.pattern.BlockPattern getWitherDispenserPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.getWitherDispenserPattern()); }
public void onPlaced(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.SkullBlockEntity blockEntity) { wrapperContained.onPlaced(world.wrapperContained,pos.wrapperContained,blockEntity.wrapperContained); }
public boolean canDispense(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack) { return wrapperContained.canDispense(world.wrapperContained,pos.wrapperContained,stack.wrapperContained); }
// public yarnwrap.block.pattern.BlockPattern getWitherBossPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.getWitherBossPattern()); }
public void onPlaced(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.onPlaced(world.wrapperContained,pos.wrapperContained); }

}