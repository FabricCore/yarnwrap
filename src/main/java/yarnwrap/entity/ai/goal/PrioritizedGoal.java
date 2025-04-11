package yarnwrap.entity.ai.goal;
public class PrioritizedGoal { public net.minecraft.entity.ai.goal.PrioritizedGoal wrapperContained; public PrioritizedGoal(net.minecraft.entity.ai.goal.PrioritizedGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.goal.Goal goal() { return new yarnwrap.entity.ai.goal.Goal(wrapperContained.goal); }
// public void goal(yarnwrap.entity.ai.goal.Goal value) { wrapperContained.goal = value.wrapperContained; }
// public int priority() { return wrapperContained.priority; }
// public void priority(int value) { wrapperContained.priority = value; }
// public boolean running() { return wrapperContained.running; }
// public void running(boolean value) { wrapperContained.running = value; }
public PrioritizedGoal(int priority,yarnwrap.entity.ai.goal.Goal goal) { this.wrapperContained = new net.minecraft.entity.ai.goal.PrioritizedGoal(priority,goal.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public boolean canBeReplacedBy(yarnwrap.entity.ai.goal.PrioritizedGoal goal) { return wrapperContained.canBeReplacedBy(goal.wrapperContained); }
public boolean isRunning() { return wrapperContained.isRunning(); }
public int getPriority() { return wrapperContained.getPriority(); }
public yarnwrap.entity.ai.goal.Goal getGoal() { return new yarnwrap.entity.ai.goal.Goal(wrapperContained.getGoal()); }

}