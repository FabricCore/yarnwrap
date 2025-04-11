package yarnwrap.world.tick;
public class TickManager { public net.minecraft.world.tick.TickManager wrapperContained; public TickManager(net.minecraft.world.tick.TickManager wrapperContained) { this.wrapperContained = wrapperContained; }

public float MIN_TICK_RATE() { return wrapperContained.MIN_TICK_RATE; }
// public void MIN_TICK_RATE(float value) { wrapperContained.MIN_TICK_RATE = value; }
// public float tickRate() { return wrapperContained.tickRate; }
// public void tickRate(float value) { wrapperContained.tickRate = value; }
// public long nanosPerTick() { return wrapperContained.nanosPerTick; }
// public void nanosPerTick(long value) { wrapperContained.nanosPerTick = value; }
// public int stepTicks() { return wrapperContained.stepTicks; }
// public void stepTicks(int value) { wrapperContained.stepTicks = value; }
// public boolean shouldTick() { return wrapperContained.shouldTick; }
// public void shouldTick(boolean value) { wrapperContained.shouldTick = value; }
// public boolean frozen() { return wrapperContained.frozen; }
// public void frozen(boolean value) { wrapperContained.frozen = value; }
public void setTickRate(float tickRate) { wrapperContained.setTickRate(tickRate); }
public void setFrozen(boolean frozen) { wrapperContained.setFrozen(frozen); }
public boolean shouldSkipTick(yarnwrap.entity.Entity entity) { return wrapperContained.shouldSkipTick(entity.wrapperContained); }
public void setStepTicks(int stepTicks) { wrapperContained.setStepTicks(stepTicks); }
public float getTickRate() { return wrapperContained.getTickRate(); }
public float getMillisPerTick() { return wrapperContained.getMillisPerTick(); }
public long getNanosPerTick() { return wrapperContained.getNanosPerTick(); }
// public boolean shouldTick() { return wrapperContained.shouldTick(); }
public boolean isStepping() { return wrapperContained.isStepping(); }
public int getStepTicks() { return wrapperContained.getStepTicks(); }
public boolean isFrozen() { return wrapperContained.isFrozen(); }
public void step() { wrapperContained.step(); }

}