package yarnwrap.entity;
public class Attackable { public net.minecraft.entity.Attackable wrapperContained; public Attackable(net.minecraft.entity.Attackable wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.LivingEntity getLastAttacker() { return new yarnwrap.entity.LivingEntity(wrapperContained.getLastAttacker()); }

}