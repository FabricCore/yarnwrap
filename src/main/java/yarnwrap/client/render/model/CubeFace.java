package yarnwrap.client.render.model;
public class CubeFace { public net.minecraft.client.render.model.CubeFace wrapperContained; public CubeFace(net.minecraft.client.render.model.CubeFace wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.client.render.model.CubeFace[] DIRECTION_LOOKUP() { return wrapperContained.DIRECTION_LOOKUP; }
// public void DIRECTION_LOOKUP(net.minecraft.client.render.model.CubeFace[] value) { wrapperContained.DIRECTION_LOOKUP = value; }
// public Object corners() { return wrapperContained.corners; }
// // public void corners(Object value) { wrapperContained.corners = value; }
public Object getCorner(int corner) { return wrapperContained.getCorner(corner); }
public yarnwrap.client.render.model.CubeFace getFace(yarnwrap.util.math.Direction direction) { return new yarnwrap.client.render.model.CubeFace(wrapperContained.getFace(direction.wrapperContained)); }

}