package yarnwrap.sound;
public class SoundEvents { public net.minecraft.sound.SoundEvents wrapperContained; public SoundEvents(net.minecraft.sound.SoundEvents wrapperContained) { this.wrapperContained = wrapperContained; }

public int GOAT_HORN_SOUND_COUNT() { return wrapperContained.GOAT_HORN_SOUND_COUNT; }
public com.google.common.collect.ImmutableList GOAT_HORN_SOUNDS() { return wrapperContained.GOAT_HORN_SOUNDS; }
// public yarnwrap.sound.SoundEvent register(java.lang.String id) { return new yarnwrap.sound.SoundEvent(wrapperContained.register(id)); }
// public yarnwrap.registry.entry.RegistryEntry register(yarnwrap.util.Identifier id,yarnwrap.util.Identifier soundId,float distanceToTravel) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.register(id.wrapperContained,soundId.wrapperContained,distanceToTravel)); }
// public com.google.common.collect.ImmutableList registerGoatHornSounds() { return wrapperContained.registerGoatHornSounds(); }
// public yarnwrap.sound.SoundEvent register(yarnwrap.util.Identifier id) { return new yarnwrap.sound.SoundEvent(wrapperContained.register(id.wrapperContained)); }
// public yarnwrap.sound.SoundEvent register(yarnwrap.util.Identifier id,yarnwrap.util.Identifier soundId) { return new yarnwrap.sound.SoundEvent(wrapperContained.register(id.wrapperContained,soundId.wrapperContained)); }
// public Object registerReference(yarnwrap.util.Identifier id) { return wrapperContained.registerReference(id.wrapperContained); }
// public Object registerReference(yarnwrap.util.Identifier id,yarnwrap.util.Identifier soundId) { return wrapperContained.registerReference(id.wrapperContained,soundId.wrapperContained); }
// public Object registerReference(java.lang.String id) { return wrapperContained.registerReference(id); }

}