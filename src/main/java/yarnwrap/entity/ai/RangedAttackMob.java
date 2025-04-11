package yarnwrap.entity.ai;
public class RangedAttackMob { public net.minecraft.entity.ai.RangedAttackMob wrapperContained; public RangedAttackMob(net.minecraft.entity.ai.RangedAttackMob wrapperContained) { this.wrapperContained = wrapperContained; }

public void shootAt(yarnwrap.entity.LivingEntity target,float pullProgress) { wrapperContained.shootAt(target.wrapperContained,pullProgress); }

}