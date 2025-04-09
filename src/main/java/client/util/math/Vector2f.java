package yarnwrap.client.util.math;
public class Vector2f { public net.minecraft.client.util.math.Vector2f wrapperContained; public Vector2f(net.minecraft.client.util.math.Vector2f wrapperContained) { this.wrapperContained = wrapperContained; }

// public float x() { return wrapperContained.x; }
// public float y() { return wrapperContained.y; }
public float getX() { return wrapperContained.getX(); }
public float getY() { return wrapperContained.getY(); }

}