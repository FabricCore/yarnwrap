package yarnwrap.block;
public class LeverBlock { public net.minecraft.block.LeverBlock wrapperContained; public LeverBlock(net.minecraft.block.LeverBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.LeverBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.LeverBlock.POWERED = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.LeverBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.LeverBlock.CODEC = value; }

// public java.util.function.Function shapeFunction() { return wrapperContained.shapeFunction; }
// public void shapeFunction(java.util.function.Function value) { wrapperContained.shapeFunction = value; }
// public static java.util.function.Function shapeFunction() { return net.minecraft.block.LeverBlock.shapeFunction; }
// public static void shapeFunction(java.util.function.Function value, ) { net.minecraft.block.LeverBlock.shapeFunction = value; }

// public void spawnParticles(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,float alpha) { wrapperContained.spawnParticles(state.wrapperContained,world.wrapperContained,pos.wrapperContained,alpha); }
// public static void spawnParticles(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,float alpha, ) { net.minecraft.block.LeverBlock.spawnParticles(state.wrapperContained,world.wrapperContained,pos.wrapperContained,alpha); }
// public void updateNeighbors(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.updateNeighbors(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static void updateNeighbors(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.LeverBlock.updateNeighbors(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
public void togglePower(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.togglePower(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public static void togglePower(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.block.LeverBlock.togglePower(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public void playClickSound(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.playClickSound(player.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void playClickSound(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.LeverBlock.playClickSound(player.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape method_66446(java.util.Map state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66446(state)); }
// public static yarnwrap.util.shape.VoxelShape method_66446(java.util.Map state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.LeverBlock.method_66446(state)); }
// public java.util.function.Function createShapeFunction() { return wrapperContained.createShapeFunction(); }
// public static java.util.function.Function createShapeFunction() { return net.minecraft.block.LeverBlock.createShapeFunction(); }

}