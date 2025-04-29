package yarnwrap.entity.ai.brain;
public class ScheduleRuleEntry { public net.minecraft.entity.ai.brain.ScheduleRuleEntry wrapperContained; public ScheduleRuleEntry(net.minecraft.entity.ai.brain.ScheduleRuleEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public int startTime() { return wrapperContained.startTime; }
// public void startTime(int value) { wrapperContained.startTime = value; }
// public static int startTime() { return net.minecraft.entity.ai.brain.ScheduleRuleEntry.startTime; }
// public static void startTime(int value, ) { net.minecraft.entity.ai.brain.ScheduleRuleEntry.startTime = value; }

// public float priority() { return wrapperContained.priority; }
// public void priority(float value) { wrapperContained.priority = value; }
// public static float priority() { return net.minecraft.entity.ai.brain.ScheduleRuleEntry.priority; }
// public static void priority(float value, ) { net.minecraft.entity.ai.brain.ScheduleRuleEntry.priority = value; }

public ScheduleRuleEntry(int startTime,float priority) { this.wrapperContained = new net.minecraft.entity.ai.brain.ScheduleRuleEntry(startTime,priority); }
public int getStartTime() { return wrapperContained.getStartTime(); }
// public static int getStartTime() { return net.minecraft.entity.ai.brain.ScheduleRuleEntry.getStartTime(); }
public float getPriority() { return wrapperContained.getPriority(); }
// public static float getPriority() { return net.minecraft.entity.ai.brain.ScheduleRuleEntry.getPriority(); }

}