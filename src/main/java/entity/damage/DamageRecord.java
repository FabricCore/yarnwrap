package yarnwrap.entity.damage;
public class DamageRecord { public net.minecraft.entity.damage.DamageRecord wrapperContained; public DamageRecord(net.minecraft.entity.damage.DamageRecord wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.damage.DamageSource damageSource() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.damageSource); }
// public float damage() { return wrapperContained.damage; }
// public float fallDistance() { return wrapperContained.fallDistance; }
// public yarnwrap.entity.damage.DamageSource damageSource() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.damageSource()); }
// public float damage() { return wrapperContained.damage(); }
// public float fallDistance() { return wrapperContained.fallDistance(); }

}