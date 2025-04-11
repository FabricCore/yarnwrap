package yarnwrap.sound;
public class MusicType { public net.minecraft.sound.MusicType wrapperContained; public MusicType(net.minecraft.sound.MusicType wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MENU_MIN_DELAY() { return wrapperContained.MENU_MIN_DELAY; }
// public void MENU_MIN_DELAY(int value) { wrapperContained.MENU_MIN_DELAY = value; }
// public int MENU_MAX_DELAY() { return wrapperContained.MENU_MAX_DELAY; }
// public void MENU_MAX_DELAY(int value) { wrapperContained.MENU_MAX_DELAY = value; }
// public int GAME_MIN_DELAY() { return wrapperContained.GAME_MIN_DELAY; }
// public void GAME_MIN_DELAY(int value) { wrapperContained.GAME_MIN_DELAY = value; }
// public int GAME_MAX_DELAY() { return wrapperContained.GAME_MAX_DELAY; }
// public void GAME_MAX_DELAY(int value) { wrapperContained.GAME_MAX_DELAY = value; }
// public int END_MIN_DELAY() { return wrapperContained.END_MIN_DELAY; }
// public void END_MIN_DELAY(int value) { wrapperContained.END_MIN_DELAY = value; }
public yarnwrap.sound.MusicSound UNDERWATER() { return new yarnwrap.sound.MusicSound(wrapperContained.UNDERWATER); }
// public void UNDERWATER(yarnwrap.sound.MusicSound value) { wrapperContained.UNDERWATER = value.wrapperContained; }
public yarnwrap.sound.MusicSound CREDITS() { return new yarnwrap.sound.MusicSound(wrapperContained.CREDITS); }
// public void CREDITS(yarnwrap.sound.MusicSound value) { wrapperContained.CREDITS = value.wrapperContained; }
public yarnwrap.sound.MusicSound DRAGON() { return new yarnwrap.sound.MusicSound(wrapperContained.DRAGON); }
// public void DRAGON(yarnwrap.sound.MusicSound value) { wrapperContained.DRAGON = value.wrapperContained; }
public yarnwrap.sound.MusicSound CREATIVE() { return new yarnwrap.sound.MusicSound(wrapperContained.CREATIVE); }
// public void CREATIVE(yarnwrap.sound.MusicSound value) { wrapperContained.CREATIVE = value.wrapperContained; }
public yarnwrap.sound.MusicSound END() { return new yarnwrap.sound.MusicSound(wrapperContained.END); }
// public void END(yarnwrap.sound.MusicSound value) { wrapperContained.END = value.wrapperContained; }
public yarnwrap.sound.MusicSound MENU() { return new yarnwrap.sound.MusicSound(wrapperContained.MENU); }
// public void MENU(yarnwrap.sound.MusicSound value) { wrapperContained.MENU = value.wrapperContained; }
public yarnwrap.sound.MusicSound GAME() { return new yarnwrap.sound.MusicSound(wrapperContained.GAME); }
// public void GAME(yarnwrap.sound.MusicSound value) { wrapperContained.GAME = value.wrapperContained; }
public yarnwrap.sound.MusicSound createIngameMusic(yarnwrap.registry.entry.RegistryEntry sound) { return new yarnwrap.sound.MusicSound(wrapperContained.createIngameMusic(sound.wrapperContained)); }

}