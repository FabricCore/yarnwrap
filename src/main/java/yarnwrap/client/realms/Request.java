package yarnwrap.client.realms;
public class Request { public net.minecraft.client.realms.Request wrapperContained; public Request(net.minecraft.client.realms.Request wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.net.HttpURLConnection connection() { return wrapperContained.connection; }
// public void connection(java.net.HttpURLConnection value) { wrapperContained.connection = value; }
// public static java.net.HttpURLConnection connection() { return net.minecraft.client.realms.Request.connection; }
// public static void connection(java.net.HttpURLConnection value, ) { net.minecraft.client.realms.Request.connection = value; }

// public java.lang.String url() { return wrapperContained.url; }
// public void url(java.lang.String value) { wrapperContained.url = value; }
// public static java.lang.String url() { return net.minecraft.client.realms.Request.url; }
// public static void url(java.lang.String value, ) { net.minecraft.client.realms.Request.url = value; }

// public boolean connected() { return wrapperContained.connected; }
// public void connected(boolean value) { wrapperContained.connected = value; }
// public static boolean connected() { return net.minecraft.client.realms.Request.connected; }
// public static void connected(boolean value, ) { net.minecraft.client.realms.Request.connected = value; }

// public int READ_TIMEOUT() { return wrapperContained.READ_TIMEOUT; }
// public void READ_TIMEOUT(int value) { wrapperContained.READ_TIMEOUT = value; }
// public static int READ_TIMEOUT() { return net.minecraft.client.realms.Request.READ_TIMEOUT; }
// public static void READ_TIMEOUT(int value, ) { net.minecraft.client.realms.Request.READ_TIMEOUT = value; }

// public int CONNECT_TIMEOUT() { return wrapperContained.CONNECT_TIMEOUT; }
// public void CONNECT_TIMEOUT(int value) { wrapperContained.CONNECT_TIMEOUT = value; }
// public static int CONNECT_TIMEOUT() { return net.minecraft.client.realms.Request.CONNECT_TIMEOUT; }
// public static void CONNECT_TIMEOUT(int value, ) { net.minecraft.client.realms.Request.CONNECT_TIMEOUT = value; }

// public java.lang.String IS_PRERELEASE_HEADER() { return wrapperContained.IS_PRERELEASE_HEADER; }
// public void IS_PRERELEASE_HEADER(java.lang.String value) { wrapperContained.IS_PRERELEASE_HEADER = value; }
// public static java.lang.String IS_PRERELEASE_HEADER() { return net.minecraft.client.realms.Request.IS_PRERELEASE_HEADER; }
// public static void IS_PRERELEASE_HEADER(java.lang.String value, ) { net.minecraft.client.realms.Request.IS_PRERELEASE_HEADER = value; }

// public java.lang.String COOKIE_HEADER() { return wrapperContained.COOKIE_HEADER; }
// public void COOKIE_HEADER(java.lang.String value) { wrapperContained.COOKIE_HEADER = value; }
// public static java.lang.String COOKIE_HEADER() { return net.minecraft.client.realms.Request.COOKIE_HEADER; }
// public static void COOKIE_HEADER(java.lang.String value, ) { net.minecraft.client.realms.Request.COOKIE_HEADER = value; }

// public Request(java.lang.String url,int connectTimeout,int readTimeout) { this.wrapperContained = new net.minecraft.client.realms.Request(url,connectTimeout,readTimeout); }
public int getRetryAfterHeader() { return wrapperContained.getRetryAfterHeader(); }
// public static int getRetryAfterHeader() { return net.minecraft.client.realms.Request.getRetryAfterHeader(); }
// public java.lang.String read(java.io.InputStream in) { return wrapperContained.read(in); }
// public static java.lang.String read(java.io.InputStream in, ) { return net.minecraft.client.realms.Request.read(in); }
// public yarnwrap.client.realms.Request get(java.lang.String url) { return new yarnwrap.client.realms.Request(wrapperContained.get(url)); }
// public static yarnwrap.client.realms.Request get(java.lang.String url, ) { return new yarnwrap.client.realms.Request(net.minecraft.client.realms.Request.get(url)); }
// public yarnwrap.client.realms.Request get(java.lang.String url,int connectTimeoutMillis,int readTimeoutMillis) { return new yarnwrap.client.realms.Request(wrapperContained.get(url,connectTimeoutMillis,readTimeoutMillis)); }
// public static yarnwrap.client.realms.Request get(java.lang.String url,int connectTimeoutMillis,int readTimeoutMillis, ) { return new yarnwrap.client.realms.Request(net.minecraft.client.realms.Request.get(url,connectTimeoutMillis,readTimeoutMillis)); }
public void cookie(java.lang.String key,java.lang.String value) { wrapperContained.cookie(key,value); }
// public static void cookie(java.lang.String key,java.lang.String value, ) { net.minecraft.client.realms.Request.cookie(key,value); }
// public yarnwrap.client.realms.Request post(java.lang.String uri,java.lang.String content,int connectTimeoutMillis,int readTimeoutMillis) { return new yarnwrap.client.realms.Request(wrapperContained.post(uri,content,connectTimeoutMillis,readTimeoutMillis)); }
// public static yarnwrap.client.realms.Request post(java.lang.String uri,java.lang.String content,int connectTimeoutMillis,int readTimeoutMillis, ) { return new yarnwrap.client.realms.Request(net.minecraft.client.realms.Request.post(uri,content,connectTimeoutMillis,readTimeoutMillis)); }
// public int getRetryAfterHeader(java.net.HttpURLConnection connection) { return wrapperContained.getRetryAfterHeader(connection); }
// public static int getRetryAfterHeader(java.net.HttpURLConnection connection, ) { return net.minecraft.client.realms.Request.getRetryAfterHeader(connection); }
// public java.lang.String getHeader(java.net.HttpURLConnection connection,java.lang.String header) { return wrapperContained.getHeader(connection,header); }
// public static java.lang.String getHeader(java.net.HttpURLConnection connection,java.lang.String header, ) { return net.minecraft.client.realms.Request.getHeader(connection,header); }
// public void cookie(java.net.HttpURLConnection connection,java.lang.String key,java.lang.String value) { wrapperContained.cookie(connection,key,value); }
// public static void cookie(java.net.HttpURLConnection connection,java.lang.String key,java.lang.String value, ) { net.minecraft.client.realms.Request.cookie(connection,key,value); }
public int responseCode() { return wrapperContained.responseCode(); }
// public static int responseCode() { return net.minecraft.client.realms.Request.responseCode(); }
// public yarnwrap.client.realms.Request delete(java.lang.String url) { return new yarnwrap.client.realms.Request(wrapperContained.delete(url)); }
// public static yarnwrap.client.realms.Request delete(java.lang.String url, ) { return new yarnwrap.client.realms.Request(net.minecraft.client.realms.Request.delete(url)); }
// public yarnwrap.client.realms.Request post(java.lang.String uri,java.lang.String content) { return new yarnwrap.client.realms.Request(wrapperContained.post(uri,content)); }
// public static yarnwrap.client.realms.Request post(java.lang.String uri,java.lang.String content, ) { return new yarnwrap.client.realms.Request(net.minecraft.client.realms.Request.post(uri,content)); }
// public yarnwrap.client.realms.Request put(java.lang.String url,java.lang.String content,int connectTimeoutMillis,int readTimeoutMillis) { return new yarnwrap.client.realms.Request(wrapperContained.put(url,content,connectTimeoutMillis,readTimeoutMillis)); }
// public static yarnwrap.client.realms.Request put(java.lang.String url,java.lang.String content,int connectTimeoutMillis,int readTimeoutMillis, ) { return new yarnwrap.client.realms.Request(net.minecraft.client.realms.Request.put(url,content,connectTimeoutMillis,readTimeoutMillis)); }
public java.lang.String text() { return wrapperContained.text(); }
// public static java.lang.String text() { return net.minecraft.client.realms.Request.text(); }
public java.lang.String getHeader(java.lang.String header) { return wrapperContained.getHeader(header); }
// public static java.lang.String getHeader(java.lang.String header, ) { return net.minecraft.client.realms.Request.getHeader(header); }
// public yarnwrap.client.realms.Request put(java.lang.String url,java.lang.String content) { return new yarnwrap.client.realms.Request(wrapperContained.put(url,content)); }
// public static yarnwrap.client.realms.Request put(java.lang.String url,java.lang.String content, ) { return new yarnwrap.client.realms.Request(net.minecraft.client.realms.Request.put(url,content)); }
// public yarnwrap.client.realms.Request connect() { return new yarnwrap.client.realms.Request(wrapperContained.connect()); }
// public static yarnwrap.client.realms.Request connect() { return new yarnwrap.client.realms.Request(net.minecraft.client.realms.Request.connect()); }
// public yarnwrap.client.realms.Request doConnect() { return new yarnwrap.client.realms.Request(wrapperContained.doConnect()); }
// public static yarnwrap.client.realms.Request doConnect() { return new yarnwrap.client.realms.Request(net.minecraft.client.realms.Request.doConnect()); }
// public void dispose() { wrapperContained.dispose(); }
// public static void dispose() { net.minecraft.client.realms.Request.dispose(); }
public void prerelease(boolean prerelease) { wrapperContained.prerelease(prerelease); }
// public static void prerelease(boolean prerelease, ) { net.minecraft.client.realms.Request.prerelease(prerelease); }

}