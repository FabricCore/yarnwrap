package yarnwrap.client.sound;
public class SoundSystem { public net.minecraft.client.sound.SoundSystem wrapperContained; public SoundSystem(net.minecraft.client.sound.SoundSystem wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public static int ticks() { return net.minecraft.client.sound.SoundSystem.ticks; }
// public static void ticks(int value, ) { net.minecraft.client.sound.SoundSystem.ticks = value; }

// public java.util.List preloadedSounds() { return wrapperContained.preloadedSounds; }
// public void preloadedSounds(java.util.List value) { wrapperContained.preloadedSounds = value; }
// public static java.util.List preloadedSounds() { return net.minecraft.client.sound.SoundSystem.preloadedSounds; }
// public static void preloadedSounds(java.util.List value, ) { net.minecraft.client.sound.SoundSystem.preloadedSounds = value; }

// public yarnwrap.client.sound.SoundManager loader() { return new yarnwrap.client.sound.SoundManager(wrapperContained.loader); }
// public void loader(yarnwrap.client.sound.SoundManager value) { wrapperContained.loader = value.wrapperContained; }
// public static yarnwrap.client.sound.SoundManager loader() { return new yarnwrap.client.sound.SoundManager(net.minecraft.client.sound.SoundSystem.loader); }
// public static void loader(yarnwrap.client.sound.SoundManager value, ) { net.minecraft.client.sound.SoundSystem.loader = value.wrapperContained; }

// public org.slf4j.Marker MARKER() { return wrapperContained.MARKER; }
// public void MARKER(org.slf4j.Marker value) { wrapperContained.MARKER = value; }
// public static org.slf4j.Marker MARKER() { return net.minecraft.client.sound.SoundSystem.MARKER; }
// public static void MARKER(org.slf4j.Marker value, ) { net.minecraft.client.sound.SoundSystem.MARKER = value; }

// public yarnwrap.client.option.GameOptions settings() { return new yarnwrap.client.option.GameOptions(wrapperContained.settings); }
// public void settings(yarnwrap.client.option.GameOptions value) { wrapperContained.settings = value.wrapperContained; }
// public static yarnwrap.client.option.GameOptions settings() { return new yarnwrap.client.option.GameOptions(net.minecraft.client.sound.SoundSystem.settings); }
// public static void settings(yarnwrap.client.option.GameOptions value, ) { net.minecraft.client.sound.SoundSystem.settings = value.wrapperContained; }

// public java.util.List tickingSounds() { return wrapperContained.tickingSounds; }
// public void tickingSounds(java.util.List value) { wrapperContained.tickingSounds = value; }
// public static java.util.List tickingSounds() { return net.minecraft.client.sound.SoundSystem.tickingSounds; }
// public static void tickingSounds(java.util.List value, ) { net.minecraft.client.sound.SoundSystem.tickingSounds = value; }

// public java.util.List listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.List value) { wrapperContained.listeners = value; }
// public static java.util.List listeners() { return net.minecraft.client.sound.SoundSystem.listeners; }
// public static void listeners(java.util.List value, ) { net.minecraft.client.sound.SoundSystem.listeners = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.sound.SoundSystem.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.sound.SoundSystem.LOGGER = value; }

// public java.util.Set UNKNOWN_SOUNDS() { return wrapperContained.UNKNOWN_SOUNDS; }
// public void UNKNOWN_SOUNDS(java.util.Set value) { wrapperContained.UNKNOWN_SOUNDS = value; }
// public static java.util.Set UNKNOWN_SOUNDS() { return net.minecraft.client.sound.SoundSystem.UNKNOWN_SOUNDS; }
// public static void UNKNOWN_SOUNDS(java.util.Set value, ) { net.minecraft.client.sound.SoundSystem.UNKNOWN_SOUNDS = value; }

// public boolean started() { return wrapperContained.started; }
// public void started(boolean value) { wrapperContained.started = value; }
// public static boolean started() { return net.minecraft.client.sound.SoundSystem.started; }
// public static void started(boolean value, ) { net.minecraft.client.sound.SoundSystem.started = value; }

// public java.util.Map soundStartTicks() { return wrapperContained.soundStartTicks; }
// public void soundStartTicks(java.util.Map value) { wrapperContained.soundStartTicks = value; }
// public static java.util.Map soundStartTicks() { return net.minecraft.client.sound.SoundSystem.soundStartTicks; }
// public static void soundStartTicks(java.util.Map value, ) { net.minecraft.client.sound.SoundSystem.soundStartTicks = value; }

// public yarnwrap.client.sound.SoundEngine soundEngine() { return new yarnwrap.client.sound.SoundEngine(wrapperContained.soundEngine); }
// public void soundEngine(yarnwrap.client.sound.SoundEngine value) { wrapperContained.soundEngine = value.wrapperContained; }
// public static yarnwrap.client.sound.SoundEngine soundEngine() { return new yarnwrap.client.sound.SoundEngine(net.minecraft.client.sound.SoundSystem.soundEngine); }
// public static void soundEngine(yarnwrap.client.sound.SoundEngine value, ) { net.minecraft.client.sound.SoundSystem.soundEngine = value.wrapperContained; }

// public yarnwrap.client.sound.SoundListener listener() { return new yarnwrap.client.sound.SoundListener(wrapperContained.listener); }
// public void listener(yarnwrap.client.sound.SoundListener value) { wrapperContained.listener = value.wrapperContained; }
// public static yarnwrap.client.sound.SoundListener listener() { return new yarnwrap.client.sound.SoundListener(net.minecraft.client.sound.SoundSystem.listener); }
// public static void listener(yarnwrap.client.sound.SoundListener value, ) { net.minecraft.client.sound.SoundSystem.listener = value.wrapperContained; }

// public yarnwrap.client.sound.SoundLoader soundLoader() { return new yarnwrap.client.sound.SoundLoader(wrapperContained.soundLoader); }
// public void soundLoader(yarnwrap.client.sound.SoundLoader value) { wrapperContained.soundLoader = value.wrapperContained; }
// public static yarnwrap.client.sound.SoundLoader soundLoader() { return new yarnwrap.client.sound.SoundLoader(net.minecraft.client.sound.SoundSystem.soundLoader); }
// public static void soundLoader(yarnwrap.client.sound.SoundLoader value, ) { net.minecraft.client.sound.SoundSystem.soundLoader = value.wrapperContained; }

// public yarnwrap.client.sound.SoundExecutor taskQueue() { return new yarnwrap.client.sound.SoundExecutor(wrapperContained.taskQueue); }
// public void taskQueue(yarnwrap.client.sound.SoundExecutor value) { wrapperContained.taskQueue = value.wrapperContained; }
// public static yarnwrap.client.sound.SoundExecutor taskQueue() { return new yarnwrap.client.sound.SoundExecutor(net.minecraft.client.sound.SoundSystem.taskQueue); }
// public static void taskQueue(yarnwrap.client.sound.SoundExecutor value, ) { net.minecraft.client.sound.SoundSystem.taskQueue = value.wrapperContained; }

// public yarnwrap.client.sound.Channel channel() { return new yarnwrap.client.sound.Channel(wrapperContained.channel); }
// public void channel(yarnwrap.client.sound.Channel value) { wrapperContained.channel = value.wrapperContained; }
// public static yarnwrap.client.sound.Channel channel() { return new yarnwrap.client.sound.Channel(net.minecraft.client.sound.SoundSystem.channel); }
// public static void channel(yarnwrap.client.sound.Channel value, ) { net.minecraft.client.sound.SoundSystem.channel = value.wrapperContained; }

// public java.util.Map sources() { return wrapperContained.sources; }
// public void sources(java.util.Map value) { wrapperContained.sources = value; }
// public static java.util.Map sources() { return net.minecraft.client.sound.SoundSystem.sources; }
// public static void sources(java.util.Map value, ) { net.minecraft.client.sound.SoundSystem.sources = value; }

// public com.google.common.collect.Multimap sounds() { return wrapperContained.sounds; }
// public void sounds(com.google.common.collect.Multimap value) { wrapperContained.sounds = value; }
// public static com.google.common.collect.Multimap sounds() { return net.minecraft.client.sound.SoundSystem.sounds; }
// public static void sounds(com.google.common.collect.Multimap value, ) { net.minecraft.client.sound.SoundSystem.sounds = value; }

// public java.util.Map soundEndTicks() { return wrapperContained.soundEndTicks; }
// public void soundEndTicks(java.util.Map value) { wrapperContained.soundEndTicks = value; }
// public static java.util.Map soundEndTicks() { return net.minecraft.client.sound.SoundSystem.soundEndTicks; }
// public static void soundEndTicks(java.util.Map value, ) { net.minecraft.client.sound.SoundSystem.soundEndTicks = value; }

// public java.util.List soundsToPlayNextTick() { return wrapperContained.soundsToPlayNextTick; }
// public void soundsToPlayNextTick(java.util.List value) { wrapperContained.soundsToPlayNextTick = value; }
// public static java.util.List soundsToPlayNextTick() { return net.minecraft.client.sound.SoundSystem.soundsToPlayNextTick; }
// public static void soundsToPlayNextTick(java.util.List value, ) { net.minecraft.client.sound.SoundSystem.soundsToPlayNextTick = value; }

// public java.lang.String FOR_THE_DEBUG() { return wrapperContained.FOR_THE_DEBUG; }
// public void FOR_THE_DEBUG(java.lang.String value) { wrapperContained.FOR_THE_DEBUG = value; }
public static java.lang.String FOR_THE_DEBUG() { return net.minecraft.client.sound.SoundSystem.FOR_THE_DEBUG; }
// public static void FOR_THE_DEBUG(java.lang.String value, ) { net.minecraft.client.sound.SoundSystem.FOR_THE_DEBUG = value; }

// public float MIN_PITCH() { return wrapperContained.MIN_PITCH; }
// public void MIN_PITCH(float value) { wrapperContained.MIN_PITCH = value; }
// public static float MIN_PITCH() { return net.minecraft.client.sound.SoundSystem.MIN_PITCH; }
// public static void MIN_PITCH(float value, ) { net.minecraft.client.sound.SoundSystem.MIN_PITCH = value; }

// public float MAX_PITCH() { return wrapperContained.MAX_PITCH; }
// public void MAX_PITCH(float value) { wrapperContained.MAX_PITCH = value; }
// public static float MAX_PITCH() { return net.minecraft.client.sound.SoundSystem.MAX_PITCH; }
// public static void MAX_PITCH(float value, ) { net.minecraft.client.sound.SoundSystem.MAX_PITCH = value; }

// public float MIN_VOLUME() { return wrapperContained.MIN_VOLUME; }
// public void MIN_VOLUME(float value) { wrapperContained.MIN_VOLUME = value; }
// public static float MIN_VOLUME() { return net.minecraft.client.sound.SoundSystem.MIN_VOLUME; }
// public static void MIN_VOLUME(float value, ) { net.minecraft.client.sound.SoundSystem.MIN_VOLUME = value; }

// public float MAX_VOLUME() { return wrapperContained.MAX_VOLUME; }
// public void MAX_VOLUME(float value) { wrapperContained.MAX_VOLUME = value; }
// public static float MAX_VOLUME() { return net.minecraft.client.sound.SoundSystem.MAX_VOLUME; }
// public static void MAX_VOLUME(float value, ) { net.minecraft.client.sound.SoundSystem.MAX_VOLUME = value; }

// public java.lang.String OPENAL_SOFT_ON() { return wrapperContained.OPENAL_SOFT_ON; }
// public void OPENAL_SOFT_ON(java.lang.String value) { wrapperContained.OPENAL_SOFT_ON = value; }
public static java.lang.String OPENAL_SOFT_ON() { return net.minecraft.client.sound.SoundSystem.OPENAL_SOFT_ON; }
// public static void OPENAL_SOFT_ON(java.lang.String value, ) { net.minecraft.client.sound.SoundSystem.OPENAL_SOFT_ON = value; }

// public int OPENAL_SOFT_ON_LENGTH() { return wrapperContained.OPENAL_SOFT_ON_LENGTH; }
// public void OPENAL_SOFT_ON_LENGTH(int value) { wrapperContained.OPENAL_SOFT_ON_LENGTH = value; }
public static int OPENAL_SOFT_ON_LENGTH() { return net.minecraft.client.sound.SoundSystem.OPENAL_SOFT_ON_LENGTH; }
// public static void OPENAL_SOFT_ON_LENGTH(int value, ) { net.minecraft.client.sound.SoundSystem.OPENAL_SOFT_ON_LENGTH = value; }

// public long MIN_TIME_INTERVAL_TO_RELOAD_SOUNDS() { return wrapperContained.MIN_TIME_INTERVAL_TO_RELOAD_SOUNDS; }
// public void MIN_TIME_INTERVAL_TO_RELOAD_SOUNDS(long value) { wrapperContained.MIN_TIME_INTERVAL_TO_RELOAD_SOUNDS = value; }
// public static long MIN_TIME_INTERVAL_TO_RELOAD_SOUNDS() { return net.minecraft.client.sound.SoundSystem.MIN_TIME_INTERVAL_TO_RELOAD_SOUNDS; }
// public static void MIN_TIME_INTERVAL_TO_RELOAD_SOUNDS(long value, ) { net.minecraft.client.sound.SoundSystem.MIN_TIME_INTERVAL_TO_RELOAD_SOUNDS = value; }

// public long lastSoundDeviceCheckTime() { return wrapperContained.lastSoundDeviceCheckTime; }
// public void lastSoundDeviceCheckTime(long value) { wrapperContained.lastSoundDeviceCheckTime = value; }
// public static long lastSoundDeviceCheckTime() { return net.minecraft.client.sound.SoundSystem.lastSoundDeviceCheckTime; }
// public static void lastSoundDeviceCheckTime(long value, ) { net.minecraft.client.sound.SoundSystem.lastSoundDeviceCheckTime = value; }

// public java.util.concurrent.atomic.AtomicReference deviceChangeStatus() { return wrapperContained.deviceChangeStatus; }
// public void deviceChangeStatus(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.deviceChangeStatus = value; }
// public static java.util.concurrent.atomic.AtomicReference deviceChangeStatus() { return net.minecraft.client.sound.SoundSystem.deviceChangeStatus; }
// public static void deviceChangeStatus(java.util.concurrent.atomic.AtomicReference value, ) { net.minecraft.client.sound.SoundSystem.deviceChangeStatus = value; }

public boolean isPlaying(yarnwrap.client.sound.SoundInstance sound) { return wrapperContained.isPlaying(sound.wrapperContained); }
// public static boolean isPlaying(yarnwrap.client.sound.SoundInstance sound, ) { return net.minecraft.client.sound.SoundSystem.isPlaying(sound.wrapperContained); }
public void reloadSounds() { wrapperContained.reloadSounds(); }
// public static void reloadSounds() { net.minecraft.client.sound.SoundSystem.reloadSounds(); }
public void stopSounds(yarnwrap.util.Identifier id,yarnwrap.sound.SoundCategory category) { wrapperContained.stopSounds(id.wrapperContained,category.wrapperContained); }
// public static void stopSounds(yarnwrap.util.Identifier id,yarnwrap.sound.SoundCategory category, ) { net.minecraft.client.sound.SoundSystem.stopSounds(id.wrapperContained,category.wrapperContained); }
public void updateListenerPosition(yarnwrap.client.render.Camera camera) { wrapperContained.updateListenerPosition(camera.wrapperContained); }
// public static void updateListenerPosition(yarnwrap.client.render.Camera camera, ) { net.minecraft.client.sound.SoundSystem.updateListenerPosition(camera.wrapperContained); }
public void stopAll() { wrapperContained.stopAll(); }
// public static void stopAll() { net.minecraft.client.sound.SoundSystem.stopAll(); }
// public void updateSoundVolume(yarnwrap.sound.SoundCategory category) { wrapperContained.updateSoundVolume(category.wrapperContained); }
// public static void updateSoundVolume(yarnwrap.sound.SoundCategory category, ) { net.minecraft.client.sound.SoundSystem.updateSoundVolume(category.wrapperContained); }
// public void start() { wrapperContained.start(); }
// public static void start() { net.minecraft.client.sound.SoundSystem.start(); }
public void unregisterListener(yarnwrap.client.sound.SoundInstanceListener listener) { wrapperContained.unregisterListener(listener.wrapperContained); }
// public static void unregisterListener(yarnwrap.client.sound.SoundInstanceListener listener, ) { net.minecraft.client.sound.SoundSystem.unregisterListener(listener.wrapperContained); }
// public float getAdjustedPitch(yarnwrap.client.sound.SoundInstance sound) { return wrapperContained.getAdjustedPitch(sound.wrapperContained); }
// public static float getAdjustedPitch(yarnwrap.client.sound.SoundInstance sound, ) { return net.minecraft.client.sound.SoundSystem.getAdjustedPitch(sound.wrapperContained); }
public void addPreloadedSound(yarnwrap.client.sound.Sound sound) { wrapperContained.addPreloadedSound(sound.wrapperContained); }
// public static void addPreloadedSound(yarnwrap.client.sound.Sound sound, ) { net.minecraft.client.sound.SoundSystem.addPreloadedSound(sound.wrapperContained); }
public void play(yarnwrap.client.sound.SoundInstance sound,int delay) { wrapperContained.play(sound.wrapperContained,delay); }
// public static void play(yarnwrap.client.sound.SoundInstance sound,int delay, ) { net.minecraft.client.sound.SoundSystem.play(sound.wrapperContained,delay); }
// public float getAdjustedVolume(yarnwrap.client.sound.SoundInstance sound) { return wrapperContained.getAdjustedVolume(sound.wrapperContained); }
// public static float getAdjustedVolume(yarnwrap.client.sound.SoundInstance sound, ) { return net.minecraft.client.sound.SoundSystem.getAdjustedVolume(sound.wrapperContained); }
// public Object play(yarnwrap.client.sound.SoundInstance sound) { return wrapperContained.play(sound.wrapperContained); }
// // public static Object play(yarnwrap.client.sound.SoundInstance sound, ) { return net.minecraft.client.sound.SoundSystem.play(sound.wrapperContained); }
public void registerListener(yarnwrap.client.sound.SoundInstanceListener listener) { wrapperContained.registerListener(listener.wrapperContained); }
// public static void registerListener(yarnwrap.client.sound.SoundInstanceListener listener, ) { net.minecraft.client.sound.SoundSystem.registerListener(listener.wrapperContained); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.client.sound.SoundSystem.stop(); }
// public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.sound.SoundSystem.tick(); }
// public void method_19748(float source) { wrapperContained.method_19748(source); }
// public static void method_19748(float source, ) { net.minecraft.client.sound.SoundSystem.method_19748(source); }
// public void method_19749(float source) { wrapperContained.method_19749(source); }
// public static void method_19749(float source, ) { net.minecraft.client.sound.SoundSystem.method_19749(source); }
// public void method_19750(float source) { wrapperContained.method_19750(source); }
// public static void method_19750(float source, ) { net.minecraft.client.sound.SoundSystem.method_19750(source); }
// public void method_19752(yarnwrap.client.sound.StaticSound source) { wrapperContained.method_19752(source.wrapperContained); }
// public static void method_19752(yarnwrap.client.sound.StaticSound source, ) { net.minecraft.client.sound.SoundSystem.method_19752(source.wrapperContained); }
public void stop(yarnwrap.client.sound.SoundInstance sound) { wrapperContained.stop(sound.wrapperContained); }
// public static void stop(yarnwrap.client.sound.SoundInstance sound, ) { net.minecraft.client.sound.SoundSystem.stop(sound.wrapperContained); }
// public void method_19754(yarnwrap.client.sound.SoundInstance source,Object sourceManager) { wrapperContained.method_19754(source.wrapperContained,sourceManager); }
// public static void method_19754(yarnwrap.client.sound.SoundInstance source,Object sourceManager, ) { net.minecraft.client.sound.SoundSystem.method_19754(source.wrapperContained,sourceManager); }
// public void method_19755(yarnwrap.client.sound.AudioStream source) { wrapperContained.method_19755(source.wrapperContained); }
// public static void method_19755(yarnwrap.client.sound.AudioStream source, ) { net.minecraft.client.sound.SoundSystem.method_19755(source.wrapperContained); }
// public void method_19756(Object source) { wrapperContained.method_19756(source); }
// public static void method_19756(Object source, ) { net.minecraft.client.sound.SoundSystem.method_19756(source); }
// public void method_19757(Object sound) { wrapperContained.method_19757(sound); }
// public static void method_19757(Object sound, ) { net.minecraft.client.sound.SoundSystem.method_19757(sound); }
// public void method_19758(Object stream) { wrapperContained.method_19758(stream); }
// public static void method_19758(Object stream, ) { net.minecraft.client.sound.SoundSystem.method_19758(stream); }
// public void method_19759(java.util.stream.Stream sources) { wrapperContained.method_19759(sources); }
// public static void method_19759(java.util.stream.Stream sources, ) { net.minecraft.client.sound.SoundSystem.method_19759(sources); }
public void resumeAll() { wrapperContained.resumeAll(); }
// public static void resumeAll() { net.minecraft.client.sound.SoundSystem.resumeAll(); }
public void tick(boolean paused) { wrapperContained.tick(paused); }
// public static void tick(boolean paused, ) { net.minecraft.client.sound.SoundSystem.tick(paused); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
// public static java.lang.String getDebugString() { return net.minecraft.client.sound.SoundSystem.getDebugString(); }
public void playNextTick(yarnwrap.client.sound.TickableSoundInstance sound) { wrapperContained.playNextTick(sound.wrapperContained); }
// public static void playNextTick(yarnwrap.client.sound.TickableSoundInstance sound, ) { net.minecraft.client.sound.SoundSystem.playNextTick(sound.wrapperContained); }
// public boolean hasRepeatDelay(yarnwrap.client.sound.SoundInstance sound) { return wrapperContained.hasRepeatDelay(sound.wrapperContained); }
// public static boolean hasRepeatDelay(yarnwrap.client.sound.SoundInstance sound, ) { return net.minecraft.client.sound.SoundSystem.hasRepeatDelay(sound.wrapperContained); }
// public boolean shouldDelayRepeat(yarnwrap.client.sound.SoundInstance sound) { return wrapperContained.shouldDelayRepeat(sound.wrapperContained); }
// public static boolean shouldDelayRepeat(yarnwrap.client.sound.SoundInstance sound, ) { return net.minecraft.client.sound.SoundSystem.shouldDelayRepeat(sound.wrapperContained); }
// public boolean shouldRepeatInstantly(yarnwrap.client.sound.SoundInstance sound) { return wrapperContained.shouldRepeatInstantly(sound.wrapperContained); }
// public static boolean shouldRepeatInstantly(yarnwrap.client.sound.SoundInstance sound, ) { return net.minecraft.client.sound.SoundSystem.shouldRepeatInstantly(sound.wrapperContained); }
public java.util.List getSoundDevices() { return wrapperContained.getSoundDevices(); }
// public static java.util.List getSoundDevices() { return net.minecraft.client.sound.SoundSystem.getSoundDevices(); }
// public boolean shouldReloadSounds() { return wrapperContained.shouldReloadSounds(); }
// public static boolean shouldReloadSounds() { return net.minecraft.client.sound.SoundSystem.shouldReloadSounds(); }
// public float getAdjustedVolume(float volume,yarnwrap.sound.SoundCategory category) { return wrapperContained.getAdjustedVolume(volume,category.wrapperContained); }
// public static float getAdjustedVolume(float volume,yarnwrap.sound.SoundCategory category, ) { return net.minecraft.client.sound.SoundSystem.getAdjustedVolume(volume,category.wrapperContained); }
public void stopAbruptly() { wrapperContained.stopAbruptly(); }
// public static void stopAbruptly() { net.minecraft.client.sound.SoundSystem.stopAbruptly(); }
public yarnwrap.client.sound.SoundListenerTransform getListenerTransform() { return new yarnwrap.client.sound.SoundListenerTransform(wrapperContained.getListenerTransform()); }
// public static yarnwrap.client.sound.SoundListenerTransform getListenerTransform() { return new yarnwrap.client.sound.SoundListenerTransform(net.minecraft.client.sound.SoundSystem.getListenerTransform()); }
// public void method_65256(float source) { wrapperContained.method_65256(source); }
// public static void method_65256(float source, ) { net.minecraft.client.sound.SoundSystem.method_65256(source); }
public void setVolume(yarnwrap.client.sound.SoundInstance sound,float volume) { wrapperContained.setVolume(sound.wrapperContained,volume); }
// public static void setVolume(yarnwrap.client.sound.SoundInstance sound,float volume, ) { net.minecraft.client.sound.SoundSystem.setVolume(sound.wrapperContained,volume); }
// public void pauseAllExcept(net.minecraft.sound.SoundCategory[] categories) { wrapperContained.pauseAllExcept(categories); }
// public static void pauseAllExcept(net.minecraft.sound.SoundCategory[] categories, ) { net.minecraft.client.sound.SoundSystem.pauseAllExcept(categories); }
// public void tickPaused() { wrapperContained.tickPaused(); }
// public static void tickPaused() { net.minecraft.client.sound.SoundSystem.tickPaused(); }

}