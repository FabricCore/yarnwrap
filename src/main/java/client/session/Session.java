package yarnwrap.client.session;
public class Session { public net.minecraft.client.session.Session wrapperContained; public Session(net.minecraft.client.session.Session wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String username() { return wrapperContained.username; }
// public java.lang.String accessToken() { return wrapperContained.accessToken; }
// public Object accountType() { return wrapperContained.accountType; }
// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public java.util.Optional xuid() { return wrapperContained.xuid; }
// public java.util.Optional clientId() { return wrapperContained.clientId; }
public java.lang.String getAccessToken() { return wrapperContained.getAccessToken(); }
public java.lang.String getSessionId() { return wrapperContained.getSessionId(); }
public java.lang.String getUsername() { return wrapperContained.getUsername(); }
public Object getAccountType() { return wrapperContained.getAccountType(); }
public java.util.Optional getClientId() { return wrapperContained.getClientId(); }
public java.util.Optional getXuid() { return wrapperContained.getXuid(); }
public java.util.UUID getUuidOrNull() { return wrapperContained.getUuidOrNull(); }

}