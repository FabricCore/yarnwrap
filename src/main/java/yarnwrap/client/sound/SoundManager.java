package yarnwrap.client.sound;
public class SoundManager { public net.minecraft.client.sound.SoundManager wrapperContained; public SoundManager(net.minecraft.client.sound.SoundManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String SOUNDS_JSON() { return wrapperContained.SOUNDS_JSON; }
// public void SOUNDS_JSON(java.lang.String value) { wrapperContained.SOUNDS_JSON = value; }
// public java.util.Map soundResources() { return wrapperContained.soundResources; }
// public void soundResources(java.util.Map value) { wrapperContained.soundResources = value; }
public yarnwrap.util.Identifier INTENTIONALLY_EMPTY_ID() { return new yarnwrap.util.Identifier(wrapperContained.INTENTIONALLY_EMPTY_ID); }
// public void INTENTIONALLY_EMPTY_ID(yarnwrap.util.Identifier value) { wrapperContained.INTENTIONALLY_EMPTY_ID = value.wrapperContained; }
public yarnwrap.client.sound.WeightedSoundSet INTENTIONALLY_EMPTY_SOUND_SET() { return new yarnwrap.client.sound.WeightedSoundSet(wrapperContained.INTENTIONALLY_EMPTY_SOUND_SET); }
// public void INTENTIONALLY_EMPTY_SOUND_SET(yarnwrap.client.sound.WeightedSoundSet value) { wrapperContained.INTENTIONALLY_EMPTY_SOUND_SET = value.wrapperContained; }
public yarnwrap.client.sound.Sound INTENTIONALLY_EMPTY_SOUND() { return new yarnwrap.client.sound.Sound(wrapperContained.INTENTIONALLY_EMPTY_SOUND); }
// public void INTENTIONALLY_EMPTY_SOUND(yarnwrap.client.sound.Sound value) { wrapperContained.INTENTIONALLY_EMPTY_SOUND = value.wrapperContained; }
public yarnwrap.util.Identifier EMPTY_ID() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_ID); }
// public void EMPTY_ID(yarnwrap.util.Identifier value) { wrapperContained.EMPTY_ID = value.wrapperContained; }
// public java.util.Map sounds() { return wrapperContained.sounds; }
// public void sounds(java.util.Map value) { wrapperContained.sounds = value; }
// public yarnwrap.client.sound.SoundSystem soundSystem() { return new yarnwrap.client.sound.SoundSystem(wrapperContained.soundSystem); }
// public void soundSystem(yarnwrap.client.sound.SoundSystem value) { wrapperContained.soundSystem = value.wrapperContained; }
// public com.google.gson.reflect.TypeToken TYPE() { return wrapperContained.TYPE; }
// public void TYPE(com.google.gson.reflect.TypeToken value) { wrapperContained.TYPE = value; }
public yarnwrap.client.sound.Sound MISSING_SOUND() { return new yarnwrap.client.sound.Sound(wrapperContained.MISSING_SOUND); }
// public void MISSING_SOUND(yarnwrap.client.sound.Sound value) { wrapperContained.MISSING_SOUND = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
public SoundManager(yarnwrap.client.option.GameOptions gameOptions) { this.wrapperContained = new net.minecraft.client.sound.SoundManager(gameOptions.wrapperContained); }
public void tick(boolean paused) { wrapperContained.tick(paused); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
public void playNextTick(yarnwrap.client.sound.TickableSoundInstance sound) { wrapperContained.playNextTick(sound.wrapperContained); }
public java.util.List getSoundDevices() { return wrapperContained.getSoundDevices(); }
public void reloadSounds() { wrapperContained.reloadSounds(); }
public java.util.Collection getKeys() { return wrapperContained.getKeys(); }
public void updateSoundVolume(yarnwrap.sound.SoundCategory category,float volume) { wrapperContained.updateSoundVolume(category.wrapperContained,volume); }
public void unregisterListener(yarnwrap.client.sound.SoundInstanceListener listener) { wrapperContained.unregisterListener(listener.wrapperContained); }
// public boolean isSoundResourcePresent(yarnwrap.client.sound.Sound sound,yarnwrap.util.Identifier id,yarnwrap.resource.ResourceFactory resourceFactory) { return wrapperContained.isSoundResourcePresent(sound.wrapperContained,id.wrapperContained,resourceFactory.wrapperContained); }
public yarnwrap.client.sound.WeightedSoundSet get(yarnwrap.util.Identifier id) { return new yarnwrap.client.sound.WeightedSoundSet(wrapperContained.get(id.wrapperContained)); }
public void stop(yarnwrap.client.sound.SoundInstance sound) { wrapperContained.stop(sound.wrapperContained); }
public void play(yarnwrap.client.sound.SoundInstance sound,int delay) { wrapperContained.play(sound.wrapperContained,delay); }
public void play(yarnwrap.client.sound.SoundInstance sound) { wrapperContained.play(sound.wrapperContained); }
public void stopSounds(yarnwrap.util.Identifier id,yarnwrap.sound.SoundCategory soundCategory) { wrapperContained.stopSounds(id.wrapperContained,soundCategory.wrapperContained); }
public void updateListenerPosition(yarnwrap.client.render.Camera camera) { wrapperContained.updateListenerPosition(camera.wrapperContained); }
public boolean isPlaying(yarnwrap.client.sound.SoundInstance sound) { return wrapperContained.isPlaying(sound.wrapperContained); }
public void registerListener(yarnwrap.client.sound.SoundInstanceListener listener) { wrapperContained.registerListener(listener.wrapperContained); }
public void pauseAll() { wrapperContained.pauseAll(); }
public void resumeAll() { wrapperContained.resumeAll(); }
public void stopAll() { wrapperContained.stopAll(); }
public void close() { wrapperContained.close(); }
public void stopAbruptly() { wrapperContained.stopAbruptly(); }
public yarnwrap.client.sound.SoundListenerTransform getListenerTransform() { return new yarnwrap.client.sound.SoundListenerTransform(wrapperContained.getListenerTransform()); }

}