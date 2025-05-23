package yarnwrap.server.filter;
public class AbstractTextFilterer { public net.minecraft.server.filter.AbstractTextFilterer wrapperContained; public AbstractTextFilterer(net.minecraft.server.filter.AbstractTextFilterer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.filter.AbstractTextFilterer.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.filter.AbstractTextFilterer.LOGGER = value; }

// public java.util.concurrent.atomic.AtomicInteger WORKER_ID() { return wrapperContained.WORKER_ID; }
// public void WORKER_ID(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.WORKER_ID = value; }
// public static java.util.concurrent.atomic.AtomicInteger WORKER_ID() { return net.minecraft.server.filter.AbstractTextFilterer.WORKER_ID; }
// public static void WORKER_ID(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.server.filter.AbstractTextFilterer.WORKER_ID = value; }

// public java.util.concurrent.ThreadFactory THREAD_FACTORY() { return wrapperContained.THREAD_FACTORY; }
// public void THREAD_FACTORY(java.util.concurrent.ThreadFactory value) { wrapperContained.THREAD_FACTORY = value; }
// public static java.util.concurrent.ThreadFactory THREAD_FACTORY() { return net.minecraft.server.filter.AbstractTextFilterer.THREAD_FACTORY; }
// public static void THREAD_FACTORY(java.util.concurrent.ThreadFactory value, ) { net.minecraft.server.filter.AbstractTextFilterer.THREAD_FACTORY = value; }

// public java.net.URL url() { return wrapperContained.url; }
// public void url(java.net.URL value) { wrapperContained.url = value; }
// public static java.net.URL url() { return net.minecraft.server.filter.AbstractTextFilterer.url; }
// public static void url(java.net.URL value, ) { net.minecraft.server.filter.AbstractTextFilterer.url = value; }

// public Object messageEncoder() { return wrapperContained.messageEncoder; }
// // public void messageEncoder(Object value) { wrapperContained.messageEncoder = value; }
// // public static Object messageEncoder() { return net.minecraft.server.filter.AbstractTextFilterer.messageEncoder; }
// // public static void messageEncoder(Object value, ) { net.minecraft.server.filter.AbstractTextFilterer.messageEncoder = value; }

// public Object hashIgnorer() { return wrapperContained.hashIgnorer; }
// // public void hashIgnorer(Object value) { wrapperContained.hashIgnorer = value; }
// // public static Object hashIgnorer() { return net.minecraft.server.filter.AbstractTextFilterer.hashIgnorer; }
// // public static void hashIgnorer(Object value, ) { net.minecraft.server.filter.AbstractTextFilterer.hashIgnorer = value; }

// public java.util.concurrent.ExecutorService threadPool() { return wrapperContained.threadPool; }
// public void threadPool(java.util.concurrent.ExecutorService value) { wrapperContained.threadPool = value; }
// public static java.util.concurrent.ExecutorService threadPool() { return net.minecraft.server.filter.AbstractTextFilterer.threadPool; }
// public static void threadPool(java.util.concurrent.ExecutorService value, ) { net.minecraft.server.filter.AbstractTextFilterer.threadPool = value; }

// public AbstractTextFilterer(java.net.URL url,Object messageEncoder,Object hashIgnorer,java.util.concurrent.ExecutorService threadPool) { this.wrapperContained = new net.minecraft.server.filter.AbstractTextFilterer(url,messageEncoder,hashIgnorer,threadPool); }
public yarnwrap.server.filter.TextStream createFilterer(com.mojang.authlib.GameProfile profile) { return new yarnwrap.server.filter.TextStream(wrapperContained.createFilterer(profile)); }
// public static yarnwrap.server.filter.TextStream createFilterer(com.mojang.authlib.GameProfile profile, ) { return new yarnwrap.server.filter.TextStream(net.minecraft.server.filter.AbstractTextFilterer.createFilterer(profile)); }
// public yarnwrap.server.filter.FilteredMessage filter(java.lang.String raw,Object hashIgnorer,com.google.gson.JsonObject response) { return new yarnwrap.server.filter.FilteredMessage(wrapperContained.filter(raw,hashIgnorer,response)); }
// public static yarnwrap.server.filter.FilteredMessage filter(java.lang.String raw,Object hashIgnorer,com.google.gson.JsonObject response, ) { return new yarnwrap.server.filter.FilteredMessage(net.minecraft.server.filter.AbstractTextFilterer.filter(raw,hashIgnorer,response)); }
// public void addAuthentication(java.net.HttpURLConnection connection) { wrapperContained.addAuthentication(connection); }
// public static void addAuthentication(java.net.HttpURLConnection connection, ) { net.minecraft.server.filter.AbstractTextFilterer.addAuthentication(connection); }
// public int getReadTimeout() { return wrapperContained.getReadTimeout(); }
// public static int getReadTimeout() { return net.minecraft.server.filter.AbstractTextFilterer.getReadTimeout(); }
// public java.util.concurrent.ExecutorService newThreadPool(int threadCount) { return wrapperContained.newThreadPool(threadCount); }
// public static java.util.concurrent.ExecutorService newThreadPool(int threadCount, ) { return net.minecraft.server.filter.AbstractTextFilterer.newThreadPool(threadCount); }
// public yarnwrap.server.filter.AbstractTextFilterer createTextFilter(yarnwrap.server.dedicated.ServerPropertiesHandler properties) { return new yarnwrap.server.filter.AbstractTextFilterer(wrapperContained.createTextFilter(properties.wrapperContained)); }
// public static yarnwrap.server.filter.AbstractTextFilterer createTextFilter(yarnwrap.server.dedicated.ServerPropertiesHandler properties, ) { return new yarnwrap.server.filter.AbstractTextFilterer(net.minecraft.server.filter.AbstractTextFilterer.createTextFilter(properties.wrapperContained)); }
// public java.lang.String getEndpointPath(com.google.gson.JsonObject endpoints,java.lang.String key,java.lang.String defaultPath) { return wrapperContained.getEndpointPath(endpoints,key,defaultPath); }
// public static java.lang.String getEndpointPath(com.google.gson.JsonObject endpoints,java.lang.String key,java.lang.String defaultPath, ) { return net.minecraft.server.filter.AbstractTextFilterer.getEndpointPath(endpoints,key,defaultPath); }
// public java.net.HttpURLConnection openConnection(com.google.gson.JsonObject request,java.net.URL url) { return wrapperContained.openConnection(request,url); }
// public static java.net.HttpURLConnection openConnection(com.google.gson.JsonObject request,java.net.URL url, ) { return net.minecraft.server.filter.AbstractTextFilterer.openConnection(request,url); }
// public java.util.concurrent.CompletableFuture filter(com.mojang.authlib.GameProfile profile,java.lang.String raw,Object hashIgnorer,java.util.concurrent.Executor executor) { return wrapperContained.filter(profile,raw,hashIgnorer,executor); }
// public static java.util.concurrent.CompletableFuture filter(com.mojang.authlib.GameProfile profile,java.lang.String raw,Object hashIgnorer,java.util.concurrent.Executor executor, ) { return net.minecraft.server.filter.AbstractTextFilterer.filter(profile,raw,hashIgnorer,executor); }
// public void discardRestOfInput(java.io.InputStream stream) { wrapperContained.discardRestOfInput(stream); }
// public static void discardRestOfInput(java.io.InputStream stream, ) { net.minecraft.server.filter.AbstractTextFilterer.discardRestOfInput(stream); }
// public java.lang.Thread method_61298(java.lang.Runnable runnable) { return wrapperContained.method_61298(runnable); }
// public static java.lang.Thread method_61298(java.lang.Runnable runnable, ) { return net.minecraft.server.filter.AbstractTextFilterer.method_61298(runnable); }
// public yarnwrap.network.message.FilterMask createFilterMask(java.lang.String raw,com.google.gson.JsonArray redactedTextIndex,Object hashIgnorer) { return new yarnwrap.network.message.FilterMask(wrapperContained.createFilterMask(raw,redactedTextIndex,hashIgnorer)); }
// public static yarnwrap.network.message.FilterMask createFilterMask(java.lang.String raw,com.google.gson.JsonArray redactedTextIndex,Object hashIgnorer, ) { return new yarnwrap.network.message.FilterMask(net.minecraft.server.filter.AbstractTextFilterer.createFilterMask(raw,redactedTextIndex,hashIgnorer)); }
// public java.net.URL resolveEndpoint(java.net.URI uri,com.google.gson.JsonObject endpoints,java.lang.String key,java.lang.String defaultPath) { return wrapperContained.resolveEndpoint(uri,endpoints,key,defaultPath); }
// public static java.net.URL resolveEndpoint(java.net.URI uri,com.google.gson.JsonObject endpoints,java.lang.String key,java.lang.String defaultPath, ) { return net.minecraft.server.filter.AbstractTextFilterer.resolveEndpoint(uri,endpoints,key,defaultPath); }
// public java.net.HttpURLConnection openConnection(java.net.URL url) { return wrapperContained.openConnection(url); }
// public static java.net.HttpURLConnection openConnection(java.net.URL url, ) { return net.minecraft.server.filter.AbstractTextFilterer.openConnection(url); }
// public com.google.gson.JsonObject request(com.google.gson.JsonObject request,java.net.URL url) { return wrapperContained.request(request,url); }
// public static com.google.gson.JsonObject request(com.google.gson.JsonObject request,java.net.URL url, ) { return net.minecraft.server.filter.AbstractTextFilterer.request(request,url); }

}