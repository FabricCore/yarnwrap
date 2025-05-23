package yarnwrap.entity.ai.goal;
public class GoalSelector { public net.minecraft.entity.ai.goal.GoalSelector wrapperContained; public GoalSelector(net.minecraft.entity.ai.goal.GoalSelector wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set goals() { return wrapperContained.goals; }
// public void goals(java.util.Set value) { wrapperContained.goals = value; }
// public static java.util.Set goals() { return net.minecraft.entity.ai.goal.GoalSelector.goals; }
// public static void goals(java.util.Set value, ) { net.minecraft.entity.ai.goal.GoalSelector.goals = value; }

// public java.util.EnumSet disabledControls() { return wrapperContained.disabledControls; }
// public void disabledControls(java.util.EnumSet value) { wrapperContained.disabledControls = value; }
// public static java.util.EnumSet disabledControls() { return net.minecraft.entity.ai.goal.GoalSelector.disabledControls; }
// public static void disabledControls(java.util.EnumSet value, ) { net.minecraft.entity.ai.goal.GoalSelector.disabledControls = value; }

// public yarnwrap.entity.ai.goal.PrioritizedGoal REPLACEABLE_GOAL() { return new yarnwrap.entity.ai.goal.PrioritizedGoal(wrapperContained.REPLACEABLE_GOAL); }
// public void REPLACEABLE_GOAL(yarnwrap.entity.ai.goal.PrioritizedGoal value) { wrapperContained.REPLACEABLE_GOAL = value.wrapperContained; }
// public static yarnwrap.entity.ai.goal.PrioritizedGoal REPLACEABLE_GOAL() { return new yarnwrap.entity.ai.goal.PrioritizedGoal(net.minecraft.entity.ai.goal.GoalSelector.REPLACEABLE_GOAL); }
// public static void REPLACEABLE_GOAL(yarnwrap.entity.ai.goal.PrioritizedGoal value, ) { net.minecraft.entity.ai.goal.GoalSelector.REPLACEABLE_GOAL = value.wrapperContained; }

// public java.util.Map goalsByControl() { return wrapperContained.goalsByControl; }
// public void goalsByControl(java.util.Map value) { wrapperContained.goalsByControl = value; }
// public static java.util.Map goalsByControl() { return net.minecraft.entity.ai.goal.GoalSelector.goalsByControl; }
// public static void goalsByControl(java.util.Map value, ) { net.minecraft.entity.ai.goal.GoalSelector.goalsByControl = value; }

// public void enableControl(Object control) { wrapperContained.enableControl(control); }
// public static void enableControl(Object control, ) { net.minecraft.entity.ai.goal.GoalSelector.enableControl(control); }
// public void disableControl(Object control) { wrapperContained.disableControl(control); }
// public static void disableControl(Object control, ) { net.minecraft.entity.ai.goal.GoalSelector.disableControl(control); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.entity.ai.goal.GoalSelector.tick(); }
// public void setControlEnabled(Object control,boolean enabled) { wrapperContained.setControlEnabled(control,enabled); }
// public static void setControlEnabled(Object control,boolean enabled, ) { net.minecraft.entity.ai.goal.GoalSelector.setControlEnabled(control,enabled); }
public void add(int priority,yarnwrap.entity.ai.goal.Goal goal) { wrapperContained.add(priority,goal.wrapperContained); }
// public static void add(int priority,yarnwrap.entity.ai.goal.Goal goal, ) { net.minecraft.entity.ai.goal.GoalSelector.add(priority,goal.wrapperContained); }
public void remove(yarnwrap.entity.ai.goal.Goal goal) { wrapperContained.remove(goal.wrapperContained); }
// public static void remove(yarnwrap.entity.ai.goal.Goal goal, ) { net.minecraft.entity.ai.goal.GoalSelector.remove(goal.wrapperContained); }
public void clear(java.util.function.Predicate predicate) { wrapperContained.clear(predicate); }
// public static void clear(java.util.function.Predicate predicate, ) { net.minecraft.entity.ai.goal.GoalSelector.clear(predicate); }
public java.util.Set getGoals() { return wrapperContained.getGoals(); }
// public static java.util.Set getGoals() { return net.minecraft.entity.ai.goal.GoalSelector.getGoals(); }
// public boolean usesAny(yarnwrap.entity.ai.goal.PrioritizedGoal goal,java.util.EnumSet controls) { return wrapperContained.usesAny(goal.wrapperContained,controls); }
// public static boolean usesAny(yarnwrap.entity.ai.goal.PrioritizedGoal goal,java.util.EnumSet controls, ) { return net.minecraft.entity.ai.goal.GoalSelector.usesAny(goal.wrapperContained,controls); }
// public boolean canReplaceAll(yarnwrap.entity.ai.goal.PrioritizedGoal goal,java.util.Map goalsByControl) { return wrapperContained.canReplaceAll(goal.wrapperContained,goalsByControl); }
// public static boolean canReplaceAll(yarnwrap.entity.ai.goal.PrioritizedGoal goal,java.util.Map goalsByControl, ) { return net.minecraft.entity.ai.goal.GoalSelector.canReplaceAll(goal.wrapperContained,goalsByControl); }
public void tickGoals(boolean tickAll) { wrapperContained.tickGoals(tickAll); }
// public static void tickGoals(boolean tickAll, ) { net.minecraft.entity.ai.goal.GoalSelector.tickGoals(tickAll); }
// public boolean method_47828(java.util.function.Predicate goal) { return wrapperContained.method_47828(goal); }
// public static boolean method_47828(java.util.function.Predicate goal, ) { return net.minecraft.entity.ai.goal.GoalSelector.method_47828(goal); }

}