package yarnwrap.entity.damage;
public class DamageRecord { public net.minecraft.entity.damage.DamageRecord wrapperContained; public DamageRecord(net.minecraft.entity.damage.DamageRecord wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.damage.DamageSource damageSource() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.damageSource); }
// public void damageSource(yarnwrap.entity.damage.DamageSource value) { wrapperContained.damageSource = value.wrapperContained; }
// public float damage() { return wrapperContained.damage; }
// public void damage(float value) { wrapperContained.damage = value; }
// public float fallDistance() { return wrapperContained.fallDistance; }
// public void fallDistance(float value) { wrapperContained.fallDistance = value; }
// public DamageRecord(yarnwrap.entity.damage.DamageSource damageSource) { this.wrapperContained = new net.minecraft.entity.damage.DamageRecord(damageSource.wrapperContained); }
// public yarnwrap.entity.damage.DamageSource damageSource() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.damageSource()); }
// public float damage() { return wrapperContained.damage(); }
// public float fallDistance() { return wrapperContained.fallDistance(); }

}