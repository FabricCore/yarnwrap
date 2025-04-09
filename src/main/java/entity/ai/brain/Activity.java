package yarnwrap.entity.ai.brain;
public class Activity { public net.minecraft.entity.ai.brain.Activity wrapperContained; public Activity(net.minecraft.entity.ai.brain.Activity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public int hashCode() { return wrapperContained.hashCode; }
// public yarnwrap.entity.ai.brain.Activity register(java.lang.String id) { return new yarnwrap.entity.ai.brain.Activity(wrapperContained.register(id)); }
public java.lang.String getId() { return wrapperContained.getId(); }

}