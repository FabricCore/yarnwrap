package yarnwrap.block;
public class WitherSkullBlock { public net.minecraft.block.WitherSkullBlock wrapperContained; public WitherSkullBlock(net.minecraft.block.WitherSkullBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.pattern.BlockPattern witherDispenserPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.witherDispenserPattern); }
// public void witherDispenserPattern(yarnwrap.block.pattern.BlockPattern value) { wrapperContained.witherDispenserPattern = value.wrapperContained; }
// public yarnwrap.block.pattern.BlockPattern witherBossPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.witherBossPattern); }
// public void witherBossPattern(yarnwrap.block.pattern.BlockPattern value) { wrapperContained.witherBossPattern = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.block.pattern.BlockPattern getWitherDispenserPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.getWitherDispenserPattern()); }
public void onPlaced(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.SkullBlockEntity blockEntity) { wrapperContained.onPlaced(world.wrapperContained,pos.wrapperContained,blockEntity.wrapperContained); }
public boolean canDispense(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack) { return wrapperContained.canDispense(world.wrapperContained,pos.wrapperContained,stack.wrapperContained); }
// public yarnwrap.block.pattern.BlockPattern getWitherBossPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.getWitherBossPattern()); }
// public boolean method_24798(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.method_24798(pos.wrapperContained); }
// public boolean method_24799(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.method_24799(pos.wrapperContained); }
// public boolean method_51174(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.method_51174(pos.wrapperContained); }
// public boolean method_51175(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.method_51175(pos.wrapperContained); }
public void onPlaced(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.onPlaced(world.wrapperContained,pos.wrapperContained); }

}