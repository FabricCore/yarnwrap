package yarnwrap.entity;
public class Targeter { public net.minecraft.entity.Targeter wrapperContained; public Targeter(net.minecraft.entity.Targeter wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.LivingEntity getTarget() { return new yarnwrap.entity.LivingEntity(wrapperContained.getTarget()); }

}