package yarnwrap.util;
public class ApiServices { public net.minecraft.util.ApiServices wrapperContained; public ApiServices(net.minecraft.util.ApiServices wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.UserCache userCache() { return new yarnwrap.util.UserCache(wrapperContained.userCache); }
// public void userCache(yarnwrap.util.UserCache value) { wrapperContained.userCache = value.wrapperContained; }
// public java.lang.String USER_CACHE_FILE_NAME() { return wrapperContained.USER_CACHE_FILE_NAME; }
// public void USER_CACHE_FILE_NAME(java.lang.String value) { wrapperContained.USER_CACHE_FILE_NAME = value; }
// public yarnwrap.util.UserCache userCache() { return new yarnwrap.util.UserCache(wrapperContained.userCache()); }
public yarnwrap.util.ApiServices create(com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService authenticationService,java.io.File rootDirectory) { return new yarnwrap.util.ApiServices(wrapperContained.create(authenticationService,rootDirectory)); }
public yarnwrap.network.encryption.SignatureVerifier serviceSignatureVerifier() { return new yarnwrap.network.encryption.SignatureVerifier(wrapperContained.serviceSignatureVerifier()); }
public boolean providesProfileKeys() { return wrapperContained.providesProfileKeys(); }

}