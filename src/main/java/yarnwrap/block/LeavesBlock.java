package yarnwrap.block;
public class LeavesBlock { public net.minecraft.block.LeavesBlock wrapperContained; public LeavesBlock(net.minecraft.block.LeavesBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty DISTANCE() { return new yarnwrap.state.property.IntProperty(wrapperContained.DISTANCE); }
// public void DISTANCE(yarnwrap.state.property.IntProperty value) { wrapperContained.DISTANCE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty DISTANCE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.LeavesBlock.DISTANCE); }
// public static void DISTANCE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.LeavesBlock.DISTANCE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty PERSISTENT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.PERSISTENT); }
// public void PERSISTENT(yarnwrap.state.property.BooleanProperty value) { wrapperContained.PERSISTENT = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty PERSISTENT() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.LeavesBlock.PERSISTENT); }
// public static void PERSISTENT(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.LeavesBlock.PERSISTENT = value.wrapperContained; }

// public int MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
// public void MAX_DISTANCE(int value) { wrapperContained.MAX_DISTANCE = value; }
public static int MAX_DISTANCE() { return net.minecraft.block.LeavesBlock.MAX_DISTANCE; }
// public static void MAX_DISTANCE(int value, ) { net.minecraft.block.LeavesBlock.MAX_DISTANCE = value; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.LeavesBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.LeavesBlock.WATERLOGGED = value.wrapperContained; }

// public float leafParticleChance() { return wrapperContained.leafParticleChance; }
// public void leafParticleChance(float value) { wrapperContained.leafParticleChance = value; }
// public static float leafParticleChance() { return net.minecraft.block.LeavesBlock.leafParticleChance; }
// public static void leafParticleChance(float value, ) { net.minecraft.block.LeavesBlock.leafParticleChance = value; }

// public LeavesBlock(float leafParticleChance,Object settings) { this.wrapperContained = new net.minecraft.block.LeavesBlock(leafParticleChance,settings); }
// public yarnwrap.block.BlockState updateDistanceFromLogs(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.updateDistanceFromLogs(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.block.BlockState updateDistanceFromLogs(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.block.LeavesBlock.updateDistanceFromLogs(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public int getDistanceFromLog(yarnwrap.block.BlockState state) { return wrapperContained.getDistanceFromLog(state.wrapperContained); }
// public static int getDistanceFromLog(yarnwrap.block.BlockState state, ) { return net.minecraft.block.LeavesBlock.getDistanceFromLog(state.wrapperContained); }
// public boolean shouldDecay(yarnwrap.block.BlockState state) { return wrapperContained.shouldDecay(state.wrapperContained); }
// public static boolean shouldDecay(yarnwrap.block.BlockState state, ) { return net.minecraft.block.LeavesBlock.shouldDecay(state.wrapperContained); }
// public java.util.OptionalInt getOptionalDistanceFromLog(yarnwrap.block.BlockState state) { return wrapperContained.getOptionalDistanceFromLog(state.wrapperContained); }
// public static java.util.OptionalInt getOptionalDistanceFromLog(yarnwrap.block.BlockState state, ) { return net.minecraft.block.LeavesBlock.getOptionalDistanceFromLog(state.wrapperContained); }
// public void spawnWaterParticle(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos posBelow) { wrapperContained.spawnWaterParticle(world.wrapperContained,pos.wrapperContained,random.wrapperContained,state.wrapperContained,posBelow.wrapperContained); }
// public static void spawnWaterParticle(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos posBelow, ) { net.minecraft.block.LeavesBlock.spawnWaterParticle(world.wrapperContained,pos.wrapperContained,random.wrapperContained,state.wrapperContained,posBelow.wrapperContained); }
// public void spawnLeafParticle(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos posBelow) { wrapperContained.spawnLeafParticle(world.wrapperContained,pos.wrapperContained,random.wrapperContained,state.wrapperContained,posBelow.wrapperContained); }
// public static void spawnLeafParticle(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos posBelow, ) { net.minecraft.block.LeavesBlock.spawnLeafParticle(world.wrapperContained,pos.wrapperContained,random.wrapperContained,state.wrapperContained,posBelow.wrapperContained); }
// public void spawnLeafParticle(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.spawnLeafParticle(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static void spawnLeafParticle(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { net.minecraft.block.LeavesBlock.spawnLeafParticle(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}