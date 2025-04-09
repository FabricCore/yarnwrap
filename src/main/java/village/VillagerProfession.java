package yarnwrap.village;
public class VillagerProfession { public net.minecraft.village.VillagerProfession wrapperContained; public VillagerProfession(net.minecraft.village.VillagerProfession wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public java.util.function.Predicate heldWorkstation() { return wrapperContained.heldWorkstation; }
// public java.util.function.Predicate acquirableWorkstation() { return wrapperContained.acquirableWorkstation; }
// public com.google.common.collect.ImmutableSet gatherableItems() { return wrapperContained.gatherableItems; }
// public com.google.common.collect.ImmutableSet secondaryJobSites() { return wrapperContained.secondaryJobSites; }
// public yarnwrap.sound.SoundEvent workSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.workSound); }
public java.util.function.Predicate IS_ACQUIRABLE_JOB_SITE() { return wrapperContained.IS_ACQUIRABLE_JOB_SITE; }
// public java.lang.String id() { return wrapperContained.id(); }
// public java.util.function.Predicate heldWorkstation() { return wrapperContained.heldWorkstation(); }
// public java.util.function.Predicate acquirableWorkstation() { return wrapperContained.acquirableWorkstation(); }
// public com.google.common.collect.ImmutableSet gatherableItems() { return wrapperContained.gatherableItems(); }
// public com.google.common.collect.ImmutableSet secondaryJobSites() { return wrapperContained.secondaryJobSites(); }
// public yarnwrap.sound.SoundEvent workSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.workSound()); }
// public yarnwrap.village.VillagerProfession register(java.lang.String id,yarnwrap.registry.RegistryKey heldWorkstation,yarnwrap.sound.SoundEvent workSound) { return new yarnwrap.village.VillagerProfession(wrapperContained.register(id,heldWorkstation.wrapperContained,workSound.wrapperContained)); }
// public yarnwrap.village.VillagerProfession register(java.lang.String id,yarnwrap.registry.RegistryKey heldWorkstation,com.google.common.collect.ImmutableSet gatherableItems,com.google.common.collect.ImmutableSet secondaryJobSites,yarnwrap.sound.SoundEvent workSound) { return new yarnwrap.village.VillagerProfession(wrapperContained.register(id,heldWorkstation.wrapperContained,gatherableItems,secondaryJobSites,workSound.wrapperContained)); }
// public yarnwrap.village.VillagerProfession register(java.lang.String id,java.util.function.Predicate heldWorkstation,java.util.function.Predicate acquirableWorkstation,yarnwrap.sound.SoundEvent workSound) { return new yarnwrap.village.VillagerProfession(wrapperContained.register(id,heldWorkstation,acquirableWorkstation,workSound.wrapperContained)); }
// public yarnwrap.village.VillagerProfession register(java.lang.String id,java.util.function.Predicate heldWorkstation,java.util.function.Predicate acquirableWorkstation,com.google.common.collect.ImmutableSet gatherableItems,com.google.common.collect.ImmutableSet secondaryJobSites,yarnwrap.sound.SoundEvent workSound) { return new yarnwrap.village.VillagerProfession(wrapperContained.register(id,heldWorkstation,acquirableWorkstation,gatherableItems,secondaryJobSites,workSound.wrapperContained)); }

}