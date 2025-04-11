package yarnwrap.client.render;
public class ChunkBuilderMode { public net.minecraft.client.render.ChunkBuilderMode wrapperContained; public ChunkBuilderMode(net.minecraft.client.render.ChunkBuilderMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public void BY_ID(java.util.function.IntFunction value) { wrapperContained.BY_ID = value; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// // public ChunkBuilderMode(java.lang.String id,int name) { this.wrapperContained = new net.minecraft.client.render.ChunkBuilderMode(id,name); }
public yarnwrap.client.render.ChunkBuilderMode get(int id) { return new yarnwrap.client.render.ChunkBuilderMode(wrapperContained.get(id)); }

}