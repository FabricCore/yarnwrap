package yarnwrap.entity.ai.brain;
public class ScheduleRule { public net.minecraft.entity.ai.brain.ScheduleRule wrapperContained; public ScheduleRule(net.minecraft.entity.ai.brain.ScheduleRule wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List entries() { return wrapperContained.entries; }
// public int prioritizedEntryIndex() { return wrapperContained.prioritizedEntryIndex; }
public float getPriority(int time) { return wrapperContained.getPriority(time); }
public yarnwrap.entity.ai.brain.ScheduleRule add(int startTime,float priority) { return new yarnwrap.entity.ai.brain.ScheduleRule(wrapperContained.add(startTime,priority)); }
// public void sort() { wrapperContained.sort(); }
public com.google.common.collect.ImmutableList getEntries() { return wrapperContained.getEntries(); }
public yarnwrap.entity.ai.brain.ScheduleRule add(java.util.Collection entries) { return new yarnwrap.entity.ai.brain.ScheduleRule(wrapperContained.add(entries)); }

}