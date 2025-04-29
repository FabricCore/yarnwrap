package yarnwrap.client.gl;
public class GlTimer { public net.minecraft.client.gl.GlTimer wrapperContained; public GlTimer(net.minecraft.client.gl.GlTimer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int queryId() { return wrapperContained.queryId; }
// public void queryId(int value) { wrapperContained.queryId = value; }
// public static int queryId() { return net.minecraft.client.gl.GlTimer.queryId; }
// public static void queryId(int value, ) { net.minecraft.client.gl.GlTimer.queryId = value; }

// public java.util.Optional getInstance() { return wrapperContained.getInstance(); }
public static java.util.Optional getInstance() { return net.minecraft.client.gl.GlTimer.getInstance(); }
public void beginProfile() { wrapperContained.beginProfile(); }
// public static void beginProfile() { net.minecraft.client.gl.GlTimer.beginProfile(); }
public Object endProfile() { return wrapperContained.endProfile(); }
// public static Object endProfile() { return net.minecraft.client.gl.GlTimer.endProfile(); }

}