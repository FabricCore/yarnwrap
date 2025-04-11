package yarnwrap.client.sound;
public class MusicTracker { public net.minecraft.client.sound.MusicTracker wrapperContained; public MusicTracker(net.minecraft.client.sound.MusicTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_TIME_UNTIL_NEXT_SONG() { return wrapperContained.DEFAULT_TIME_UNTIL_NEXT_SONG; }
// public void DEFAULT_TIME_UNTIL_NEXT_SONG(int value) { wrapperContained.DEFAULT_TIME_UNTIL_NEXT_SONG = value; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public int timeUntilNextSong() { return wrapperContained.timeUntilNextSong; }
// public void timeUntilNextSong(int value) { wrapperContained.timeUntilNextSong = value; }
// public yarnwrap.client.sound.SoundInstance current() { return new yarnwrap.client.sound.SoundInstance(wrapperContained.current); }
// public void current(yarnwrap.client.sound.SoundInstance value) { wrapperContained.current = value.wrapperContained; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
public MusicTracker(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.sound.MusicTracker(client.wrapperContained); }
public void tick() { wrapperContained.tick(); }
public void play(yarnwrap.sound.MusicSound type) { wrapperContained.play(type.wrapperContained); }
public void stop() { wrapperContained.stop(); }
public boolean isPlayingType(yarnwrap.sound.MusicSound type) { return wrapperContained.isPlayingType(type.wrapperContained); }
public void stop(yarnwrap.sound.MusicSound type) { wrapperContained.stop(type.wrapperContained); }

}