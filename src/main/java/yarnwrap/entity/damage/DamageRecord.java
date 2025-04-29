package yarnwrap.entity.damage;
public class DamageRecord { public net.minecraft.entity.damage.DamageRecord wrapperContained; public DamageRecord(net.minecraft.entity.damage.DamageRecord wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.damage.DamageSource damageSource() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.damageSource); }
// public void damageSource(yarnwrap.entity.damage.DamageSource value) { wrapperContained.damageSource = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource damageSource() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageRecord.damageSource); }
// public static void damageSource(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageRecord.damageSource = value.wrapperContained; }

// public float damage() { return wrapperContained.damage; }
// public void damage(float value) { wrapperContained.damage = value; }
// public static float damage() { return net.minecraft.entity.damage.DamageRecord.damage; }
// public static void damage(float value, ) { net.minecraft.entity.damage.DamageRecord.damage = value; }

// public float fallDistance() { return wrapperContained.fallDistance; }
// public void fallDistance(float value) { wrapperContained.fallDistance = value; }
// public static float fallDistance() { return net.minecraft.entity.damage.DamageRecord.fallDistance; }
// public static void fallDistance(float value, ) { net.minecraft.entity.damage.DamageRecord.fallDistance = value; }

// public DamageRecord(yarnwrap.entity.damage.DamageSource damageSource) { this.wrapperContained = new net.minecraft.entity.damage.DamageRecord(damageSource.wrapperContained); }
// public yarnwrap.entity.damage.DamageSource damageSource() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.damageSource()); }
// // public static yarnwrap.entity.damage.DamageSource damageSource() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageRecord.damageSource()); }
// public float damage() { return wrapperContained.damage(); }
// // public static float damage() { return net.minecraft.entity.damage.DamageRecord.damage(); }
// public float fallDistance() { return wrapperContained.fallDistance(); }
// // public static float fallDistance() { return net.minecraft.entity.damage.DamageRecord.fallDistance(); }

}