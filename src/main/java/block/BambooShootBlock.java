package yarnwrap.block;
public class BambooShootBlock { public net.minecraft.block.BambooShootBlock wrapperContained; public BambooShootBlock(net.minecraft.block.BambooShootBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void grow(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.grow(world.wrapperContained,pos.wrapperContained); }

}