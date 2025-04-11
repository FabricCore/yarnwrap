package yarnwrap.client.gl;
public class GlTimer { public net.minecraft.client.gl.GlTimer wrapperContained; public GlTimer(net.minecraft.client.gl.GlTimer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int queryId() { return wrapperContained.queryId; }
// public void queryId(int value) { wrapperContained.queryId = value; }
public java.util.Optional getInstance() { return wrapperContained.getInstance(); }
public void beginProfile() { wrapperContained.beginProfile(); }
public Object endProfile() { return wrapperContained.endProfile(); }

}