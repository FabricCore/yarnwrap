package yarnwrap.block.entity;
public class BellBlockEntity { public net.minecraft.block.entity.BellBlockEntity wrapperContained; public BellBlockEntity(net.minecraft.block.entity.BellBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public int ringTicks() { return wrapperContained.ringTicks; }
public boolean ringing() { return wrapperContained.ringing; }
public yarnwrap.util.math.Direction lastSideHit() { return new yarnwrap.util.math.Direction(wrapperContained.lastSideHit); }
// public long lastRingTime() { return wrapperContained.lastRingTime; }
// public java.util.List hearingEntities() { return wrapperContained.hearingEntities; }
// public boolean resonating() { return wrapperContained.resonating; }
// public int resonateTime() { return wrapperContained.resonateTime; }
// public int MAX_RINGING_TICKS() { return wrapperContained.MAX_RINGING_TICKS; }
// public int MAX_RESONATING_TICKS() { return wrapperContained.MAX_RESONATING_TICKS; }
// public int MAX_BELL_HEARING_DISTANCE() { return wrapperContained.MAX_BELL_HEARING_DISTANCE; }
public void activate(yarnwrap.util.math.Direction direction) { wrapperContained.activate(direction.wrapperContained); }
// public void applyParticlesToRaiders(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List hearingEntities) { wrapperContained.applyParticlesToRaiders(world.wrapperContained,pos.wrapperContained,hearingEntities); }
// public void notifyMemoriesOfBell() { wrapperContained.notifyMemoriesOfBell(); }
// public boolean isRaiderEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.LivingEntity entity) { return wrapperContained.isRaiderEntity(pos.wrapperContained,entity.wrapperContained); }
// public void applyGlowToEntity(yarnwrap.entity.LivingEntity entity) { wrapperContained.applyGlowToEntity(entity.wrapperContained); }
// public void applyGlowToRaiders(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List hearingEntities) { wrapperContained.applyGlowToRaiders(world.wrapperContained,pos.wrapperContained,hearingEntities); }
// public boolean raidersHearBell(yarnwrap.util.math.BlockPos pos,java.util.List hearingEntities) { return wrapperContained.raidersHearBell(pos.wrapperContained,hearingEntities); }
public void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BellBlockEntity blockEntity) { wrapperContained.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BellBlockEntity blockEntity,Object bellEffect) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained,bellEffect); }
public void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BellBlockEntity blockEntity) { wrapperContained.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }

}