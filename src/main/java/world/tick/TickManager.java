package yarnwrap.world.tick;
public class TickManager { public net.minecraft.world.tick.TickManager wrapperContained; public TickManager(net.minecraft.world.tick.TickManager wrapperContained) { this.wrapperContained = wrapperContained; }

public float MIN_TICK_RATE() { return wrapperContained.MIN_TICK_RATE; }
// public float tickRate() { return wrapperContained.tickRate; }
// public long nanosPerTick() { return wrapperContained.nanosPerTick; }
// public int stepTicks() { return wrapperContained.stepTicks; }
// public boolean shouldTick() { return wrapperContained.shouldTick; }
// public boolean frozen() { return wrapperContained.frozen; }
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