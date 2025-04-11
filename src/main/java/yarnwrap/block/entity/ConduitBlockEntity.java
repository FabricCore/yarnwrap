package yarnwrap.block.entity;
public class ConduitBlockEntity { public net.minecraft.block.entity.ConduitBlockEntity wrapperContained; public ConduitBlockEntity(net.minecraft.block.entity.ConduitBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.block.Block[] ACTIVATING_BLOCKS() { return wrapperContained.ACTIVATING_BLOCKS; }
// public void ACTIVATING_BLOCKS(net.minecraft.block.Block[] value) { wrapperContained.ACTIVATING_BLOCKS = value; }
// public float ticksActive() { return wrapperContained.ticksActive; }
// public void ticksActive(float value) { wrapperContained.ticksActive = value; }
// public boolean eyeOpen() { return wrapperContained.eyeOpen; }
// public void eyeOpen(boolean value) { wrapperContained.eyeOpen = value; }
// public boolean active() { return wrapperContained.active; }
// public void active(boolean value) { wrapperContained.active = value; }
// public java.util.UUID targetUuid() { return wrapperContained.targetUuid; }
// public void targetUuid(java.util.UUID value) { wrapperContained.targetUuid = value; }
public int ticks() { return wrapperContained.ticks; }
public void ticks(int value) { wrapperContained.ticks = value; }
// public java.util.List activatingBlocks() { return wrapperContained.activatingBlocks; }
// public void activatingBlocks(java.util.List value) { wrapperContained.activatingBlocks = value; }
// public long nextAmbientSoundTime() { return wrapperContained.nextAmbientSoundTime; }
// public void nextAmbientSoundTime(long value) { wrapperContained.nextAmbientSoundTime = value; }
// public yarnwrap.entity.LivingEntity targetEntity() { return new yarnwrap.entity.LivingEntity(wrapperContained.targetEntity); }
// public void targetEntity(yarnwrap.entity.LivingEntity value) { wrapperContained.targetEntity = value.wrapperContained; }
// public int MIN_BLOCKS_TO_ACTIVATE() { return wrapperContained.MIN_BLOCKS_TO_ACTIVATE; }
// public void MIN_BLOCKS_TO_ACTIVATE(int value) { wrapperContained.MIN_BLOCKS_TO_ACTIVATE = value; }
public ConduitBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.ConduitBlockEntity(pos.wrapperContained,state.wrapperContained); }
// public void givePlayersEffects(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List activatingBlocks) { wrapperContained.givePlayersEffects(world.wrapperContained,pos.wrapperContained,activatingBlocks); }
// public yarnwrap.entity.LivingEntity findTargetEntity(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.UUID uuid) { return new yarnwrap.entity.LivingEntity(wrapperContained.findTargetEntity(world.wrapperContained,pos.wrapperContained,uuid)); }
// public boolean method_11058(java.util.UUID entity) { return wrapperContained.method_11058(entity); }
// public yarnwrap.util.math.Box getAttackZone(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.Box(wrapperContained.getAttackZone(pos.wrapperContained)); }
// public boolean method_11060(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_11060(entity.wrapperContained); }
public float getRotation(float tickDelta) { return wrapperContained.getRotation(tickDelta); }
// public void setEyeOpen(boolean eyeOpen) { wrapperContained.setEyeOpen(eyeOpen); }
// public void spawnNautilusParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List activatingBlocks,yarnwrap.entity.Entity entity,int ticks) { wrapperContained.spawnNautilusParticles(world.wrapperContained,pos.wrapperContained,activatingBlocks,entity.wrapperContained,ticks); }
// public void updateTargetEntity(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.ConduitBlockEntity blockEntity) { wrapperContained.updateTargetEntity(world.wrapperContained,pos.wrapperContained,blockEntity.wrapperContained); }
public boolean isActive() { return wrapperContained.isActive(); }
public boolean isEyeOpen() { return wrapperContained.isEyeOpen(); }
// public void attackHostileEntity(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,java.util.List activatingBlocks,yarnwrap.block.entity.ConduitBlockEntity blockEntity) { wrapperContained.attackHostileEntity(world.wrapperContained,pos.wrapperContained,state.wrapperContained,activatingBlocks,blockEntity.wrapperContained); }
// public boolean updateActivatingBlocks(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List activatingBlocks) { return wrapperContained.updateActivatingBlocks(world.wrapperContained,pos.wrapperContained,activatingBlocks); }
public void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.ConduitBlockEntity blockEntity) { wrapperContained.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public void openEye(yarnwrap.block.entity.ConduitBlockEntity blockEntity,java.util.List activatingBlocks) { wrapperContained.openEye(blockEntity.wrapperContained,activatingBlocks); }
public void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.ConduitBlockEntity blockEntity) { wrapperContained.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }

}