package yarnwrap.structure;
public class JigsawJunction { public net.minecraft.structure.JigsawJunction wrapperContained; public JigsawJunction(net.minecraft.structure.JigsawJunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public int deltaY() { return wrapperContained.deltaY; }
// public int sourceZ() { return wrapperContained.sourceZ; }
// public int sourceGroundY() { return wrapperContained.sourceGroundY; }
// public int sourceX() { return wrapperContained.sourceX; }
// public Object destProjection() { return wrapperContained.destProjection; }
public int getSourceZ() { return wrapperContained.getSourceZ(); }
public int getSourceX() { return wrapperContained.getSourceX(); }
public int getSourceGroundY() { return wrapperContained.getSourceGroundY(); }
public com.mojang.serialization.Dynamic serialize(com.mojang.serialization.DynamicOps ops) { return wrapperContained.serialize(ops); }
public yarnwrap.structure.JigsawJunction deserialize(com.mojang.serialization.Dynamic dynamic) { return new yarnwrap.structure.JigsawJunction(wrapperContained.deserialize(dynamic)); }
public int getDeltaY() { return wrapperContained.getDeltaY(); }
public Object getDestProjection() { return wrapperContained.getDestProjection(); }

}