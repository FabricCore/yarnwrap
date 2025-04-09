package yarnwrap.entity.ai.brain;
public class ScheduleRuleEntry { public net.minecraft.entity.ai.brain.ScheduleRuleEntry wrapperContained; public ScheduleRuleEntry(net.minecraft.entity.ai.brain.ScheduleRuleEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public int startTime() { return wrapperContained.startTime; }
// public float priority() { return wrapperContained.priority; }
public int getStartTime() { return wrapperContained.getStartTime(); }
public float getPriority() { return wrapperContained.getPriority(); }

}