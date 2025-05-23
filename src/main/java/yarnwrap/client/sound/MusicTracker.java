package yarnwrap.client.sound;
public class MusicTracker { public net.minecraft.client.sound.MusicTracker wrapperContained; public MusicTracker(net.minecraft.client.sound.MusicTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.client.sound.MusicTracker.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.client.sound.MusicTracker.random = value.wrapperContained; }

// public int timeUntilNextSong() { return wrapperContained.timeUntilNextSong; }
// public void timeUntilNextSong(int value) { wrapperContained.timeUntilNextSong = value; }
// public static int timeUntilNextSong() { return net.minecraft.client.sound.MusicTracker.timeUntilNextSong; }
// public static void timeUntilNextSong(int value, ) { net.minecraft.client.sound.MusicTracker.timeUntilNextSong = value; }

// public yarnwrap.client.sound.SoundInstance current() { return new yarnwrap.client.sound.SoundInstance(wrapperContained.current); }
// public void current(yarnwrap.client.sound.SoundInstance value) { wrapperContained.current = value.wrapperContained; }
// public static yarnwrap.client.sound.SoundInstance current() { return new yarnwrap.client.sound.SoundInstance(net.minecraft.client.sound.MusicTracker.current); }
// public static void current(yarnwrap.client.sound.SoundInstance value, ) { net.minecraft.client.sound.MusicTracker.current = value.wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.sound.MusicTracker.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.sound.MusicTracker.client = value.wrapperContained; }

// public int DEFAULT_TIME_UNTIL_NEXT_SONG() { return wrapperContained.DEFAULT_TIME_UNTIL_NEXT_SONG; }
// public void DEFAULT_TIME_UNTIL_NEXT_SONG(int value) { wrapperContained.DEFAULT_TIME_UNTIL_NEXT_SONG = value; }
// public static int DEFAULT_TIME_UNTIL_NEXT_SONG() { return net.minecraft.client.sound.MusicTracker.DEFAULT_TIME_UNTIL_NEXT_SONG; }
// public static void DEFAULT_TIME_UNTIL_NEXT_SONG(int value, ) { net.minecraft.client.sound.MusicTracker.DEFAULT_TIME_UNTIL_NEXT_SONG = value; }

// public float volume() { return wrapperContained.volume; }
// public void volume(float value) { wrapperContained.volume = value; }
// public static float volume() { return net.minecraft.client.sound.MusicTracker.volume; }
// public static void volume(float value, ) { net.minecraft.client.sound.MusicTracker.volume = value; }

// public Object musicFrequency() { return wrapperContained.musicFrequency; }
// public void musicFrequency(Object value) { wrapperContained.musicFrequency = value; }
// // public static Object musicFrequency() { return net.minecraft.client.sound.MusicTracker.musicFrequency; }
// public static void musicFrequency(Object value, ) { net.minecraft.client.sound.MusicTracker.musicFrequency = value; }

// public void play() { wrapperContained.play(); }
// public static void play() { net.minecraft.client.sound.MusicTracker.play(); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.client.sound.MusicTracker.stop(); }
public boolean isPlayingType(yarnwrap.sound.MusicSound type) { return wrapperContained.isPlayingType(type.wrapperContained); }
// public static boolean isPlayingType(yarnwrap.sound.MusicSound type, ) { return net.minecraft.client.sound.MusicTracker.isPlayingType(type.wrapperContained); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.sound.MusicTracker.tick(); }
public void stop(yarnwrap.sound.MusicSound type) { wrapperContained.stop(type.wrapperContained); }
// public static void stop(yarnwrap.sound.MusicSound type, ) { net.minecraft.client.sound.MusicTracker.stop(type.wrapperContained); }
// public boolean canFadeTowardsVolume(float volume) { return wrapperContained.canFadeTowardsVolume(volume); }
// public static boolean canFadeTowardsVolume(float volume, ) { return net.minecraft.client.sound.MusicTracker.canFadeTowardsVolume(volume); }
// public void setMusicFrequency(Object musicFrequency) { wrapperContained.setMusicFrequency(musicFrequency); }
// public static void setMusicFrequency(Object musicFrequency, ) { net.minecraft.client.sound.MusicTracker.setMusicFrequency(musicFrequency); }
// public java.lang.String getCurrentMusicTranslationKey() { return wrapperContained.getCurrentMusicTranslationKey(); }
// public static java.lang.String getCurrentMusicTranslationKey() { return net.minecraft.client.sound.MusicTracker.getCurrentMusicTranslationKey(); }

}