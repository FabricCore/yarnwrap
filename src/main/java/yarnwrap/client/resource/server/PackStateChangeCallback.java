package yarnwrap.client.resource.server;
public class PackStateChangeCallback { public net.minecraft.client.resource.server.PackStateChangeCallback wrapperContained; public PackStateChangeCallback(net.minecraft.client.resource.server.PackStateChangeCallback wrapperContained) { this.wrapperContained = wrapperContained; }

// public void onFinish(java.util.UUID id,Object state) { wrapperContained.onFinish(id,state); }
// public static void onFinish(java.util.UUID id,Object state, ) { net.minecraft.client.resource.server.PackStateChangeCallback.onFinish(id,state); }
// public void onStateChanged(java.util.UUID id,Object state) { wrapperContained.onStateChanged(id,state); }
// public static void onStateChanged(java.util.UUID id,Object state, ) { net.minecraft.client.resource.server.PackStateChangeCallback.onStateChanged(id,state); }

}