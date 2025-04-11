package yarnwrap.client.sound;
public class SoundSystem { public net.minecraft.client.sound.SoundSystem wrapperContained; public SoundSystem(net.minecraft.client.sound.SoundSystem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.sound.SoundEngine soundEngine() { return new yarnwrap.client.sound.SoundEngine(wrapperContained.soundEngine); }
// public void soundEngine(yarnwrap.client.sound.SoundEngine value) { wrapperContained.soundEngine = value.wrapperContained; }
// public yarnwrap.client.sound.SoundListener listener() { return new yarnwrap.client.sound.SoundListener(wrapperContained.listener); }
// public void listener(yarnwrap.client.sound.SoundListener value) { wrapperContained.listener = value.wrapperContained; }
// public yarnwrap.client.sound.SoundLoader soundLoader() { return new yarnwrap.client.sound.SoundLoader(wrapperContained.soundLoader); }
// public void soundLoader(yarnwrap.client.sound.SoundLoader value) { wrapperContained.soundLoader = value.wrapperContained; }
// public yarnwrap.client.sound.SoundExecutor taskQueue() { return new yarnwrap.client.sound.SoundExecutor(wrapperContained.taskQueue); }
// public void taskQueue(yarnwrap.client.sound.SoundExecutor value) { wrapperContained.taskQueue = value.wrapperContained; }
// public yarnwrap.client.sound.Channel channel() { return new yarnwrap.client.sound.Channel(wrapperContained.channel); }
// public void channel(yarnwrap.client.sound.Channel value) { wrapperContained.channel = value.wrapperContained; }
// public java.util.Map sources() { return wrapperContained.sources; }
// public void sources(java.util.Map value) { wrapperContained.sources = value; }
// public com.google.common.collect.Multimap sounds() { return wrapperContained.sounds; }
// public void sounds(com.google.common.collect.Multimap value) { wrapperContained.sounds = value; }
// public java.util.Map soundEndTicks() { return wrapperContained.soundEndTicks; }
// public void soundEndTicks(java.util.Map value) { wrapperContained.soundEndTicks = value; }
// public java.util.List soundsToPlayNextTick() { return wrapperContained.soundsToPlayNextTick; }
// public void soundsToPlayNextTick(java.util.List value) { wrapperContained.soundsToPlayNextTick = value; }
public java.lang.String FOR_THE_DEBUG() { return wrapperContained.FOR_THE_DEBUG; }
// public void FOR_THE_DEBUG(java.lang.String value) { wrapperContained.FOR_THE_DEBUG = value; }
// public float MIN_PITCH() { return wrapperContained.MIN_PITCH; }
// public void MIN_PITCH(float value) { wrapperContained.MIN_PITCH = value; }
// public float MAX_PITCH() { return wrapperContained.MAX_PITCH; }
// public void MAX_PITCH(float value) { wrapperContained.MAX_PITCH = value; }
// public float MIN_VOLUME() { return wrapperContained.MIN_VOLUME; }
// public void MIN_VOLUME(float value) { wrapperContained.MIN_VOLUME = value; }
// public float MAX_VOLUME() { return wrapperContained.MAX_VOLUME; }
// public void MAX_VOLUME(float value) { wrapperContained.MAX_VOLUME = value; }
public java.lang.String OPENAL_SOFT_ON() { return wrapperContained.OPENAL_SOFT_ON; }
// public void OPENAL_SOFT_ON(java.lang.String value) { wrapperContained.OPENAL_SOFT_ON = value; }
public int OPENAL_SOFT_ON_LENGTH() { return wrapperContained.OPENAL_SOFT_ON_LENGTH; }
// public void OPENAL_SOFT_ON_LENGTH(int value) { wrapperContained.OPENAL_SOFT_ON_LENGTH = value; }
// public long MIN_TIME_INTERVAL_TO_RELOAD_SOUNDS() { return wrapperContained.MIN_TIME_INTERVAL_TO_RELOAD_SOUNDS; }
// public void MIN_TIME_INTERVAL_TO_RELOAD_SOUNDS(long value) { wrapperContained.MIN_TIME_INTERVAL_TO_RELOAD_SOUNDS = value; }
// public long lastSoundDeviceCheckTime() { return wrapperContained.lastSoundDeviceCheckTime; }
// public void lastSoundDeviceCheckTime(long value) { wrapperContained.lastSoundDeviceCheckTime = value; }
// public java.util.concurrent.atomic.AtomicReference deviceChangeStatus() { return wrapperContained.deviceChangeStatus; }
// public void deviceChangeStatus(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.deviceChangeStatus = value; }
// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public java.util.List preloadedSounds() { return wrapperContained.preloadedSounds; }
// public void preloadedSounds(java.util.List value) { wrapperContained.preloadedSounds = value; }
// public yarnwrap.client.sound.SoundManager loader() { return new yarnwrap.client.sound.SoundManager(wrapperContained.loader); }
// public void loader(yarnwrap.client.sound.SoundManager value) { wrapperContained.loader = value.wrapperContained; }
// public org.slf4j.Marker MARKER() { return wrapperContained.MARKER; }
// public void MARKER(org.slf4j.Marker value) { wrapperContained.MARKER = value; }
// public yarnwrap.client.option.GameOptions settings() { return new yarnwrap.client.option.GameOptions(wrapperContained.settings); }
// public void settings(yarnwrap.client.option.GameOptions value) { wrapperContained.settings = value.wrapperContained; }
// public java.util.List tickingSounds() { return wrapperContained.tickingSounds; }
// public void tickingSounds(java.util.List value) { wrapperContained.tickingSounds = value; }
// public java.util.List listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.List value) { wrapperContained.listeners = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Set UNKNOWN_SOUNDS() { return wrapperContained.UNKNOWN_SOUNDS; }
// public void UNKNOWN_SOUNDS(java.util.Set value) { wrapperContained.UNKNOWN_SOUNDS = value; }
// public boolean started() { return wrapperContained.started; }
// public void started(boolean value) { wrapperContained.started = value; }
// public java.util.Map startTicks() { return wrapperContained.startTicks; }
// public void startTicks(java.util.Map value) { wrapperContained.startTicks = value; }
public SoundSystem(yarnwrap.client.sound.SoundManager loader,yarnwrap.client.option.GameOptions settings,yarnwrap.resource.ResourceFactory resourceFactory) { this.wrapperContained = new net.minecraft.client.sound.SoundSystem(loader.wrapperContained,settings.wrapperContained,resourceFactory.wrapperContained); }
// public void method_19748(float source) { wrapperContained.method_19748(source); }
// public void method_19749(float source) { wrapperContained.method_19749(source); }
// public void method_19750(float source) { wrapperContained.method_19750(source); }
// public void method_19752(yarnwrap.client.sound.StaticSound source) { wrapperContained.method_19752(source.wrapperContained); }
public void stop(yarnwrap.client.sound.SoundInstance sound) { wrapperContained.stop(sound.wrapperContained); }
// public void method_19754(yarnwrap.client.sound.SoundInstance source,Object sourceManager) { wrapperContained.method_19754(source.wrapperContained,sourceManager); }
// public void method_19755(yarnwrap.client.sound.AudioStream source) { wrapperContained.method_19755(source.wrapperContained); }
// public void method_19756(Object source) { wrapperContained.method_19756(source); }
// public void method_19757(Object sound) { wrapperContained.method_19757(sound); }
// public void method_19758(Object stream) { wrapperContained.method_19758(stream); }
// public void method_19759(java.util.stream.Stream sources) { wrapperContained.method_19759(sources); }
// public void method_19760(java.util.stream.Stream sources) { wrapperContained.method_19760(sources); }
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