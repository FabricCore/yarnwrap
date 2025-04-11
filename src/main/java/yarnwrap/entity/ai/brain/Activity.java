package yarnwrap.entity.ai.brain;
public class Activity { public net.minecraft.entity.ai.brain.Activity wrapperContained; public Activity(net.minecraft.entity.ai.brain.Activity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public int hashCode() { return wrapperContained.hashCode; }
// public void hashCode(int value) { wrapperContained.hashCode = value; }
// public Activity(java.lang.String id) { this.wrapperContained = new net.minecraft.entity.ai.brain.Activity(id); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public yarnwrap.entity.ai.brain.Activity register(java.lang.String id) { return new yarnwrap.entity.ai.brain.Activity(wrapperContained.register(id)); }
public java.lang.String getId() { return wrapperContained.getId(); }

}