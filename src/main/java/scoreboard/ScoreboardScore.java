package yarnwrap.scoreboard;
public class ScoreboardScore { public net.minecraft.scoreboard.ScoreboardScore wrapperContained; public ScoreboardScore(net.minecraft.scoreboard.ScoreboardScore wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean locked() { return wrapperContained.locked; }
// public java.lang.String SCORE_NBT_KEY() { return wrapperContained.SCORE_NBT_KEY; }
// public java.lang.String LOCKED_NBT_KEY() { return wrapperContained.LOCKED_NBT_KEY; }
// public java.lang.String DISPLAY_NBT_KEY() { return wrapperContained.DISPLAY_NBT_KEY; }
// public java.lang.String FORMAT_NBT_KEY() { return wrapperContained.FORMAT_NBT_KEY; }
// public int score() { return wrapperContained.score; }
// public yarnwrap.text.Text displayText() { return new yarnwrap.text.Text(wrapperContained.displayText); }
// public yarnwrap.scoreboard.number.NumberFormat numberFormat() { return new yarnwrap.scoreboard.number.NumberFormat(wrapperContained.numberFormat); }
public void setLocked(boolean locked) { wrapperContained.setLocked(locked); }
public void setScore(int score) { wrapperContained.setScore(score); }
// public yarnwrap.scoreboard.ScoreboardScore fromNbt(yarnwrap.nbt.NbtCompound nbt,Object registries) { return new yarnwrap.scoreboard.ScoreboardScore(wrapperContained.fromNbt(nbt.wrapperContained,registries)); }
public void setDisplayText(yarnwrap.text.Text text) { wrapperContained.setDisplayText(text.wrapperContained); }
public void setNumberFormat(yarnwrap.scoreboard.number.NumberFormat numberFormat) { wrapperContained.setNumberFormat(numberFormat.wrapperContained); }
public yarnwrap.text.Text getDisplayText() { return new yarnwrap.text.Text(wrapperContained.getDisplayText()); }
// public yarnwrap.nbt.NbtCompound toNbt(Object registries) { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt(registries)); }

}