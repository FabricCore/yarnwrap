package yarnwrap.world;
public class Difficulty { public net.minecraft.world.Difficulty wrapperContained; public Difficulty(net.minecraft.world.Difficulty wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object CODEC() { return wrapperContained.CODEC; }
// // public void CODEC(Object value) { wrapperContained.CODEC = value; }
// public static Object CODEC() { return net.minecraft.world.Difficulty.CODEC; }
// // public static void CODEC(Object value, ) { net.minecraft.world.Difficulty.CODEC = value; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public void BY_ID(java.util.function.IntFunction value) { wrapperContained.BY_ID = value; }
// public static java.util.function.IntFunction BY_ID() { return net.minecraft.world.Difficulty.BY_ID; }
// public static void BY_ID(java.util.function.IntFunction value, ) { net.minecraft.world.Difficulty.BY_ID = value; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.world.Difficulty.id; }
// public static void id(int value, ) { net.minecraft.world.Difficulty.id = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.world.Difficulty.name; }
// public static void name(java.lang.String value, ) { net.minecraft.world.Difficulty.name = value; }

// // public Difficulty(java.lang.String id,int name) { this.wrapperContained = new net.minecraft.world.Difficulty(id,name); }
// public yarnwrap.world.Difficulty byName(java.lang.String name) { return new yarnwrap.world.Difficulty(wrapperContained.byName(name)); }
// public static yarnwrap.world.Difficulty byName(java.lang.String name, ) { return new yarnwrap.world.Difficulty(net.minecraft.world.Difficulty.byName(name)); }
public yarnwrap.text.Text getInfo() { return new yarnwrap.text.Text(wrapperContained.getInfo()); }
// public static yarnwrap.text.Text getInfo() { return new yarnwrap.text.Text(net.minecraft.world.Difficulty.getInfo()); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.world.Difficulty.getName(); }
public int getId() { return wrapperContained.getId(); }
// public static int getId() { return net.minecraft.world.Difficulty.getId(); }
// public yarnwrap.world.Difficulty byId(int id) { return new yarnwrap.world.Difficulty(wrapperContained.byId(id)); }
// public static yarnwrap.world.Difficulty byId(int id, ) { return new yarnwrap.world.Difficulty(net.minecraft.world.Difficulty.byId(id)); }
public yarnwrap.text.Text getTranslatableName() { return new yarnwrap.text.Text(wrapperContained.getTranslatableName()); }
// public static yarnwrap.text.Text getTranslatableName() { return new yarnwrap.text.Text(net.minecraft.world.Difficulty.getTranslatableName()); }

}