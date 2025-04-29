package yarnwrap.client.render.model;
public class CubeFace { public net.minecraft.client.render.model.CubeFace wrapperContained; public CubeFace(net.minecraft.client.render.model.CubeFace wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.client.render.model.CubeFace[] DIRECTION_LOOKUP() { return wrapperContained.DIRECTION_LOOKUP; }
// public void DIRECTION_LOOKUP(net.minecraft.client.render.model.CubeFace[] value) { wrapperContained.DIRECTION_LOOKUP = value; }
// public static net.minecraft.client.render.model.CubeFace[] DIRECTION_LOOKUP() { return net.minecraft.client.render.model.CubeFace.DIRECTION_LOOKUP; }
// public static void DIRECTION_LOOKUP(net.minecraft.client.render.model.CubeFace[] value, ) { net.minecraft.client.render.model.CubeFace.DIRECTION_LOOKUP = value; }

// public Object corners() { return wrapperContained.corners; }
// // public void corners(Object value) { wrapperContained.corners = value; }
// // public static Object corners() { return net.minecraft.client.render.model.CubeFace.corners; }
// // public static void corners(Object value, ) { net.minecraft.client.render.model.CubeFace.corners = value; }

// public CubeFace(java.lang.String corners) { this.wrapperContained = new net.minecraft.client.render.model.CubeFace(corners); }
// public void method_3161(net.minecraft.client.render.model.CubeFace[] lookup) { wrapperContained.method_3161(lookup); }
// public static void method_3161(net.minecraft.client.render.model.CubeFace[] lookup, ) { net.minecraft.client.render.model.CubeFace.method_3161(lookup); }
public Object getCorner(int corner) { return wrapperContained.getCorner(corner); }
// public static Object getCorner(int corner, ) { return net.minecraft.client.render.model.CubeFace.getCorner(corner); }
// public yarnwrap.client.render.model.CubeFace getFace(yarnwrap.util.math.Direction direction) { return new yarnwrap.client.render.model.CubeFace(wrapperContained.getFace(direction.wrapperContained)); }
// public static yarnwrap.client.render.model.CubeFace getFace(yarnwrap.util.math.Direction direction, ) { return new yarnwrap.client.render.model.CubeFace(net.minecraft.client.render.model.CubeFace.getFace(direction.wrapperContained)); }

}