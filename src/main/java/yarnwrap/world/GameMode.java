package yarnwrap.world;
public class GameMode { public net.minecraft.world.GameMode wrapperContained; public GameMode(net.minecraft.world.GameMode wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.GameMode DEFAULT() { return new yarnwrap.world.GameMode(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.world.GameMode value) { wrapperContained.DEFAULT = value.wrapperContained; }
// public yarnwrap.text.Text simpleTranslatableName() { return new yarnwrap.text.Text(wrapperContained.simpleTranslatableName); }
// public void simpleTranslatableName(yarnwrap.text.Text value) { wrapperContained.simpleTranslatableName = value.wrapperContained; }
// public yarnwrap.text.Text translatableName() { return new yarnwrap.text.Text(wrapperContained.translatableName); }
// public void translatableName(yarnwrap.text.Text value) { wrapperContained.translatableName = value.wrapperContained; }
// public int UNKNOWN() { return wrapperContained.UNKNOWN; }
// public void UNKNOWN(int value) { wrapperContained.UNKNOWN = value; }
public Object CODEC() { return wrapperContained.CODEC; }
// // public void CODEC(Object value) { wrapperContained.CODEC = value; }
// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public void BY_ID(java.util.function.IntFunction value) { wrapperContained.BY_ID = value; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// // public GameMode(java.lang.String id,int name) { this.wrapperContained = new net.minecraft.world.GameMode(id,name); }
public int getId(yarnwrap.world.GameMode gameMode) { return wrapperContained.getId(gameMode.wrapperContained); }
public yarnwrap.world.GameMode getOrNull(int id) { return new yarnwrap.world.GameMode(wrapperContained.getOrNull(id)); }
public yarnwrap.text.Text getSimpleTranslatableName() { return new yarnwrap.text.Text(wrapperContained.getSimpleTranslatableName()); }
public yarnwrap.world.GameMode byName(java.lang.String name,yarnwrap.world.GameMode defaultMode) { return new yarnwrap.world.GameMode(wrapperContained.byName(name,defaultMode.wrapperContained)); }
public int getId() { return wrapperContained.getId(); }
public java.lang.String getName() { return wrapperContained.getName(); }
public void setAbilities(yarnwrap.entity.player.PlayerAbilities abilities) { wrapperContained.setAbilities(abilities.wrapperContained); }
public yarnwrap.text.Text getTranslatableName() { return new yarnwrap.text.Text(wrapperContained.getTranslatableName()); }
public yarnwrap.world.GameMode byId(int id) { return new yarnwrap.world.GameMode(wrapperContained.byId(id)); }
public yarnwrap.world.GameMode byName(java.lang.String name) { return new yarnwrap.world.GameMode(wrapperContained.byName(name)); }
public boolean isCreative() { return wrapperContained.isCreative(); }
public boolean isBlockBreakingRestricted() { return wrapperContained.isBlockBreakingRestricted(); }
public boolean isSurvivalLike() { return wrapperContained.isSurvivalLike(); }

}