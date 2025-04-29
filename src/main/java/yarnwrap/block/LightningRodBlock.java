package yarnwrap.block;
public class LightningRodBlock { public net.minecraft.block.LightningRodBlock wrapperContained; public LightningRodBlock(net.minecraft.block.LightningRodBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.LightningRodBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.LightningRodBlock.POWERED = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.LightningRodBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.LightningRodBlock.WATERLOGGED = value.wrapperContained; }

// public int MAX_REDIRECT_DISTANCE() { return wrapperContained.MAX_REDIRECT_DISTANCE; }
// public void MAX_REDIRECT_DISTANCE(int value) { wrapperContained.MAX_REDIRECT_DISTANCE = value; }
public static int MAX_REDIRECT_DISTANCE() { return net.minecraft.block.LightningRodBlock.MAX_REDIRECT_DISTANCE; }
// public static void MAX_REDIRECT_DISTANCE(int value, ) { net.minecraft.block.LightningRodBlock.MAX_REDIRECT_DISTANCE = value; }

// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
// public void SCHEDULED_TICK_DELAY(int value) { wrapperContained.SCHEDULED_TICK_DELAY = value; }
// public static int SCHEDULED_TICK_DELAY() { return net.minecraft.block.LightningRodBlock.SCHEDULED_TICK_DELAY; }
// public static void SCHEDULED_TICK_DELAY(int value, ) { net.minecraft.block.LightningRodBlock.SCHEDULED_TICK_DELAY = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.LightningRodBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.LightningRodBlock.CODEC = value; }

public void setPowered(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.setPowered(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static void setPowered(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.LightningRodBlock.setPowered(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public void updateNeighbors(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.updateNeighbors(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static void updateNeighbors(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.LightningRodBlock.updateNeighbors(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}