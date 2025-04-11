package yarnwrap.entity.ai.goal;
public class Goal { public net.minecraft.entity.ai.goal.Goal wrapperContained; public Goal(net.minecraft.entity.ai.goal.Goal wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.EnumSet controls() { return wrapperContained.controls; }
// public void controls(java.util.EnumSet value) { wrapperContained.controls = value; }
public boolean shouldRunEveryTick() { return wrapperContained.shouldRunEveryTick(); }
// public int getTickCount(int ticks) { return wrapperContained.getTickCount(ticks); }
// public int toGoalTicks(int serverTicks) { return wrapperContained.toGoalTicks(serverTicks); }
public boolean canStart() { return wrapperContained.canStart(); }
public void setControls(java.util.EnumSet controls) { wrapperContained.setControls(controls); }
public boolean shouldContinue() { return wrapperContained.shouldContinue(); }
public boolean canStop() { return wrapperContained.canStop(); }
public void tick() { wrapperContained.tick(); }
public void start() { wrapperContained.start(); }
public void stop() { wrapperContained.stop(); }
public java.util.EnumSet getControls() { return wrapperContained.getControls(); }

}