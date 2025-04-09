package yarnwrap.server.filter;
public class TextFilterer { public net.minecraft.server.filter.TextFilterer wrapperContained; public TextFilterer(net.minecraft.server.filter.TextFilterer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.concurrent.atomic.AtomicInteger NEXT_WORKER_ID() { return wrapperContained.NEXT_WORKER_ID; }
// public java.util.concurrent.ThreadFactory THREAD_FACTORY() { return wrapperContained.THREAD_FACTORY; }
// public java.net.URL chatEndpoint() { return wrapperContained.chatEndpoint; }
// public java.net.URL joinEndpoint() { return wrapperContained.joinEndpoint; }
// public java.net.URL leaveEndpoint() { return wrapperContained.leaveEndpoint; }
// public java.lang.String apiKey() { return wrapperContained.apiKey; }
// public Object ignorer() { return wrapperContained.ignorer; }
// public java.util.concurrent.ExecutorService executor() { return wrapperContained.executor; }
// public java.lang.String CHAT_ENDPOINT() { return wrapperContained.CHAT_ENDPOINT; }
// public Object messageEncoder() { return wrapperContained.messageEncoder; }
// public Object joinEncoder() { return wrapperContained.joinEncoder; }
// public Object leaveEncoder() { return wrapperContained.leaveEncoder; }
// public com.google.gson.JsonObject sendJsonRequest(com.google.gson.JsonObject payload,java.net.URL endpoint) { return wrapperContained.sendJsonRequest(payload,endpoint); }
public yarnwrap.server.filter.TextStream createFilterer(com.mojang.authlib.GameProfile gameProfile) { return new yarnwrap.server.filter.TextStream(wrapperContained.createFilterer(gameProfile)); }
// public java.util.concurrent.CompletableFuture filterMessage(com.mojang.authlib.GameProfile gameProfile,java.lang.String message,Object ignorer,java.util.concurrent.Executor executor) { return wrapperContained.filterMessage(gameProfile,message,ignorer,executor); }
// public void sendJoinOrLeaveRequest(com.mojang.authlib.GameProfile gameProfile,java.net.URL endpoint,Object profileEncoder,java.util.concurrent.Executor executor) { wrapperContained.sendJoinOrLeaveRequest(gameProfile,endpoint,profileEncoder,executor); }
// public void consumeFully(java.io.InputStream inputStream) { wrapperContained.consumeFully(inputStream); }
// public void sendRequest(com.google.gson.JsonObject payload,java.net.URL endpoint) { wrapperContained.sendRequest(payload,endpoint); }
// public java.net.HttpURLConnection createConnection(com.google.gson.JsonObject payload,java.net.URL endpoint) { return wrapperContained.createConnection(payload,endpoint); }
public yarnwrap.server.filter.TextFilterer load(java.lang.String config) { return new yarnwrap.server.filter.TextFilterer(wrapperContained.load(config)); }
// public java.net.URL getEndpoint(java.net.URI root,com.google.gson.JsonObject endpoints,java.lang.String key,java.lang.String fallback) { return wrapperContained.getEndpoint(root,endpoints,key,fallback); }
// public java.lang.String getValue(com.google.gson.JsonObject json,java.lang.String key,java.lang.String fallback) { return wrapperContained.getValue(json,key,fallback); }
// public yarnwrap.network.message.FilterMask getMask(java.lang.String message,com.google.gson.JsonArray mask,Object ignorer) { return new yarnwrap.network.message.FilterMask(wrapperContained.getMask(message,mask,ignorer)); }

}