package yarnwrap.block.entity;
public class BellBlockEntity { public net.minecraft.block.entity.BellBlockEntity wrapperContained; public BellBlockEntity(net.minecraft.block.entity.BellBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public int ringTicks() { return wrapperContained.ringTicks; }
public void ringTicks(int value) { wrapperContained.ringTicks = value; }
// public static int ringTicks() { return net.minecraft.block.entity.BellBlockEntity.ringTicks; }
// public static void ringTicks(int value, ) { net.minecraft.block.entity.BellBlockEntity.ringTicks = value; }

public boolean ringing() { return wrapperContained.ringing; }
public void ringing(boolean value) { wrapperContained.ringing = value; }
// public static boolean ringing() { return net.minecraft.block.entity.BellBlockEntity.ringing; }
// public static void ringing(boolean value, ) { net.minecraft.block.entity.BellBlockEntity.ringing = value; }

public yarnwrap.util.math.Direction lastSideHit() { return new yarnwrap.util.math.Direction(wrapperContained.lastSideHit); }
public void lastSideHit(yarnwrap.util.math.Direction value) { wrapperContained.lastSideHit = value.wrapperContained; }
// public static yarnwrap.util.math.Direction lastSideHit() { return new yarnwrap.util.math.Direction(net.minecraft.block.entity.BellBlockEntity.lastSideHit); }
// public static void lastSideHit(yarnwrap.util.math.Direction value, ) { net.minecraft.block.entity.BellBlockEntity.lastSideHit = value.wrapperContained; }

// public long lastRingTime() { return wrapperContained.lastRingTime; }
// public void lastRingTime(long value) { wrapperContained.lastRingTime = value; }
// public static long lastRingTime() { return net.minecraft.block.entity.BellBlockEntity.lastRingTime; }
// public static void lastRingTime(long value, ) { net.minecraft.block.entity.BellBlockEntity.lastRingTime = value; }

// public java.util.List hearingEntities() { return wrapperContained.hearingEntities; }
// public void hearingEntities(java.util.List value) { wrapperContained.hearingEntities = value; }
// public static java.util.List hearingEntities() { return net.minecraft.block.entity.BellBlockEntity.hearingEntities; }
// public static void hearingEntities(java.util.List value, ) { net.minecraft.block.entity.BellBlockEntity.hearingEntities = value; }

// public boolean resonating() { return wrapperContained.resonating; }
// public void resonating(boolean value) { wrapperContained.resonating = value; }
// public static boolean resonating() { return net.minecraft.block.entity.BellBlockEntity.resonating; }
// public static void resonating(boolean value, ) { net.minecraft.block.entity.BellBlockEntity.resonating = value; }

// public int resonateTime() { return wrapperContained.resonateTime; }
// public void resonateTime(int value) { wrapperContained.resonateTime = value; }
// public static int resonateTime() { return net.minecraft.block.entity.BellBlockEntity.resonateTime; }
// public static void resonateTime(int value, ) { net.minecraft.block.entity.BellBlockEntity.resonateTime = value; }

// public int MAX_RINGING_TICKS() { return wrapperContained.MAX_RINGING_TICKS; }
// public void MAX_RINGING_TICKS(int value) { wrapperContained.MAX_RINGING_TICKS = value; }
// public static int MAX_RINGING_TICKS() { return net.minecraft.block.entity.BellBlockEntity.MAX_RINGING_TICKS; }
// public static void MAX_RINGING_TICKS(int value, ) { net.minecraft.block.entity.BellBlockEntity.MAX_RINGING_TICKS = value; }

// public int MAX_RESONATING_TICKS() { return wrapperContained.MAX_RESONATING_TICKS; }
// public void MAX_RESONATING_TICKS(int value) { wrapperContained.MAX_RESONATING_TICKS = value; }
// public static int MAX_RESONATING_TICKS() { return net.minecraft.block.entity.BellBlockEntity.MAX_RESONATING_TICKS; }
// public static void MAX_RESONATING_TICKS(int value, ) { net.minecraft.block.entity.BellBlockEntity.MAX_RESONATING_TICKS = value; }

// public int MAX_BELL_HEARING_DISTANCE() { return wrapperContained.MAX_BELL_HEARING_DISTANCE; }
// public void MAX_BELL_HEARING_DISTANCE(int value) { wrapperContained.MAX_BELL_HEARING_DISTANCE = value; }
// public static int MAX_BELL_HEARING_DISTANCE() { return net.minecraft.block.entity.BellBlockEntity.MAX_BELL_HEARING_DISTANCE; }
// public static void MAX_BELL_HEARING_DISTANCE(int value, ) { net.minecraft.block.entity.BellBlockEntity.MAX_BELL_HEARING_DISTANCE = value; }

public BellBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.BellBlockEntity(pos.wrapperContained,state.wrapperContained); }
public void activate(yarnwrap.util.math.Direction direction) { wrapperContained.activate(direction.wrapperContained); }
// public static void activate(yarnwrap.util.math.Direction direction, ) { net.minecraft.block.entity.BellBlockEntity.activate(direction.wrapperContained); }
// public boolean method_20217(yarnwrap.util.math.BlockPos entity) { return wrapperContained.method_20217(entity.wrapperContained); }
// public static boolean method_20217(yarnwrap.util.math.BlockPos entity, ) { return net.minecraft.block.entity.BellBlockEntity.method_20217(entity.wrapperContained); }
// public void applyParticlesToRaiders(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List hearingEntities) { wrapperContained.applyParticlesToRaiders(world.wrapperContained,pos.wrapperContained,hearingEntities); }
// public static void applyParticlesToRaiders(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List hearingEntities, ) { net.minecraft.block.entity.BellBlockEntity.applyParticlesToRaiders(world.wrapperContained,pos.wrapperContained,hearingEntities); }
// public void notifyMemoriesOfBell() { wrapperContained.notifyMemoriesOfBell(); }
// public static void notifyMemoriesOfBell() { net.minecraft.block.entity.BellBlockEntity.notifyMemoriesOfBell(); }
// public boolean isRaiderEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.LivingEntity entity) { return wrapperContained.isRaiderEntity(pos.wrapperContained,entity.wrapperContained); }
// public static boolean isRaiderEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.block.entity.BellBlockEntity.isRaiderEntity(pos.wrapperContained,entity.wrapperContained); }
// public void method_20519(yarnwrap.util.math.BlockPos entity) { wrapperContained.method_20519(entity.wrapperContained); }
// public static void method_20519(yarnwrap.util.math.BlockPos entity, ) { net.minecraft.block.entity.BellBlockEntity.method_20519(entity.wrapperContained); }
// public void applyGlowToEntity(yarnwrap.entity.LivingEntity entity) { wrapperContained.applyGlowToEntity(entity.wrapperContained); }
// public static void applyGlowToEntity(yarnwrap.entity.LivingEntity entity, ) { net.minecraft.block.entity.BellBlockEntity.applyGlowToEntity(entity.wrapperContained); }
// public void applyGlowToRaiders(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List hearingEntities) { wrapperContained.applyGlowToRaiders(world.wrapperContained,pos.wrapperContained,hearingEntities); }
// public static void applyGlowToRaiders(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List hearingEntities, ) { net.minecraft.block.entity.BellBlockEntity.applyGlowToRaiders(world.wrapperContained,pos.wrapperContained,hearingEntities); }
// public boolean raidersHearBell(yarnwrap.util.math.BlockPos pos,java.util.List hearingEntities) { return wrapperContained.raidersHearBell(pos.wrapperContained,hearingEntities); }
// public static boolean raidersHearBell(yarnwrap.util.math.BlockPos pos,java.util.List hearingEntities, ) { return net.minecraft.block.entity.BellBlockEntity.raidersHearBell(pos.wrapperContained,hearingEntities); }
// public void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BellBlockEntity blockEntity) { wrapperContained.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BellBlockEntity blockEntity, ) { net.minecraft.block.entity.BellBlockEntity.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BellBlockEntity blockEntity,Object bellEffect) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained,bellEffect); }
// public static void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BellBlockEntity blockEntity,Object bellEffect, ) { net.minecraft.block.entity.BellBlockEntity.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained,bellEffect); }
// public void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BellBlockEntity blockEntity) { wrapperContained.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BellBlockEntity blockEntity, ) { net.minecraft.block.entity.BellBlockEntity.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public boolean method_31660(yarnwrap.util.math.BlockPos entity) { return wrapperContained.method_31660(entity.wrapperContained); }
// public static boolean method_31660(yarnwrap.util.math.BlockPos entity, ) { return net.minecraft.block.entity.BellBlockEntity.method_31660(entity.wrapperContained); }
// public boolean method_31661(yarnwrap.util.math.BlockPos entity) { return wrapperContained.method_31661(entity.wrapperContained); }
// public static boolean method_31661(yarnwrap.util.math.BlockPos entity, ) { return net.minecraft.block.entity.BellBlockEntity.method_31661(entity.wrapperContained); }

}