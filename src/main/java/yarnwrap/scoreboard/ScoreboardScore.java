package yarnwrap.scoreboard;
public class ScoreboardScore { public net.minecraft.scoreboard.ScoreboardScore wrapperContained; public ScoreboardScore(net.minecraft.scoreboard.ScoreboardScore wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean locked() { return wrapperContained.locked; }
// public void locked(boolean value) { wrapperContained.locked = value; }
// public static boolean locked() { return net.minecraft.scoreboard.ScoreboardScore.locked; }
// public static void locked(boolean value, ) { net.minecraft.scoreboard.ScoreboardScore.locked = value; }

// public java.lang.String SCORE_NBT_KEY() { return wrapperContained.SCORE_NBT_KEY; }
// public void SCORE_NBT_KEY(java.lang.String value) { wrapperContained.SCORE_NBT_KEY = value; }
// public static java.lang.String SCORE_NBT_KEY() { return net.minecraft.scoreboard.ScoreboardScore.SCORE_NBT_KEY; }
// public static void SCORE_NBT_KEY(java.lang.String value, ) { net.minecraft.scoreboard.ScoreboardScore.SCORE_NBT_KEY = value; }

// public java.lang.String LOCKED_NBT_KEY() { return wrapperContained.LOCKED_NBT_KEY; }
// public void LOCKED_NBT_KEY(java.lang.String value) { wrapperContained.LOCKED_NBT_KEY = value; }
// public static java.lang.String LOCKED_NBT_KEY() { return net.minecraft.scoreboard.ScoreboardScore.LOCKED_NBT_KEY; }
// public static void LOCKED_NBT_KEY(java.lang.String value, ) { net.minecraft.scoreboard.ScoreboardScore.LOCKED_NBT_KEY = value; }

// public java.lang.String DISPLAY_NBT_KEY() { return wrapperContained.DISPLAY_NBT_KEY; }
// public void DISPLAY_NBT_KEY(java.lang.String value) { wrapperContained.DISPLAY_NBT_KEY = value; }
// public static java.lang.String DISPLAY_NBT_KEY() { return net.minecraft.scoreboard.ScoreboardScore.DISPLAY_NBT_KEY; }
// public static void DISPLAY_NBT_KEY(java.lang.String value, ) { net.minecraft.scoreboard.ScoreboardScore.DISPLAY_NBT_KEY = value; }

// public java.lang.String FORMAT_NBT_KEY() { return wrapperContained.FORMAT_NBT_KEY; }
// public void FORMAT_NBT_KEY(java.lang.String value) { wrapperContained.FORMAT_NBT_KEY = value; }
// public static java.lang.String FORMAT_NBT_KEY() { return net.minecraft.scoreboard.ScoreboardScore.FORMAT_NBT_KEY; }
// public static void FORMAT_NBT_KEY(java.lang.String value, ) { net.minecraft.scoreboard.ScoreboardScore.FORMAT_NBT_KEY = value; }

// public int score() { return wrapperContained.score; }
// public void score(int value) { wrapperContained.score = value; }
// public static int score() { return net.minecraft.scoreboard.ScoreboardScore.score; }
// public static void score(int value, ) { net.minecraft.scoreboard.ScoreboardScore.score = value; }

// public yarnwrap.text.Text displayText() { return new yarnwrap.text.Text(wrapperContained.displayText); }
// public void displayText(yarnwrap.text.Text value) { wrapperContained.displayText = value.wrapperContained; }
// public static yarnwrap.text.Text displayText() { return new yarnwrap.text.Text(net.minecraft.scoreboard.ScoreboardScore.displayText); }
// public static void displayText(yarnwrap.text.Text value, ) { net.minecraft.scoreboard.ScoreboardScore.displayText = value.wrapperContained; }

// public yarnwrap.scoreboard.number.NumberFormat numberFormat() { return new yarnwrap.scoreboard.number.NumberFormat(wrapperContained.numberFormat); }
// public void numberFormat(yarnwrap.scoreboard.number.NumberFormat value) { wrapperContained.numberFormat = value.wrapperContained; }
// public static yarnwrap.scoreboard.number.NumberFormat numberFormat() { return new yarnwrap.scoreboard.number.NumberFormat(net.minecraft.scoreboard.ScoreboardScore.numberFormat); }
// public static void numberFormat(yarnwrap.scoreboard.number.NumberFormat value, ) { net.minecraft.scoreboard.ScoreboardScore.numberFormat = value.wrapperContained; }

public void setLocked(boolean locked) { wrapperContained.setLocked(locked); }
// public static void setLocked(boolean locked, ) { net.minecraft.scoreboard.ScoreboardScore.setLocked(locked); }
public void setScore(int score) { wrapperContained.setScore(score); }
// public static void setScore(int score, ) { net.minecraft.scoreboard.ScoreboardScore.setScore(score); }
// public void method_55402(yarnwrap.scoreboard.ScoreboardScore format) { wrapperContained.method_55402(format.wrapperContained); }
// public static void method_55402(yarnwrap.scoreboard.ScoreboardScore format, ) { net.minecraft.scoreboard.ScoreboardScore.method_55402(format.wrapperContained); }
// public yarnwrap.scoreboard.ScoreboardScore fromNbt(yarnwrap.nbt.NbtCompound nbt,Object registries) { return new yarnwrap.scoreboard.ScoreboardScore(wrapperContained.fromNbt(nbt.wrapperContained,registries)); }
// public static yarnwrap.scoreboard.ScoreboardScore fromNbt(yarnwrap.nbt.NbtCompound nbt,Object registries, ) { return new yarnwrap.scoreboard.ScoreboardScore(net.minecraft.scoreboard.ScoreboardScore.fromNbt(nbt.wrapperContained,registries)); }
// public void method_55404(yarnwrap.nbt.NbtCompound formatElement) { wrapperContained.method_55404(formatElement.wrapperContained); }
// public static void method_55404(yarnwrap.nbt.NbtCompound formatElement, ) { net.minecraft.scoreboard.ScoreboardScore.method_55404(formatElement.wrapperContained); }
public void setDisplayText(yarnwrap.text.Text text) { wrapperContained.setDisplayText(text.wrapperContained); }
// public static void setDisplayText(yarnwrap.text.Text text, ) { net.minecraft.scoreboard.ScoreboardScore.setDisplayText(text.wrapperContained); }
public void setNumberFormat(yarnwrap.scoreboard.number.NumberFormat numberFormat) { wrapperContained.setNumberFormat(numberFormat.wrapperContained); }
// public static void setNumberFormat(yarnwrap.scoreboard.number.NumberFormat numberFormat, ) { net.minecraft.scoreboard.ScoreboardScore.setNumberFormat(numberFormat.wrapperContained); }
public yarnwrap.text.Text getDisplayText() { return new yarnwrap.text.Text(wrapperContained.getDisplayText()); }
// public static yarnwrap.text.Text getDisplayText() { return new yarnwrap.text.Text(net.minecraft.scoreboard.ScoreboardScore.getDisplayText()); }
// public yarnwrap.nbt.NbtCompound toNbt(Object registries) { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt(registries)); }
// public static yarnwrap.nbt.NbtCompound toNbt(Object registries, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.scoreboard.ScoreboardScore.toNbt(registries)); }

}