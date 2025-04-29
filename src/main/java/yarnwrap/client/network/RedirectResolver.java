package yarnwrap.client.network;
public class RedirectResolver { public net.minecraft.client.network.RedirectResolver wrapperContained; public RedirectResolver(net.minecraft.client.network.RedirectResolver wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public static org.slf4j.Logger LOGGER() { return net.minecraft.client.network.RedirectResolver.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.network.RedirectResolver.LOGGER = value; }

// public yarnwrap.client.network.RedirectResolver INVALID() { return new yarnwrap.client.network.RedirectResolver(wrapperContained.INVALID); }
// public void INVALID(yarnwrap.client.network.RedirectResolver value) { wrapperContained.INVALID = value.wrapperContained; }
public static yarnwrap.client.network.RedirectResolver INVALID() { return new yarnwrap.client.network.RedirectResolver(net.minecraft.client.network.RedirectResolver.INVALID); }
// public static void INVALID(yarnwrap.client.network.RedirectResolver value, ) { net.minecraft.client.network.RedirectResolver.INVALID = value.wrapperContained; }

public java.util.Optional lookupRedirect(yarnwrap.client.network.ServerAddress address) { return wrapperContained.lookupRedirect(address.wrapperContained); }
// public static java.util.Optional lookupRedirect(yarnwrap.client.network.ServerAddress address, ) { return net.minecraft.client.network.RedirectResolver.lookupRedirect(address.wrapperContained); }
// public yarnwrap.client.network.RedirectResolver createSrv() { return new yarnwrap.client.network.RedirectResolver(wrapperContained.createSrv()); }
public static yarnwrap.client.network.RedirectResolver createSrv() { return new yarnwrap.client.network.RedirectResolver(net.minecraft.client.network.RedirectResolver.createSrv()); }
// public java.util.Optional method_36910(yarnwrap.client.network.ServerAddress address) { return wrapperContained.method_36910(address.wrapperContained); }
// public static java.util.Optional method_36910(yarnwrap.client.network.ServerAddress address, ) { return net.minecraft.client.network.RedirectResolver.method_36910(address.wrapperContained); }
// public java.util.Optional method_36911(javax.naming.directory.DirContext context,yarnwrap.client.network.ServerAddress address) { return wrapperContained.method_36911(context,address.wrapperContained); }
// public static java.util.Optional method_36911(javax.naming.directory.DirContext context,yarnwrap.client.network.ServerAddress address, ) { return net.minecraft.client.network.RedirectResolver.method_36911(context,address.wrapperContained); }

}