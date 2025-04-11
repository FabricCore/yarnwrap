package yarnwrap.client.option;
public class GraphicsMode { public net.minecraft.client.option.GraphicsMode wrapperContained; public GraphicsMode(net.minecraft.client.option.GraphicsMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public void BY_ID(java.util.function.IntFunction value) { wrapperContained.BY_ID = value; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public void translationKey(java.lang.String value) { wrapperContained.translationKey = value; }
public yarnwrap.client.option.GraphicsMode byId(int id) { return new yarnwrap.client.option.GraphicsMode(wrapperContained.byId(id)); }

}