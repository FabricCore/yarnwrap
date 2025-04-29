package yarnwrap.block;
public class RedstoneTorchBlock { public net.minecraft.block.RedstoneTorchBlock wrapperContained; public RedstoneTorchBlock(net.minecraft.block.RedstoneTorchBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map BURNOUT_MAP() { return wrapperContained.BURNOUT_MAP; }
// public void BURNOUT_MAP(java.util.Map value) { wrapperContained.BURNOUT_MAP = value; }
// public static java.util.Map BURNOUT_MAP() { return net.minecraft.block.RedstoneTorchBlock.BURNOUT_MAP; }
// public static void BURNOUT_MAP(java.util.Map value, ) { net.minecraft.block.RedstoneTorchBlock.BURNOUT_MAP = value; }

// public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
// public void LIT(yarnwrap.state.property.BooleanProperty value) { wrapperContained.LIT = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.RedstoneTorchBlock.LIT); }
// public static void LIT(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.RedstoneTorchBlock.LIT = value.wrapperContained; }

// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
// public void SCHEDULED_TICK_DELAY(int value) { wrapperContained.SCHEDULED_TICK_DELAY = value; }
// public static int SCHEDULED_TICK_DELAY() { return net.minecraft.block.RedstoneTorchBlock.SCHEDULED_TICK_DELAY; }
// public static void SCHEDULED_TICK_DELAY(int value, ) { net.minecraft.block.RedstoneTorchBlock.SCHEDULED_TICK_DELAY = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.RedstoneTorchBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.RedstoneTorchBlock.CODEC = value; }

// public boolean shouldUnpower(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.shouldUnpower(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static boolean shouldUnpower(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.block.RedstoneTorchBlock.shouldUnpower(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean isBurnedOut(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean addNew) { return wrapperContained.isBurnedOut(world.wrapperContained,pos.wrapperContained,addNew); }
// public static boolean isBurnedOut(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean addNew, ) { return net.minecraft.block.RedstoneTorchBlock.isBurnedOut(world.wrapperContained,pos.wrapperContained,addNew); }
// public java.util.List method_20453(yarnwrap.world.BlockView worldx) { return wrapperContained.method_20453(worldx.wrapperContained); }
// public static java.util.List method_20453(yarnwrap.world.BlockView worldx, ) { return net.minecraft.block.RedstoneTorchBlock.method_20453(worldx.wrapperContained); }

}