package yarnwrap.entity.ai.goal;
public class GoalSelector { public net.minecraft.entity.ai.goal.GoalSelector wrapperContained; public GoalSelector(net.minecraft.entity.ai.goal.GoalSelector wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.goal.PrioritizedGoal REPLACEABLE_GOAL() { return new yarnwrap.entity.ai.goal.PrioritizedGoal(wrapperContained.REPLACEABLE_GOAL); }
// public void REPLACEABLE_GOAL(yarnwrap.entity.ai.goal.PrioritizedGoal value) { wrapperContained.REPLACEABLE_GOAL = value.wrapperContained; }
// public java.util.Map goalsByControl() { return wrapperContained.goalsByControl; }
// public void goalsByControl(java.util.Map value) { wrapperContained.goalsByControl = value; }
// public java.util.Set goals() { return wrapperContained.goals; }
// public void goals(java.util.Set value) { wrapperContained.goals = value; }
// public java.util.EnumSet disabledControls() { return wrapperContained.disabledControls; }
// public void disabledControls(java.util.EnumSet value) { wrapperContained.disabledControls = value; }
// public java.util.function.Supplier profiler() { return wrapperContained.profiler; }
// public void profiler(java.util.function.Supplier value) { wrapperContained.profiler = value; }
public void clear(java.util.function.Predicate predicate) { wrapperContained.clear(predicate); }
public java.util.Set getGoals() { return wrapperContained.getGoals(); }
// public boolean usesAny(yarnwrap.entity.ai.goal.PrioritizedGoal goal,java.util.EnumSet controls) { return wrapperContained.usesAny(goal.wrapperContained,controls); }
// public boolean canReplaceAll(yarnwrap.entity.ai.goal.PrioritizedGoal goal,java.util.Map goalsByControl) { return wrapperContained.canReplaceAll(goal.wrapperContained,goalsByControl); }
public void tickGoals(boolean tickAll) { wrapperContained.tickGoals(tickAll); }
// public void enableControl(Object control) { wrapperContained.enableControl(control); }
// public void disableControl(Object control) { wrapperContained.disableControl(control); }
public void tick() { wrapperContained.tick(); }
// public void setControlEnabled(Object control,boolean enabled) { wrapperContained.setControlEnabled(control,enabled); }
public void add(int priority,yarnwrap.entity.ai.goal.Goal goal) { wrapperContained.add(priority,goal.wrapperContained); }
public void remove(yarnwrap.entity.ai.goal.Goal goal) { wrapperContained.remove(goal.wrapperContained); }

}