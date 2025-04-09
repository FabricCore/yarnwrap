package yarnwrap.client.realms.dto;
public class UploadInfo { public net.minecraft.client.realms.dto.UploadInfo wrapperContained; public UploadInfo(net.minecraft.client.realms.dto.UploadInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public boolean worldClosed() { return wrapperContained.worldClosed; }
// public java.lang.String token() { return wrapperContained.token; }
// public java.net.URI uploadEndpoint() { return wrapperContained.uploadEndpoint; }
// public java.util.regex.Pattern PROTOCOL_PATTERN() { return wrapperContained.PROTOCOL_PATTERN; }
// public java.lang.String HTTP_PROTOCOL() { return wrapperContained.HTTP_PROTOCOL; }
// public int PORT() { return wrapperContained.PORT; }
public java.lang.String getToken() { return wrapperContained.getToken(); }
public yarnwrap.client.realms.dto.UploadInfo parse(java.lang.String json) { return new yarnwrap.client.realms.dto.UploadInfo(wrapperContained.parse(json)); }
public java.net.URI getUploadEndpoint() { return wrapperContained.getUploadEndpoint(); }
public boolean isWorldClosed() { return wrapperContained.isWorldClosed(); }
// public int getPort(int port,int urlPort) { return wrapperContained.getPort(port,urlPort); }
public java.net.URI getUrl(java.lang.String url,int port) { return wrapperContained.getUrl(url,port); }
// public java.lang.String getUrlWithProtocol(java.lang.String url,java.util.regex.Matcher matcher) { return wrapperContained.getUrlWithProtocol(url,matcher); }
public java.lang.String createRequestContent(java.lang.String token) { return wrapperContained.createRequestContent(token); }

}