package yarnwrap.entity.ai.goal;
public class SitOnOwnerShoulderGoal { public net.minecraft.entity.ai.goal.SitOnOwnerShoulderGoal wrapperContained; public SitOnOwnerShoulderGoal(net.minecraft.entity.ai.goal.SitOnOwnerShoulderGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.TameableShoulderEntity tameable() { return new yarnwrap.entity.passive.TameableShoulderEntity(wrapperContained.tameable); }
// public void tameable(yarnwrap.entity.passive.TameableShoulderEntity value) { wrapperContained.tameable = value.wrapperContained; }
// public static yarnwrap.entity.passive.TameableShoulderEntity tameable() { return new yarnwrap.entity.passive.TameableShoulderEntity(net.minecraft.entity.ai.goal.SitOnOwnerShoulderGoal.tameable); }
// public static void tameable(yarnwrap.entity.passive.TameableShoulderEntity value, ) { net.minecraft.entity.ai.goal.SitOnOwnerShoulderGoal.tameable = value.wrapperContained; }

// public boolean mounted() { return wrapperContained.mounted; }
// public void mounted(boolean value) { wrapperContained.mounted = value; }
// public static boolean mounted() { return net.minecraft.entity.ai.goal.SitOnOwnerShoulderGoal.mounted; }
// public static void mounted(boolean value, ) { net.minecraft.entity.ai.goal.SitOnOwnerShoulderGoal.mounted = value; }

public SitOnOwnerShoulderGoal(yarnwrap.entity.passive.TameableShoulderEntity tameable) { this.wrapperContained = new net.minecraft.entity.ai.goal.SitOnOwnerShoulderGoal(tameable.wrapperContained); }

}