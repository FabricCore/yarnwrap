package yarnwrap.block;
public class FarmlandBlock { public net.minecraft.block.FarmlandBlock wrapperContained; public FarmlandBlock(net.minecraft.block.FarmlandBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty MOISTURE() { return new yarnwrap.state.property.IntProperty(wrapperContained.MOISTURE); }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public int MAX_MOISTURE() { return wrapperContained.MAX_MOISTURE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public boolean hasCrop(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasCrop(world.wrapperContained,pos.wrapperContained); }
public void setToDirt(yarnwrap.entity.Entity entity,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.setToDirt(entity.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public boolean isWaterNearby(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isWaterNearby(world.wrapperContained,pos.wrapperContained); }

}