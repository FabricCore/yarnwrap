package yarnwrap.entity.mob;
public class AbstractSkeletonEntity { public net.minecraft.entity.mob.AbstractSkeletonEntity wrapperContained; public AbstractSkeletonEntity(net.minecraft.entity.mob.AbstractSkeletonEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int HARD_ATTACK_INTERVAL() { return wrapperContained.HARD_ATTACK_INTERVAL; }
// public void HARD_ATTACK_INTERVAL(int value) { wrapperContained.HARD_ATTACK_INTERVAL = value; }
// public int REGULAR_ATTACK_INTERVAL() { return wrapperContained.REGULAR_ATTACK_INTERVAL; }
// public void REGULAR_ATTACK_INTERVAL(int value) { wrapperContained.REGULAR_ATTACK_INTERVAL = value; }
// public yarnwrap.entity.ai.goal.BowAttackGoal bowAttackGoal() { return new yarnwrap.entity.ai.goal.BowAttackGoal(wrapperContained.bowAttackGoal); }
// public void bowAttackGoal(yarnwrap.entity.ai.goal.BowAttackGoal value) { wrapperContained.bowAttackGoal = value.wrapperContained; }
// public yarnwrap.entity.ai.goal.MeleeAttackGoal meleeAttackGoal() { return new yarnwrap.entity.ai.goal.MeleeAttackGoal(wrapperContained.meleeAttackGoal); }
// public void meleeAttackGoal(yarnwrap.entity.ai.goal.MeleeAttackGoal value) { wrapperContained.meleeAttackGoal = value.wrapperContained; }
public Object createAbstractSkeletonAttributes() { return wrapperContained.createAbstractSkeletonAttributes(); }
public boolean isShaking() { return wrapperContained.isShaking(); }
// public int getHardAttackInterval() { return wrapperContained.getHardAttackInterval(); }
// public int getRegularAttackInterval() { return wrapperContained.getRegularAttackInterval(); }
// public yarnwrap.entity.projectile.PersistentProjectileEntity createArrowProjectile(yarnwrap.item.ItemStack arrow,float damageModifier,yarnwrap.item.ItemStack shotFrom) { return new yarnwrap.entity.projectile.PersistentProjectileEntity(wrapperContained.createArrowProjectile(arrow.wrapperContained,damageModifier,shotFrom.wrapperContained)); }
public void updateAttackType() { wrapperContained.updateAttackType(); }
// public yarnwrap.sound.SoundEvent getStepSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getStepSound()); }

}