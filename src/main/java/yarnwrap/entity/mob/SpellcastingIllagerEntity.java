package yarnwrap.entity.mob;
public class SpellcastingIllagerEntity { public net.minecraft.entity.mob.SpellcastingIllagerEntity wrapperContained; public SpellcastingIllagerEntity(net.minecraft.entity.mob.SpellcastingIllagerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object spell() { return wrapperContained.spell; }
// // public void spell(Object value) { wrapperContained.spell = value; }
// // public static Object spell() { return net.minecraft.entity.mob.SpellcastingIllagerEntity.spell; }
// // public static void spell(Object value, ) { net.minecraft.entity.mob.SpellcastingIllagerEntity.spell = value; }

// public int spellTicks() { return wrapperContained.spellTicks; }
// public void spellTicks(int value) { wrapperContained.spellTicks = value; }
// public static int spellTicks() { return net.minecraft.entity.mob.SpellcastingIllagerEntity.spellTicks; }
// public static void spellTicks(int value, ) { net.minecraft.entity.mob.SpellcastingIllagerEntity.spellTicks = value; }

// public yarnwrap.entity.data.TrackedData SPELL() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SPELL); }
// public void SPELL(yarnwrap.entity.data.TrackedData value) { wrapperContained.SPELL = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SPELL() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.SpellcastingIllagerEntity.SPELL); }
// public static void SPELL(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.SpellcastingIllagerEntity.SPELL = value.wrapperContained; }

// public int DEFAULT_SPELL_TICKS() { return wrapperContained.DEFAULT_SPELL_TICKS; }
// public void DEFAULT_SPELL_TICKS(int value) { wrapperContained.DEFAULT_SPELL_TICKS = value; }
// public static int DEFAULT_SPELL_TICKS() { return net.minecraft.entity.mob.SpellcastingIllagerEntity.DEFAULT_SPELL_TICKS; }
// public static void DEFAULT_SPELL_TICKS(int value, ) { net.minecraft.entity.mob.SpellcastingIllagerEntity.DEFAULT_SPELL_TICKS = value; }

public boolean isSpellcasting() { return wrapperContained.isSpellcasting(); }
// public static boolean isSpellcasting() { return net.minecraft.entity.mob.SpellcastingIllagerEntity.isSpellcasting(); }
// public void setSpell(Object spell) { wrapperContained.setSpell(spell); }
// public static void setSpell(Object spell, ) { net.minecraft.entity.mob.SpellcastingIllagerEntity.setSpell(spell); }
// public int getSpellTicks() { return wrapperContained.getSpellTicks(); }
// public static int getSpellTicks() { return net.minecraft.entity.mob.SpellcastingIllagerEntity.getSpellTicks(); }
// public Object getSpell() { return wrapperContained.getSpell(); }
// public static Object getSpell() { return net.minecraft.entity.mob.SpellcastingIllagerEntity.getSpell(); }
// public yarnwrap.sound.SoundEvent getCastSpellSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getCastSpellSound()); }
// public static yarnwrap.sound.SoundEvent getCastSpellSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.mob.SpellcastingIllagerEntity.getCastSpellSound()); }

}