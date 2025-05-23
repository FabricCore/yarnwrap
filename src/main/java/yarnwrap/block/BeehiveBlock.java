package yarnwrap.block;
public class BeehiveBlock { public net.minecraft.block.BeehiveBlock wrapperContained; public BeehiveBlock(net.minecraft.block.BeehiveBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.BeehiveBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.BeehiveBlock.FACING = value.wrapperContained; }

// public yarnwrap.state.property.IntProperty HONEY_LEVEL() { return new yarnwrap.state.property.IntProperty(wrapperContained.HONEY_LEVEL); }
// public void HONEY_LEVEL(yarnwrap.state.property.IntProperty value) { wrapperContained.HONEY_LEVEL = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty HONEY_LEVEL() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.BeehiveBlock.HONEY_LEVEL); }
// public static void HONEY_LEVEL(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.BeehiveBlock.HONEY_LEVEL = value.wrapperContained; }

// public int FULL_HONEY_LEVEL() { return wrapperContained.FULL_HONEY_LEVEL; }
// public void FULL_HONEY_LEVEL(int value) { wrapperContained.FULL_HONEY_LEVEL = value; }
public static int FULL_HONEY_LEVEL() { return net.minecraft.block.BeehiveBlock.FULL_HONEY_LEVEL; }
// public static void FULL_HONEY_LEVEL(int value, ) { net.minecraft.block.BeehiveBlock.FULL_HONEY_LEVEL = value; }

// public int DROPPED_HONEYCOMB_COUNT() { return wrapperContained.DROPPED_HONEYCOMB_COUNT; }
// public void DROPPED_HONEYCOMB_COUNT(int value) { wrapperContained.DROPPED_HONEYCOMB_COUNT = value; }
// public static int DROPPED_HONEYCOMB_COUNT() { return net.minecraft.block.BeehiveBlock.DROPPED_HONEYCOMB_COUNT; }
// public static void DROPPED_HONEYCOMB_COUNT(int value, ) { net.minecraft.block.BeehiveBlock.DROPPED_HONEYCOMB_COUNT = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.BeehiveBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.BeehiveBlock.CODEC = value; }

// public void addHoneyParticle(yarnwrap.world.World world,double minX,double maxX,double minZ,double maxZ,double height) { wrapperContained.addHoneyParticle(world.wrapperContained,minX,maxX,minZ,maxZ,height); }
// public static void addHoneyParticle(yarnwrap.world.World world,double minX,double maxX,double minZ,double maxZ,double height, ) { net.minecraft.block.BeehiveBlock.addHoneyParticle(world.wrapperContained,minX,maxX,minZ,maxZ,height); }
// public void takeHoney(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,Object beeState) { wrapperContained.takeHoney(world.wrapperContained,state.wrapperContained,pos.wrapperContained,player.wrapperContained,beeState); }
// public static void takeHoney(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,Object beeState, ) { net.minecraft.block.BeehiveBlock.takeHoney(world.wrapperContained,state.wrapperContained,pos.wrapperContained,player.wrapperContained,beeState); }
// public void dropHoneycomb(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.dropHoneycomb(world.wrapperContained,pos.wrapperContained); }
// public static void dropHoneycomb(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.BeehiveBlock.dropHoneycomb(world.wrapperContained,pos.wrapperContained); }
// public void spawnHoneyParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.spawnHoneyParticles(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void spawnHoneyParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.BeehiveBlock.spawnHoneyParticles(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void addHoneyParticle(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.shape.VoxelShape shape,double height) { wrapperContained.addHoneyParticle(world.wrapperContained,pos.wrapperContained,shape.wrapperContained,height); }
// public static void addHoneyParticle(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.shape.VoxelShape shape,double height, ) { net.minecraft.block.BeehiveBlock.addHoneyParticle(world.wrapperContained,pos.wrapperContained,shape.wrapperContained,height); }
public void takeHoney(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { wrapperContained.takeHoney(world.wrapperContained,state.wrapperContained,pos.wrapperContained); }
// public static void takeHoney(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.BeehiveBlock.takeHoney(world.wrapperContained,state.wrapperContained,pos.wrapperContained); }
// public void angerNearbyBees(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.angerNearbyBees(world.wrapperContained,pos.wrapperContained); }
// public static void angerNearbyBees(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.BeehiveBlock.angerNearbyBees(world.wrapperContained,pos.wrapperContained); }
// public boolean hasBees(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasBees(world.wrapperContained,pos.wrapperContained); }
// public static boolean hasBees(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.BeehiveBlock.hasBees(world.wrapperContained,pos.wrapperContained); }

}