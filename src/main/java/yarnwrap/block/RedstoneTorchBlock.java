package yarnwrap.block;
public class RedstoneTorchBlock { public net.minecraft.block.RedstoneTorchBlock wrapperContained; public RedstoneTorchBlock(net.minecraft.block.RedstoneTorchBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map BURNOUT_MAP() { return wrapperContained.BURNOUT_MAP; }
// public void BURNOUT_MAP(java.util.Map value) { wrapperContained.BURNOUT_MAP = value; }
public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
// public void LIT(yarnwrap.state.property.BooleanProperty value) { wrapperContained.LIT = value.wrapperContained; }
// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
// public void SCHEDULED_TICK_DELAY(int value) { wrapperContained.SCHEDULED_TICK_DELAY = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public boolean shouldUnpower(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.shouldUnpower(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean isBurnedOut(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean addNew) { return wrapperContained.isBurnedOut(world.wrapperContained,pos.wrapperContained,addNew); }

}