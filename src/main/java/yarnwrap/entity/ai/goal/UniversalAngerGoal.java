package yarnwrap.entity.ai.goal;
public class UniversalAngerGoal { public net.minecraft.entity.ai.goal.UniversalAngerGoal wrapperContained; public UniversalAngerGoal(net.minecraft.entity.ai.goal.UniversalAngerGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.mob = value.wrapperContained; }
// public boolean triggerOthers() { return wrapperContained.triggerOthers; }
// public void triggerOthers(boolean value) { wrapperContained.triggerOthers = value; }
// public int lastAttackedTime() { return wrapperContained.lastAttackedTime; }
// public void lastAttackedTime(int value) { wrapperContained.lastAttackedTime = value; }
// public int BOX_VERTICAL_EXPANSION() { return wrapperContained.BOX_VERTICAL_EXPANSION; }
// public void BOX_VERTICAL_EXPANSION(int value) { wrapperContained.BOX_VERTICAL_EXPANSION = value; }
public UniversalAngerGoal(yarnwrap.entity.mob.MobEntity mob,boolean triggerOthers) { this.wrapperContained = new net.minecraft.entity.ai.goal.UniversalAngerGoal(mob.wrapperContained,triggerOthers); }
// public yarnwrap.entity.mob.Angerable method_29930(yarnwrap.entity.mob.MobEntity entity) { return new yarnwrap.entity.mob.Angerable(wrapperContained.method_29930(entity.wrapperContained)); }
// public boolean method_29931(yarnwrap.entity.mob.MobEntity entity) { return wrapperContained.method_29931(entity.wrapperContained); }
// public boolean canStartUniversalAnger() { return wrapperContained.canStartUniversalAnger(); }
// public java.util.List getOthersInRange() { return wrapperContained.getOthersInRange(); }

}