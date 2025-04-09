package yarnwrap.entity.ai.goal;
public class PrioritizedGoal { public net.minecraft.entity.ai.goal.PrioritizedGoal wrapperContained; public PrioritizedGoal(net.minecraft.entity.ai.goal.PrioritizedGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.goal.Goal goal() { return new yarnwrap.entity.ai.goal.Goal(wrapperContained.goal); }
// public int priority() { return wrapperContained.priority; }
// public boolean running() { return wrapperContained.running; }
public boolean canBeReplacedBy(yarnwrap.entity.ai.goal.PrioritizedGoal goal) { return wrapperContained.canBeReplacedBy(goal.wrapperContained); }
public boolean isRunning() { return wrapperContained.isRunning(); }
public int getPriority() { return wrapperContained.getPriority(); }
public yarnwrap.entity.ai.goal.Goal getGoal() { return new yarnwrap.entity.ai.goal.Goal(wrapperContained.getGoal()); }

}