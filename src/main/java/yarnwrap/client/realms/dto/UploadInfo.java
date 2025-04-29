package yarnwrap.client.realms.dto;
public class UploadInfo { public net.minecraft.client.realms.dto.UploadInfo wrapperContained; public UploadInfo(net.minecraft.client.realms.dto.UploadInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.dto.UploadInfo.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.dto.UploadInfo.LOGGER = value; }

// public boolean worldClosed() { return wrapperContained.worldClosed; }
// public void worldClosed(boolean value) { wrapperContained.worldClosed = value; }
// public static boolean worldClosed() { return net.minecraft.client.realms.dto.UploadInfo.worldClosed; }
// public static void worldClosed(boolean value, ) { net.minecraft.client.realms.dto.UploadInfo.worldClosed = value; }

// public java.lang.String token() { return wrapperContained.token; }
// public void token(java.lang.String value) { wrapperContained.token = value; }
// public static java.lang.String token() { return net.minecraft.client.realms.dto.UploadInfo.token; }
// public static void token(java.lang.String value, ) { net.minecraft.client.realms.dto.UploadInfo.token = value; }

// public java.net.URI uploadEndpoint() { return wrapperContained.uploadEndpoint; }
// public void uploadEndpoint(java.net.URI value) { wrapperContained.uploadEndpoint = value; }
// public static java.net.URI uploadEndpoint() { return net.minecraft.client.realms.dto.UploadInfo.uploadEndpoint; }
// public static void uploadEndpoint(java.net.URI value, ) { net.minecraft.client.realms.dto.UploadInfo.uploadEndpoint = value; }

// public java.util.regex.Pattern PROTOCOL_PATTERN() { return wrapperContained.PROTOCOL_PATTERN; }
// public void PROTOCOL_PATTERN(java.util.regex.Pattern value) { wrapperContained.PROTOCOL_PATTERN = value; }
// public static java.util.regex.Pattern PROTOCOL_PATTERN() { return net.minecraft.client.realms.dto.UploadInfo.PROTOCOL_PATTERN; }
// public static void PROTOCOL_PATTERN(java.util.regex.Pattern value, ) { net.minecraft.client.realms.dto.UploadInfo.PROTOCOL_PATTERN = value; }

// public java.lang.String HTTP_PROTOCOL() { return wrapperContained.HTTP_PROTOCOL; }
// public void HTTP_PROTOCOL(java.lang.String value) { wrapperContained.HTTP_PROTOCOL = value; }
// public static java.lang.String HTTP_PROTOCOL() { return net.minecraft.client.realms.dto.UploadInfo.HTTP_PROTOCOL; }
// public static void HTTP_PROTOCOL(java.lang.String value, ) { net.minecraft.client.realms.dto.UploadInfo.HTTP_PROTOCOL = value; }

// public int PORT() { return wrapperContained.PORT; }
// public void PORT(int value) { wrapperContained.PORT = value; }
// public static int PORT() { return net.minecraft.client.realms.dto.UploadInfo.PORT; }
// public static void PORT(int value, ) { net.minecraft.client.realms.dto.UploadInfo.PORT = value; }

// public UploadInfo(boolean worldClosed,java.lang.String token,java.net.URI uploadEndpoint) { this.wrapperContained = new net.minecraft.client.realms.dto.UploadInfo(worldClosed,token,uploadEndpoint); }
public java.lang.String getToken() { return wrapperContained.getToken(); }
// public static java.lang.String getToken() { return net.minecraft.client.realms.dto.UploadInfo.getToken(); }
// public yarnwrap.client.realms.dto.UploadInfo parse(java.lang.String json) { return new yarnwrap.client.realms.dto.UploadInfo(wrapperContained.parse(json)); }
// public static yarnwrap.client.realms.dto.UploadInfo parse(java.lang.String json, ) { return new yarnwrap.client.realms.dto.UploadInfo(net.minecraft.client.realms.dto.UploadInfo.parse(json)); }
public java.net.URI getUploadEndpoint() { return wrapperContained.getUploadEndpoint(); }
// public static java.net.URI getUploadEndpoint() { return net.minecraft.client.realms.dto.UploadInfo.getUploadEndpoint(); }
public boolean isWorldClosed() { return wrapperContained.isWorldClosed(); }
// public static boolean isWorldClosed() { return net.minecraft.client.realms.dto.UploadInfo.isWorldClosed(); }
// public int getPort(int port,int urlPort) { return wrapperContained.getPort(port,urlPort); }
// public static int getPort(int port,int urlPort, ) { return net.minecraft.client.realms.dto.UploadInfo.getPort(port,urlPort); }
// public java.net.URI getUrl(java.lang.String url,int port) { return wrapperContained.getUrl(url,port); }
// public static java.net.URI getUrl(java.lang.String url,int port, ) { return net.minecraft.client.realms.dto.UploadInfo.getUrl(url,port); }
// public java.lang.String getUrlWithProtocol(java.lang.String url,java.util.regex.Matcher matcher) { return wrapperContained.getUrlWithProtocol(url,matcher); }
// public static java.lang.String getUrlWithProtocol(java.lang.String url,java.util.regex.Matcher matcher, ) { return net.minecraft.client.realms.dto.UploadInfo.getUrlWithProtocol(url,matcher); }
// public java.lang.String createRequestContent(java.lang.String token) { return wrapperContained.createRequestContent(token); }
// public static java.lang.String createRequestContent(java.lang.String token, ) { return net.minecraft.client.realms.dto.UploadInfo.createRequestContent(token); }

}