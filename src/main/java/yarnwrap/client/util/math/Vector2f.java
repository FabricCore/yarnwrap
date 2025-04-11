package yarnwrap.client.util.math;
public class Vector2f { public net.minecraft.client.util.math.Vector2f wrapperContained; public Vector2f(net.minecraft.client.util.math.Vector2f wrapperContained) { this.wrapperContained = wrapperContained; }

// public float x() { return wrapperContained.x; }
// public void x(float value) { wrapperContained.x = value; }
// public float y() { return wrapperContained.y; }
// public void y(float value) { wrapperContained.y = value; }
public float getX() { return wrapperContained.getX(); }
public float getY() { return wrapperContained.getY(); }

}