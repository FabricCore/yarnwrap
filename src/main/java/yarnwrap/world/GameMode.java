package yarnwrap.world;
public class GameMode { public net.minecraft.world.GameMode wrapperContained; public GameMode(net.minecraft.world.GameMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.GameMode DEFAULT() { return new yarnwrap.world.GameMode(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.world.GameMode value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.world.GameMode DEFAULT() { return new yarnwrap.world.GameMode(net.minecraft.world.GameMode.DEFAULT); }
// public static void DEFAULT(yarnwrap.world.GameMode value, ) { net.minecraft.world.GameMode.DEFAULT = value.wrapperContained; }

// public yarnwrap.text.Text simpleTranslatableName() { return new yarnwrap.text.Text(wrapperContained.simpleTranslatableName); }
// public void simpleTranslatableName(yarnwrap.text.Text value) { wrapperContained.simpleTranslatableName = value.wrapperContained; }
// public static yarnwrap.text.Text simpleTranslatableName() { return new yarnwrap.text.Text(net.minecraft.world.GameMode.simpleTranslatableName); }
// public static void simpleTranslatableName(yarnwrap.text.Text value, ) { net.minecraft.world.GameMode.simpleTranslatableName = value.wrapperContained; }

// public yarnwrap.text.Text translatableName() { return new yarnwrap.text.Text(wrapperContained.translatableName); }
// public void translatableName(yarnwrap.text.Text value) { wrapperContained.translatableName = value.wrapperContained; }
// public static yarnwrap.text.Text translatableName() { return new yarnwrap.text.Text(net.minecraft.world.GameMode.translatableName); }
// public static void translatableName(yarnwrap.text.Text value, ) { net.minecraft.world.GameMode.translatableName = value.wrapperContained; }

// public int UNKNOWN() { return wrapperContained.UNKNOWN; }
// public void UNKNOWN(int value) { wrapperContained.UNKNOWN = value; }
// public static int UNKNOWN() { return net.minecraft.world.GameMode.UNKNOWN; }
// public static void UNKNOWN(int value, ) { net.minecraft.world.GameMode.UNKNOWN = value; }

// public Object CODEC() { return wrapperContained.CODEC; }
// // public void CODEC(Object value) { wrapperContained.CODEC = value; }
// public static Object CODEC() { return net.minecraft.world.GameMode.CODEC; }
// // public static void CODEC(Object value, ) { net.minecraft.world.GameMode.CODEC = value; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public void BY_ID(java.util.function.IntFunction value) { wrapperContained.BY_ID = value; }
// public static java.util.function.IntFunction BY_ID() { return net.minecraft.world.GameMode.BY_ID; }
// public static void BY_ID(java.util.function.IntFunction value, ) { net.minecraft.world.GameMode.BY_ID = value; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.world.GameMode.id; }
// public static void id(int value, ) { net.minecraft.world.GameMode.id = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.world.GameMode.name; }
// public static void name(java.lang.String value, ) { net.minecraft.world.GameMode.name = value; }

// // public GameMode(java.lang.String id,int name) { this.wrapperContained = new net.minecraft.world.GameMode(id,name); }
// public int getId(yarnwrap.world.GameMode gameMode) { return wrapperContained.getId(gameMode.wrapperContained); }
// public static int getId(yarnwrap.world.GameMode gameMode, ) { return net.minecraft.world.GameMode.getId(gameMode.wrapperContained); }
// public yarnwrap.world.GameMode getOrNull(int id) { return new yarnwrap.world.GameMode(wrapperContained.getOrNull(id)); }
// public static yarnwrap.world.GameMode getOrNull(int id, ) { return new yarnwrap.world.GameMode(net.minecraft.world.GameMode.getOrNull(id)); }
public yarnwrap.text.Text getSimpleTranslatableName() { return new yarnwrap.text.Text(wrapperContained.getSimpleTranslatableName()); }
// public static yarnwrap.text.Text getSimpleTranslatableName() { return new yarnwrap.text.Text(net.minecraft.world.GameMode.getSimpleTranslatableName()); }
// public yarnwrap.world.GameMode byName(java.lang.String name,yarnwrap.world.GameMode defaultMode) { return new yarnwrap.world.GameMode(wrapperContained.byName(name,defaultMode.wrapperContained)); }
// public static yarnwrap.world.GameMode byName(java.lang.String name,yarnwrap.world.GameMode defaultMode, ) { return new yarnwrap.world.GameMode(net.minecraft.world.GameMode.byName(name,defaultMode.wrapperContained)); }
public int getId() { return wrapperContained.getId(); }
// public static int getId() { return net.minecraft.world.GameMode.getId(); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.world.GameMode.getName(); }
public void setAbilities(yarnwrap.entity.player.PlayerAbilities abilities) { wrapperContained.setAbilities(abilities.wrapperContained); }
// public static void setAbilities(yarnwrap.entity.player.PlayerAbilities abilities, ) { net.minecraft.world.GameMode.setAbilities(abilities.wrapperContained); }
public yarnwrap.text.Text getTranslatableName() { return new yarnwrap.text.Text(wrapperContained.getTranslatableName()); }
// public static yarnwrap.text.Text getTranslatableName() { return new yarnwrap.text.Text(net.minecraft.world.GameMode.getTranslatableName()); }
// public yarnwrap.world.GameMode byId(int id) { return new yarnwrap.world.GameMode(wrapperContained.byId(id)); }
// public static yarnwrap.world.GameMode byId(int id, ) { return new yarnwrap.world.GameMode(net.minecraft.world.GameMode.byId(id)); }
// public yarnwrap.world.GameMode byName(java.lang.String name) { return new yarnwrap.world.GameMode(wrapperContained.byName(name)); }
// public static yarnwrap.world.GameMode byName(java.lang.String name, ) { return new yarnwrap.world.GameMode(net.minecraft.world.GameMode.byName(name)); }
public boolean isCreative() { return wrapperContained.isCreative(); }
// public static boolean isCreative() { return net.minecraft.world.GameMode.isCreative(); }
public boolean isBlockBreakingRestricted() { return wrapperContained.isBlockBreakingRestricted(); }
// public static boolean isBlockBreakingRestricted() { return net.minecraft.world.GameMode.isBlockBreakingRestricted(); }
public boolean isSurvivalLike() { return wrapperContained.isSurvivalLike(); }
// public static boolean isSurvivalLike() { return net.minecraft.world.GameMode.isSurvivalLike(); }

}