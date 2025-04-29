package yarnwrap.entity.ai.goal;
public class UniversalAngerGoal { public net.minecraft.entity.ai.goal.UniversalAngerGoal wrapperContained; public UniversalAngerGoal(net.minecraft.entity.ai.goal.UniversalAngerGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.goal.UniversalAngerGoal.mob); }
// public static void mob(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.goal.UniversalAngerGoal.mob = value.wrapperContained; }

// public boolean triggerOthers() { return wrapperContained.triggerOthers; }
// public void triggerOthers(boolean value) { wrapperContained.triggerOthers = value; }
// public static boolean triggerOthers() { return net.minecraft.entity.ai.goal.UniversalAngerGoal.triggerOthers; }
// public static void triggerOthers(boolean value, ) { net.minecraft.entity.ai.goal.UniversalAngerGoal.triggerOthers = value; }

// public int lastAttackedTime() { return wrapperContained.lastAttackedTime; }
// public void lastAttackedTime(int value) { wrapperContained.lastAttackedTime = value; }
// public static int lastAttackedTime() { return net.minecraft.entity.ai.goal.UniversalAngerGoal.lastAttackedTime; }
// public static void lastAttackedTime(int value, ) { net.minecraft.entity.ai.goal.UniversalAngerGoal.lastAttackedTime = value; }

// public int BOX_VERTICAL_EXPANSION() { return wrapperContained.BOX_VERTICAL_EXPANSION; }
// public void BOX_VERTICAL_EXPANSION(int value) { wrapperContained.BOX_VERTICAL_EXPANSION = value; }
// public static int BOX_VERTICAL_EXPANSION() { return net.minecraft.entity.ai.goal.UniversalAngerGoal.BOX_VERTICAL_EXPANSION; }
// public static void BOX_VERTICAL_EXPANSION(int value, ) { net.minecraft.entity.ai.goal.UniversalAngerGoal.BOX_VERTICAL_EXPANSION = value; }

public UniversalAngerGoal(yarnwrap.entity.mob.MobEntity mob,boolean triggerOthers) { this.wrapperContained = new net.minecraft.entity.ai.goal.UniversalAngerGoal(mob.wrapperContained,triggerOthers); }
// public yarnwrap.entity.mob.Angerable method_29930(yarnwrap.entity.mob.MobEntity entity) { return new yarnwrap.entity.mob.Angerable(wrapperContained.method_29930(entity.wrapperContained)); }
// public static yarnwrap.entity.mob.Angerable method_29930(yarnwrap.entity.mob.MobEntity entity, ) { return new yarnwrap.entity.mob.Angerable(net.minecraft.entity.ai.goal.UniversalAngerGoal.method_29930(entity.wrapperContained)); }
// public boolean method_29931(yarnwrap.entity.mob.MobEntity entity) { return wrapperContained.method_29931(entity.wrapperContained); }
// public static boolean method_29931(yarnwrap.entity.mob.MobEntity entity, ) { return net.minecraft.entity.ai.goal.UniversalAngerGoal.method_29931(entity.wrapperContained); }
// public boolean canStartUniversalAnger() { return wrapperContained.canStartUniversalAnger(); }
// public static boolean canStartUniversalAnger() { return net.minecraft.entity.ai.goal.UniversalAngerGoal.canStartUniversalAnger(); }
// public java.util.List getOthersInRange() { return wrapperContained.getOthersInRange(); }
// public static java.util.List getOthersInRange() { return net.minecraft.entity.ai.goal.UniversalAngerGoal.getOthersInRange(); }

}