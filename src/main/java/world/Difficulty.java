package yarnwrap.world;
public class Difficulty { public net.minecraft.world.Difficulty wrapperContained; public Difficulty(net.minecraft.world.Difficulty wrapperContained) { this.wrapperContained = wrapperContained; }

public Object CODEC() { return wrapperContained.CODEC; }
// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public int id() { return wrapperContained.id; }
// public java.lang.String name() { return wrapperContained.name; }
public yarnwrap.world.Difficulty byName(java.lang.String name) { return new yarnwrap.world.Difficulty(wrapperContained.byName(name)); }
public yarnwrap.text.Text getInfo() { return new yarnwrap.text.Text(wrapperContained.getInfo()); }
public java.lang.String getName() { return wrapperContained.getName(); }
public int getId() { return wrapperContained.getId(); }
public yarnwrap.world.Difficulty byId(int id) { return new yarnwrap.world.Difficulty(wrapperContained.byId(id)); }
public yarnwrap.text.Text getTranslatableName() { return new yarnwrap.text.Text(wrapperContained.getTranslatableName()); }

}