package yarnwrap.structure;
public class JigsawJunction { public net.minecraft.structure.JigsawJunction wrapperContained; public JigsawJunction(net.minecraft.structure.JigsawJunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public int deltaY() { return wrapperContained.deltaY; }
// public void deltaY(int value) { wrapperContained.deltaY = value; }
// public static int deltaY() { return net.minecraft.structure.JigsawJunction.deltaY; }
// public static void deltaY(int value, ) { net.minecraft.structure.JigsawJunction.deltaY = value; }

// public int sourceZ() { return wrapperContained.sourceZ; }
// public void sourceZ(int value) { wrapperContained.sourceZ = value; }
// public static int sourceZ() { return net.minecraft.structure.JigsawJunction.sourceZ; }
// public static void sourceZ(int value, ) { net.minecraft.structure.JigsawJunction.sourceZ = value; }

// public int sourceGroundY() { return wrapperContained.sourceGroundY; }
// public void sourceGroundY(int value) { wrapperContained.sourceGroundY = value; }
// public static int sourceGroundY() { return net.minecraft.structure.JigsawJunction.sourceGroundY; }
// public static void sourceGroundY(int value, ) { net.minecraft.structure.JigsawJunction.sourceGroundY = value; }

// public int sourceX() { return wrapperContained.sourceX; }
// public void sourceX(int value) { wrapperContained.sourceX = value; }
// public static int sourceX() { return net.minecraft.structure.JigsawJunction.sourceX; }
// public static void sourceX(int value, ) { net.minecraft.structure.JigsawJunction.sourceX = value; }

// public Object destProjection() { return wrapperContained.destProjection; }
// // public void destProjection(Object value) { wrapperContained.destProjection = value; }
// // public static Object destProjection() { return net.minecraft.structure.JigsawJunction.destProjection; }
// // public static void destProjection(Object value, ) { net.minecraft.structure.JigsawJunction.destProjection = value; }

// public JigsawJunction(int sourceX,int sourceGroundY,int sourceZ,int deltaY,Object destProjection) { this.wrapperContained = new net.minecraft.structure.JigsawJunction(sourceX,sourceGroundY,sourceZ,deltaY,destProjection); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.structure.JigsawJunction.equals(o); }
public int getSourceZ() { return wrapperContained.getSourceZ(); }
// public static int getSourceZ() { return net.minecraft.structure.JigsawJunction.getSourceZ(); }
public int getSourceX() { return wrapperContained.getSourceX(); }
// public static int getSourceX() { return net.minecraft.structure.JigsawJunction.getSourceX(); }
public int getSourceGroundY() { return wrapperContained.getSourceGroundY(); }
// public static int getSourceGroundY() { return net.minecraft.structure.JigsawJunction.getSourceGroundY(); }
public com.mojang.serialization.Dynamic serialize(com.mojang.serialization.DynamicOps ops) { return wrapperContained.serialize(ops); }
// public static com.mojang.serialization.Dynamic serialize(com.mojang.serialization.DynamicOps ops, ) { return net.minecraft.structure.JigsawJunction.serialize(ops); }
// public yarnwrap.structure.JigsawJunction deserialize(com.mojang.serialization.Dynamic dynamic) { return new yarnwrap.structure.JigsawJunction(wrapperContained.deserialize(dynamic)); }
// public static yarnwrap.structure.JigsawJunction deserialize(com.mojang.serialization.Dynamic dynamic, ) { return new yarnwrap.structure.JigsawJunction(net.minecraft.structure.JigsawJunction.deserialize(dynamic)); }
public int getDeltaY() { return wrapperContained.getDeltaY(); }
// public static int getDeltaY() { return net.minecraft.structure.JigsawJunction.getDeltaY(); }
public Object getDestProjection() { return wrapperContained.getDestProjection(); }
// public static Object getDestProjection() { return net.minecraft.structure.JigsawJunction.getDestProjection(); }

}