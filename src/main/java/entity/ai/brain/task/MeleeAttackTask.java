package yarnwrap.entity.ai.brain.task;
public class MeleeAttackTask { public net.minecraft.entity.ai.brain.task.MeleeAttackTask wrapperContained; public MeleeAttackTask(net.minecraft.entity.ai.brain.task.MeleeAttackTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean isHoldingUsableRangedWeapon(yarnwrap.entity.mob.MobEntity mob) { return wrapperContained.isHoldingUsableRangedWeapon(mob.wrapperContained); }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(int cooldown) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(cooldown)); }

}