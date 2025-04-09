package yarnwrap.client.render;
public class ChunkBuilderMode { public net.minecraft.client.render.ChunkBuilderMode wrapperContained; public ChunkBuilderMode(net.minecraft.client.render.ChunkBuilderMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public int id() { return wrapperContained.id; }
// public java.lang.String name() { return wrapperContained.name; }
public yarnwrap.client.render.ChunkBuilderMode get(int id) { return new yarnwrap.client.render.ChunkBuilderMode(wrapperContained.get(id)); }

}