package yarnwrap.client.session;
public class ProfileKeys { public net.minecraft.client.session.ProfileKeys wrapperContained; public ProfileKeys(net.minecraft.client.session.ProfileKeys wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.session.ProfileKeys MISSING() { return new yarnwrap.client.session.ProfileKeys(wrapperContained.MISSING); }
public java.util.concurrent.CompletableFuture fetchKeyPair() { return wrapperContained.fetchKeyPair(); }
public boolean isExpired() { return wrapperContained.isExpired(); }
// public yarnwrap.client.session.ProfileKeys create(com.mojang.authlib.minecraft.UserApiService userApiService,yarnwrap.client.session.Session session,java.nio.file.Path root) { return new yarnwrap.client.session.ProfileKeys(wrapperContained.create(userApiService,session.wrapperContained,root)); }

}