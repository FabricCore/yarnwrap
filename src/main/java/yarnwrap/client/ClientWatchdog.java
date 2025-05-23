package yarnwrap.client;
public class ClientWatchdog { public net.minecraft.client.ClientWatchdog wrapperContained; public ClientWatchdog(net.minecraft.client.ClientWatchdog wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Duration TIMEOUT() { return wrapperContained.TIMEOUT; }
// public void TIMEOUT(java.time.Duration value) { wrapperContained.TIMEOUT = value; }
// public static java.time.Duration TIMEOUT() { return net.minecraft.client.ClientWatchdog.TIMEOUT; }
// public static void TIMEOUT(java.time.Duration value, ) { net.minecraft.client.ClientWatchdog.TIMEOUT = value; }

// public void shutdownClient(java.io.File runDir,long threadId) { wrapperContained.shutdownClient(runDir,threadId); }
// public static void shutdownClient(java.io.File runDir,long threadId, ) { net.minecraft.client.ClientWatchdog.shutdownClient(runDir,threadId); }

}