package yarnwrap.sound;
public class MusicType { public net.minecraft.sound.MusicType wrapperContained; public MusicType(net.minecraft.sound.MusicType wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MENU_MIN_DELAY() { return wrapperContained.MENU_MIN_DELAY; }
// public int MENU_MAX_DELAY() { return wrapperContained.MENU_MAX_DELAY; }
// public int GAME_MIN_DELAY() { return wrapperContained.GAME_MIN_DELAY; }
// public int GAME_MAX_DELAY() { return wrapperContained.GAME_MAX_DELAY; }
// public int END_MIN_DELAY() { return wrapperContained.END_MIN_DELAY; }
public yarnwrap.sound.MusicSound UNDERWATER() { return new yarnwrap.sound.MusicSound(wrapperContained.UNDERWATER); }
public yarnwrap.sound.MusicSound CREDITS() { return new yarnwrap.sound.MusicSound(wrapperContained.CREDITS); }
public yarnwrap.sound.MusicSound DRAGON() { return new yarnwrap.sound.MusicSound(wrapperContained.DRAGON); }
public yarnwrap.sound.MusicSound CREATIVE() { return new yarnwrap.sound.MusicSound(wrapperContained.CREATIVE); }
public yarnwrap.sound.MusicSound END() { return new yarnwrap.sound.MusicSound(wrapperContained.END); }
public yarnwrap.sound.MusicSound MENU() { return new yarnwrap.sound.MusicSound(wrapperContained.MENU); }
public yarnwrap.sound.MusicSound GAME() { return new yarnwrap.sound.MusicSound(wrapperContained.GAME); }
public yarnwrap.sound.MusicSound createIngameMusic(yarnwrap.registry.entry.RegistryEntry sound) { return new yarnwrap.sound.MusicSound(wrapperContained.createIngameMusic(sound.wrapperContained)); }

}