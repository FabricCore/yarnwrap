package yarnwrap.entity.ai.goal;
public class SitOnOwnerShoulderGoal { public net.minecraft.entity.ai.goal.SitOnOwnerShoulderGoal wrapperContained; public SitOnOwnerShoulderGoal(net.minecraft.entity.ai.goal.SitOnOwnerShoulderGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.TameableShoulderEntity tameable() { return new yarnwrap.entity.passive.TameableShoulderEntity(wrapperContained.tameable); }
// public void tameable(yarnwrap.entity.passive.TameableShoulderEntity value) { wrapperContained.tameable = value.wrapperContained; }
// public yarnwrap.server.network.ServerPlayerEntity owner() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.owner); }
// public void owner(yarnwrap.server.network.ServerPlayerEntity value) { wrapperContained.owner = value.wrapperContained; }
// public boolean mounted() { return wrapperContained.mounted; }
// public void mounted(boolean value) { wrapperContained.mounted = value; }
public SitOnOwnerShoulderGoal(yarnwrap.entity.passive.TameableShoulderEntity tameable) { this.wrapperContained = new net.minecraft.entity.ai.goal.SitOnOwnerShoulderGoal(tameable.wrapperContained); }

}