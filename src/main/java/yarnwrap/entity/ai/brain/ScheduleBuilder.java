package yarnwrap.entity.ai.brain;
public class ScheduleBuilder { public net.minecraft.entity.ai.brain.ScheduleBuilder wrapperContained; public ScheduleBuilder(net.minecraft.entity.ai.brain.ScheduleBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.Schedule schedule() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.schedule); }
// public void schedule(yarnwrap.entity.ai.brain.Schedule value) { wrapperContained.schedule = value.wrapperContained; }
// public static yarnwrap.entity.ai.brain.Schedule schedule() { return new yarnwrap.entity.ai.brain.Schedule(net.minecraft.entity.ai.brain.ScheduleBuilder.schedule); }
// public static void schedule(yarnwrap.entity.ai.brain.Schedule value, ) { net.minecraft.entity.ai.brain.ScheduleBuilder.schedule = value.wrapperContained; }

// public java.util.List activities() { return wrapperContained.activities; }
// public void activities(java.util.List value) { wrapperContained.activities = value; }
// public static java.util.List activities() { return net.minecraft.entity.ai.brain.ScheduleBuilder.activities; }
// public static void activities(java.util.List value, ) { net.minecraft.entity.ai.brain.ScheduleBuilder.activities = value; }

public ScheduleBuilder(yarnwrap.entity.ai.brain.Schedule schedule) { this.wrapperContained = new net.minecraft.entity.ai.brain.ScheduleBuilder(schedule.wrapperContained); }
public yarnwrap.entity.ai.brain.Schedule build() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.build()); }
// public static yarnwrap.entity.ai.brain.Schedule build() { return new yarnwrap.entity.ai.brain.Schedule(net.minecraft.entity.ai.brain.ScheduleBuilder.build()); }
public yarnwrap.entity.ai.brain.ScheduleBuilder withActivity(int startTime,yarnwrap.entity.ai.brain.Activity activity) { return new yarnwrap.entity.ai.brain.ScheduleBuilder(wrapperContained.withActivity(startTime,activity.wrapperContained)); }
// public static yarnwrap.entity.ai.brain.ScheduleBuilder withActivity(int startTime,yarnwrap.entity.ai.brain.Activity activity, ) { return new yarnwrap.entity.ai.brain.ScheduleBuilder(net.minecraft.entity.ai.brain.ScheduleBuilder.withActivity(startTime,activity.wrapperContained)); }
// public void method_19222(Object activity) { wrapperContained.method_19222(activity); }
// public static void method_19222(Object activity, ) { net.minecraft.entity.ai.brain.ScheduleBuilder.method_19222(activity); }
// public void method_19223(Object rule) { wrapperContained.method_19223(rule); }
// public static void method_19223(Object rule, ) { net.minecraft.entity.ai.brain.ScheduleBuilder.method_19223(rule); }

}