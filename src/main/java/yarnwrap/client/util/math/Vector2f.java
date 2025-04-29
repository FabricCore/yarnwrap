package yarnwrap.client.util.math;
public class Vector2f { public net.minecraft.client.util.math.Vector2f wrapperContained; public Vector2f(net.minecraft.client.util.math.Vector2f wrapperContained) { this.wrapperContained = wrapperContained; }

// public float x() { return wrapperContained.x; }
// public void x(float value) { wrapperContained.x = value; }
// public static float x() { return net.minecraft.client.util.math.Vector2f.x; }
// public static void x(float value, ) { net.minecraft.client.util.math.Vector2f.x = value; }

// public float y() { return wrapperContained.y; }
// public void y(float value) { wrapperContained.y = value; }
// public static float y() { return net.minecraft.client.util.math.Vector2f.y; }
// public static void y(float value, ) { net.minecraft.client.util.math.Vector2f.y = value; }

public Vector2f(float x,float y) { this.wrapperContained = new net.minecraft.client.util.math.Vector2f(x,y); }
public float getX() { return wrapperContained.getX(); }
// public static float getX() { return net.minecraft.client.util.math.Vector2f.getX(); }
public float getY() { return wrapperContained.getY(); }
// public static float getY() { return net.minecraft.client.util.math.Vector2f.getY(); }

}