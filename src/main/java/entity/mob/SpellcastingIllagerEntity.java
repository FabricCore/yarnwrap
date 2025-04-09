package yarnwrap.entity.mob;
public class SpellcastingIllagerEntity { public net.minecraft.entity.mob.SpellcastingIllagerEntity wrapperContained; public SpellcastingIllagerEntity(net.minecraft.entity.mob.SpellcastingIllagerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object spell() { return wrapperContained.spell; }
// public int spellTicks() { return wrapperContained.spellTicks; }
// public yarnwrap.entity.data.TrackedData SPELL() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SPELL); }
public boolean isSpellcasting() { return wrapperContained.isSpellcasting(); }
// public void setSpell(Object spell) { wrapperContained.setSpell(spell); }
// public int getSpellTicks() { return wrapperContained.getSpellTicks(); }
// public Object getSpell() { return wrapperContained.getSpell(); }
// public yarnwrap.sound.SoundEvent getCastSpellSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getCastSpellSound()); }

}