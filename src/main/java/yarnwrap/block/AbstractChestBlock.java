package yarnwrap.block;
public class AbstractChestBlock { public net.minecraft.block.AbstractChestBlock wrapperContained; public AbstractChestBlock(net.minecraft.block.AbstractChestBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier entityTypeRetriever() { return wrapperContained.entityTypeRetriever; }
// public void entityTypeRetriever(java.util.function.Supplier value) { wrapperContained.entityTypeRetriever = value; }
// public static java.util.function.Supplier entityTypeRetriever() { return net.minecraft.block.AbstractChestBlock.entityTypeRetriever; }
// public static void entityTypeRetriever(java.util.function.Supplier value, ) { net.minecraft.block.AbstractChestBlock.entityTypeRetriever = value; }

// public AbstractChestBlock(Object settings,java.util.function.Supplier entityTypeRetriever) { this.wrapperContained = new net.minecraft.block.AbstractChestBlock(settings,entityTypeRetriever); }
public Object getBlockEntitySource(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean ignoreBlocked) { return wrapperContained.getBlockEntitySource(state.wrapperContained,world.wrapperContained,pos.wrapperContained,ignoreBlocked); }
// public static Object getBlockEntitySource(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean ignoreBlocked, ) { return net.minecraft.block.AbstractChestBlock.getBlockEntitySource(state.wrapperContained,world.wrapperContained,pos.wrapperContained,ignoreBlocked); }

}