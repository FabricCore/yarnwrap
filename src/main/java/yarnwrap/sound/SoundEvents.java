package yarnwrap.sound;
public class SoundEvents { public net.minecraft.sound.SoundEvents wrapperContained; public SoundEvents(net.minecraft.sound.SoundEvents wrapperContained) { this.wrapperContained = wrapperContained; }

// public int GOAT_HORN_SOUND_COUNT() { return wrapperContained.GOAT_HORN_SOUND_COUNT; }
// public void GOAT_HORN_SOUND_COUNT(int value) { wrapperContained.GOAT_HORN_SOUND_COUNT = value; }
public static int GOAT_HORN_SOUND_COUNT() { return net.minecraft.sound.SoundEvents.GOAT_HORN_SOUND_COUNT; }
// public static void GOAT_HORN_SOUND_COUNT(int value, ) { net.minecraft.sound.SoundEvents.GOAT_HORN_SOUND_COUNT = value; }

// public com.google.common.collect.ImmutableList GOAT_HORN_SOUNDS() { return wrapperContained.GOAT_HORN_SOUNDS; }
// public void GOAT_HORN_SOUNDS(com.google.common.collect.ImmutableList value) { wrapperContained.GOAT_HORN_SOUNDS = value; }
public static com.google.common.collect.ImmutableList GOAT_HORN_SOUNDS() { return net.minecraft.sound.SoundEvents.GOAT_HORN_SOUNDS; }
// public static void GOAT_HORN_SOUNDS(com.google.common.collect.ImmutableList value, ) { net.minecraft.sound.SoundEvents.GOAT_HORN_SOUNDS = value; }

// public yarnwrap.sound.SoundEvent register(java.lang.String id) { return new yarnwrap.sound.SoundEvent(wrapperContained.register(id)); }
// public static yarnwrap.sound.SoundEvent register(java.lang.String id, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.sound.SoundEvents.register(id)); }
// public yarnwrap.registry.entry.RegistryEntry register(yarnwrap.util.Identifier id,yarnwrap.util.Identifier soundId,float distanceToTravel) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.register(id.wrapperContained,soundId.wrapperContained,distanceToTravel)); }
// public static yarnwrap.registry.entry.RegistryEntry register(yarnwrap.util.Identifier id,yarnwrap.util.Identifier soundId,float distanceToTravel, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.sound.SoundEvents.register(id.wrapperContained,soundId.wrapperContained,distanceToTravel)); }
// public com.google.common.collect.ImmutableList registerGoatHornSounds() { return wrapperContained.registerGoatHornSounds(); }
// public static com.google.common.collect.ImmutableList registerGoatHornSounds() { return net.minecraft.sound.SoundEvents.registerGoatHornSounds(); }
// public Object method_43517(int variant) { return wrapperContained.method_43517(variant); }
// public static Object method_43517(int variant, ) { return net.minecraft.sound.SoundEvents.method_43517(variant); }
// public yarnwrap.sound.SoundEvent register(yarnwrap.util.Identifier id) { return new yarnwrap.sound.SoundEvent(wrapperContained.register(id.wrapperContained)); }
// public static yarnwrap.sound.SoundEvent register(yarnwrap.util.Identifier id, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.sound.SoundEvents.register(id.wrapperContained)); }
// public yarnwrap.sound.SoundEvent register(yarnwrap.util.Identifier id,yarnwrap.util.Identifier soundId) { return new yarnwrap.sound.SoundEvent(wrapperContained.register(id.wrapperContained,soundId.wrapperContained)); }
// public static yarnwrap.sound.SoundEvent register(yarnwrap.util.Identifier id,yarnwrap.util.Identifier soundId, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.sound.SoundEvents.register(id.wrapperContained,soundId.wrapperContained)); }
// public Object registerReference(yarnwrap.util.Identifier id) { return wrapperContained.registerReference(id.wrapperContained); }
// public static Object registerReference(yarnwrap.util.Identifier id, ) { return net.minecraft.sound.SoundEvents.registerReference(id.wrapperContained); }
// public Object registerReference(yarnwrap.util.Identifier id,yarnwrap.util.Identifier soundId) { return wrapperContained.registerReference(id.wrapperContained,soundId.wrapperContained); }
// public static Object registerReference(yarnwrap.util.Identifier id,yarnwrap.util.Identifier soundId, ) { return net.minecraft.sound.SoundEvents.registerReference(id.wrapperContained,soundId.wrapperContained); }
// public Object registerReference(java.lang.String id) { return wrapperContained.registerReference(id); }
// public static Object registerReference(java.lang.String id, ) { return net.minecraft.sound.SoundEvents.registerReference(id); }

}