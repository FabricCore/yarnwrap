package yarnwrap.server.filter;
public class TextFilterer { public net.minecraft.server.filter.TextFilterer wrapperContained; public TextFilterer(net.minecraft.server.filter.TextFilterer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.concurrent.atomic.AtomicInteger NEXT_WORKER_ID() { return wrapperContained.NEXT_WORKER_ID; }
// public void NEXT_WORKER_ID(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.NEXT_WORKER_ID = value; }
// public java.util.concurrent.ThreadFactory THREAD_FACTORY() { return wrapperContained.THREAD_FACTORY; }
// public void THREAD_FACTORY(java.util.concurrent.ThreadFactory value) { wrapperContained.THREAD_FACTORY = value; }
// public java.net.URL chatEndpoint() { return wrapperContained.chatEndpoint; }
// public void chatEndpoint(java.net.URL value) { wrapperContained.chatEndpoint = value; }
// public java.net.URL joinEndpoint() { return wrapperContained.joinEndpoint; }
// public void joinEndpoint(java.net.URL value) { wrapperContained.joinEndpoint = value; }
// public java.net.URL leaveEndpoint() { return wrapperContained.leaveEndpoint; }
// public void leaveEndpoint(java.net.URL value) { wrapperContained.leaveEndpoint = value; }
// public java.lang.String apiKey() { return wrapperContained.apiKey; }
// public void apiKey(java.lang.String value) { wrapperContained.apiKey = value; }
// public Object ignorer() { return wrapperContained.ignorer; }
// // public void ignorer(Object value) { wrapperContained.ignorer = value; }
// public java.util.concurrent.ExecutorService executor() { return wrapperContained.executor; }
// public void executor(java.util.concurrent.ExecutorService value) { wrapperContained.executor = value; }
// public java.lang.String CHAT_ENDPOINT() { return wrapperContained.CHAT_ENDPOINT; }
// public void CHAT_ENDPOINT(java.lang.String value) { wrapperContained.CHAT_ENDPOINT = value; }
// public Object messageEncoder() { return wrapperContained.messageEncoder; }
// // public void messageEncoder(Object value) { wrapperContained.messageEncoder = value; }
// public Object joinEncoder() { return wrapperContained.joinEncoder; }
// // public void joinEncoder(Object value) { wrapperContained.joinEncoder = value; }
// public Object leaveEncoder() { return wrapperContained.leaveEncoder; }
// // public void leaveEncoder(Object value) { wrapperContained.leaveEncoder = value; }
// public TextFilterer(java.net.URL chatEndpoint,Object messageEncoder,java.net.URL joinEndpoint,Object joinEncoder,java.net.URL leaveEndpoint,Object leaveEncoder,java.lang.String apiKey,Object ignorer,int parallelism) { this.wrapperContained = new net.minecraft.server.filter.TextFilterer(chatEndpoint,messageEncoder,joinEndpoint,joinEncoder,leaveEndpoint,leaveEncoder,apiKey,ignorer,parallelism); }
// public com.google.gson.JsonObject sendJsonRequest(com.google.gson.JsonObject payload,java.net.URL endpoint) { return wrapperContained.sendJsonRequest(payload,endpoint); }
public yarnwrap.server.filter.TextStream createFilterer(com.mojang.authlib.GameProfile gameProfile) { return new yarnwrap.server.filter.TextStream(wrapperContained.createFilterer(gameProfile)); }
// public java.util.concurrent.CompletableFuture filterMessage(com.mojang.authlib.GameProfile gameProfile,java.lang.String message,Object ignorer,java.util.concurrent.Executor executor) { return wrapperContained.filterMessage(gameProfile,message,ignorer,executor); }
// public void sendJoinOrLeaveRequest(com.mojang.authlib.GameProfile gameProfile,java.net.URL endpoint,Object profileEncoder,java.util.concurrent.Executor executor) { wrapperContained.sendJoinOrLeaveRequest(gameProfile,endpoint,profileEncoder,executor); }
// public void consumeFully(java.io.InputStream inputStream) { wrapperContained.consumeFully(inputStream); }
// public java.lang.Thread method_31301(java.lang.Runnable runnable) { return wrapperContained.method_31301(runnable); }
// public void sendRequest(com.google.gson.JsonObject payload,java.net.URL endpoint) { wrapperContained.sendRequest(payload,endpoint); }
// public java.net.HttpURLConnection createConnection(com.google.gson.JsonObject payload,java.net.URL endpoint) { return wrapperContained.createConnection(payload,endpoint); }
public yarnwrap.server.filter.TextFilterer load(java.lang.String config) { return new yarnwrap.server.filter.TextFilterer(wrapperContained.load(config)); }
// public java.net.URL getEndpoint(java.net.URI root,com.google.gson.JsonObject endpoints,java.lang.String key,java.lang.String fallback) { return wrapperContained.getEndpoint(root,endpoints,key,fallback); }
// public com.google.gson.JsonObject method_42110(int profile,java.lang.String message) { return wrapperContained.method_42110(profile,message); }
// public java.lang.String getValue(com.google.gson.JsonObject json,java.lang.String key,java.lang.String fallback) { return wrapperContained.getValue(json,key,fallback); }
// public com.google.gson.JsonObject method_42112(java.lang.String profile) { return wrapperContained.method_42112(profile); }
// public com.google.gson.JsonObject method_42113(java.lang.String profile,java.lang.String message) { return wrapperContained.method_42113(profile,message); }
// public yarnwrap.network.message.FilterMask getMask(java.lang.String message,com.google.gson.JsonArray mask,Object ignorer) { return new yarnwrap.network.message.FilterMask(wrapperContained.getMask(message,mask,ignorer)); }

}