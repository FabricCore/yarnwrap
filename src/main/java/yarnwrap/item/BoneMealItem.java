package yarnwrap.item;
public class BoneMealItem { public net.minecraft.item.BoneMealItem wrapperContained; public BoneMealItem(net.minecraft.item.BoneMealItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_40006(Object state) { return wrapperContained.method_40006(state); }
// public yarnwrap.block.BlockState method_40128(yarnwrap.registry.entry.RegistryEntry blockEntry) { return new yarnwrap.block.BlockState(wrapperContained.method_40128(blockEntry.wrapperContained)); }
// public yarnwrap.block.BlockState method_40130(yarnwrap.registry.entry.RegistryEntry blockEntry) { return new yarnwrap.block.BlockState(wrapperContained.method_40130(blockEntry.wrapperContained)); }
public boolean useOnGround(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.util.math.BlockPos blockPos,yarnwrap.util.math.Direction facing) { return wrapperContained.useOnGround(stack.wrapperContained,world.wrapperContained,blockPos.wrapperContained,facing.wrapperContained); }
public boolean useOnFertilizable(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.useOnFertilizable(stack.wrapperContained,world.wrapperContained,pos.wrapperContained); }
public void createParticles(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,int count) { wrapperContained.createParticles(world.wrapperContained,pos.wrapperContained,count); }

}