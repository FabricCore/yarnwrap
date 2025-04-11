package yarnwrap.structure;
public class JigsawJunction { public net.minecraft.structure.JigsawJunction wrapperContained; public JigsawJunction(net.minecraft.structure.JigsawJunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public int deltaY() { return wrapperContained.deltaY; }
// public void deltaY(int value) { wrapperContained.deltaY = value; }
// public int sourceZ() { return wrapperContained.sourceZ; }
// public void sourceZ(int value) { wrapperContained.sourceZ = value; }
// public int sourceGroundY() { return wrapperContained.sourceGroundY; }
// public void sourceGroundY(int value) { wrapperContained.sourceGroundY = value; }
// public int sourceX() { return wrapperContained.sourceX; }
// public void sourceX(int value) { wrapperContained.sourceX = value; }
// public Object destProjection() { return wrapperContained.destProjection; }
// // public void destProjection(Object value) { wrapperContained.destProjection = value; }
public int getSourceZ() { return wrapperContained.getSourceZ(); }
public int getSourceX() { return wrapperContained.getSourceX(); }
public int getSourceGroundY() { return wrapperContained.getSourceGroundY(); }
public com.mojang.serialization.Dynamic serialize(com.mojang.serialization.DynamicOps ops) { return wrapperContained.serialize(ops); }
public yarnwrap.structure.JigsawJunction deserialize(com.mojang.serialization.Dynamic dynamic) { return new yarnwrap.structure.JigsawJunction(wrapperContained.deserialize(dynamic)); }
public int getDeltaY() { return wrapperContained.getDeltaY(); }
public Object getDestProjection() { return wrapperContained.getDestProjection(); }

}