package yarnwrap.block;
public class BubbleColumnBlock { public net.minecraft.block.BubbleColumnBlock wrapperContained; public BubbleColumnBlock(net.minecraft.block.BubbleColumnBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty DRAG() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.DRAG); }
// public void DRAG(yarnwrap.state.property.BooleanProperty value) { wrapperContained.DRAG = value.wrapperContained; }
// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
// public void SCHEDULED_TICK_DELAY(int value) { wrapperContained.SCHEDULED_TICK_DELAY = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public void update(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState water,yarnwrap.block.BlockState bubbleSource) { wrapperContained.update(world.wrapperContained,pos.wrapperContained,water.wrapperContained,bubbleSource.wrapperContained); }
public void update(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.update(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public yarnwrap.block.BlockState getBubbleState(yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.getBubbleState(state.wrapperContained)); }
// public boolean isStillWater(yarnwrap.block.BlockState state) { return wrapperContained.isStillWater(state.wrapperContained); }

}