package yarnwrap.world.tick;
public class TickManager { public net.minecraft.world.tick.TickManager wrapperContained; public TickManager(net.minecraft.world.tick.TickManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public float MIN_TICK_RATE() { return wrapperContained.MIN_TICK_RATE; }
// public void MIN_TICK_RATE(float value) { wrapperContained.MIN_TICK_RATE = value; }
public static float MIN_TICK_RATE() { return net.minecraft.world.tick.TickManager.MIN_TICK_RATE; }
// public static void MIN_TICK_RATE(float value, ) { net.minecraft.world.tick.TickManager.MIN_TICK_RATE = value; }

// public float tickRate() { return wrapperContained.tickRate; }
// public void tickRate(float value) { wrapperContained.tickRate = value; }
// public static float tickRate() { return net.minecraft.world.tick.TickManager.tickRate; }
// public static void tickRate(float value, ) { net.minecraft.world.tick.TickManager.tickRate = value; }

// public long nanosPerTick() { return wrapperContained.nanosPerTick; }
// public void nanosPerTick(long value) { wrapperContained.nanosPerTick = value; }
// public static long nanosPerTick() { return net.minecraft.world.tick.TickManager.nanosPerTick; }
// public static void nanosPerTick(long value, ) { net.minecraft.world.tick.TickManager.nanosPerTick = value; }

// public int stepTicks() { return wrapperContained.stepTicks; }
// public void stepTicks(int value) { wrapperContained.stepTicks = value; }
// public static int stepTicks() { return net.minecraft.world.tick.TickManager.stepTicks; }
// public static void stepTicks(int value, ) { net.minecraft.world.tick.TickManager.stepTicks = value; }

// public boolean shouldTick() { return wrapperContained.shouldTick; }
// public void shouldTick(boolean value) { wrapperContained.shouldTick = value; }
// public static boolean shouldTick() { return net.minecraft.world.tick.TickManager.shouldTick; }
// public static void shouldTick(boolean value, ) { net.minecraft.world.tick.TickManager.shouldTick = value; }

// public boolean frozen() { return wrapperContained.frozen; }
// public void frozen(boolean value) { wrapperContained.frozen = value; }
// public static boolean frozen() { return net.minecraft.world.tick.TickManager.frozen; }
// public static void frozen(boolean value, ) { net.minecraft.world.tick.TickManager.frozen = value; }

public void setTickRate(float tickRate) { wrapperContained.setTickRate(tickRate); }
// public static void setTickRate(float tickRate, ) { net.minecraft.world.tick.TickManager.setTickRate(tickRate); }
public void setFrozen(boolean frozen) { wrapperContained.setFrozen(frozen); }
// public static void setFrozen(boolean frozen, ) { net.minecraft.world.tick.TickManager.setFrozen(frozen); }
public boolean shouldSkipTick(yarnwrap.entity.Entity entity) { return wrapperContained.shouldSkipTick(entity.wrapperContained); }
// public static boolean shouldSkipTick(yarnwrap.entity.Entity entity, ) { return net.minecraft.world.tick.TickManager.shouldSkipTick(entity.wrapperContained); }
public void setStepTicks(int stepTicks) { wrapperContained.setStepTicks(stepTicks); }
// public static void setStepTicks(int stepTicks, ) { net.minecraft.world.tick.TickManager.setStepTicks(stepTicks); }
public float getTickRate() { return wrapperContained.getTickRate(); }
// public static float getTickRate() { return net.minecraft.world.tick.TickManager.getTickRate(); }
public float getMillisPerTick() { return wrapperContained.getMillisPerTick(); }
// public static float getMillisPerTick() { return net.minecraft.world.tick.TickManager.getMillisPerTick(); }
public long getNanosPerTick() { return wrapperContained.getNanosPerTick(); }
// public static long getNanosPerTick() { return net.minecraft.world.tick.TickManager.getNanosPerTick(); }
// public boolean shouldTick() { return wrapperContained.shouldTick(); }
// // public static boolean shouldTick() { return net.minecraft.world.tick.TickManager.shouldTick(); }
public boolean isStepping() { return wrapperContained.isStepping(); }
// public static boolean isStepping() { return net.minecraft.world.tick.TickManager.isStepping(); }
public int getStepTicks() { return wrapperContained.getStepTicks(); }
// public static int getStepTicks() { return net.minecraft.world.tick.TickManager.getStepTicks(); }
public boolean isFrozen() { return wrapperContained.isFrozen(); }
// public static boolean isFrozen() { return net.minecraft.world.tick.TickManager.isFrozen(); }
public void step() { wrapperContained.step(); }
// public static void step() { net.minecraft.world.tick.TickManager.step(); }

}