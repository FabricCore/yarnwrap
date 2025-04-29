package yarnwrap.sound;
public class MusicType { public net.minecraft.sound.MusicType wrapperContained; public MusicType(net.minecraft.sound.MusicType wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MENU_MIN_DELAY() { return wrapperContained.MENU_MIN_DELAY; }
// public void MENU_MIN_DELAY(int value) { wrapperContained.MENU_MIN_DELAY = value; }
// public static int MENU_MIN_DELAY() { return net.minecraft.sound.MusicType.MENU_MIN_DELAY; }
// public static void MENU_MIN_DELAY(int value, ) { net.minecraft.sound.MusicType.MENU_MIN_DELAY = value; }

// public int MENU_MAX_DELAY() { return wrapperContained.MENU_MAX_DELAY; }
// public void MENU_MAX_DELAY(int value) { wrapperContained.MENU_MAX_DELAY = value; }
// public static int MENU_MAX_DELAY() { return net.minecraft.sound.MusicType.MENU_MAX_DELAY; }
// public static void MENU_MAX_DELAY(int value, ) { net.minecraft.sound.MusicType.MENU_MAX_DELAY = value; }

// public int GAME_MIN_DELAY() { return wrapperContained.GAME_MIN_DELAY; }
// public void GAME_MIN_DELAY(int value) { wrapperContained.GAME_MIN_DELAY = value; }
// public static int GAME_MIN_DELAY() { return net.minecraft.sound.MusicType.GAME_MIN_DELAY; }
// public static void GAME_MIN_DELAY(int value, ) { net.minecraft.sound.MusicType.GAME_MIN_DELAY = value; }

// public int GAME_MAX_DELAY() { return wrapperContained.GAME_MAX_DELAY; }
// public void GAME_MAX_DELAY(int value) { wrapperContained.GAME_MAX_DELAY = value; }
// public static int GAME_MAX_DELAY() { return net.minecraft.sound.MusicType.GAME_MAX_DELAY; }
// public static void GAME_MAX_DELAY(int value, ) { net.minecraft.sound.MusicType.GAME_MAX_DELAY = value; }

// public int END_MIN_DELAY() { return wrapperContained.END_MIN_DELAY; }
// public void END_MIN_DELAY(int value) { wrapperContained.END_MIN_DELAY = value; }
// public static int END_MIN_DELAY() { return net.minecraft.sound.MusicType.END_MIN_DELAY; }
// public static void END_MIN_DELAY(int value, ) { net.minecraft.sound.MusicType.END_MIN_DELAY = value; }

// public yarnwrap.sound.MusicSound UNDERWATER() { return new yarnwrap.sound.MusicSound(wrapperContained.UNDERWATER); }
// public void UNDERWATER(yarnwrap.sound.MusicSound value) { wrapperContained.UNDERWATER = value.wrapperContained; }
public static yarnwrap.sound.MusicSound UNDERWATER() { return new yarnwrap.sound.MusicSound(net.minecraft.sound.MusicType.UNDERWATER); }
// public static void UNDERWATER(yarnwrap.sound.MusicSound value, ) { net.minecraft.sound.MusicType.UNDERWATER = value.wrapperContained; }

// public yarnwrap.sound.MusicSound CREDITS() { return new yarnwrap.sound.MusicSound(wrapperContained.CREDITS); }
// public void CREDITS(yarnwrap.sound.MusicSound value) { wrapperContained.CREDITS = value.wrapperContained; }
public static yarnwrap.sound.MusicSound CREDITS() { return new yarnwrap.sound.MusicSound(net.minecraft.sound.MusicType.CREDITS); }
// public static void CREDITS(yarnwrap.sound.MusicSound value, ) { net.minecraft.sound.MusicType.CREDITS = value.wrapperContained; }

// public yarnwrap.sound.MusicSound DRAGON() { return new yarnwrap.sound.MusicSound(wrapperContained.DRAGON); }
// public void DRAGON(yarnwrap.sound.MusicSound value) { wrapperContained.DRAGON = value.wrapperContained; }
public static yarnwrap.sound.MusicSound DRAGON() { return new yarnwrap.sound.MusicSound(net.minecraft.sound.MusicType.DRAGON); }
// public static void DRAGON(yarnwrap.sound.MusicSound value, ) { net.minecraft.sound.MusicType.DRAGON = value.wrapperContained; }

// public yarnwrap.sound.MusicSound CREATIVE() { return new yarnwrap.sound.MusicSound(wrapperContained.CREATIVE); }
// public void CREATIVE(yarnwrap.sound.MusicSound value) { wrapperContained.CREATIVE = value.wrapperContained; }
public static yarnwrap.sound.MusicSound CREATIVE() { return new yarnwrap.sound.MusicSound(net.minecraft.sound.MusicType.CREATIVE); }
// public static void CREATIVE(yarnwrap.sound.MusicSound value, ) { net.minecraft.sound.MusicType.CREATIVE = value.wrapperContained; }

// public yarnwrap.sound.MusicSound END() { return new yarnwrap.sound.MusicSound(wrapperContained.END); }
// public void END(yarnwrap.sound.MusicSound value) { wrapperContained.END = value.wrapperContained; }
public static yarnwrap.sound.MusicSound END() { return new yarnwrap.sound.MusicSound(net.minecraft.sound.MusicType.END); }
// public static void END(yarnwrap.sound.MusicSound value, ) { net.minecraft.sound.MusicType.END = value.wrapperContained; }

// public yarnwrap.sound.MusicSound MENU() { return new yarnwrap.sound.MusicSound(wrapperContained.MENU); }
// public void MENU(yarnwrap.sound.MusicSound value) { wrapperContained.MENU = value.wrapperContained; }
public static yarnwrap.sound.MusicSound MENU() { return new yarnwrap.sound.MusicSound(net.minecraft.sound.MusicType.MENU); }
// public static void MENU(yarnwrap.sound.MusicSound value, ) { net.minecraft.sound.MusicType.MENU = value.wrapperContained; }

// public yarnwrap.sound.MusicSound GAME() { return new yarnwrap.sound.MusicSound(wrapperContained.GAME); }
// public void GAME(yarnwrap.sound.MusicSound value) { wrapperContained.GAME = value.wrapperContained; }
public static yarnwrap.sound.MusicSound GAME() { return new yarnwrap.sound.MusicSound(net.minecraft.sound.MusicType.GAME); }
// public static void GAME(yarnwrap.sound.MusicSound value, ) { net.minecraft.sound.MusicType.GAME = value.wrapperContained; }

// public yarnwrap.sound.MusicSound createIngameMusic(yarnwrap.registry.entry.RegistryEntry sound) { return new yarnwrap.sound.MusicSound(wrapperContained.createIngameMusic(sound.wrapperContained)); }
// public static yarnwrap.sound.MusicSound createIngameMusic(yarnwrap.registry.entry.RegistryEntry sound, ) { return new yarnwrap.sound.MusicSound(net.minecraft.sound.MusicType.createIngameMusic(sound.wrapperContained)); }

}