package yarnwrap.client.session;
public class ProfileKeys { public net.minecraft.client.session.ProfileKeys wrapperContained; public ProfileKeys(net.minecraft.client.session.ProfileKeys wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.session.ProfileKeys MISSING() { return new yarnwrap.client.session.ProfileKeys(wrapperContained.MISSING); }
// public void MISSING(yarnwrap.client.session.ProfileKeys value) { wrapperContained.MISSING = value.wrapperContained; }
public static yarnwrap.client.session.ProfileKeys MISSING() { return new yarnwrap.client.session.ProfileKeys(net.minecraft.client.session.ProfileKeys.MISSING); }
// public static void MISSING(yarnwrap.client.session.ProfileKeys value, ) { net.minecraft.client.session.ProfileKeys.MISSING = value.wrapperContained; }

public java.util.concurrent.CompletableFuture fetchKeyPair() { return wrapperContained.fetchKeyPair(); }
// public static java.util.concurrent.CompletableFuture fetchKeyPair() { return net.minecraft.client.session.ProfileKeys.fetchKeyPair(); }
public boolean isExpired() { return wrapperContained.isExpired(); }
// public static boolean isExpired() { return net.minecraft.client.session.ProfileKeys.isExpired(); }
// public yarnwrap.client.session.ProfileKeys create(com.mojang.authlib.minecraft.UserApiService userApiService,yarnwrap.client.session.Session session,java.nio.file.Path root) { return new yarnwrap.client.session.ProfileKeys(wrapperContained.create(userApiService,session.wrapperContained,root)); }
// public static yarnwrap.client.session.ProfileKeys create(com.mojang.authlib.minecraft.UserApiService userApiService,yarnwrap.client.session.Session session,java.nio.file.Path root, ) { return new yarnwrap.client.session.ProfileKeys(net.minecraft.client.session.ProfileKeys.create(userApiService,session.wrapperContained,root)); }

}