package yarnwrap.block.entity;
public class BellBlockEntity { public net.minecraft.block.entity.BellBlockEntity wrapperContained; public BellBlockEntity(net.minecraft.block.entity.BellBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public int ringTicks() { return wrapperContained.ringTicks; }
public void ringTicks(int value) { wrapperContained.ringTicks = value; }
public boolean ringing() { return wrapperContained.ringing; }
public void ringing(boolean value) { wrapperContained.ringing = value; }
public yarnwrap.util.math.Direction lastSideHit() { return new yarnwrap.util.math.Direction(wrapperContained.lastSideHit); }
public void lastSideHit(yarnwrap.util.math.Direction value) { wrapperContained.lastSideHit = value.wrapperContained; }
// public long lastRingTime() { return wrapperContained.lastRingTime; }
// public void lastRingTime(long value) { wrapperContained.lastRingTime = value; }
// public java.util.List hearingEntities() { return wrapperContained.hearingEntities; }
// public void hearingEntities(java.util.List value) { wrapperContained.hearingEntities = value; }
// public boolean resonating() { return wrapperContained.resonating; }
// public void resonating(boolean value) { wrapperContained.resonating = value; }
// public int resonateTime() { return wrapperContained.resonateTime; }
// public void resonateTime(int value) { wrapperContained.resonateTime = value; }
// public int MAX_RINGING_TICKS() { return wrapperContained.MAX_RINGING_TICKS; }
// public void MAX_RINGING_TICKS(int value) { wrapperContained.MAX_RINGING_TICKS = value; }
// public int MAX_RESONATING_TICKS() { return wrapperContained.MAX_RESONATING_TICKS; }
// public void MAX_RESONATING_TICKS(int value) { wrapperContained.MAX_RESONATING_TICKS = value; }
// public int MAX_BELL_HEARING_DISTANCE() { return wrapperContained.MAX_BELL_HEARING_DISTANCE; }
// public void MAX_BELL_HEARING_DISTANCE(int value) { wrapperContained.MAX_BELL_HEARING_DISTANCE = value; }
public BellBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.BellBlockEntity(pos.wrapperContained,state.wrapperContained); }
public void activate(yarnwrap.util.math.Direction direction) { wrapperContained.activate(direction.wrapperContained); }
// public boolean method_20217(yarnwrap.util.math.BlockPos entity) { return wrapperContained.method_20217(entity.wrapperContained); }
// public void applyParticlesToRaiders(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List hearingEntities) { wrapperContained.applyParticlesToRaiders(world.wrapperContained,pos.wrapperContained,hearingEntities); }
// public void notifyMemoriesOfBell() { wrapperContained.notifyMemoriesOfBell(); }
// public boolean isRaiderEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.LivingEntity entity) { return wrapperContained.isRaiderEntity(pos.wrapperContained,entity.wrapperContained); }
// public void method_20519(yarnwrap.util.math.BlockPos entity) { wrapperContained.method_20519(entity.wrapperContained); }
// public void applyGlowToEntity(yarnwrap.entity.LivingEntity entity) { wrapperContained.applyGlowToEntity(entity.wrapperContained); }
// public void applyGlowToRaiders(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List hearingEntities) { wrapperContained.applyGlowToRaiders(world.wrapperContained,pos.wrapperContained,hearingEntities); }
// public boolean raidersHearBell(yarnwrap.util.math.BlockPos pos,java.util.List hearingEntities) { return wrapperContained.raidersHearBell(pos.wrapperContained,hearingEntities); }
public void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BellBlockEntity blockEntity) { wrapperContained.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BellBlockEntity blockEntity,Object bellEffect) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained,bellEffect); }
public void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BellBlockEntity blockEntity) { wrapperContained.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public boolean method_31660(yarnwrap.util.math.BlockPos entity) { return wrapperContained.method_31660(entity.wrapperContained); }
// public boolean method_31661(yarnwrap.util.math.BlockPos entity) { return wrapperContained.method_31661(entity.wrapperContained); }

}