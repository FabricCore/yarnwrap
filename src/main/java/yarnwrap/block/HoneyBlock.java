package yarnwrap.block;
public class HoneyBlock { public net.minecraft.block.HoneyBlock wrapperContained; public HoneyBlock(net.minecraft.block.HoneyBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.HoneyBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.HoneyBlock.SHAPE = value.wrapperContained; }

// public int TICKS_PER_SECOND() { return wrapperContained.TICKS_PER_SECOND; }
// public void TICKS_PER_SECOND(int value) { wrapperContained.TICKS_PER_SECOND = value; }
// public static int TICKS_PER_SECOND() { return net.minecraft.block.HoneyBlock.TICKS_PER_SECOND; }
// public static void TICKS_PER_SECOND(int value, ) { net.minecraft.block.HoneyBlock.TICKS_PER_SECOND = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.HoneyBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.HoneyBlock.CODEC = value; }

// public void addParticles(yarnwrap.entity.Entity entity,int count) { wrapperContained.addParticles(entity.wrapperContained,count); }
// public static void addParticles(yarnwrap.entity.Entity entity,int count, ) { net.minecraft.block.HoneyBlock.addParticles(entity.wrapperContained,count); }
// public boolean isSliding(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity) { return wrapperContained.isSliding(pos.wrapperContained,entity.wrapperContained); }
// public static boolean isSliding(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity, ) { return net.minecraft.block.HoneyBlock.isSliding(pos.wrapperContained,entity.wrapperContained); }
// public void addRegularParticles(yarnwrap.entity.Entity entity) { wrapperContained.addRegularParticles(entity.wrapperContained); }
// public static void addRegularParticles(yarnwrap.entity.Entity entity, ) { net.minecraft.block.HoneyBlock.addRegularParticles(entity.wrapperContained); }
// public void triggerAdvancement(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos) { wrapperContained.triggerAdvancement(entity.wrapperContained,pos.wrapperContained); }
// public static void triggerAdvancement(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.HoneyBlock.triggerAdvancement(entity.wrapperContained,pos.wrapperContained); }
// public void addCollisionEffects(yarnwrap.world.World world,yarnwrap.entity.Entity entity) { wrapperContained.addCollisionEffects(world.wrapperContained,entity.wrapperContained); }
// public static void addCollisionEffects(yarnwrap.world.World world,yarnwrap.entity.Entity entity, ) { net.minecraft.block.HoneyBlock.addCollisionEffects(world.wrapperContained,entity.wrapperContained); }
// public void addRichParticles(yarnwrap.entity.Entity entity) { wrapperContained.addRichParticles(entity.wrapperContained); }
// public static void addRichParticles(yarnwrap.entity.Entity entity, ) { net.minecraft.block.HoneyBlock.addRichParticles(entity.wrapperContained); }
// public boolean hasHoneyBlockEffects(yarnwrap.entity.Entity entity) { return wrapperContained.hasHoneyBlockEffects(entity.wrapperContained); }
// public static boolean hasHoneyBlockEffects(yarnwrap.entity.Entity entity, ) { return net.minecraft.block.HoneyBlock.hasHoneyBlockEffects(entity.wrapperContained); }
// public void updateSlidingVelocity(yarnwrap.entity.Entity entity) { wrapperContained.updateSlidingVelocity(entity.wrapperContained); }
// public static void updateSlidingVelocity(yarnwrap.entity.Entity entity, ) { net.minecraft.block.HoneyBlock.updateSlidingVelocity(entity.wrapperContained); }

}