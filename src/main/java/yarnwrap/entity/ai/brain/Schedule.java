package yarnwrap.entity.ai.brain;
public class Schedule { public net.minecraft.entity.ai.brain.Schedule wrapperContained; public Schedule(net.minecraft.entity.ai.brain.Schedule wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.Schedule EMPTY() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.entity.ai.brain.Schedule value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.entity.ai.brain.Schedule EMPTY() { return new yarnwrap.entity.ai.brain.Schedule(net.minecraft.entity.ai.brain.Schedule.EMPTY); }
// public static void EMPTY(yarnwrap.entity.ai.brain.Schedule value, ) { net.minecraft.entity.ai.brain.Schedule.EMPTY = value.wrapperContained; }

// public yarnwrap.entity.ai.brain.Schedule SIMPLE() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.SIMPLE); }
// public void SIMPLE(yarnwrap.entity.ai.brain.Schedule value) { wrapperContained.SIMPLE = value.wrapperContained; }
public static yarnwrap.entity.ai.brain.Schedule SIMPLE() { return new yarnwrap.entity.ai.brain.Schedule(net.minecraft.entity.ai.brain.Schedule.SIMPLE); }
// public static void SIMPLE(yarnwrap.entity.ai.brain.Schedule value, ) { net.minecraft.entity.ai.brain.Schedule.SIMPLE = value.wrapperContained; }

// public yarnwrap.entity.ai.brain.Schedule VILLAGER_BABY() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.VILLAGER_BABY); }
// public void VILLAGER_BABY(yarnwrap.entity.ai.brain.Schedule value) { wrapperContained.VILLAGER_BABY = value.wrapperContained; }
public static yarnwrap.entity.ai.brain.Schedule VILLAGER_BABY() { return new yarnwrap.entity.ai.brain.Schedule(net.minecraft.entity.ai.brain.Schedule.VILLAGER_BABY); }
// public static void VILLAGER_BABY(yarnwrap.entity.ai.brain.Schedule value, ) { net.minecraft.entity.ai.brain.Schedule.VILLAGER_BABY = value.wrapperContained; }

// public yarnwrap.entity.ai.brain.Schedule VILLAGER_DEFAULT() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.VILLAGER_DEFAULT); }
// public void VILLAGER_DEFAULT(yarnwrap.entity.ai.brain.Schedule value) { wrapperContained.VILLAGER_DEFAULT = value.wrapperContained; }
public static yarnwrap.entity.ai.brain.Schedule VILLAGER_DEFAULT() { return new yarnwrap.entity.ai.brain.Schedule(net.minecraft.entity.ai.brain.Schedule.VILLAGER_DEFAULT); }
// public static void VILLAGER_DEFAULT(yarnwrap.entity.ai.brain.Schedule value, ) { net.minecraft.entity.ai.brain.Schedule.VILLAGER_DEFAULT = value.wrapperContained; }

// public java.util.Map scheduleRules() { return wrapperContained.scheduleRules; }
// public void scheduleRules(java.util.Map value) { wrapperContained.scheduleRules = value; }
// public static java.util.Map scheduleRules() { return net.minecraft.entity.ai.brain.Schedule.scheduleRules; }
// public static void scheduleRules(java.util.Map value, ) { net.minecraft.entity.ai.brain.Schedule.scheduleRules = value; }

// public int WORK_TIME() { return wrapperContained.WORK_TIME; }
// public void WORK_TIME(int value) { wrapperContained.WORK_TIME = value; }
public static int WORK_TIME() { return net.minecraft.entity.ai.brain.Schedule.WORK_TIME; }
// public static void WORK_TIME(int value, ) { net.minecraft.entity.ai.brain.Schedule.WORK_TIME = value; }

public yarnwrap.entity.ai.brain.Activity getActivityForTime(int time) { return new yarnwrap.entity.ai.brain.Activity(wrapperContained.getActivityForTime(time)); }
// public static yarnwrap.entity.ai.brain.Activity getActivityForTime(int time, ) { return new yarnwrap.entity.ai.brain.Activity(net.minecraft.entity.ai.brain.Schedule.getActivityForTime(time)); }
// public double method_19214(int rule) { return wrapperContained.method_19214(rule); }
// public static double method_19214(int rule, ) { return net.minecraft.entity.ai.brain.Schedule.method_19214(rule); }
// public void addActivity(yarnwrap.entity.ai.brain.Activity activity) { wrapperContained.addActivity(activity.wrapperContained); }
// public static void addActivity(yarnwrap.entity.ai.brain.Activity activity, ) { net.minecraft.entity.ai.brain.Schedule.addActivity(activity.wrapperContained); }
// public boolean method_19216(yarnwrap.entity.ai.brain.Activity rule) { return wrapperContained.method_19216(rule.wrapperContained); }
// public static boolean method_19216(yarnwrap.entity.ai.brain.Activity rule, ) { return net.minecraft.entity.ai.brain.Schedule.method_19216(rule.wrapperContained); }
// public yarnwrap.entity.ai.brain.ScheduleBuilder register(java.lang.String id) { return new yarnwrap.entity.ai.brain.ScheduleBuilder(wrapperContained.register(id)); }
// public static yarnwrap.entity.ai.brain.ScheduleBuilder register(java.lang.String id, ) { return new yarnwrap.entity.ai.brain.ScheduleBuilder(net.minecraft.entity.ai.brain.Schedule.register(id)); }
// public yarnwrap.entity.ai.brain.ScheduleRule getRule(yarnwrap.entity.ai.brain.Activity activity) { return new yarnwrap.entity.ai.brain.ScheduleRule(wrapperContained.getRule(activity.wrapperContained)); }
// public static yarnwrap.entity.ai.brain.ScheduleRule getRule(yarnwrap.entity.ai.brain.Activity activity, ) { return new yarnwrap.entity.ai.brain.ScheduleRule(net.minecraft.entity.ai.brain.Schedule.getRule(activity.wrapperContained)); }
// public java.util.List getOtherRules(yarnwrap.entity.ai.brain.Activity activity) { return wrapperContained.getOtherRules(activity.wrapperContained); }
// public static java.util.List getOtherRules(yarnwrap.entity.ai.brain.Activity activity, ) { return net.minecraft.entity.ai.brain.Schedule.getOtherRules(activity.wrapperContained); }

}