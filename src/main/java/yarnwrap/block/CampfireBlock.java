package yarnwrap.block;
public class CampfireBlock { public net.minecraft.block.CampfireBlock wrapperContained; public CampfireBlock(net.minecraft.block.CampfireBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.CampfireBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.CampfireBlock.SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
// public void LIT(yarnwrap.state.property.BooleanProperty value) { wrapperContained.LIT = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.CampfireBlock.LIT); }
// public static void LIT(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.CampfireBlock.LIT = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty SIGNAL_FIRE() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SIGNAL_FIRE); }
// public void SIGNAL_FIRE(yarnwrap.state.property.BooleanProperty value) { wrapperContained.SIGNAL_FIRE = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty SIGNAL_FIRE() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.CampfireBlock.SIGNAL_FIRE); }
// public static void SIGNAL_FIRE(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.CampfireBlock.SIGNAL_FIRE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.CampfireBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.CampfireBlock.WATERLOGGED = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.CampfireBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.CampfireBlock.FACING = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SMOKEY_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SMOKEY_SHAPE); }
// public void SMOKEY_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SMOKEY_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SMOKEY_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.CampfireBlock.SMOKEY_SHAPE); }
// public static void SMOKEY_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.CampfireBlock.SMOKEY_SHAPE = value.wrapperContained; }

// public boolean emitsParticles() { return wrapperContained.emitsParticles; }
// public void emitsParticles(boolean value) { wrapperContained.emitsParticles = value; }
// public static boolean emitsParticles() { return net.minecraft.block.CampfireBlock.emitsParticles; }
// public static void emitsParticles(boolean value, ) { net.minecraft.block.CampfireBlock.emitsParticles = value; }

// public int fireDamage() { return wrapperContained.fireDamage; }
// public void fireDamage(int value) { wrapperContained.fireDamage = value; }
// public static int fireDamage() { return net.minecraft.block.CampfireBlock.fireDamage; }
// public static void fireDamage(int value, ) { net.minecraft.block.CampfireBlock.fireDamage = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CampfireBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CampfireBlock.CODEC = value; }

// public CampfireBlock(boolean emitsParticles,int fireDamage,Object settings) { this.wrapperContained = new net.minecraft.block.CampfireBlock(emitsParticles,fireDamage,settings); }
// public void spawnSmokeParticle(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean isSignal,boolean lotsOfSmoke) { wrapperContained.spawnSmokeParticle(world.wrapperContained,pos.wrapperContained,isSignal,lotsOfSmoke); }
// public static void spawnSmokeParticle(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean isSignal,boolean lotsOfSmoke, ) { net.minecraft.block.CampfireBlock.spawnSmokeParticle(world.wrapperContained,pos.wrapperContained,isSignal,lotsOfSmoke); }
// public boolean isSignalFireBaseBlock(yarnwrap.block.BlockState state) { return wrapperContained.isSignalFireBaseBlock(state.wrapperContained); }
// public static boolean isSignalFireBaseBlock(yarnwrap.block.BlockState state, ) { return net.minecraft.block.CampfireBlock.isSignalFireBaseBlock(state.wrapperContained); }
// public boolean isLitCampfireInRange(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isLitCampfireInRange(world.wrapperContained,pos.wrapperContained); }
// public static boolean isLitCampfireInRange(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.CampfireBlock.isLitCampfireInRange(world.wrapperContained,pos.wrapperContained); }
// public boolean isLitCampfire(yarnwrap.block.BlockState state) { return wrapperContained.isLitCampfire(state.wrapperContained); }
// public static boolean isLitCampfire(yarnwrap.block.BlockState state, ) { return net.minecraft.block.CampfireBlock.isLitCampfire(state.wrapperContained); }
// public void extinguish(yarnwrap.entity.Entity entity,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.extinguish(entity.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void extinguish(yarnwrap.entity.Entity entity,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.CampfireBlock.extinguish(entity.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean method_30034(Object statex) { return wrapperContained.method_30034(statex); }
// public static boolean method_30034(Object statex, ) { return net.minecraft.block.CampfireBlock.method_30034(statex); }
// public boolean canBeLit(yarnwrap.block.BlockState state) { return wrapperContained.canBeLit(state.wrapperContained); }
// public static boolean canBeLit(yarnwrap.block.BlockState state, ) { return net.minecraft.block.CampfireBlock.canBeLit(state.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53986(Object instance) { return wrapperContained.method_53986(instance); }
// public static com.mojang.datafixers.kinds.App method_53986(Object instance, ) { return net.minecraft.block.CampfireBlock.method_53986(instance); }
// public java.lang.Integer method_53987(yarnwrap.block.CampfireBlock block) { return wrapperContained.method_53987(block.wrapperContained); }
// public static java.lang.Integer method_53987(yarnwrap.block.CampfireBlock block, ) { return net.minecraft.block.CampfireBlock.method_53987(block.wrapperContained); }
// public java.lang.Boolean method_53988(yarnwrap.block.CampfireBlock block) { return wrapperContained.method_53988(block.wrapperContained); }
// public static java.lang.Boolean method_53988(yarnwrap.block.CampfireBlock block, ) { return net.minecraft.block.CampfireBlock.method_53988(block.wrapperContained); }
// public void method_64781(yarnwrap.server.world.ServerWorld world,Object pos,yarnwrap.world.World state,yarnwrap.util.math.BlockPos blockEntity) { wrapperContained.method_64781(world.wrapperContained,pos,state.wrapperContained,blockEntity.wrapperContained); }
// public static void method_64781(yarnwrap.server.world.ServerWorld world,Object pos,yarnwrap.world.World state,yarnwrap.util.math.BlockPos blockEntity, ) { net.minecraft.block.CampfireBlock.method_64781(world.wrapperContained,pos,state.wrapperContained,blockEntity.wrapperContained); }

}