package yarnwrap.client.resource.server;
public class DownloadQueuer { public net.minecraft.client.resource.server.DownloadQueuer wrapperContained; public DownloadQueuer(net.minecraft.client.resource.server.DownloadQueuer wrapperContained) { this.wrapperContained = wrapperContained; }

public void enqueue(java.util.Map entries,java.util.function.Consumer callback) { wrapperContained.enqueue(entries,callback); }
// public static void enqueue(java.util.Map entries,java.util.function.Consumer callback, ) { net.minecraft.client.resource.server.DownloadQueuer.enqueue(entries,callback); }

}