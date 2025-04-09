package yarnwrap.entity.ai.brain;
public class Schedule { public net.minecraft.entity.ai.brain.Schedule wrapperContained; public Schedule(net.minecraft.entity.ai.brain.Schedule wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.Schedule EMPTY() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.EMPTY); }
public yarnwrap.entity.ai.brain.Schedule SIMPLE() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.SIMPLE); }
public yarnwrap.entity.ai.brain.Schedule VILLAGER_BABY() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.VILLAGER_BABY); }
public yarnwrap.entity.ai.brain.Schedule VILLAGER_DEFAULT() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.VILLAGER_DEFAULT); }
// public java.util.Map scheduleRules() { return wrapperContained.scheduleRules; }
public int WORK_TIME() { return wrapperContained.WORK_TIME; }
public yarnwrap.entity.ai.brain.Activity getActivityForTime(int time) { return new yarnwrap.entity.ai.brain.Activity(wrapperContained.getActivityForTime(time)); }
// public void addActivity(yarnwrap.entity.ai.brain.Activity activity) { wrapperContained.addActivity(activity.wrapperContained); }
// public yarnwrap.entity.ai.brain.ScheduleBuilder register(java.lang.String id) { return new yarnwrap.entity.ai.brain.ScheduleBuilder(wrapperContained.register(id)); }
// public yarnwrap.entity.ai.brain.ScheduleRule getRule(yarnwrap.entity.ai.brain.Activity activity) { return new yarnwrap.entity.ai.brain.ScheduleRule(wrapperContained.getRule(activity.wrapperContained)); }
// public java.util.List getOtherRules(yarnwrap.entity.ai.brain.Activity activity) { return wrapperContained.getOtherRules(activity.wrapperContained); }

}