package yarnwrap.village;
public class VillagerProfession { public net.minecraft.village.VillagerProfession wrapperContained; public VillagerProfession(net.minecraft.village.VillagerProfession wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.village.VillagerProfession.id; }
// public static void id(java.lang.String value, ) { net.minecraft.village.VillagerProfession.id = value; }

// public java.util.function.Predicate heldWorkstation() { return wrapperContained.heldWorkstation; }
// public void heldWorkstation(java.util.function.Predicate value) { wrapperContained.heldWorkstation = value; }
// public static java.util.function.Predicate heldWorkstation() { return net.minecraft.village.VillagerProfession.heldWorkstation; }
// public static void heldWorkstation(java.util.function.Predicate value, ) { net.minecraft.village.VillagerProfession.heldWorkstation = value; }

// public java.util.function.Predicate acquirableWorkstation() { return wrapperContained.acquirableWorkstation; }
// public void acquirableWorkstation(java.util.function.Predicate value) { wrapperContained.acquirableWorkstation = value; }
// public static java.util.function.Predicate acquirableWorkstation() { return net.minecraft.village.VillagerProfession.acquirableWorkstation; }
// public static void acquirableWorkstation(java.util.function.Predicate value, ) { net.minecraft.village.VillagerProfession.acquirableWorkstation = value; }

// public com.google.common.collect.ImmutableSet gatherableItems() { return wrapperContained.gatherableItems; }
// public void gatherableItems(com.google.common.collect.ImmutableSet value) { wrapperContained.gatherableItems = value; }
// public static com.google.common.collect.ImmutableSet gatherableItems() { return net.minecraft.village.VillagerProfession.gatherableItems; }
// public static void gatherableItems(com.google.common.collect.ImmutableSet value, ) { net.minecraft.village.VillagerProfession.gatherableItems = value; }

// public com.google.common.collect.ImmutableSet secondaryJobSites() { return wrapperContained.secondaryJobSites; }
// public void secondaryJobSites(com.google.common.collect.ImmutableSet value) { wrapperContained.secondaryJobSites = value; }
// public static com.google.common.collect.ImmutableSet secondaryJobSites() { return net.minecraft.village.VillagerProfession.secondaryJobSites; }
// public static void secondaryJobSites(com.google.common.collect.ImmutableSet value, ) { net.minecraft.village.VillagerProfession.secondaryJobSites = value; }

// public yarnwrap.sound.SoundEvent workSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.workSound); }
// public void workSound(yarnwrap.sound.SoundEvent value) { wrapperContained.workSound = value.wrapperContained; }
// public static yarnwrap.sound.SoundEvent workSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.village.VillagerProfession.workSound); }
// public static void workSound(yarnwrap.sound.SoundEvent value, ) { net.minecraft.village.VillagerProfession.workSound = value.wrapperContained; }

// public java.util.function.Predicate IS_ACQUIRABLE_JOB_SITE() { return wrapperContained.IS_ACQUIRABLE_JOB_SITE; }
// public void IS_ACQUIRABLE_JOB_SITE(java.util.function.Predicate value) { wrapperContained.IS_ACQUIRABLE_JOB_SITE = value; }
public static java.util.function.Predicate IS_ACQUIRABLE_JOB_SITE() { return net.minecraft.village.VillagerProfession.IS_ACQUIRABLE_JOB_SITE; }
// public static void IS_ACQUIRABLE_JOB_SITE(java.util.function.Predicate value, ) { net.minecraft.village.VillagerProfession.IS_ACQUIRABLE_JOB_SITE = value; }

// public VillagerProfession(java.lang.String id) { this.wrapperContained = new net.minecraft.village.VillagerProfession(id); }
// public java.lang.String id() { return wrapperContained.id(); }
// // public static java.lang.String id() { return net.minecraft.village.VillagerProfession.id(); }
// public java.util.function.Predicate heldWorkstation() { return wrapperContained.heldWorkstation(); }
// // public static java.util.function.Predicate heldWorkstation() { return net.minecraft.village.VillagerProfession.heldWorkstation(); }
// public java.util.function.Predicate acquirableWorkstation() { return wrapperContained.acquirableWorkstation(); }
// // public static java.util.function.Predicate acquirableWorkstation() { return net.minecraft.village.VillagerProfession.acquirableWorkstation(); }
// public com.google.common.collect.ImmutableSet gatherableItems() { return wrapperContained.gatherableItems(); }
// // public static com.google.common.collect.ImmutableSet gatherableItems() { return net.minecraft.village.VillagerProfession.gatherableItems(); }
// public com.google.common.collect.ImmutableSet secondaryJobSites() { return wrapperContained.secondaryJobSites(); }
// // public static com.google.common.collect.ImmutableSet secondaryJobSites() { return net.minecraft.village.VillagerProfession.secondaryJobSites(); }
// public yarnwrap.sound.SoundEvent workSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.workSound()); }
// // public static yarnwrap.sound.SoundEvent workSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.village.VillagerProfession.workSound()); }
// public yarnwrap.village.VillagerProfession register(java.lang.String id,yarnwrap.registry.RegistryKey heldWorkstation,yarnwrap.sound.SoundEvent workSound) { return new yarnwrap.village.VillagerProfession(wrapperContained.register(id,heldWorkstation.wrapperContained,workSound.wrapperContained)); }
// public static yarnwrap.village.VillagerProfession register(java.lang.String id,yarnwrap.registry.RegistryKey heldWorkstation,yarnwrap.sound.SoundEvent workSound, ) { return new yarnwrap.village.VillagerProfession(net.minecraft.village.VillagerProfession.register(id,heldWorkstation.wrapperContained,workSound.wrapperContained)); }
// public yarnwrap.village.VillagerProfession register(java.lang.String id,yarnwrap.registry.RegistryKey heldWorkstation,com.google.common.collect.ImmutableSet gatherableItems,com.google.common.collect.ImmutableSet secondaryJobSites,yarnwrap.sound.SoundEvent workSound) { return new yarnwrap.village.VillagerProfession(wrapperContained.register(id,heldWorkstation.wrapperContained,gatherableItems,secondaryJobSites,workSound.wrapperContained)); }
// public static yarnwrap.village.VillagerProfession register(java.lang.String id,yarnwrap.registry.RegistryKey heldWorkstation,com.google.common.collect.ImmutableSet gatherableItems,com.google.common.collect.ImmutableSet secondaryJobSites,yarnwrap.sound.SoundEvent workSound, ) { return new yarnwrap.village.VillagerProfession(net.minecraft.village.VillagerProfession.register(id,heldWorkstation.wrapperContained,gatherableItems,secondaryJobSites,workSound.wrapperContained)); }
// public boolean method_44005(yarnwrap.registry.RegistryKey entry) { return wrapperContained.method_44005(entry.wrapperContained); }
// public static boolean method_44005(yarnwrap.registry.RegistryKey entry, ) { return net.minecraft.village.VillagerProfession.method_44005(entry.wrapperContained); }
// public boolean method_44006(yarnwrap.registry.entry.RegistryEntry poiType) { return wrapperContained.method_44006(poiType.wrapperContained); }
// public static boolean method_44006(yarnwrap.registry.entry.RegistryEntry poiType, ) { return net.minecraft.village.VillagerProfession.method_44006(poiType.wrapperContained); }
// public yarnwrap.village.VillagerProfession register(java.lang.String id,java.util.function.Predicate heldWorkstation,java.util.function.Predicate acquirableWorkstation,yarnwrap.sound.SoundEvent workSound) { return new yarnwrap.village.VillagerProfession(wrapperContained.register(id,heldWorkstation,acquirableWorkstation,workSound.wrapperContained)); }
// public static yarnwrap.village.VillagerProfession register(java.lang.String id,java.util.function.Predicate heldWorkstation,java.util.function.Predicate acquirableWorkstation,yarnwrap.sound.SoundEvent workSound, ) { return new yarnwrap.village.VillagerProfession(net.minecraft.village.VillagerProfession.register(id,heldWorkstation,acquirableWorkstation,workSound.wrapperContained)); }
// public yarnwrap.village.VillagerProfession register(java.lang.String id,java.util.function.Predicate heldWorkstation,java.util.function.Predicate acquirableWorkstation,com.google.common.collect.ImmutableSet gatherableItems,com.google.common.collect.ImmutableSet secondaryJobSites,yarnwrap.sound.SoundEvent workSound) { return new yarnwrap.village.VillagerProfession(wrapperContained.register(id,heldWorkstation,acquirableWorkstation,gatherableItems,secondaryJobSites,workSound.wrapperContained)); }
// public static yarnwrap.village.VillagerProfession register(java.lang.String id,java.util.function.Predicate heldWorkstation,java.util.function.Predicate acquirableWorkstation,com.google.common.collect.ImmutableSet gatherableItems,com.google.common.collect.ImmutableSet secondaryJobSites,yarnwrap.sound.SoundEvent workSound, ) { return new yarnwrap.village.VillagerProfession(net.minecraft.village.VillagerProfession.register(id,heldWorkstation,acquirableWorkstation,gatherableItems,secondaryJobSites,workSound.wrapperContained)); }
// public boolean method_44009(yarnwrap.registry.RegistryKey entry) { return wrapperContained.method_44009(entry.wrapperContained); }
// public static boolean method_44009(yarnwrap.registry.RegistryKey entry, ) { return net.minecraft.village.VillagerProfession.method_44009(entry.wrapperContained); }
// public boolean method_44321(yarnwrap.registry.RegistryKey entry) { return wrapperContained.method_44321(entry.wrapperContained); }
// public static boolean method_44321(yarnwrap.registry.RegistryKey entry, ) { return net.minecraft.village.VillagerProfession.method_44321(entry.wrapperContained); }
// public boolean method_44322(yarnwrap.registry.RegistryKey entry) { return wrapperContained.method_44322(entry.wrapperContained); }
// public static boolean method_44322(yarnwrap.registry.RegistryKey entry, ) { return net.minecraft.village.VillagerProfession.method_44322(entry.wrapperContained); }

}