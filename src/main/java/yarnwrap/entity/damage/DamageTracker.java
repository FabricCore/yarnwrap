package yarnwrap.entity.damage;
public class DamageTracker { public net.minecraft.entity.damage.DamageTracker wrapperContained; public DamageTracker(net.minecraft.entity.damage.DamageTracker wrapperContained) { this.wrapperContained = wrapperContained; }

public int DAMAGE_COOLDOWN() { return wrapperContained.DAMAGE_COOLDOWN; }
// public void DAMAGE_COOLDOWN(int value) { wrapperContained.DAMAGE_COOLDOWN = value; }
public int ATTACK_DAMAGE_COOLDOWN() { return wrapperContained.ATTACK_DAMAGE_COOLDOWN; }
// public void ATTACK_DAMAGE_COOLDOWN(int value) { wrapperContained.ATTACK_DAMAGE_COOLDOWN = value; }
// public yarnwrap.text.Style INTENTIONAL_GAME_DESIGN_ISSUE_LINK_STYLE() { return new yarnwrap.text.Style(wrapperContained.INTENTIONAL_GAME_DESIGN_ISSUE_LINK_STYLE); }
// public void INTENTIONAL_GAME_DESIGN_ISSUE_LINK_STYLE(yarnwrap.text.Style value) { wrapperContained.INTENTIONAL_GAME_DESIGN_ISSUE_LINK_STYLE = value.wrapperContained; }
// public java.util.List recentDamage() { return wrapperContained.recentDamage; }
// public void recentDamage(java.util.List value) { wrapperContained.recentDamage = value; }
// public boolean hasDamage() { return wrapperContained.hasDamage; }
// public void hasDamage(boolean value) { wrapperContained.hasDamage = value; }
// public int ageOnLastUpdate() { return wrapperContained.ageOnLastUpdate; }
// public void ageOnLastUpdate(int value) { wrapperContained.ageOnLastUpdate = value; }
// public boolean recentlyAttacked() { return wrapperContained.recentlyAttacked; }
// public void recentlyAttacked(boolean value) { wrapperContained.recentlyAttacked = value; }
// public int ageOnLastAttacked() { return wrapperContained.ageOnLastAttacked; }
// public void ageOnLastAttacked(int value) { wrapperContained.ageOnLastAttacked = value; }
// public int ageOnLastDamage() { return wrapperContained.ageOnLastDamage; }
// public void ageOnLastDamage(int value) { wrapperContained.ageOnLastDamage = value; }
// public yarnwrap.entity.LivingEntity entity() { return new yarnwrap.entity.LivingEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.LivingEntity value) { wrapperContained.entity = value.wrapperContained; }
// public yarnwrap.text.Text getFallDeathMessage(yarnwrap.entity.damage.DamageRecord damageRecord,yarnwrap.entity.Entity attacker) { return new yarnwrap.text.Text(wrapperContained.getFallDeathMessage(damageRecord.wrapperContained,attacker.wrapperContained)); }
// public boolean isAttackerLiving(yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.isAttackerLiving(damageSource.wrapperContained); }
// public yarnwrap.text.Text getDisplayName(yarnwrap.entity.Entity entity) { return new yarnwrap.text.Text(wrapperContained.getDisplayName(entity.wrapperContained)); }
// public yarnwrap.text.Text getAttackedFallDeathMessage(yarnwrap.entity.Entity attacker,yarnwrap.text.Text attackerDisplayName,java.lang.String itemDeathTranslationKey,java.lang.String deathTranslationKey) { return new yarnwrap.text.Text(wrapperContained.getAttackedFallDeathMessage(attacker.wrapperContained,attackerDisplayName.wrapperContained,itemDeathTranslationKey,deathTranslationKey)); }
public void update() { wrapperContained.update(); }
// public yarnwrap.entity.damage.DamageRecord getBiggestFall() { return new yarnwrap.entity.damage.DamageRecord(wrapperContained.getBiggestFall()); }
public int getTimeSinceLastAttack() { return wrapperContained.getTimeSinceLastAttack(); }
public void onDamage(yarnwrap.entity.damage.DamageSource damageSource,float damage) { wrapperContained.onDamage(damageSource.wrapperContained,damage); }
public yarnwrap.text.Text getDeathMessage() { return new yarnwrap.text.Text(wrapperContained.getDeathMessage()); }

}