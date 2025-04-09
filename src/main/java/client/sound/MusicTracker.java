package yarnwrap.client.sound;
public class MusicTracker { public net.minecraft.client.sound.MusicTracker wrapperContained; public MusicTracker(net.minecraft.client.sound.MusicTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_TIME_UNTIL_NEXT_SONG() { return wrapperContained.DEFAULT_TIME_UNTIL_NEXT_SONG; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public int timeUntilNextSong() { return wrapperContained.timeUntilNextSong; }
// public yarnwrap.client.sound.SoundInstance current() { return new yarnwrap.client.sound.SoundInstance(wrapperContained.current); }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
public void tick() { wrapperContained.tick(); }
public void play(yarnwrap.sound.MusicSound type) { wrapperContained.play(type.wrapperContained); }
public void stop() { wrapperContained.stop(); }
public boolean isPlayingType(yarnwrap.sound.MusicSound type) { return wrapperContained.isPlayingType(type.wrapperContained); }
public void stop(yarnwrap.sound.MusicSound type) { wrapperContained.stop(type.wrapperContained); }

}