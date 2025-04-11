package yarnwrap.block;
public class AbstractChestBlock { public net.minecraft.block.AbstractChestBlock wrapperContained; public AbstractChestBlock(net.minecraft.block.AbstractChestBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier entityTypeRetriever() { return wrapperContained.entityTypeRetriever; }
// public void entityTypeRetriever(java.util.function.Supplier value) { wrapperContained.entityTypeRetriever = value; }
// public AbstractChestBlock(Object settings,java.util.function.Supplier entityTypeSupplier) { this.wrapperContained = new net.minecraft.block.AbstractChestBlock(settings,entityTypeSupplier); }
public Object getBlockEntitySource(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean ignoreBlocked) { return wrapperContained.getBlockEntitySource(state.wrapperContained,world.wrapperContained,pos.wrapperContained,ignoreBlocked); }

}