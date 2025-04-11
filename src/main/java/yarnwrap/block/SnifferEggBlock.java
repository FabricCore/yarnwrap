package yarnwrap.block;
public class SnifferEggBlock { public net.minecraft.block.SnifferEggBlock wrapperContained; public SnifferEggBlock(net.minecraft.block.SnifferEggBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public int FINAL_HATCH_STAGE() { return wrapperContained.FINAL_HATCH_STAGE; }
// public void FINAL_HATCH_STAGE(int value) { wrapperContained.FINAL_HATCH_STAGE = value; }
public yarnwrap.state.property.IntProperty HATCH() { return new yarnwrap.state.property.IntProperty(wrapperContained.HATCH); }
// public void HATCH(yarnwrap.state.property.IntProperty value) { wrapperContained.HATCH = value.wrapperContained; }
// public int HATCHING_TIME() { return wrapperContained.HATCHING_TIME; }
// public void HATCHING_TIME(int value) { wrapperContained.HATCHING_TIME = value; }
// public int BOOSTED_HATCHING_TIME() { return wrapperContained.BOOSTED_HATCHING_TIME; }
// public void BOOSTED_HATCHING_TIME(int value) { wrapperContained.BOOSTED_HATCHING_TIME = value; }
// public int MAX_RANDOM_CRACK_TIME_OFFSET() { return wrapperContained.MAX_RANDOM_CRACK_TIME_OFFSET; }
// public void MAX_RANDOM_CRACK_TIME_OFFSET(int value) { wrapperContained.MAX_RANDOM_CRACK_TIME_OFFSET = value; }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public boolean isAboveHatchBooster(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isAboveHatchBooster(world.wrapperContained,pos.wrapperContained); }
public int getHatchStage(yarnwrap.block.BlockState state) { return wrapperContained.getHatchStage(state.wrapperContained); }
// public boolean isReadyToHatch(yarnwrap.block.BlockState state) { return wrapperContained.isReadyToHatch(state.wrapperContained); }

}