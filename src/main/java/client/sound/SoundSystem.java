package yarnwrap.client.sound;
public class SoundSystem { public net.minecraft.client.sound.SoundSystem wrapperContained; public SoundSystem(net.minecraft.client.sound.SoundSystem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.sound.SoundEngine soundEngine() { return new yarnwrap.client.sound.SoundEngine(wrapperContained.soundEngine); }
// public yarnwrap.client.sound.SoundListener listener() { return new yarnwrap.client.sound.SoundListener(wrapperContained.listener); }
// public yarnwrap.client.sound.SoundLoader soundLoader() { return new yarnwrap.client.sound.SoundLoader(wrapperContained.soundLoader); }
// public yarnwrap.client.sound.SoundExecutor taskQueue() { return new yarnwrap.client.sound.SoundExecutor(wrapperContained.taskQueue); }
// public yarnwrap.client.sound.Channel channel() { return new yarnwrap.client.sound.Channel(wrapperContained.channel); }
// public java.util.Map sources() { return wrapperContained.sources; }
// public com.google.common.collect.Multimap sounds() { return wrapperContained.sounds; }
// public java.util.Map soundEndTicks() { return wrapperContained.soundEndTicks; }
// public java.util.List soundsToPlayNextTick() { return wrapperContained.soundsToPlayNextTick; }
public java.lang.String FOR_THE_DEBUG() { return wrapperContained.FOR_THE_DEBUG; }
// public float MIN_PITCH() { return wrapperContained.MIN_PITCH; }
// public float MAX_PITCH() { return wrapperContained.MAX_PITCH; }
// public float MIN_VOLUME() { return wrapperContained.MIN_VOLUME; }
// public float MAX_VOLUME() { return wrapperContained.MAX_VOLUME; }
public java.lang.String OPENAL_SOFT_ON() { return wrapperContained.OPENAL_SOFT_ON; }
public int OPENAL_SOFT_ON_LENGTH() { return wrapperContained.OPENAL_SOFT_ON_LENGTH; }
// public long MIN_TIME_INTERVAL_TO_RELOAD_SOUNDS() { return wrapperContained.MIN_TIME_INTERVAL_TO_RELOAD_SOUNDS; }
// public long lastSoundDeviceCheckTime() { return wrapperContained.lastSoundDeviceCheckTime; }
// public java.util.concurrent.atomic.AtomicReference deviceChangeStatus() { return wrapperContained.deviceChangeStatus; }
// public int ticks() { return wrapperContained.ticks; }
// public java.util.List preloadedSounds() { return wrapperContained.preloadedSounds; }
// public yarnwrap.client.sound.SoundManager loader() { return new yarnwrap.client.sound.SoundManager(wrapperContained.loader); }
// public org.slf4j.Marker MARKER() { return wrapperContained.MARKER; }
// public yarnwrap.client.option.GameOptions settings() { return new yarnwrap.client.option.GameOptions(wrapperContained.settings); }
// public java.util.List tickingSounds() { return wrapperContained.tickingSounds; }
// public java.util.List listeners() { return wrapperContained.listeners; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Set UNKNOWN_SOUNDS() { return wrapperContained.UNKNOWN_SOUNDS; }
// public boolean started() { return wrapperContained.started; }
// public java.util.Map startTicks() { return wrapperContained.startTicks; }
public void stop(yarnwrap.client.sound.SoundInstance sound) { wrapperContained.stop(sound.wrapperContained); }
public void pauseAll() { wrapperContained.pauseAll(); }
public void resumeAll() { wrapperContained.resumeAll(); }
public void tick(boolean paused) { wrapperContained.tick(paused); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
public void playNextTick(yarnwrap.client.sound.TickableSoundInstance sound) { wrapperContained.playNextTick(sound.wrapperContained); }
// public boolean canRepeatInstantly(yarnwrap.client.sound.SoundInstance sound) { return wrapperContained.canRepeatInstantly(sound.wrapperContained); }
// public boolean isRepeatDelayed(yarnwrap.client.sound.SoundInstance sound) { return wrapperContained.isRepeatDelayed(sound.wrapperContained); }
// public boolean shouldRepeatInstantly(yarnwrap.client.sound.SoundInstance sound) { return wrapperContained.shouldRepeatInstantly(sound.wrapperContained); }
public java.util.List getSoundDevices() { return wrapperContained.getSoundDevices(); }
// public boolean shouldReloadSounds() { return wrapperContained.shouldReloadSounds(); }
// public float getAdjustedVolume(float volume,yarnwrap.sound.SoundCategory category) { return wrapperContained.getAdjustedVolume(volume,category.wrapperContained); }
public boolean isPlaying(yarnwrap.client.sound.SoundInstance sound) { return wrapperContained.isPlaying(sound.wrapperContained); }
public void reloadSounds() { wrapperContained.reloadSounds(); }
public void stopSounds(yarnwrap.util.Identifier id,yarnwrap.sound.SoundCategory category) { wrapperContained.stopSounds(id.wrapperContained,category.wrapperContained); }
public void updateListenerPosition(yarnwrap.client.render.Camera camera) { wrapperContained.updateListenerPosition(camera.wrapperContained); }
public void stopAll() { wrapperContained.stopAll(); }
public void updateSoundVolume(yarnwrap.sound.SoundCategory category,float volume) { wrapperContained.updateSoundVolume(category.wrapperContained,volume); }
// public void start() { wrapperContained.start(); }
public void unregisterListener(yarnwrap.client.sound.SoundInstanceListener listener) { wrapperContained.unregisterListener(listener.wrapperContained); }
// public float getAdjustedPitch(yarnwrap.client.sound.SoundInstance sound) { return wrapperContained.getAdjustedPitch(sound.wrapperContained); }
// public float getSoundVolume(yarnwrap.sound.SoundCategory category) { return wrapperContained.getSoundVolume(category.wrapperContained); }
public void addPreloadedSound(yarnwrap.client.sound.Sound sound) { wrapperContained.addPreloadedSound(sound.wrapperContained); }
public void play(yarnwrap.client.sound.SoundInstance sound,int delay) { wrapperContained.play(sound.wrapperContained,delay); }
// public float getAdjustedVolume(yarnwrap.client.sound.SoundInstance sound) { return wrapperContained.getAdjustedVolume(sound.wrapperContained); }
public void play(yarnwrap.client.sound.SoundInstance sound) { wrapperContained.play(sound.wrapperContained); }
public void registerListener(yarnwrap.client.sound.SoundInstanceListener listener) { wrapperContained.registerListener(listener.wrapperContained); }
public void stop() { wrapperContained.stop(); }
// public void tick() { wrapperContained.tick(); }
public void stopAbruptly() { wrapperContained.stopAbruptly(); }
public yarnwrap.client.sound.SoundListenerTransform getListenerTransform() { return new yarnwrap.client.sound.SoundListenerTransform(wrapperContained.getListenerTransform()); }

}