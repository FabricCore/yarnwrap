package yarnwrap.block.entity;
public class ConduitBlockEntity { public net.minecraft.block.entity.ConduitBlockEntity wrapperContained; public ConduitBlockEntity(net.minecraft.block.entity.ConduitBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.block.Block[] ACTIVATING_BLOCKS() { return wrapperContained.ACTIVATING_BLOCKS; }
// public void ACTIVATING_BLOCKS(net.minecraft.block.Block[] value) { wrapperContained.ACTIVATING_BLOCKS = value; }
// public static net.minecraft.block.Block[] ACTIVATING_BLOCKS() { return net.minecraft.block.entity.ConduitBlockEntity.ACTIVATING_BLOCKS; }
// public static void ACTIVATING_BLOCKS(net.minecraft.block.Block[] value, ) { net.minecraft.block.entity.ConduitBlockEntity.ACTIVATING_BLOCKS = value; }

// public float ticksActive() { return wrapperContained.ticksActive; }
// public void ticksActive(float value) { wrapperContained.ticksActive = value; }
// public static float ticksActive() { return net.minecraft.block.entity.ConduitBlockEntity.ticksActive; }
// public static void ticksActive(float value, ) { net.minecraft.block.entity.ConduitBlockEntity.ticksActive = value; }

// public boolean eyeOpen() { return wrapperContained.eyeOpen; }
// public void eyeOpen(boolean value) { wrapperContained.eyeOpen = value; }
// public static boolean eyeOpen() { return net.minecraft.block.entity.ConduitBlockEntity.eyeOpen; }
// public static void eyeOpen(boolean value, ) { net.minecraft.block.entity.ConduitBlockEntity.eyeOpen = value; }

// public boolean active() { return wrapperContained.active; }
// public void active(boolean value) { wrapperContained.active = value; }
// public static boolean active() { return net.minecraft.block.entity.ConduitBlockEntity.active; }
// public static void active(boolean value, ) { net.minecraft.block.entity.ConduitBlockEntity.active = value; }

public int ticks() { return wrapperContained.ticks; }
public void ticks(int value) { wrapperContained.ticks = value; }
// public static int ticks() { return net.minecraft.block.entity.ConduitBlockEntity.ticks; }
// public static void ticks(int value, ) { net.minecraft.block.entity.ConduitBlockEntity.ticks = value; }

// public java.util.List activatingBlocks() { return wrapperContained.activatingBlocks; }
// public void activatingBlocks(java.util.List value) { wrapperContained.activatingBlocks = value; }
// public static java.util.List activatingBlocks() { return net.minecraft.block.entity.ConduitBlockEntity.activatingBlocks; }
// public static void activatingBlocks(java.util.List value, ) { net.minecraft.block.entity.ConduitBlockEntity.activatingBlocks = value; }

// public long nextAmbientSoundTime() { return wrapperContained.nextAmbientSoundTime; }
// public void nextAmbientSoundTime(long value) { wrapperContained.nextAmbientSoundTime = value; }
// public static long nextAmbientSoundTime() { return net.minecraft.block.entity.ConduitBlockEntity.nextAmbientSoundTime; }
// public static void nextAmbientSoundTime(long value, ) { net.minecraft.block.entity.ConduitBlockEntity.nextAmbientSoundTime = value; }

// // public yarnwrap.entity.LazyEntityReference targetEntity() { return new yarnwrap.entity.LazyEntityReference(wrapperContained.targetEntity); }
// // public void targetEntity(yarnwrap.entity.LazyEntityReference value) { wrapperContained.targetEntity = value.wrapperContained; }
// // public static yarnwrap.entity.LazyEntityReference targetEntity() { return new yarnwrap.entity.LazyEntityReference(net.minecraft.block.entity.ConduitBlockEntity.targetEntity); }
// // public static void targetEntity(yarnwrap.entity.LazyEntityReference value, ) { net.minecraft.block.entity.ConduitBlockEntity.targetEntity = value.wrapperContained; }

// public int MIN_BLOCKS_TO_ACTIVATE() { return wrapperContained.MIN_BLOCKS_TO_ACTIVATE; }
// public void MIN_BLOCKS_TO_ACTIVATE(int value) { wrapperContained.MIN_BLOCKS_TO_ACTIVATE = value; }
// public static int MIN_BLOCKS_TO_ACTIVATE() { return net.minecraft.block.entity.ConduitBlockEntity.MIN_BLOCKS_TO_ACTIVATE; }
// public static void MIN_BLOCKS_TO_ACTIVATE(int value, ) { net.minecraft.block.entity.ConduitBlockEntity.MIN_BLOCKS_TO_ACTIVATE = value; }

public ConduitBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.ConduitBlockEntity(pos.wrapperContained,state.wrapperContained); }
// public void givePlayersEffects(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List activatingBlocks) { wrapperContained.givePlayersEffects(world.wrapperContained,pos.wrapperContained,activatingBlocks); }
// public static void givePlayersEffects(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List activatingBlocks, ) { net.minecraft.block.entity.ConduitBlockEntity.givePlayersEffects(world.wrapperContained,pos.wrapperContained,activatingBlocks); }
// public yarnwrap.util.math.Box getAttackZone(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.Box(wrapperContained.getAttackZone(pos.wrapperContained)); }
// public static yarnwrap.util.math.Box getAttackZone(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.Box(net.minecraft.block.entity.ConduitBlockEntity.getAttackZone(pos.wrapperContained)); }
public float getRotation(float tickProgress) { return wrapperContained.getRotation(tickProgress); }
// public static float getRotation(float tickProgress, ) { return net.minecraft.block.entity.ConduitBlockEntity.getRotation(tickProgress); }
// public void setEyeOpen(boolean eyeOpen) { wrapperContained.setEyeOpen(eyeOpen); }
// public static void setEyeOpen(boolean eyeOpen, ) { net.minecraft.block.entity.ConduitBlockEntity.setEyeOpen(eyeOpen); }
// public void spawnNautilusParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List activatingBlocks,yarnwrap.entity.Entity entity,int ticks) { wrapperContained.spawnNautilusParticles(world.wrapperContained,pos.wrapperContained,activatingBlocks,entity.wrapperContained,ticks); }
// public static void spawnNautilusParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List activatingBlocks,yarnwrap.entity.Entity entity,int ticks, ) { net.minecraft.block.entity.ConduitBlockEntity.spawnNautilusParticles(world.wrapperContained,pos.wrapperContained,activatingBlocks,entity.wrapperContained,ticks); }
public boolean isActive() { return wrapperContained.isActive(); }
// public static boolean isActive() { return net.minecraft.block.entity.ConduitBlockEntity.isActive(); }
public boolean isEyeOpen() { return wrapperContained.isEyeOpen(); }
// public static boolean isEyeOpen() { return net.minecraft.block.entity.ConduitBlockEntity.isEyeOpen(); }
// public boolean updateActivatingBlocks(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List activatingBlocks) { return wrapperContained.updateActivatingBlocks(world.wrapperContained,pos.wrapperContained,activatingBlocks); }
// public static boolean updateActivatingBlocks(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List activatingBlocks, ) { return net.minecraft.block.entity.ConduitBlockEntity.updateActivatingBlocks(world.wrapperContained,pos.wrapperContained,activatingBlocks); }
// public void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.ConduitBlockEntity blockEntity) { wrapperContained.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.ConduitBlockEntity blockEntity, ) { net.minecraft.block.entity.ConduitBlockEntity.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public void openEye(yarnwrap.block.entity.ConduitBlockEntity blockEntity,java.util.List activatingBlocks) { wrapperContained.openEye(blockEntity.wrapperContained,activatingBlocks); }
// public static void openEye(yarnwrap.block.entity.ConduitBlockEntity blockEntity,java.util.List activatingBlocks, ) { net.minecraft.block.entity.ConduitBlockEntity.openEye(blockEntity.wrapperContained,activatingBlocks); }
// public void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.ConduitBlockEntity blockEntity) { wrapperContained.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.ConduitBlockEntity blockEntity, ) { net.minecraft.block.entity.ConduitBlockEntity.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public yarnwrap.entity.LazyEntityReference findAttackTarget(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.LazyEntityReference(wrapperContained.findAttackTarget(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.entity.LazyEntityReference findAttackTarget(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.entity.LazyEntityReference(net.minecraft.block.entity.ConduitBlockEntity.findAttackTarget(world.wrapperContained,pos.wrapperContained)); }
// public void tryAttack(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.ConduitBlockEntity blockEntity,boolean canAttack) { wrapperContained.tryAttack(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained,canAttack); }
// public static void tryAttack(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.ConduitBlockEntity blockEntity,boolean canAttack, ) { net.minecraft.block.entity.ConduitBlockEntity.tryAttack(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained,canAttack); }
// public yarnwrap.entity.LazyEntityReference getValidTarget(yarnwrap.entity.LazyEntityReference currentTarget,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,boolean canAttack) { return new yarnwrap.entity.LazyEntityReference(wrapperContained.getValidTarget(currentTarget.wrapperContained,world.wrapperContained,pos.wrapperContained,canAttack)); }
// public static yarnwrap.entity.LazyEntityReference getValidTarget(yarnwrap.entity.LazyEntityReference currentTarget,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,boolean canAttack, ) { return new yarnwrap.entity.LazyEntityReference(net.minecraft.block.entity.ConduitBlockEntity.getValidTarget(currentTarget.wrapperContained,world.wrapperContained,pos.wrapperContained,canAttack)); }
// public boolean method_71634(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_71634(entity.wrapperContained); }
// public static boolean method_71634(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.block.entity.ConduitBlockEntity.method_71634(entity.wrapperContained); }

}